package com.pacoperezgalan.ad3b;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView nombre;
    TextView dni;
    TextView fecha;
    TextView sexo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre=(TextView) findViewById(R.id.tv_nombre);
        dni=(TextView) findViewById(R.id.tv_dni);
        fecha=(TextView) findViewById(R.id.tv_fecha);
        sexo=(TextView) findViewById(R.id.tv_sexo);

        SharedPreferences preferencias=getSharedPreferences("pref", Activity.MODE_PRIVATE);

        nombre.setText("Nombre: "+preferencias.getString("nombre",""));
        dni.setText("DNI: "+preferencias.getString("dni",""));
        fecha.setText("Fecha de nacimiento: "+preferencias.getString("fecha",""));
        sexo.setText("Sexo: "+preferencias.getString("sexo",""));

    }
}
