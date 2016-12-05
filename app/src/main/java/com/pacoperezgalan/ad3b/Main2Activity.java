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
        dni=(TextView) findViewById(R.id.tv_nombre);
        fecha=(TextView) findViewById(R.id.tv_nombre);
        sexo=(TextView) findViewById(R.id.tv_nombre);

        SharedPreferences preferencias=getSharedPreferences("pref", Activity.MODE_PRIVATE);

        nombre.setText(preferencias.getString("nombre",""));
        dni.setText(preferencias.getInt("dni",0));
        fecha.setText(preferencias.getString("fecha",""));
        sexo.setText(preferencias.getString("sexo",""));

    }
}
