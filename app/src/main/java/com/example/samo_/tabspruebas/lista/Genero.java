package com.example.samo_.tabspruebas.lista;

import com.example.samo_.tabspruebas.R;

/**
 * Created by elko91 on 23/10/16.
 */

public enum Genero {
    HOMBRE("hombre", R.drawable.hombre),
    MUJER("mujer", R.drawable.mujer);

    String tipo;
    int idImagen;

    Genero(String tipo, int idImagen) {
        this.tipo = tipo;
        this.idImagen = idImagen;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getId(){
        return this.idImagen;
    }
}
