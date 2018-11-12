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

        comenzar(0);




        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (juego.isNotFinished()){
                    if(juego.revisarRes(act.getCorrecta()))
                        juego.addPunto();
                    rellenarInterfaz();

                }else
                    finalizar();

            }
        });

        txtTiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!juego.isNotFinished())
                    comenzar(1);
            }
        });



    }

    private void rellenarInterfaz(){
        sDefaults();
        act=juego.getPregActual();
        imgDisp.setImageResource(R.drawable.ic_menu_gallery); //check how to change this
    }

    private void sDefaults(){
        txtPuntaje.setText("Puntaje: "+juego.getPuntaje());
        txtPregunta.setText("Pregunta: "+juego.getActual()+"/10");
        //Rellenar las opciones
        rb1.setText(act.getRespuesta(0));
        rb2.setText(act.getRespuesta(1));
        rb3.setText(act.getRespuesta(2));
    }

    private void comenzar(int o){

        rb1.setVisibility(View.VISIBLE);
        rb2.setVisibility(View.VISIBLE);
        rb3.setVisibility(View.VISIBLE);
        txtTiempo.setText("00:00");
        btnConfirmar.setText("Confirmar");

        if(o==0)
            act=juego.iniciar();
        else
            act=juego.iniciar(1);

        sDefaults();

        imgDisp.setImageResource(R.drawable.ic_menu_camera); //check how to change this

    }

    private void finalizar(){
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        txtTiempo.setText("Reiniciar");
        btnConfirmar.setText("Salir");
        txtPuntaje.setText("Puntaje final: "+juego.getPuntaje());

        //Poner una imagen de juego terminado.


    }



}
