package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class tuan22MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main2);
        txt1=findViewById(R.id.tuan22txt1);
        txt2=findViewById(R.id.tuan22txt2);
        btn1=findViewById(R.id.tuan22btn1);
        btn1.setOnClickListener(v -> {
            Intent i= new Intent(tuan22MainActivity.this,
                    tuan22SecondActivity.class);
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());

            startActivity(i);
        });
    }
}