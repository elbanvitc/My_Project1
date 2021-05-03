package com.example.myproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.example.myproject.databinding.ActivityPrsRegistrationBinding;

public class Prs_Registration_Activity extends AppCompatActivity {
final static int REQUETS_CODE_CAPTURE=54;
    String image ,  name , birth_day , phone_num , user_name , password;
    ActivityPrsRegistrationBinding registrationBind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registrationBind = DataBindingUtil.setContentView(this,R.layout.activity_prs__registration_);

        registrationBind.prsRegistrationActivityIvEnterYourImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,  REQUETS_CODE_CAPTURE);
            }
        });

        registrationBind.prsRegistrationActivityFabtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image = "image";  //need to convert from Bitmap >>>> URL
                name = registrationBind.prsRegistrationActivityEtName.getText().toString();
                birth_day = registrationBind.prsRegistrationActivityEtDateOfBirth.getText().toString();
                phone_num = registrationBind.prsRegistrationActivityEtPhoneNum.getText().toString();
                user_name = registrationBind.prsRegistrationActivityEtUserName.getText().toString();
                password = registrationBind.prsRegistrationActivityEtPassword.getText().toString();
                Class_Person new_player = new Class_Person(name,phone_num,birth_day,user_name,password,image);
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode== REQUETS_CODE_CAPTURE && resultCode == RESULT_OK ){

            Bitmap image = (Bitmap) data.getExtras().get("data");
            registrationBind.prsRegistrationActivityIvEnterYourImage.setImageBitmap(image);
        }
    }
}