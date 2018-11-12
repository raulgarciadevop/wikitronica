package com.wikitronica.programacionjavaapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ActividadPreguntas extends Activity {
    Button btnConfirmar;
    TextView txtTiempo, txtPuntaje, txtPregunta;
    Juego juego;
    RadioButton rb1,rb2,rb3;
    RadioGroup rgroup;
    ImageView imgDisp;
    Pregunta act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_preguntas);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        juego=new Juego();

        btnConfirmar=findViewById(R.id.btnContinuar);
        txtTiempo=findViewById(R.id.txtTiempo);
        txtPregunta=findViewById(R.id.txtPreguntaActual);
        txtPuntaje=findViewById(R.id.txtPuntaje);
        rgroup=findViewById(R.id.rgroup);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        imgDisp=findViewById(R.id.imgDisplay);

        comenzar();


        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(juego.revisarRes(1))
                    juego.addPunto();

                rellenarInterfaz();
            }
        });

    }

    private void rellenarInterfaz(){
        txtPuntaje.setText(juego.getPuntaje()+"");

        act=juego.getPregActual();

        //Rellenar las opciones
        rb1.setText(act.getRespuesta(0));
        rb2.setText(act.getRespuesta(1));
        rb3.setText(act.getRespuesta(2));

        //imgDisp.setImageResource(R.drawable.ic_menu_camera); //check how to change this
    }

    private void comenzar(){
        act=juego.iniciar();
        //Rellenar las opciones
        rb1.setText(act.getRespuesta(0));
        rb2.setText(act.getRespuesta(1));
        rb3.setText(act.getRespuesta(2));

        imgDisp.setImageResource(R.drawable.ic_menu_camera); //check how to change this

    }



}
