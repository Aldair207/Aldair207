package com.example.parcial1;



import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla2 extends AppCompatActivity {

    TextView txtRespuestas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        txtRespuestas = findViewById(R.id.txt_respuestas);

        String respuestas = "1) c\n2) c\n3) c\n4) b\n5) c\n6) a\n7) c\n8) b";
        txtRespuestas.setText(respuestas);
    }
}
