package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.chuyendoi.Chuyendoi;
import com.example.myapplication.facebook.Loginfacebook;
import com.example.myapplication.maytinh.Maytinh;

public class TrangChuActivity extends AppCompatActivity {

    private Button btnChuyenDoi, btnMayTinh, btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu); // Đảm bảo bạn có tệp trangchu.xml trong thư mục layout

        // Ánh xạ các nút
        btnChuyenDoi = findViewById(R.id.btnChuyenDoi);
        btnMayTinh = findViewById(R.id.btnMayTinh);
        btnFacebook = findViewById(R.id.btnFacebook);

        // Xử lý sự kiện nút Chuyển Đổi
        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrangChuActivity.this, Chuyendoi.class);
                startActivity(intent);
            }
        });

        // Xử lý sự kiện nút Máy Tính
        btnMayTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrangChuActivity.this, Maytinh.class);
                startActivity(intent);
            }
        });

        // Xử lý sự kiện nút Facebook
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrangChuActivity.this, Loginfacebook.class);
                startActivity(intent);
            }
        });
    }
}
