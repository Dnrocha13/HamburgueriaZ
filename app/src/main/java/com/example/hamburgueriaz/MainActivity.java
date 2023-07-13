package com.example.hamburgueriaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {




    int numero = 0;

    double hamburguer = 0;

    private FloatingActionButton BtnMenos,BtnMais;
    private TextView Pedido;
    private CheckedTextView Quantidade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pedido = findViewById(R.id.resumoPedido);
        Quantidade = findViewById(R.id.Quantidade);
        BtnMenos= findViewById(R.id.BtnMenos);
        BtnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero = numero - 1;
                hamburguer = hamburguer - 15;
                 Pedido.setText(String.valueOf(hamburguer));
                Quantidade.setText((String.valueOf(numero)));

            }

        });
        BtnMais= findViewById(R.id.BtnMais);
        BtnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero = numero + 1;
                hamburguer = hamburguer + 15;

               Pedido.setText(String.valueOf(hamburguer));
                Quantidade.setText((String.valueOf(numero)));

            }

        });


    }


}







