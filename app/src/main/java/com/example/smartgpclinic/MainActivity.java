package com.example.smartgpclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Action button NFC
        Button buttonNFC = findViewById(R.id.btnNfc);
        buttonNFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nfc = new Intent(MainActivity.this, NFCActivity.class);
                startActivity(nfc);
            }
        });

        //Action button Log In
        Button btn_LogInMain = findViewById(R.id.btnLogInMain);
        btn_LogInMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginBy.class));
            }
        });

        //Action button Register
        Button btn_registerMain = findViewById(R.id.btnRegisterMain);
        btn_registerMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sign = new Intent(MainActivity.this, CheckUniqueCode.class);
                startActivity(sign);
            }
        });
    }
}