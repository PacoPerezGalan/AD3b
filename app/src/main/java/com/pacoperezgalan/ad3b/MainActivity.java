package com.pacoperezgalan.ad3b;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText dni;
    EditText fecha;
    RadioGroup sexo;
    Button preferencias;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText) findViewById(R.id.et_nombre);
        dni=(EditText) findViewById(R.id.et_dni);
        fecha=(EditText) findViewById(R.id.et_fecha);
        sexo=(RadioGroup) findViewById(R.id.rg_sexo);

        preferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferencias= getSharedPreferences("pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor=preferencias.edit();

                editor.putString("nombre",nombre.getText().toString());
                editor.putInt("dni",Integer.parseInt(dni.getText().toString()));
                editor.putString("fecha",fecha.getText().toString());
                if(sexo.getCheckedRadioButtonId()==R.id.radioButton) {
                    editor.putString("sexo","Masculino");
                }else{
                    editor.putString("sexo","Femenino");
                }

                Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
