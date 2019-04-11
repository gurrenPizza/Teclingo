package com.ifrj.pibic.teclingo.entidades;

import com.ifrj.pibic.teclingo.DAO.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;

public class Baralhos {

    private String titulo;
    private String descricao;
    private String categoria;
    private String autor;
    private int quantCartas;

    public Baralhos() {    }

    public void salvar(){
        DatabaseReference referenciaDatabase = ConfiguracaoFirebase.getFirebase();
        referenciaDatabase.child("baralhos").child(String.valueOf(getTitulo())).setValue(this);
    }

    public int getQuantCartas() {
        return quantCartas;
    }

    public void setQuantCartas(Integer quantCartas) {
        this.quantCartas = quantCartas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
