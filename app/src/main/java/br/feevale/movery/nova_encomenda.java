package br.feevale.movery;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class nova_encomenda extends AppCompatActivity {

    ImageButton caixa1;
    ImageButton caixa2;
    ImageButton caixa3;
    ImageButton caixa4;
    ImageButton peso1;
    ImageButton peso2;
    ImageButton peso3;
    ImageButton peso4;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_encomenda);


        btn = (Button) findViewById(R.id.btnConfirmarPacote);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nova_encomenda.this,endereco.class));
            }
        });

        caixa1  = (ImageButton) findViewById(R.id.caixa1);
        caixa2  = (ImageButton) findViewById(R.id.caixa2);
        caixa3  = (ImageButton) findViewById(R.id.caixa3);
        caixa4  = (ImageButton) findViewById(R.id.caixa4);


        peso1  = (ImageButton) findViewById(R.id.peso1);
        peso2  = (ImageButton) findViewById(R.id.peso2);
        peso3  = (ImageButton) findViewById(R.id.peso3);
        peso4  = (ImageButton) findViewById(R.id.peso4);

        caixa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa1.setImageResource(R.mipmap.im_caixaverde);
                caixa2.setImageResource(R.mipmap.im_caixapreta);
                caixa3.setImageResource(R.mipmap.im_caixapreta);
                caixa4.setImageResource(R.mipmap.im_caixapreta);

            }
        });
        caixa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa2.setImageResource(R.mipmap.im_caixaverde);
                caixa1.setImageResource(R.mipmap.im_caixapreta);
                caixa3.setImageResource(R.mipmap.im_caixapreta);
                caixa4.setImageResource(R.mipmap.im_caixapreta);

            }
        });
        caixa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa3.setImageResource(R.mipmap.im_caixaverde);
                caixa1.setImageResource(R.mipmap.im_caixapreta);
                caixa2.setImageResource(R.mipmap.im_caixapreta);
                caixa4.setImageResource(R.mipmap.im_caixapreta);

            }
        });
        caixa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixa4.setImageResource(R.mipmap.im_caixaverde);
                caixa1.setImageResource(R.mipmap.im_caixapreta);
                caixa2.setImageResource(R.mipmap.im_caixapreta);
                caixa3.setImageResource(R.mipmap.im_caixapreta);

            }
        });

        peso1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peso1.setImageResource(R.mipmap.im_pesoverde);
                peso2.setImageResource(R.mipmap.im_pesopreto);
                peso3.setImageResource(R.mipmap.im_pesopreto);
                peso4.setImageResource(R.mipmap.im_pesopreto);

            }
        });
        peso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peso2.setImageResource(R.mipmap.im_pesoverde);
                peso1.setImageResource(R.mipmap.im_pesopreto);
                peso3.setImageResource(R.mipmap.im_pesopreto);
                peso4.setImageResource(R.mipmap.im_pesopreto);

            }
        });
        peso3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peso3.setImageResource(R.mipmap.im_pesoverde);
                peso1.setImageResource(R.mipmap.im_pesopreto);
                peso2.setImageResource(R.mipmap.im_pesopreto);
                peso4.setImageResource(R.mipmap.im_pesopreto);

            }
        });
        peso4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peso4.setImageResource(R.mipmap.im_pesoverde);
                peso1.setImageResource(R.mipmap.im_pesopreto);
                peso2.setImageResource(R.mipmap.im_pesopreto);
                peso3.setImageResource(R.mipmap.im_pesopreto);

            }
        });




    }




}
