package com.example.restaurantejapones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Pedido(View view){
        Intent intent = new Intent(Menu.this, Pedido.class);
        startActivity(intent);
    }
    public void Infos(View view){
        Intent intent = new Intent(Menu.this, Informacoes.class);
        startActivity(intent);
    }
}
