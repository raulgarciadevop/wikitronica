package com.wikitronica.programacionjavaapp;

public class Juego {
    private int puntaje;
    //private Pregunta actual;
    private int actual;
    private Pregunta[] preguntas;

    public Juego() {
        this.actual=0;
        this.puntaje=0;
        preguntas=new Pregunta[15];
        setPreguntas();
    }

    //Aqui se pueden ingresar las preguntas
    private void setPreguntas(){
        preguntas[0]=new Pregunta("Aqui va la imagen","Resistencia","Fotoresistor","Led", 3);//Pregunta 1 led
        preguntas[1]=new Pregunta("Aqui va la imagen","Capacitor","Transistor","Conector", 1);//Pregunta 2 capacitor
        preguntas[2]=new Pregunta("Aqui va la imagen","Diodo","Diodo zener","Resistencia", 2);//Pregunta 3 diodo zener
        preguntas[3]=new Pregunta("Aqui va la imagen","Capacitor","Led","Diodo", 3);//Pregunta 4 Diodo
        preguntas[4]=new Pregunta("Aqui va la imagen","Transistor","Mosfet","Opamp", 2);//Pregunta 5 mosfet
        preguntas[5]=new Pregunta("Aqui va la imagen","Transistor","Resistor","Sensor", 1);//Pregunta 6 Transistor

        preguntas[6]=new Pregunta("Aqui va la imagen","Diodo","Lector","Transistor", 1);//Pregunta 7 SIN RESPUESTA

        preguntas[7]=new Pregunta("Aqui va la imagen","Resistencia","Inductor","Diodo", 1);//Pregunta 8 Resistencia
        preguntas[8]=new Pregunta("Aqui va la imagen","Sensor de luz","Sensor de sonido","Sensor de temperatura", 3);//Pregunta 9 Sensor de temperatura
        preguntas[9]=new Pregunta("Aqui va la imagen","Dip switch","Contador","Capacitor", 1);//Pregunta 10 Dip switch

        preguntas[10]=new Pregunta("Aqui va la imagen","Capacitor","Bobina","Transformador", 2);//Pregunta 10 Bobina
        preguntas[11]=new Pregunta("Aqui va la imagen","Buzzer","Sensor","Tensor", 1);//Pregunta 10 Buzzer
        preguntas[12]=new Pregunta("Aqui va la imagen","Osciloscopio","Multímetro","Contador", 2);//Pregunta 10 Multímetro
        preguntas[13]=new Pregunta("Aqui va la imagen","Sensor de agua","Bobina","Servomotor", 3);//Pregunta 10 Servomotor
        preguntas[14]=new Pregunta("Aqui va la imagen","Transformador","Motor","Servomotor", 2);//Pregunta 10 Motor


    }

    public void siguiente(){
        if(actual<preguntas.length-1)
            actual++;
    }

    public int getActual(){
        return actual;
    }

    public Pregunta getPregunta(int ind){
        return preguntas[ind];
    }

    public Pregunta getPreguntaActual(){
        return preguntas[actual];
    }

    public void addPunto(){
        puntaje++;
    }

    public int getPuntaje(){
        return puntaje;
    }

    public void reiniciar(){
        this.puntaje=0;
        this.actual=0;
    }

    public boolean revisarRes(int res){
        return preguntas[actual].getCorrecta()==res;
    }

    public void revisarResp(int ress){
        if(preguntas[actual].getCorrecta()==ress)
            addPunto();
    }

    public int getTam(){
        return preguntas.length;
    }


    /*

    public Pregunta iniciar(){
        int a=actual;
        actual++;
        return preguntas[a];
    }

    public Pregunta iniciar(int o){
        setDefaults();
        int a=actual;
        actual++;
        return preguntas[a];
    }

    private void setDefaults(){
        preguntas=new Pregunta[15];
        setPreguntas();
        puntaje=0;
        actual=0;
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



    public boolean isNotFinished(){
        return actual<preguntas.length;
    }

    public Pregunta getPregActual(){
        if(actual<preguntas.length){
            Pregunta pr=preguntas[actual];
            actual++;
            return pr;
        }
        else {

            return null;//new Pregunta("asd","","","",0);

        }

    }

    public void finalizar(int a){
        switch (a){
            case 2:
                int ultimaP=actual;
                int puntajeF=puntaje;
                break;
        }
    }

    */

}
