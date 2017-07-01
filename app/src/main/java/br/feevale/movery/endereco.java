package br.feevale.movery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class endereco extends AppCompatActivity {


    Spinner pagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endereco);

        pagamento = (Spinner) findViewById(R.id.spinner_pagamento);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.array_pagamento, android.R.layout.simple_spinner_item);
        pagamento.setAdapter(adapter);

    }

}
