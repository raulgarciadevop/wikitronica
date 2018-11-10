package com.wikitronica.programacionjavaapp;

public class WikiPage {
    private String titulo;
    private String contenido;
    private String imgPath;

    public WikiPage() {

    }

    public WikiPage(String titulo, String contenido, String imgPath) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.imgPath = imgPath;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }


}
