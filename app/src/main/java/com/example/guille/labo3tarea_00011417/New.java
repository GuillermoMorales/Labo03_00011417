package com.example.guille.labo3tarea_00011417;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class New extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        inicializar();

        String dato = getIntent().getStringExtra("dato");
        String dato2 = getIntent().getStringExtra("dato2");
        String dato3 = getIntent().getStringExtra("dato3");
        String dato4 = getIntent().getStringExtra("dato4");
        tv1.setText("Hola "+dato);
        tv2.setText("Tu contra "+dato2);
        tv3.setText("Correo: "+dato3);
        tv4.setText("Eres "+dato4);
    }

    public void inicializar()
    {
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
    }
}
