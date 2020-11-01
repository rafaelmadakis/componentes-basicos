package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView resultado;
    private CheckBox cbBranco, cbVerde,cbVermelho;
    List<String> check = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoProduto = findViewById(R.id.etNomeProduto);
        resultado = findViewById(R.id.tvResultado);

        cbBranco = findViewById(R.id.cbBranco);
        cbVerde = findViewById(R.id.cbVerde);
        cbVermelho = findViewById(R.id.cbVermelho);
    }

    public void verificaCheck(){

        check.clear();

        if (cbBranco.isChecked()) {
            check.add(cbBranco.getText().toString());
        }

        if (cbVerde.isChecked()) {
            check.add(cbVerde.getText().toString());
        }

        if (cbVermelho.isChecked()) {
            check.add(cbVermelho.getText().toString());
        }

        resultado.setText(check.toString());

    }

    public void btEnviar(View view) {

//        String nomeProduto = campoProduto.getText().toString();
//        resultado.setText(nomeProduto);

        verificaCheck();

    }
}