package com.wikitronica.programacionjavaapp;

public class Pregunta {
    private String img;
    private String[] respuestas;
    private int correcta;

    public Pregunta(){
        respuestas=new String[3];

    }

    public Pregunta(String img, String[] respuestas) {
        this.img = img;
        this.respuestas = respuestas;
        respuestas=new String[3];
    }

    public Pregunta(String img, String res1, String res2, String res3){
        this.img = img;
        respuestas=new String[3];
        respuestas[0]=res1;
        respuestas[1]=res2;
        respuestas[2]=res3;

    }

    public Pregunta(String img, String res1, String res2, String res3, int corr){
        this.img = img;
        respuestas=new String[3];
        respuestas[0]=res1;
        respuestas[1]=res2;
        respuestas[2]=res3;
        this.correcta=corr;

    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public String getRespuesta(int n){
        return respuestas[n];
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }

    public void addRespuesta(String resp){
        if(!respuestasLlenas()){
            int i=0;
            for(String s:respuestas)
                if(s=="" || s==null){
                    respuestas[i]=resp;
                    i++;
                }
        }
    }

    public void addRespuesta(String resp1, String resp2, String resp3){
        if(!respuestasLlenas()){
            respuestas[0]=resp1;
            respuestas[1]=resp2;
            respuestas[2]=resp3;
        }
    }

    private boolean respuestasLlenas(){
        return respuestas.length>=2;
    }
}
