package com.wikitronica.programacionjavaapp;

import android.os.Bundle;
import android.app.Activity;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

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
    private ImageSwitcher switcher;
    private static final int[] IMAGES={R.mipmap.uno_led,R.mipmap.dos_capacitor,R.mipmap.tres_diodozener,R.mipmap.cuatro_diodo,R.mipmap.cinco_mosfet,R.mipmap.seis_transistor,R.mipmap.ic_launcher,R.mipmap.ocho_resistencia,R.mipmap.nueve_sensordetemperatura,R.mipmap.diez_dipswitch,R.mipmap.once_bobina,R.mipmap.doce_buzzer,R.mipmap.trece_multimetro,R.mipmap.catorce_servomotor,R.mipmap.quince_motor};
    private int mPosition=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_preguntas);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        switcher=findViewById(R.id.imgSwitcher);





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


        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });


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
        //setImagen();
        sDefaults();

        act=juego.getPregActual();
        //if (act==null)
        cdt.cancel();
        cdt.start();

        //imgDisp.setImageResource(R.drawable.ic_menu_gallery); //check how to change this
    }

    private void sDefaults(){
        mPosition++;
        switcher.setBackgroundResource(IMAGES[mPosition]);

        txtPuntaje.setText("Puntaje: "+juego.getPuntaje());
        //setImagen();

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
        //mPosition=0;

        if(o==0)
            act=juego.iniciar();
        else
            act=juego.iniciar(1);

        sDefaults();

        //imgDisp.setImageResource(R.drawable.ic_menu_camera); //check how to change this

    }

    private void finalizar(){
        cdt.cancel();
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        txtTiempo.setText("Reiniciar");
        btnConfirmar.setText("Salir");
        txtPuntaje.setText("Puntaje final: "+juego.getPuntaje());
        switcher.setBackgroundResource(R.mipmap.juego_terminado);


        btnSalir.setVisibility(View.VISIBLE);
        btnConfirmar.setVisibility(View.GONE);



        //Poner una imagen de juego terminado.


    }




    /*
    private void setImagen(){
        switch (juego.getActual()){
            case 0:
                imgDisp.setImageResource(R.mipmap.uno_led);
                //imgDisp.setImageResource(R.mipmap.ic_led);
                break;
            case 1:
                imgDisp.setImageResource(R.mipmap.dos_capacitor);
                //imgDisp.setImageResource(R.mipmap.ic_dos_capacitor);
                break;
            case 2:
                imgDisp.setImageResource(R.mipmap.tres_diodozener);
                break;
            case 3:
                imgDisp.setImageResource(R.mipmap.cuatro_diodo);
                break;
            case 4:
                imgDisp.setImageResource(R.mipmap.cinco_mosfet);
                break;
            case 5:
                imgDisp.setImageResource(R.mipmap.seis_transistor);
                break;
            case 6:
                imgDisp.setImageResource(R.mipmap.ocho_resistencia);
                break;
            case 7:
                imgDisp.setImageResource(R.mipmap.nueve_sensordetemperatura);
                break;
            case 8:
                imgDisp.setImageResource(R.mipmap.diez_dipswitch);
                break;
            case 9:
                imgDisp.setImageResource(R.mipmap.once_bobina);
                break;
            case 10:
                imgDisp.setImageResource(R.mipmap.doce_buzzer);
                break;
            case 11:
                imgDisp.setImageResource(R.mipmap.trece_multimetro);
                break;
            case 12:
                imgDisp.setImageResource(R.mipmap.catorce_servomotor);
                break;
            case 13:
                imgDisp.setImageResource(R.mipmap.quince_motor);
                break;
        }

    }

    */





}
