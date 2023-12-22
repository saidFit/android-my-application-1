package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        RetrieveData();

    }

    public void RetrieveData(){
        Bundle extras = getIntent().getExtras();
        String dataRetrieve;
        TextView textView = findViewById(R.id.textView);
        if(extras != null){
            Log.d("valid","valid data");
            dataRetrieve = extras.getString("key_data");
            System.out.println("valid");
            textView.setText(dataRetrieve);
        }

    }
    public void launchSetting(View button){

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}