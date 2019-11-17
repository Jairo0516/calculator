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
    private Button btnC;
    private Button btnNumMas;
    private Button btnNumMenos;
    private Button btnNumMultiplicar;
    private Button btnNumDividir;
    private Button btnBorrar;
    private Button btnPunto;

    private TextView textTextOperation;

    private boolean clicBtnMas, clicBtnMenos, clicBtnMultiplicar, clicBtnDividir, clicBtnPunto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTextOperation = findViewById(R.id.txtOperacion);
        textTextOperation.setFocusable(true);
        textTextOperation.setFocusableInTouchMode(true);
        textTextOperation.setInputType(InputType.TYPE_NULL);

        btnButton0 = findViewById(R.id.btn0);
        btnButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn0);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "0");
            }
        });


        btnButton1 = findViewById(R.id.btn1);
        btnButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn1);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "1");
            }
        });

        btnButton2 = findViewById(R.id.btn2);
        btnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn2);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "2");
            }
        });

        btnButton3 = findViewById(R.id.btn3);
        btnButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn3);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "3");
            }
        });

        btnButton4 = findViewById(R.id.btn4);
        btnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn4);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "4");
            }
        });

        btnButton5 = findViewById(R.id.btn5);
        btnButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn5);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "5");
            }
        });
        btnButton6 = findViewById(R.id.btn6);
        btnButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn6);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "6");
            }
        });
        btnButton7 = findViewById(R.id.btn7);
        btnButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn7);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "7");
            }
        });
        btnButton8 = findViewById(R.id.btn8);
        btnButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn8);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "8");
            }
        });
        btnButton9 = findViewById(R.id.btn9);
        btnButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionesAdcicionales(R.id.btn9);
                String textAnterior = textTextOperation.getText().toString();
                textTextOperation.setText(textAnterior + "9");
            }
        });
        btnC = findViewById(R.id.btnC);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTextOperation.setText("");
            }
        });
        btnNumMas = findViewById(R.id.btnMas);
        btnNumMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                if (textAnterior.trim().length() > 0 && clicBtnMas == false) {

                    if(textAnterior.endsWith("*")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1); clicBtnMultiplicar=false;}
                    if(textAnterior.endsWith("/")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnDividir=false;}
                    if(textAnterior.endsWith("+")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnMas=false;}
                    if(textAnterior.endsWith("-")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnMenos=false;}

                    textTextOperation.setText(textAnterior + "+");
                    clicBtnMas = true;
                }
            }
        });
        btnNumMenos = findViewById(R.id.btnMenos);
        btnNumMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                if (textAnterior.trim().length() > 0 && clicBtnMenos == false) {
                    if(textAnterior.endsWith("*")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1); clicBtnMultiplicar=false;}
                    if(textAnterior.endsWith("/")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnDividir=false;}
                    if(textAnterior.endsWith("+")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnMas=false;}
                    if(textAnterior.endsWith("-")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnMenos=false;}

                    textTextOperation.setText(textAnterior + "-");
                    clicBtnMenos = true;
                }
            }
        });
        btnNumMultiplicar = findViewById(R.id.btnMultiplicar);
        btnNumMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                if (textAnterior.trim().length() > 0  && clicBtnMultiplicar == false) {
                    if(textAnterior.endsWith("*")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1); clicBtnMultiplicar=false;}
                    if(textAnterior.endsWith("/")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnDividir=false;}
                    if(textAnterior.endsWith("+")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnMas=false;}
                    if(textAnterior.endsWith("-")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnMenos=false;}

                    textTextOperation.setText(textAnterior + "*");
                    clicBtnMultiplicar = true;
                }
            }
        });
        btnNumDividir = findViewById(R.id.btnDivision);
        btnNumDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                if (textAnterior.trim().length() > 0 && clicBtnDividir == false) {

                    if(textAnterior.endsWith("*")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1); clicBtnMultiplicar=false;}
                    if(textAnterior.endsWith("/")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnDividir=false;}
                    if(textAnterior.endsWith("+")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnMas=false;}
                    if(textAnterior.endsWith("-")){textAnterior = textAnterior.substring(0, textAnterior.length() - 1);clicBtnMenos=false;}

                    textTextOperation.setText(textAnterior + "/");
                    clicBtnDividir = true;
                }
            }
        });
        btnBorrar = findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                if (textAnterior.length() > 0) {
                    String nuevoTexto = textAnterior.substring(0, textAnterior.length() - 1);
                    textTextOperation.setText(nuevoTexto);
                }
            }
        });
        btnPunto = findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAnterior = textTextOperation.getText().toString();
                if (clicBtnPunto == false) {
                    textTextOperation.setText(textAnterior + ".");
                    clicBtnPunto = true;
                    accionesAdcicionales(R.id.btnPunto);
                }
            }
        });

    }

    private void accionesAdcicionales(int idBtn) {

        if (clicBtnDividir || clicBtnMultiplicar || clicBtnMenos || clicBtnMas) {
            clicBtnPunto=false;
        }
        if (idBtn != R.id.btnMas) {
            clicBtnMas = false;
        }
        if (idBtn != R.id.btnMenos) {
            clicBtnMenos = false;
        }
        if (idBtn != R.id.btnMultiplicar) {
            clicBtnMultiplicar = false;
        }
        if (idBtn != R.id.btnDivision) {
            clicBtnDividir = false;
        }
    }
}
