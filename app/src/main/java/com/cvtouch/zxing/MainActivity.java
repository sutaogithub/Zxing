package com.cvtouch.zxing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cvtouch.zxing.others.CaptureActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void qrCode(View view) {

        Intent intent = new Intent(this, CaptureActivity.class);
        startActivity(intent);
    }
}
