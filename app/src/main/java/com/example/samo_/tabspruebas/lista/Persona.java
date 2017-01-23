package com.example.samo_.tabspruebas.lista;

/**
 * Created by elko91 on 23/10/16.
 */

public class Persona {
    private String nombre, telefono, correo;
    private boolean favorito;
    private Genero genero;
    //private static int contador = 0;

    public Persona(String nombre, String telefono, String correo, boolean favorito, Genero genero){
        this.nombre = nombre;
        this.telefono = telefono;
        this. correo = correo;
        this.favorito = favorito;
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public long getId(){
        return Persona.this.getId();
    }
}
