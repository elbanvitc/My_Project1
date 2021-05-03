package com.example.myproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.myproject.databinding.ActivityStRegistartionBinding;
import com.google.android.gms.maps.model.LatLng;

import java.util.Calendar;

public class St_Registartion_Activity extends AppCompatActivity {
final static int REQUETS_CODE_CAPTURE_STADIUM_IMAGE = 12, REQUETS_CODE_CAPTURE_IMAGE1 = 13,REQUETS_CODE_CAPTURE_IMAGE2 = 14,REQUETS_CODE_CAPTURE_IMAGE3 = 15;
TimePickerDialog picker;
    ActivityStRegistartionBinding stRegistartionBind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
stRegistartionBind = DataBindingUtil.setContentView(this,R.layout.activity_st__registartion_);
stRegistartionBind.stRegistartionActivityTvDurationStart.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        picker = new TimePickerDialog(St_Registartion_Activity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                stRegistartionBind.stRegistartionActivityEtDurationStart.setVisibility(View.VISIBLE);
                stRegistartionBind.stRegistartionActivityEtDurationStart.setText("  "+ i +" : "+i1+"  ");
            }
        },hour,minute,true);
       picker.show();
    }
});
stRegistartionBind.stRegistartionActivityTvDurationEnd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
 picker = new TimePickerDialog(St_Registartion_Activity.this, new TimePickerDialog.OnTimeSetListener() {
     @Override
     public void onTimeSet(TimePicker timePicker, int i, int i1) {
         stRegistartionBind.stRegistartionActivityEtDurationEnd.setVisibility(View.VISIBLE);
         stRegistartionBind.stRegistartionActivityEtDurationEnd.setText("  "+i+" : "+i1+"  ");
     }
 },hour,minute,false);
    picker.show();
    }
});
        stRegistartionBind.stRegistartionActivityIvStadiumImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,  REQUETS_CODE_CAPTURE_STADIUM_IMAGE);
            }
        });
        stRegistartionBind.stRegistartionActivityImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,  REQUETS_CODE_CAPTURE_IMAGE1);
            }
        });
        stRegistartionBind.stRegistartionActivityImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,  REQUETS_CODE_CAPTURE_IMAGE2);
            }
        });
        stRegistartionBind.stRegistartionActivityImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,  REQUETS_CODE_CAPTURE_IMAGE3);
            }
        });
        stRegistartionBind.stRegistartionActivityIvShareStadiumLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng latLng = new LatLng(0,0);
                Uri st_location = Uri.parse("geo:"+latLng+"?z=10&q=restaurants");
                Intent intent = new Intent(Intent.ACTION_VIEW,st_location);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }
            }
        });
        stRegistartionBind.stRegistartionActivityFabtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st_name = stRegistartionBind.stRegistartionActivityEtStadiumName.getText().toString();
                String manger_name  = stRegistartionBind.stRegistartionRegistartionEtStadiumMangerName.getText().toString();
                String maneger_phone1 = stRegistartionBind.stRegistartionActivityEtStadiumMangerPhone1.getText().toString();
                String maneger_phone2 = stRegistartionBind.stRegistartionActivityEtStadiumMangerPhone2.getText().toString();
                String st_location = stRegistartionBind.stRegistartionActivityTvStadiumLocation.getText().toString();
                String duration_start = stRegistartionBind.stRegistartionActivityEtDurationStart.getText().toString();
                String duration_End = stRegistartionBind.stRegistartionActivityEtDurationEnd.getText().toString();
                String hour_price = stRegistartionBind.stRegistartionActivityEtHourPrice.getText().toString();

                // un known error    here..
                if (TextUtils.isEmpty(st_name)||TextUtils.isEmpty(manger_name)||TextUtils.isEmpty(maneger_phone1)
                        ||TextUtils.isEmpty(st_location)||TextUtils.isEmpty(duration_start)
                        ||TextUtils.isEmpty(duration_End)||TextUtils.isEmpty(hour_price)){
                    Toast.makeText(St_Registartion_Activity.this, "compleet you data", Toast.LENGTH_SHORT).show();
                }
                else {
                    Class_Stadium stadium  = new Class_Stadium("XXXX","XXX","XXXX","XXXX",st_name,manger_name,maneger_phone1,maneger_phone2,duration_start,duration_End,hour_price,st_location);
                    Toast.makeText(St_Registartion_Activity.this, "you compleet registartion for"+stadium.getSt_name()+"   --> fire base ", Toast.LENGTH_SHORT).show();

                }


            }
        });




    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode== REQUETS_CODE_CAPTURE_STADIUM_IMAGE && resultCode == RESULT_OK ){
            Bitmap image = (Bitmap) data.getExtras().get("data");
            stRegistartionBind.stRegistartionActivityIvStadiumImage.setImageBitmap(image);
    }
        if (requestCode== REQUETS_CODE_CAPTURE_IMAGE1&& resultCode == RESULT_OK ){
            Bitmap image = (Bitmap) data.getExtras().get("data");
            stRegistartionBind.stRegistartionActivityImage1.setImageBitmap(image);
        }
        if (requestCode== REQUETS_CODE_CAPTURE_IMAGE2&& resultCode == RESULT_OK ){
            Bitmap image = (Bitmap) data.getExtras().get("data");
            stRegistartionBind.stRegistartionActivityImage2.setImageBitmap(image);
        }
        if (requestCode== REQUETS_CODE_CAPTURE_IMAGE3&& resultCode == RESULT_OK ){
            Bitmap image = (Bitmap) data.getExtras().get("data");
            stRegistartionBind.stRegistartionActivityImage3.setImageBitmap(image);
        }
    }
}