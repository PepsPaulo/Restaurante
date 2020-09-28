package com.example.restaurantejapones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_USUÁRIO = "com.example.intent.USUÁRIO";
    public final static String EXTRA_MESSAGE_SENHA = "com.example.intent.SENHA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void Cadastrar(View view){
        EditText usuário = findViewById(R.id.edtxtUsu);
        EditText senha = findViewById(R.id.edtxtSen);
        EditText nome = findViewById(R.id.edtxtNome);
        EditText email = findViewById(R.id.edtxtEmail);
        EditText conf = findViewById(R.id.edtxtConf);

        String u = usuário.getText().toString();
        String s = senha.getText().toString();

        if(nome.getText().toString().isEmpty() || email.getText().toString().isEmpty() || usuário.getText().toString().isEmpty() || senha.getText().toString().isEmpty() || conf.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Todos os campos devem estar preenchidos!", Toast.LENGTH_LONG).show();
            return;
        }
        if (conf.getText().toString().equals(senha.getText().toString()))
        {
            Intent intent = new Intent(Cadastro.this, MainActivity.class);
            intent.putExtra(EXTRA_MESSAGE_USUÁRIO, "" + u);
            intent.putExtra(EXTRA_MESSAGE_SENHA, "" + s);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "As senhas devem ser idênticas!", Toast.LENGTH_LONG).show();
        }
    }
}
