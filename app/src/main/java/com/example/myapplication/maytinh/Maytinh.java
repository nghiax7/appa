package com.example.myapplication.maytinh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Maytinh extends AppCompatActivity {

    private EditText sothunhat, sothuhai, ketqua;
    private Button btnCong, btnTru, btnNhan, btnChia, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maytinh); // Đảm bảo bạn có tệp maytinh.xml trong thư mục layout

        // Ánh xạ các view
        sothunhat = findViewById(R.id.sothunhat);
        sothuhai = findViewById(R.id.sothuhai);
        ketqua = findViewById(R.id.ketqua);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnClear = findViewById(R.id.btnClear);

        // Xử lý sự kiện nút Cộng
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation("+");
            }
        });

        // Xử lý sự kiện nút Trừ
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation("-");
            }
        });

        // Xử lý sự kiện nút Nhân
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation("*");
            }
        });

        // Xử lý sự kiện nút Chia
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation("/");
            }
        });

        // Xử lý sự kiện nút Xóa
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sothunhat.setText("");
                sothuhai.setText("");
                ketqua.setText("");
            }
        });
    }

    // Hàm thực hiện phép tính
    private void performOperation(String operator) {
        String num1Text = sothunhat.getText().toString();
        String num2Text = sothuhai.getText().toString();

        // Kiểm tra nếu các ô nhập liệu không trống
        if (num1Text.isEmpty() || num2Text.isEmpty()) {
            Toast.makeText(Maytinh.this, "Vui lòng nhập cả hai số", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double num1 = Double.parseDouble(num1Text);
            double num2 = Double.parseDouble(num2Text);
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        Toast.makeText(Maytinh.this, "Không thể chia cho 0", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            // Hiển thị kết quả
            ketqua.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            Toast.makeText(Maytinh.this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}
