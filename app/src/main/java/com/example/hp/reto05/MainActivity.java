package com.example.hp.reto05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText testo1;
    EditText testo2;
    EditText testo3;
    EditText testo4;
    Button   boton;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testo1 = findViewById(R. id. testo1);
        testo2 = findViewById(R. id. testo2);
        testo3 = findViewById(R. id. testo3);
        testo4 = findViewById(R. id. testo4);
        boton = findViewById(R. id. boton);
        resultado = findViewById(R. id. resultado);
    }
    public void click (View v)
    {
        int num =Integer.parseInt(testo1.getText().toString());
        int num1 = Integer.parseInt(testo2.getText().toString());
        int num2 =Integer.parseInt(testo3.getText().toString());
        int num3 = Integer.parseInt(testo4.getText().toString());
        int suma = num + num1 + num2 + num3;
        int division = suma / 4;

        resultado.setText("tu promedio es " +division);
    }
}
