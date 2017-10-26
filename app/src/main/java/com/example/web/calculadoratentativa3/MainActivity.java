package com.example.web.calculadoratentativa3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String cadeia = "0";
    private double Num1=0, Num2=0, resultado=0;
    private char Operacao_atual = 'n', Operacao_anterior = 'n';
    private int zerar=1;
    private TextView visor;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnSoma;
    private Button btnDiminui;
    private Button btnDivide;
    private Button btnMultiplica;
    private Button btnPorcentagem;
    private Button btnZera;
    private Button btnIgual;
    private Button btnVirg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visor = (TextView) findViewById(R.id.visor);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnDiminui = (Button) findViewById(R.id.btnDiminui);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiplica = (Button) findViewById(R.id.btnMultiplica);
        btnPorcentagem = (Button) findViewById(R.id.btnPorcentagem);
        btnZera = (Button) findViewById(R.id.btnZera);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnVirg = (Button) findViewById(R.id.btnVirg);


        btn0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "0";
                if (!cadeia.equals("0")){
                    cadeia = cadeia + "0";
                } else zerar = 1;
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "1";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "2";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "3";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "4";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "5";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "6";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "7";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "8";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                cadeia = cadeia + "9";
                zerar = 0;
                visor.setText("" + cadeia);
            }
        });

        btnVirg.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (!cadeia.contains(".")) {
                    if (zerar == 1) cadeia = "";
                    cadeia = cadeia + ".";
                    zerar = 0;
                    visor.setText("" + cadeia);
                }
            }
        });

        btnZera.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Num1 = 0;
                Num2 = 0;
                cadeia = "0";
                zerar = 1;
                resultado = 0;
                Operacao_atual = 'n';
                visor.setText("" + cadeia);
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Operacao_atual = '+';
                zerar = 1;
                calcula(Double.parseDouble(visor.getText().toString()));
            }
        });

        btnPorcentagem.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Operacao_atual = '%';
                zerar = 1;
                calcula(Double.parseDouble(visor.getText().toString()));
            }
        });

        btnDiminui.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Operacao_atual = '-';
                zerar = 1;
                calcula(Double.parseDouble(visor.getText().toString()));
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Operacao_atual = '*';
                zerar = 1;
                calcula(Double.parseDouble(visor.getText().toString()));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Operacao_atual = '/';
                zerar = 1;
                calcula(Double.parseDouble(visor.getText().toString()));
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                zerar = 1;
                Operacao_atual = Operacao_anterior;
                calcula(Double.parseDouble(visor.getText().toString()));
                Num1=0;

            }
        });

    }

    private void calcula(Double valor){


        if(Num1 == 0){

            this.Num1 = valor;

            switch(Operacao_atual) {

                case 'n': resultado = Num1;
                    break;

                case '+': resultado = Num1;
                    break;

                case '-': resultado = Num1;
                    break;

                case '*': resultado = Num1;
                    break;

                case '/': resultado = Num1;
                    break;

                case '%': resultado = Num1;
                    break;

            }
        }else{

            this.Num2 = valor;

            switch(Operacao_anterior) {

                case 'n': resultado = 0;
                    break;

                case '+': resultado = Num1 + Num2;
                    break;

                case '-': resultado = Num1 - Num2;
                    break;

                case '*': resultado = Num1 * Num2;
                    break;

                case '/': resultado = Num1 / Num2;
                    break;

                case '%': resultado = (Num1 * Num2) / 100;
                    break;


            }
        }

        showResults();

    }
    private void showResults(){

        visor.setText("" + String.valueOf(resultado));
        Num1 = resultado;
        Operacao_anterior = Operacao_atual;

    }


}
