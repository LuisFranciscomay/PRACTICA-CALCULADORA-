package com.example.practica_calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables

    //botones numericos
    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero;

    //botones de igualdad y de punto decimal
    Button btnPunto, btnIgual;

    //botones de operaciones
    Button btnSuma, btnResta, btnMultiplicacion, btnDivision;

    //botones de borrado
    Button btnReset, btnBorrar;

    //pantalla (textView)
    TextView pantallaCalcu;

    double resultado;
    String operador, mostrar, reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //numeros
        btnUno = findViewById(R.id.uno);
        btnDos = findViewById(R.id.dos);
        btnTres = findViewById(R.id.tres);
        btnCuatro = findViewById(R.id.cuatro);
        btnCinco = findViewById(R.id.cinco);
        btnSeis = findViewById(R.id.seis);
        btnSiete = findViewById(R.id.siete);
        btnOcho = findViewById(R.id.ocho);
        btnNueve = findViewById(R.id.nueve);
        btnCero = findViewById(R.id.cero);
        //operadores
        btnSuma = findViewById(R.id.suma);
        btnResta = findViewById(R.id.resta);
        btnMultiplicacion = findViewById(R.id.multiplicacion);
        btnDivision = findViewById(R.id.division);
        //punto e igual
        btnPunto = findViewById(R.id.punto);
        btnIgual = findViewById(R.id.igual);
        //borradores
        btnReset = findViewById(R.id.borrar);
        btnBorrar = findViewById(R.id.borrarDato);
        //pantalla
        pantallaCalcu = findViewById(R.id.pantalla);

        //funciones para el funcionamiento de la calculadora

        //funcion para boton 1
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "1";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 2
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "2";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 3
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "3";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 4
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "4";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 5
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "5";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 6
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "6";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 7
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "7";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 8
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "8";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 9
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "9";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton 0
        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "0";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para boton punto
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + ".";
                pantallaCalcu.setText(mostrar);
            }
        });

        //funcion para OPERADOR SUMA
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = pantallaCalcu.getText().toString();//4
                operador =  "+";
                pantallaCalcu.setText("");
            }
        });

        //funcion para OPERADOR RESTA
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = pantallaCalcu.getText().toString();//4
                operador =  "-";
                pantallaCalcu.setText("");
            }
        });

        //funcion para OPERADOR MULTI
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = pantallaCalcu.getText().toString();//4
                operador =  "*";
                pantallaCalcu.setText("");
            }
        });

        //funcion para OPERADOR DIVISION
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = pantallaCalcu.getText().toString();//4
                operador =  "/";
                pantallaCalcu.setText("");
            }
        });

        //funcion para resultado boton IGUAL
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar + "1";
                //SUMA
                if(operador.equals("+")){
                  resultado = Double.parseDouble(reserva) + Double.parseDouble(pantallaCalcu.getText().toString());
                  pantallaCalcu.setText(String.valueOf(resultado));
                }
                //RESTA
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(pantallaCalcu.getText().toString());
                    pantallaCalcu.setText(String.valueOf(resultado));
                }
                //MULTIPLICACION
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(pantallaCalcu.getText().toString());
                    pantallaCalcu.setText(String.valueOf(resultado));
                }
                //DIVISION
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(pantallaCalcu.getText().toString());
                    pantallaCalcu.setText(String.valueOf(resultado));
                }

            }
        });

        //FUNCIONES DE BORRAR DATO
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = pantallaCalcu.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                // 0123 4
                // 120. 0
                pantallaCalcu.setText(mostrar);
            }
        });

        //FUNCIONES DE reset
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = "";
                pantallaCalcu.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });
    }//FIN ONCREATE
}//FIN MAIN ACTIVITY