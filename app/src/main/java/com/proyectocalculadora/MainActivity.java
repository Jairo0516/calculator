package com.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnButton0;
    private Button btnButton1;
    private Button btnButton2;
    private Button btnButton3;
    private Button btnButton4;
    private Button btnButton5;
    private Button btnButton6;
    private Button btnButton7;
    private Button btnButton8;
    private Button btnButton9;
    private TextView textTextOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTextOperation=findViewById(R.id.txtOperacion);
        textTextOperation.setFocusable(true);
        textTextOperation.setFocusableInTouchMode(true);
        textTextOperation.setInputType(InputType.TYPE_NULL);

        btnButton0 = findViewById( R.id.btn0 );
        btnButton1 = findViewById( R.id.btn1 );
        btnButton2 = findViewById( R.id.btn2 );
        btnButton3 = findViewById( R.id.btn3 );
        btnButton4 = findViewById( R.id.btn4 );
        btnButton5 = findViewById( R.id.btn5 );
        btnButton6 = findViewById( R.id.btn6 );
        btnButton7 = findViewById( R.id.btn7 );
        btnButton8 = findViewById( R.id.btn8 );
        btnButton9 = findViewById( R.id.btn9 );

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

        btnButton3 = findViewById( R.id.btn3 );
        btnButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"3");
            }
        });

        btnButton4 = findViewById( R.id.btn4 );
        btnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"4");
            }
        });

        btnButton5 = findViewById( R.id.btn5 );
        btnButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"5");
            }
        });
        btnButton6 = findViewById( R.id.btn6 );
        btnButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"6");
            }
        });
        btnButton7 = findViewById( R.id.btn7 );
        btnButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"7");
            }
        });
        btnButton8 = findViewById( R.id.btn8 );
        btnButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"8");
            }
        });
        btnButton9 = findViewById( R.id.btn9 );
        btnButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior+"9");
            }
        });

    }
}
