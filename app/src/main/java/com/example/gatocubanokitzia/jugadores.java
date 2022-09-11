package com.example.gatocubanokitzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class jugadores extends AppCompatActivity {
    EditText jugador1;
    EditText jugador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);

        jugador1 = findViewById(R.id.editText1);
        jugador2 = findViewById(R.id.editText2);
    }
    public void btnJ(View view){
        String nom1 = jugador1.getText().toString();
        String nom2 = jugador2.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("nombresJugadores", new String[] {nom1, nom2});
        startActivity(intent);


    }
}