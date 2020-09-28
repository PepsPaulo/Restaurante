package com.example.restaurantejapones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Informacoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);
    }
    public void Local(View view){
        Uri uri = Uri.parse("https://www.google.com/search?q=matsuya&rlz=1C1CHWL_pt-BRBR900BR900&oq=matsuya&aqs=chrome..69i57j0l5j69i60j69i61.4263j0j9&sourceid=chrome&ie=UTF-8&sxsrf=ALeKk01DmTcsHqpl1rB7-72iBupoAFTgKg:1601258966480&npsic=0&rflfq=1&rlha=0&rllag=-23572279,-46654649,4338&tbm=lcl&rldimm=14289475464781906103&lqi=CgdtYXRzdXlhIgOIAQFaEgoHbWF0c3V5YSIHbWF0c3V5YQ&ved=2ahUKEwiko4-_4orsAhVLGLkGHXMhAH0QvS4wAXoECAwQGQ&rldoc=1&tbs=lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:4&rlst=f#rlfi=hd:;si:14289475464781906103,l,CgdtYXRzdXlhIgOIAQFaEgoHbWF0c3V5YSIHbWF0c3V5YQ;mv:[[-23.4777669,-46.579454999999996],[-23.6443896,-46.7425576]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:4");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void Insta(View view){
        Uri uri = Uri.parse("https://www.instagram.com/restaurantes.matsuya/");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}
