package com.wikitronica.programacionjavaapp;


public class Juego {
    private int puntaje;
    //private Pregunta actual;
    private int actual;
    private Pregunta[] preguntas;

    //Aqui se pueden ingresar las preguntas
    private void setPreguntas(){
        preguntas[0]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 1
        preguntas[1]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 2
        preguntas[2]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 3
        preguntas[3]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 4
        preguntas[4]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 5
        preguntas[5]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 6
        preguntas[6]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 7
        preguntas[7]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 8
        preguntas[8]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 9
        preguntas[9]=new Pregunta("Aqui va la imagen","respuesta 1","respuesta 2","respuesta 3", 1);//Pregunta 10

    }


    public Juego() {
        preguntas=new Pregunta[10];
        setPreguntas();
        puntaje=0;
        actual=0;
    }

    public Pregunta iniciar(){
        int a=actual;
        actual++;
        return preguntas[a];
    }

    public Pregunta[] getPreguntas(){
        return preguntas;
    }

    public boolean revisarRes(int res){
        return preguntas[actual].getCorrecta()==res;
    }

    public void addPunto(){
        puntaje++;
    }

    public int getPuntaje(){
        return puntaje;
    }

    public Pregunta getPregActual(){
        if(actual<=9){
            actual++;
            return preguntas[actual];
        }
        else
            return null;
    }

}
