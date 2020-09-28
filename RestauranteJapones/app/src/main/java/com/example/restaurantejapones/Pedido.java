package com.example.restaurantejapones;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Pedido extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
    }
    public void Pedido(View view){
        EditText pedido = findViewById(R.id.txtmultPed);

        if (pedido.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Você não fez nenhum pedido!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Seu pedido foi enviado!", Toast.LENGTH_LONG).show();
        }
    }

}
