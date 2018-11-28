package com.wikitronica.programacionjavaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import org.w3c.dom.Text;

public class ActividadWiki extends AppCompatActivity {
    ImageButton btnNext,btnPrev;
    private ImageSwitcher switcher;
    TextView txtTitulo, txtContenido;
    private Wiki wiki;
    private static final int[] IMAGES={R.mipmap.uno_led,R.mipmap.dos_capacitor,R.mipmap.tres_diodozener,R.mipmap.cuatro_diodo,R.mipmap.cinco_mosfet,R.mipmap.seis_transistor,R.mipmap.ocho_resistencia,R.mipmap.nueve_sensordetemperatura,R.mipmap.diez_dipswitch,R.mipmap.once_bobina,R.mipmap.doce_buzzer,R.mipmap.trece_multimetro,R.mipmap.catorce_servomotor,R.mipmap.quince_motor};
    private int mPosition=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_wiki);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnNext=findViewById(R.id.btnNext);
        txtTitulo=findViewById(R.id.txtTitulo);
        txtContenido=findViewById(R.id.txtContenido);
        btnPrev=findViewById(R.id.btnPrevious);
        switcher=findViewById(R.id.imgSwitch);
        wiki=new Wiki();


        mPosition=0;
        rellenarInterfaz();





        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mPosition<IMAGES.length-1)
                    siguiente();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mPosition>0)
                    anterior();
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
        mPosition++;
        rellenarInterfaz();
    }

    private void anterior(){
        wiki.anterior();
        mPosition--;
        rellenarInterfaz();
    }

    private void rellenarInterfaz(){
        //Set imagen
        switcher.setBackgroundResource(IMAGES[mPosition]);
        txtTitulo.setText(wiki.getPaginaActual().getTitulo());
        txtContenido.setText(wiki.getPaginaActual().getContenido());


    }



}
