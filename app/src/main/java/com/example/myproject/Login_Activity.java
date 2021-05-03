package com.example.myproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.myproject.databinding.ActivityLoginBinding;

public class Login_Activity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

ActivityLoginBinding loginBind = DataBindingUtil.setContentView(this,R.layout.activity_login);
loginBind.loginActivityTvCreatNewAccont.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        loginBind.loginActivityBtnRegistAsPlayer.setVisibility(View.VISIBLE);
        loginBind.loginActivityBtnRegistAsStadium.setVisibility(View.VISIBLE);

    }
});
loginBind.loginActivityBtnRegistAsPlayer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Login_Activity.this,Prs_Registration_Activity.class);
        startActivity(intent);
    }
});
loginBind.loginActivityBtnRegistAsStadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Activity.this,St_Registartion_Activity.class);
                startActivity(intent);
            }
        });
loginBind.loginActivityBtnDoneLogin.setOnClickListener(new View.OnClickListener() {
    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        if (TextUtils.isEmpty(loginBind.loginActivityEtUserName.getText().toString()) ){
            Toast.makeText(Login_Activity.this, "enter your user name", Toast.LENGTH_SHORT).show();
            loginBind.loginActivityEtUserName.setError("error");
            loginBind.loginActivityTvPassword.setTextColor(getResources().getColor(R.color.red_erorr));
        }
        if (TextUtils.isEmpty(loginBind.loginActivityEtPassword.getText().toString())){
            Toast.makeText(Login_Activity.this, "enter your password", Toast.LENGTH_LONG).show();
            loginBind.loginActivityEtPassword.setError("");
            loginBind.loginActivityTvPassword.setTextColor(getResources().getColor(R.color.red_erorr));
        }
        if (TextUtils.isEmpty(loginBind.loginActivityEtUserName.getText().toString())==false && TextUtils.isEmpty(loginBind.loginActivityEtPassword.getText().toString())==false){
            String userName = loginBind.loginActivityEtUserName.getText().toString();
            String password = loginBind.loginActivityEtPassword.getText().toString();

            if (userName.equals("1")&& password.equals("1") ){
            Intent intent = new Intent(Login_Activity.this,Prs_main_Acyivity.class);
            startActivity(intent);
                Toast.makeText(Login_Activity.this, "welcome As Player", Toast.LENGTH_LONG).show();
            }
            else if (userName.equals("2")&& password.equals("2")){
                Intent intent = new Intent(Login_Activity.this,St_Main_Activity.class);
                startActivity(intent);
                Toast.makeText(Login_Activity.this, "welcome As Stadium", Toast.LENGTH_LONG).show();
            }
            else {
                loginBind.loginActivityEtPassword.setError("");
               // loginBind.loginActivityEtPassword.requestFocus();
                loginBind.loginActivityEtUserName.setError("error");
                //loginBind.loginActivityEtUserName.requestFocus();
            }
        }

    }
});

    }
}