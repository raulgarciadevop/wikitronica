package com.wikitronica.programacionjavaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActividadWiki extends AppCompatActivity {
    ImageButton btnNext;
    TextView txtTitulo, txtContenido;
    private Wiki wiki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_wiki);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnNext=findViewById(R.id.btnNext);
        txtTitulo=findViewById(R.id.txtTitulo);
        txtContenido=findViewById(R.id.txtContenido);

        wiki=new Wiki();

        rellenarInterfaz();


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                siguiente();
            }
        });


        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        */



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void siguiente(){
        wiki.siguiente();
        rellenarInterfaz();
    }

    private void rellenarInterfaz(){
        //Set imagen
        txtTitulo.setText(wiki.getPaginaActual().getTitulo());
        txtContenido.setText(wiki.getPaginaActual().getContenido());


    }



}
