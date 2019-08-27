package br.es.senac.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//Declarando uma class...Erdando uma class/ herança...
public class MainActivity extends AppCompatActivity {

    //Metodo que declara o ciclo de criação da tela...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Metodo que liga a activity.java
        setContentView(R.layout.activity_main);
    }
}
