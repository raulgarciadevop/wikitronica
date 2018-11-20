package com.wikitronica.programacionjavaapp;

public class Wiki {
    private int actual;
    private WikiPage[] paginas;


    public Wiki(){
        this.actual=0;
        paginas=new WikiPage[10];
        setPaginas();
    }

    private void setPaginas(){
        paginas[0]=new WikiPage("Titulo 1", "Contenido", "Imagen");
        paginas[1]=new WikiPage("Titulo 2", "Contenido", "Imagen");
        paginas[2]=new WikiPage("Titulo 3", "Contenido", "Imagen");
        paginas[3]=new WikiPage("Titulo 4", "Contenido", "Imagen");
        paginas[4]=new WikiPage("Titulo 5", "Contenido", "Imagen");
        paginas[5]=new WikiPage("Titulo 6", "Contenido", "Imagen");
        paginas[6]=new WikiPage("Titulo 7", "Contenido", "Imagen");
        paginas[7]=new WikiPage("Titulo 8", "Contenido", "Imagen");
        paginas[8]=new WikiPage("Titulo 9", "Contenido", "Imagen");
        paginas[9]=new WikiPage("Titulo 10", "Contenido", "Imagen");

    }

    public void siguiente(){
        actual++;
    }

    public int getActual(){
        return actual;
    }

    public WikiPage getPagina(int ac){
        return paginas[ac];
    }

    public WikiPage getPaginaActual(){
        return paginas[actual];
    }





}