package com.wikitronica.programacionjavaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class SplashWiki extends AppCompatActivity {
    AutoCompleteTextView actvBuscar;
    Button btnBuscar,btnIr;
    Intent a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_wiki);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actvBuscar=findViewById(R.id.actvBuscador);
        btnBuscar=findViewById(R.id.btnBuscar);
        btnIr=findViewById(R.id.btnContinuar);

        a=new Intent(getApplicationContext(),ActividadWiki.class);

        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.putExtra("pagina","-1");
                startActivity(a);
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=actvBuscar.getText().toString();
                int vv;
                switch (val){
                    case "Led":
                        vv=0;
                        break;
                    case "Capacitor":
                        vv=1;
                        break;
                    case "Diodo Zener":
                        vv=2;
                        break;
                    case "Diodo":
                        vv=3;
                        break;
                    case "Mosfet":
                        vv=4;
                        break;
                    case "Transistor":
                        vv=5;
                        break;
                    case "Resistencia":
                        vv=6;
                        break;
                    case "Sensor de temperatura":
                        vv=7;
                        break;
                    case "Dip Switch":
                        vv=8;
                        break;
                    case "Bobina":
                        vv=9;
                        break;
                    case "Buzzer":
                        vv=10;
                        break;
                    case "Multimetro":
                        vv=11;
                        break;
                    case "Servomotor":
                        vv=12;
                        break;
                    case "Motor":
                        vv=13;
                        break;

                        default:
                            Toast.makeText(getApplicationContext(),"Error: seleccione un valor valido de la lista de autocompletado.",Toast.LENGTH_SHORT).show();
                            vv=-1;
                            break;
                }
                val=vv+"";

                a.putExtra("pagina",val);
                startActivity(a);
            }
        });

        String[] textos={"Led","Capacitor","Diodo Zener", "Diodo", "Mosfet", "Transistor", "Resistencia", "Sensor de temperatura", "Dip Switch", "Bobina", "Buzzer", "Multimetro", "Servomotor", "Motor"};

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,textos);
        actvBuscar.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
