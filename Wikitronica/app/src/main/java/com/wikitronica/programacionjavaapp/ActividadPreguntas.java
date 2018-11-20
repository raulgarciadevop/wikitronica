package com.wikitronica.programacionjavaapp;

import android.os.Bundle;
import android.app.Activity;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ActividadPreguntas extends Activity {
    Button btnConfirmar,btnSalir;
    TextView txtTiempo, txtPuntaje, txtPregunta;
    Juego juego;
    RadioButton rb1,rb2,rb3;
    RadioGroup rgroup;
    ImageView imgDisp;
    Pregunta act;
    int respActual;
    private CountDownTimer cdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_preguntas);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        juego=new Juego();
        Toast.makeText(getApplicationContext(), "Int: "+juego.getPreguntas().length,Toast.LENGTH_SHORT).show();

        btnConfirmar=findViewById(R.id.btnContinuar);
        txtTiempo=findViewById(R.id.txtTiempo);
        txtPregunta=findViewById(R.id.txtPreguntaActual);
        txtPuntaje=findViewById(R.id.txtPuntaje);
        rgroup=findViewById(R.id.rgroup);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        imgDisp=findViewById(R.id.imgDisplay);
        btnSalir=findViewById(R.id.btnSalir);

        btnSalir.setVisibility(View.INVISIBLE);



        cdt=new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                txtTiempo.setText("Tiempo: "+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                if(juego.isNotFinished()){
                    txtTiempo.setText("Tiempo agotado");
                    rellenarInterfaz();
                }else {
                    finalizar();
                }

            }
        };


        comenzar(0);


        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (juego.isNotFinished()){
                    checkId();
                    if(juego.revisarRes(respActual))
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


        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }

    private void checkId(){
        if(rgroup.getCheckedRadioButtonId()==R.id.rb1){
            respActual=1;
        }else if(rgroup.getCheckedRadioButtonId()==R.id.rb2){
            respActual=2;
        }else if(rgroup.getCheckedRadioButtonId()==R.id.rb3){
            respActual=3;
        }
    }

    private void rellenarInterfaz(){
        sDefaults();
        act=juego.getPregActual();
        //if (act==null)
        cdt.cancel();
        cdt.start();

        imgDisp.setImageResource(R.drawable.ic_menu_gallery); //check how to change this
    }

    private void sDefaults(){
        txtPuntaje.setText("Puntaje: "+juego.getPuntaje());
        setImagen();

        if(juego.getActual()==14){
            txtPregunta.setText("Pregunta: "+(juego.getActual()+1)+"/"+juego.getPreguntas().length);
        }else
            txtPregunta.setText("Pregunta: "+juego.getActual()+"/"+juego.getPreguntas().length);

        rgroup.clearCheck();
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
        btnSalir.setVisibility(View.GONE);
        btnConfirmar.setVisibility(View.VISIBLE);
        btnConfirmar.setText("Confirmar");
        cdt.cancel();
        cdt.start();

        if(o==0)
            act=juego.iniciar();
        else
            act=juego.iniciar(1);

        sDefaults();

        imgDisp.setImageResource(R.drawable.ic_menu_camera); //check how to change this

    }

    private void finalizar(){
        cdt.cancel();
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        txtTiempo.setText("Reiniciar");
        btnConfirmar.setText("Salir");
        txtPuntaje.setText("Puntaje final: "+juego.getPuntaje());


        btnSalir.setVisibility(View.VISIBLE);
        btnConfirmar.setVisibility(View.GONE);



        //Poner una imagen de juego terminado.


    }

    private void setImagen(){
        switch (juego.getActual()){
            case 0:
                imgDisp.setImageResource(R.mipmap.ic_led);
                break;
            case 1:
                imgDisp.setImageResource(R.mipmap.ic_dos_capacitor);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;
        }

    }





}
