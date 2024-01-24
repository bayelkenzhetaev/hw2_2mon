package com.example.hw2_2mon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView firstTv, secondTv, therdTv;

    private EditText emailEt, passwordEt;

    private Button vhodBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstTv = findViewById(R.id.first_tv);
        secondTv = findViewById(R.id.second_tv);
        therdTv = findViewById(R.id.therd_tv);
        emailEt = findViewById(R.id.email_et);
        passwordEt = findViewById(R.id.password_et);
        vhodBtn = findViewById(R.id.vhod_btn);

        emailEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (emailEt.getText().toString().isEmpty()){
                    vhodBtn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                }
                vhodBtn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
            }
        });

        passwordEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (emailEt.getText().toString().isEmpty()){
                    vhodBtn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                }
                vhodBtn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
            }
        });

        vhodBtn.setOnClickListener(v -> {
            if (emailEt.getText().toString().equals("admin") && passwordEt.getText().toString().equals("admin")){
                firstTv.setVisibility(View.GONE);
                passwordEt.setVisibility(View.GONE);
                therdTv.setVisibility(View.GONE);
                emailEt.setVisibility(View.GONE);
                vhodBtn.setVisibility(View.GONE);
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}