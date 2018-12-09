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
                    case "Fuente de Poder":
                        vv=1;
                        break;
                    case "Cautin":
                        vv=2;
                        break;
                    case "Relevador":
                        vv=3;
                        break;
                    case "Arduino Nano":
                        vv=4;
                        break;
                    case "Arduino Uno":
                        vv=5;
                        break;
                    case "Arduino Mega":
                        vv=6;
                        break;
                    case "Protoboard":
                        vv=7;
                        break;
                    case "Resistencias":
                        vv=8;
                        break;
                    case "Circuito Impreso":
                        vv=9;
                        break;
                    case "Integrado 555":
                        vv=10;
                        break;
                    case "Integrado lm741":
                        vv=11;
                        break;
                    case "Compuerta OR":
                        vv=12;
                        break;
                    case "Compuerta NOR":
                        vv=13;
                        break;

                        //lel

                    case "Compuerta AND":
                        vv=14;
                        break;
                    case "Compuerta NAND":
                        vv=15;
                        break;
                    case "Compuerta NOT":
                        vv=16;
                        break;
                    case "Compuerta XOR":
                        vv=17;
                        break;
                    case "Compuerta XNOR":
                        vv=18;
                        break;
                    case "Osciloscopio":
                        vv=19;
                        break;
                    case "Estaño":
                        vv=20;
                        break;
                    case "Tip 31":
                        vv=21;
                        break;
                    case "Tip 32":
                        vv=22;
                        break;
                    case "BJT":
                        vv=23;
                        break;
                    case "PLC":
                        vv=24;
                        break;
                    case "Display 7 Segmentos":
                        vv=25;
                        break;
                    case "Cables Dupont":
                        vv=26;
                        break;
                    case "Cable UTP":
                        vv=27;
                        break;

                    //lel

                    case "Octoacopladores":
                        vv=28;
                        break;
                    case "Sensor de Humedad":
                        vv=29;
                        break;
                    case "Sensor de A proximidad":
                        vv=30;
                        break;
                    case "Sensor de Humo":
                        vv=31;
                        break;
                    case "Sensor Infrarrojo":
                        vv=32;
                        break;
                    case "Sensor de Calor":
                        vv=33;
                        break;
                    case "Giroscopio":
                        vv=34;
                        break;
                    case "Módulo Bluetooth":
                        vv=35;
                        break;
                    case "Sensor de Colores":
                        vv=36;
                        break;
                    case "Diodo":
                        vv=37;
                        break;
                    case "Diodo zener":
                        vv=38;
                        break;
                    case "Bobina":
                        vv=39;
                        break;
                    case "Microcontrolador":
                        vv=40;
                        break;
                    case "Foco":
                        vv=41;
                        break;
                    case "Potenciómetro":
                        vv=42;
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

        String[] textos={"Led",
                "Fuente de Poder",
                "Cautin",
                "Relevador",
                "Arduino Nano",
                "Arduino Uno",
                "Arduino Mega",
                "Protoboard",
                "Resistencias",
                "Circuito Impreso",
                "Integrado 555",
                "Integrado lm741",
                "Compuerta OR",
                "Compuerta NOR",
                "Compuerta AND",
                "Compuerta NAND",
                "Compuerta NOT",
                "Compuerta XOR",
                "Compuerta XNOR",
                "Osciloscopio",
                "Estaño",
                "Tip 31",
                "Tip 32",
                "BJT",
                "PLC",
                "Display 7 Segmentos",
                "Cables Dupont",
                "Cable UTP",
                "Octoacopladores",
                "Sensor de Humedad",
                "Sensor de A proximidad",
                "Sensor de Humo",
                "Sensor Infrarrojo",
                "Sensor de Calor",
                "Giroscopio",
                "Módulo Bluetooth",
                "Sensor de Colores",
                "Diodo",
                "Diodo zener",
                "Bobina",
                "Microcontrolador",
                "Foco",
                "Potenciómetro"};

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,textos);
        actvBuscar.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
