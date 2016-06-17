package com.munoz.cesar.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int numero1 = 0;
    private int numero2 = 0;
    private String operador = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Pulsar(View v){
        Button btn = (Button) v;

        TextView txtResultado = (TextView)findViewById(R.id.txtResultado);

        String texto = txtResultado.getText().toString()+btn.getText().toString();
        txtResultado.setText(texto);
    }

    public void PulsarOperacion (View v){
        Button btn = (Button)v;
        TextView txtResultado = (TextView)findViewById(R.id.txtResultado);
        if(!btn.getText().toString().equals("=")){
            operador = btn.getText().toString();

            numero1 = Integer.parseInt(txtResultado.getText().toString());

        }else{
            numero2 = Integer.parseInt(txtResultado.getText().toString();)

            int resultado = 0;

            if(operador.equals("=")){
                resultado = numero1 + numero2;
            }

            txtResultado.setText("" + resultado);
        }

    }


}
