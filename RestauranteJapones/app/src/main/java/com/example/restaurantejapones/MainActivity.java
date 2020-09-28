package com.example.restaurantejapones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();

        EditText usuário = findViewById(R.id.edtxtUsu);
        EditText senha = findViewById(R.id.edtxtSen);

        String u = extras.getString(Cadastro.EXTRA_MESSAGE_USUÁRIO);
        String s = extras.getString(Cadastro.EXTRA_MESSAGE_SENHA);
        usuário.setText(u);
        senha.setText(s);
    }

    public void Login(View view){
        EditText usuário = findViewById(R.id.edtxtUsu);
        EditText senha = findViewById(R.id.edtxtSen);

        if (usuário.getText().toString().equals("Ppfernandes") && senha.getText().toString().equals("ppf28003"))
        {
            Intent intent = new Intent(MainActivity.this, Menu.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "O usuário e/ou senha está/estão incorretos!", Toast.LENGTH_LONG).show();
        }
    }
}
