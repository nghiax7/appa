package com.example.myapplication.facebook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Mainfb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainfb); // Đảm bảo bạn có tệp facebook.xml trong thư mục layout
    }
}
