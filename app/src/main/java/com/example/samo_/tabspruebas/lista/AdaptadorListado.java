package com.example.samo_.tabspruebas.lista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samo_.tabspruebas.R;

/**
 * Created by elko91 on 26/10/16.
 */

public class AdaptadorListado extends BaseAdapter {
    private Context contexto;
    private LayoutInflater inflador;
    private ListaPersonas listaPersonas;

    private ImageView imagen;
    private TextView nombre, telefono, correo;
    private ImageButton favorito;
    public AdaptadorListado(Context contexto, ListaPersonas listaPersonas) {
        this.listaPersonas = listaPersonas;
        this.contexto = contexto;
        inflador = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Persona p = listaPersonas.getPersona(position);

        if(convertView == null){
            convertView = inflador.inflate(R.layout.pantalla_3, null);
        }
        nombre = (TextView) convertView.findViewById(R.id.nombre_lista);
        telefono = (TextView) convertView.findViewById(R.id.telefono_lista);
        correo = (TextView) convertView.findViewById(R.id.correo_lista);

        nombre.setText(p.getNombre());
        telefono.setText(p.getTelefono());
        correo.setText(p.getCorreo());
        favorito = (ImageButton) convertView.findViewById(R.id.imageButton_lista);
        if(p.isFavorito() == true){
            favorito.setImageResource(R.drawable.favorito);
        }else{
            favorito.setImageResource(R.drawable.nofavorito);
        }
        favorito.setScaleType(ImageView.ScaleType.FIT_END);

        imagen = (ImageView) convertView.findViewById(R.id.imagen);
        if(p.getGenero() == Genero.HOMBRE){
            imagen.setImageResource(R.drawable.hombre);
        }else{
            imagen.setImageResource(R.drawable.mujer);
        }
        imagen.setScaleType(ImageView.ScaleType.FIT_END);

        return convertView;
    }

    @Override
    public int getCount() {
        return listaPersonas.getTamanio();
    }

    @Override
    public Object getItem(int position) {
        return listaPersonas.getPersona(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
