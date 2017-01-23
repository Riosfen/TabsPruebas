package com.example.samo_.tabspruebas;

/**
 * Created by alumno2damdiurno on 25/10/16.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private View rootView;


    public PlaceholderFragment() {

    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        int i=getArguments().getInt(ARG_SECTION_NUMBER);

        switch(i){
            case 1:
                rootView = inflater.inflate(R.layout.pantalla_1, container, false);
                inicializarVentana1();
            break;
            case 2:
                rootView = inflater.inflate(R.layout.pantalla_2, container, false);
                inicializarVentana2();
            break;
            case 3:
                rootView = inflater.inflate(R.layout.pantalla_3, container, false);
                //TODO Vacio
            break;
            case 4:
                rootView = inflater.inflate(R.layout.pantalla_4, container, false);
            break;
        }

        return rootView;
    }

    private void inicializarVentana2() {
        Button logear = (Button) rootView.findViewById(R.id.login);

        logear.setOnClickListener(new View.OnClickListener() {
            EditText usuario = (EditText) rootView.findViewById(R.id.editUsuario);
            EditText pass = (EditText) rootView.findViewById(R.id.editPass);

            @Override
            public void onClick(View v) {
                String u = usuario.getText().toString();
                String p = pass.getText().toString();
                if(u.equals("") || p.equals("")){
                    Toast toast = Toast.makeText(getActivity().getApplicationContext(), "Todos los campos son obligatorios.", Toast.LENGTH_LONG);
                    toast.show();
                }else{
                    if(u.indexOf(" ") != -1 || p.indexOf(" ") != -1){
                        Toast toast = Toast.makeText(getActivity().getApplicationContext(), "Los campos no pueden contener espacios.", Toast.LENGTH_LONG);
                        toast.show();
                    }else{
                        usuario.setText("");
                        pass.setText("");
                        Toast toast = Toast.makeText(getActivity().getApplicationContext(), "El usuario " + u + " ha iniciado sesión.", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        });
    }

    private void inicializarVentana1() {
        Button registrar = (Button) rootView.findViewById(R.id.registrar);

        registrar.setOnClickListener(new View.OnClickListener() {
            EditText nombre = (EditText) rootView.findViewById(R.id.editNombre);
            EditText apellildos = (EditText) rootView.findViewById(R.id.editApellidos);
            EditText telefono = (EditText) rootView.findViewById(R.id.editTelefono);
            EditText email = (EditText) rootView.findViewById(R.id.editEmail);

            @Override
            public void onClick(View v) {
                String n = nombre.getText().toString().trim();
                String a = apellildos.getText().toString().trim();
                String t = telefono.getText().toString().trim();
                String e = email.getText().toString().trim();
                if (n.equals("") || a.equals("") || t.equals("") || e.equals("")){
                    Toast toast = Toast.makeText(getActivity().getApplicationContext(), "Todos los campos son obligatorios.", Toast.LENGTH_LONG);
                    toast.show();
                }else{
                    nombre.setText("");
                    apellildos.setText("");
                    telefono.setText("");
                    email.setText("");
                    Toast toast = Toast.makeText(getActivity().getApplicationContext(), "El usuario " + n + " " + a + " ha sido 'registrado'.", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
