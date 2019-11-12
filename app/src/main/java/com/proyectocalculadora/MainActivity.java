package com.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnButton0;
    private Button btnButton1;
    private Button btnButton2;
    private EditText textTextOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnButton0 = findViewById( R.id.btn0 );

        btnButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"0");
            }
        });

        btnButton1 = findViewById( R.id.btn1 );
        btnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"1");
            }
        });

        btnButton2 = findViewById( R.id.btn2 );
        btnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"2");
            }
        });
    }
}
