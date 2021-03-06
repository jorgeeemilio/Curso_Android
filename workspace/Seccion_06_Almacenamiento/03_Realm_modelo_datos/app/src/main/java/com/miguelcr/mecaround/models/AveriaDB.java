package com.miguelcr.mecaround.models;

import com.miguelcr.mecaround.app.MyApp;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by miguelcampos on 27/10/17.
 */

public class AveriaDB extends RealmObject {

    @PrimaryKey
    private long id;
    private String titulo;
    private String modeloCoche;
    private String urlFoto;
    private int numeroPresupuestos;

    public AveriaDB() {
        this.id = MyApp.AveriaID.incrementAndGet();
    }

    public AveriaDB(String titulo, String modeloCoche, String urlFoto, int numeroPresupuestos) {
        this.id = MyApp.AveriaID.incrementAndGet();
        this.titulo = titulo;
        this.modeloCoche = modeloCoche;
        this.urlFoto = urlFoto;
        this.numeroPresupuestos = numeroPresupuestos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getModeloCoche() {
        return modeloCoche;
    }

    public void setModeloCoche(String modeloCoche) {
        this.modeloCoche = modeloCoche;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public int getNumeroPresupuestos() {
        return numeroPresupuestos;
    }

    public void setNumeroPresupuestos(int numeroPresupuestos) {
        this.numeroPresupuestos = numeroPresupuestos;
    }
}
