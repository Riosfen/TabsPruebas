package com.example.samo_.tabspruebas.lista;

import java.util.ArrayList;

/**
 * Created by elko91 on 23/10/16.
 */

public class ListaPersonas {
    private ArrayList<Persona> listaPersonas;

    public ListaPersonas(){
        listaPersonas = new ArrayList<Persona>();
    }

    public void addPersona(Persona persona){
        this.listaPersonas.add(persona);
    }

    public int getTamanio(){
        return this.listaPersonas.size();
    }

    public Persona getPersona(int posicion){
        return this.listaPersonas.get(posicion);
    }
}
