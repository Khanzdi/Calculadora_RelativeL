package com.example.brayandavid.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay;
    double n1,n2,resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btncero (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"0");
    }

    public void btnuno (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"1");
    }

    public void btndos (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"2");
    }

    public void btntres (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"3");
    }

    public void btncuatro (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"4");
    }

    public void btncinco (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"5");
    }

    public void btnseis (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"6");
    }

    public void btnsiete (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"7");
    }

    public void btnocho (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"8");
    }

    public void btnnueve (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+"9");
    }

    public void btnpunto (View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText(txtDisplay.getText()+".");
    }

    public void onClickOperacionCapturaNumero1(View View){
        txtDisplay= (TextView) findViewById(R.id.txtDisplay);
        n1 = Double.parseDouble(txtDisplay.getText().toString());
        txtDisplay.setText("");
    }

    public void Sumar (View View){
        operador = "+";
        onClickOperacionCapturaNumero1(View);
    }

    public void Resta (View View){
        operador = "-";
        onClickOperacionCapturaNumero1(View);
    }

    public void Multiplicacion (View View){
        operador = "*";
        onClickOperacionCapturaNumero1(View);
    }

    public void Division (View View){
        operador = "/";
        onClickOperacionCapturaNumero1(View);
    }

    public void ExponenteN (View View){
        operador = "expo";
        txtDisplay = (TextView) findViewById(R.id.txtDisplay);
        try{
            n1 = Double.parseDouble(txtDisplay.getText().toString());
            txtDisplay.setText("");
        }catch (NumberFormatException nfe){
        }
    }

    public void btnigual (View View){
        txtDisplay = (TextView) findViewById(R.id.txtDisplay);
        n2 = Double.parseDouble(txtDisplay.getText().toString());

        if (operador.equals("+")){
            resultado = n1 + n2;
        }else if (operador.equals("-")){
            resultado = n1 - n2;
        }else if (operador.equals("*")){
            resultado = n1 * n2;
        }else if (operador.equals("/")){
            resultado = n1 / n2;
        }else if (operador.equals("exp")){
            txtDisplay = (TextView) findViewById(R.id.txtDisplay);
            n2 = Double.parseDouble(txtDisplay.getText().toString());
            txtDisplay.setText("");
            resultado = Math.pow(n1,n2);
        }
        txtDisplay.setText(""+resultado);
    }

    public void btnborrar (View View){
        if (!txtDisplay.getText().toString().equals("")){
            txtDisplay.setText(txtDisplay.getText().subSequence(0,txtDisplay.getText().length()-1));
        }
    }

    public void btnreset (View View){
        n1 = 0.0;
        n2 = 0.0;
        txtDisplay = (TextView) findViewById(R.id.txtDisplay);
        txtDisplay.setText("");
    }

    public void btncerrar (View View){
        finish();
    }
}
