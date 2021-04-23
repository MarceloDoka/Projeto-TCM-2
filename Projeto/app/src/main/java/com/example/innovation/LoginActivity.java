package com.example.innovation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
//Chamando a tela menu através do botão "Entrar"
Button buttonEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonEntrar = findViewById(R.id.buttonEntrar);
        abrirTelaMenu();
    }

    public void abrirTelaMenu(){
        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaMenu = new Intent(getApplicationContext(),ActivityTelaMenu.class);
                startActivity(telaMenu);
            }
        });
    }
}