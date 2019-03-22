package com.example.guille.labo3tarea_00011417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2,et3,et4;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent avanzar = new Intent(MainActivity.this,NewActivity.class);
                //avanzar.putExtra("dato",et1.getText().toString());
                //startActivity(avanzar);
            }
        });
    }

    public void inicializar()
    {
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);
        et4 = (EditText)findViewById(R.id.et4);
        btn = (Button)findViewById(R.id.button);
    }
}
