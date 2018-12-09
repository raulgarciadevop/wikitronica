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
    //private static final int[] IMAGES={R.mipmap.uno_led,R.mipmap.dos_capacitor,R.mipmap.tres_diodozener,R.mipmap.cuatro_diodo,R.mipmap.cinco_mosfet,R.mipmap.seis_transistor,R.mipmap.ocho_resistencia,R.mipmap.nueve_sensordetemperatura,R.mipmap.diez_dipswitch,R.mipmap.once_bobina,R.mipmap.doce_buzzer,R.mipmap.trece_multimetro,R.mipmap.catorce_servomotor,R.mipmap.quince_motor};
    private static final int[] IMAGES={
            R.mipmap.uno_led,
            R.mipmap.wiki_dos_fuentedp,
            R.mipmap.wiki_tres_cautin,
            R.mipmap.wiki_cuatro_relevador,
            R.mipmap.wiki_cinco_nano,
            R.mipmap.wiki_seis_uno,
            R.mipmap.wiki_siete_mega,
            R.mipmap.wiki_ocho_proto,
            R.mipmap.wiki_nueve_resistencias,
            R.mipmap.wiki_diez_circuitoimp,
            R.mipmap.wiki_once_integradocincocincocinco,
            R.mipmap.wiki_doce_integradoimsietecuatrouno,
            R.mipmap.wiki_trece_compuertaor,
            R.mipmap.wiki_catorce_compuertanor,
            R.mipmap.wiki_quince_compuertaand,
            R.mipmap.wiki_dieciseis_compuertanand,
            R.mipmap.wiki_diecisiete_compuertanot,
            R.mipmap.wiki_dieciocho_compuertaxor,
            R.mipmap.wiki_diecinueve_compuertaxnor,
            R.mipmap.wiki_veinte_osciloscopio,
            R.mipmap.wiki_veintiuno_estano,
            R.mipmap.wiki_veintidos_tiptreintayuno,
            R.mipmap.wiki_veintitres_tiptreintaydos,
            R.mipmap.wiki_veinticuatro_bjt,
            R.mipmap.wiki_veinticinco_plc,
            R.mipmap.wiki_veintiseis_displaysietesegmentos,
            R.mipmap.wiki_veintisiete_cablesdupont,
            R.mipmap.wiki_veintiocho_cableutp,
            R.mipmap.wiki_veintinueve_octoacopladores,
            R.mipmap.wiki_treinta_sensordehumedad,
            R.mipmap.wiki_treintayuno_sensordeproximidad,
            R.mipmap.wiki_treintaydos_sensordehumo,
            R.mipmap.wiki_treintaytres_sensorinfrarrojo,
            R.mipmap.wiki_treintaycuatro_sensordecalor,
            R.mipmap.wiki_treintaycinco_giroscopio,
            R.mipmap.wiki_treintayseis_modulobluetooth,
            R.mipmap.wiki_treintaysiete_sensordecolores,
            R.mipmap.wiki_treintayocho_diodo,
            R.mipmap.wiki_treintaynueve_diodozener,
            R.mipmap.wiki_cuarenta_bobina,
            R.mipmap.wiki_cuarentayuno_microcontrolador,
            R.mipmap.wiki_cuarentaydos_foco,
            R.mipmap.wiki_cuarentaytres_potencimetro};

    private int mPosition=-1;
    String val;


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


        val=getIntent().getExtras().getString("pagina");
        int vv=Integer.parseInt(val);

        if(vv>-1){
            mPosition=vv;
            wiki.setActual(vv);
        }else
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
