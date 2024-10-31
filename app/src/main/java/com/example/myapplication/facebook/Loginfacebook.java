package com.example.myapplication.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Loginfacebook extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private Button btnLogin,testbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facebook); // Đảm bảo bạn có tệp facebook.xml trong thư mục layout

        // Ánh xạ các view
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
testbtn1 = findViewById(R.id.btnRegister);
        // Xử lý sự kiện khi nhấn nút Login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                // Kiểm tra thông tin đăng nhập
                if (email.equals("admin") && password.equals("123")) { // Thay đổi với tài khoản thực tế
                    // Đăng nhập thành công, chuyển sang màn hình mainfb
                    Intent intent = new Intent(Loginfacebook.this, Mainfb.class);
                    startActivity(intent);
                    finish(); // Đóng màn hình đăng nhập
                } else {
                    // Thông báo nếu thông tin đăng nhập không đúng
                    Toast.makeText(Loginfacebook.this, "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // Chuyển sang màn hình đăng ký khi nhấn nút Register
        testbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginfacebook.this, Dangky.class);
                startActivity(intent);
            }
        });


    }
}
