package com.example.nguyenthithuong_2422_activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        // Ánh xạ nút setting
        ImageView ivSetting = findViewById(R.id.ivSetting);

        // Khi bấm icon răng cưa, quay lại trang MainActivity
        ivSetting.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // đóng ProfileActivity để tránh stack chồng
        });
    }
}
