package com.example.guille.labo3tarea_00011417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Share extends AppCompatActivity {

    TextView tv1,tv2;
    private String text_aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        tv1 = (TextView)findViewById(R.id.shared_text);
        Intent new_intent = getIntent();
        if(new_intent!=null)
        {
            text_aux = new_intent.getStringExtra(Intent.EXTRA_TEXT);
        }
        tv1.setText(text_aux);
    }
}
