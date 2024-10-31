package com.example.myapplication.chuyendoi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class Chuyendoi extends AppCompatActivity {

    private EditText editTextFahrenheit;
    private EditText editTextCelsius;
    private Button btnConvertToCelsius;
    private Button btnConvertToFahrenheit;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chuyendoi);

        // Ánh xạ các view với id
        editTextFahrenheit = findViewById(R.id.doF);
        editTextCelsius = findViewById(R.id.doC);
        btnConvertToCelsius = findViewById(R.id.btnFsangC);
        btnConvertToFahrenheit = findViewById(R.id.btnCsangF);
        btnClear = findViewById(R.id.btnClear);

        // Chuyển đổi từ độ F sang độ C
        btnConvertToCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fahrenheitText = editTextFahrenheit.getText().toString();
                if (!fahrenheitText.isEmpty()) {
                    double fahrenheit = Double.parseDouble(fahrenheitText);
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    editTextCelsius.setText(String.format("%.2f", celsius));
                } else {
                    Toast.makeText(Chuyendoi.this, "Vui lòng nhập giá trị độ F", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Chuyển đổi từ độ C sang độ F
        btnConvertToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celsiusText = editTextCelsius.getText().toString();
                if (!celsiusText.isEmpty()) {
                    double celsius = Double.parseDouble(celsiusText);
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    editTextFahrenheit.setText(String.format("%.2f", fahrenheit));
                } else {
                    Toast.makeText(Chuyendoi.this, "Vui lòng nhập giá trị độ C", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Xóa các ô nhập liệu
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextFahrenheit.setText("");
                editTextCelsius.setText("");
            }
        });
    }
}
