package com.example.gatocubanokitzia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String[] jugadores = new String[2];
    public TextView jugador1;
    public TextView jugador2;
    public boolean jugador;
    public int valores[] = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6,
                            R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12,
                            R.id.btn13, R.id.btn14, R.id.btn15, R.id.btn16, R.id.btn17, R.id.btn18,
                            R.id.btn19, R.id.btn20, R.id.btn21, R.id.btn22, R.id.btn23, R.id.btn24,
                            R.id.btn25, R.id.btn26, R.id.btn27, R.id.btn28, R.id.btn29, R.id.btn30,
                            R.id.btn31, R.id.btn32, R.id.btn33, R.id.btn34, R.id.btn35, R.id.btn36};
    public int resultados[] = {0,0,0,0,0,0,
                            0,0,0,0,0,0,
                            0,0,0,0,0,0,
                            0,0,0,0,0,0,
                            0,0,0,0,0,0,
                            0,0,0,0,0,0};
    public int posicionesG[][] = {{0,1,2,3}, {1,2,3,4}, {2,3,4,5}, {6,7,8,9}, {7,8,9,10}, {8,9,10,11}, {12,13,14,15}, {13,14,15,16}, {14,15,16,17},
                                {18,19,20,21}, {19,20,21,22}, {20,21,22,23}, {24,25,26,27}, {25,26,27,28}, {26,27,28,29}, {30,31,32,33}, {31,32,33,34}, {32,33,34,35,36},
                                {0,6,12,18}, {6,12,18,24}, {12,18,24,30}, {1,7,13,19}, {7,13,19,25}, {13,19,25,31}, {2,8,14,20}, {8,14,20,26}, {14,20,26,32},
                                {3,9,15,21}, {9,15,21,27}, {15,21,27,33}, {4,10,16,22}, {10,16,22,28}, {16,22,28,34}, {5,11,17,23}, {11,17,23,29}, {17,23,29,35},
                                {2,9,16,23}, {1,8,15,22}, {8,15,22,29}, {0,7,14,21}, {7,14,21,28}, {14,21,28,35}, {6,13,20,27}, {13,20,27,34}, {12,19,26,33},
                                {3,8,13,18}, {4,9,14,19}, {9,14,19,24}, {5,10,15,20}, {10,15,20,25}, {15,20,25,30}, {11,16,21,26}, {16,21,26,31}, {17,22,27,32}};
    public int contadorR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugadores = getIntent().getStringArrayExtra("nombresJugadores");
        jugador1 = findViewById(R.id.textViewJ1);
        jugador2 = findViewById(R.id.textViewJ2);

        if(jugadores[0].equals("") && jugadores[1].equals("")){
            jugadores[0] = "Jugador 1";
            jugadores[1] = "Jugador 2";

        } else{
            if (jugadores[1].equals("")) {
                jugadores[1] = "Jugador 2";
            }
            else{
                if(jugadores[0].equals("")){
                    jugadores[0] = "Jugador 1";
                }
            }
        }

        jugador1.setText(jugadores[0]);
        jugador2.setText(jugadores[1]);

        Button btn;
        jugador = false;

        for(int i = 0; i<36; i++)
        {
            int valor = valores[i];
            btn =  findViewById(valor);
            btn.setOnClickListener(new View.OnClickListener() {

            @Override
                public void onClick(View v) {
                    if (jugador)
                    {
                        ((Button)v).setBackgroundResource(R.drawable.circulo);
                        ((Button)v).setText("o");
                        jugador = false;
                    }
                    else
                    {
                        ((Button)v).setBackgroundResource(R.drawable.tache);
                        ((Button)v).setText("x");
                        jugador = true;
                    }
                    ((Button)v).setEnabled( false );
                    contadorR++;
                    resultado();


                }

            });

        }
        if(checarGanador()){
            String texto;
            if (jugador){
                texto = "Ganó " + jugadores[0]+ " !";
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
            } else {
                texto = "Ganó " + jugadores[1]+ " !";
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
            }
        }
        else {
            if (contadorR == 36) {
                Toast.makeText(this, "Empate...", Toast.LENGTH_SHORT).show();
            } else {
                jugador = !jugador;
            }
        }
    }


    public void resultado() {
        Button button = null;
        for (int i = 0; i < valores.length; i++) {
            button = findViewById(valores[i]);
            if (!button.isEnabled()) {
                if ("x".equals(button.getText().toString())) {
                    resultados[i] = 1;
                } else {
                    resultados[i] = 2;
                }
            }
        }
    }

    public boolean checarGanador(){
        boolean ganador = false;

        for (int [] posiciones : posicionesG){
            if (resultados[posiciones[0]] == resultados[posiciones[1]] && resultados[posiciones[1]] == resultados[posiciones[2]]
                    && resultados[posiciones[2]] == resultados[posiciones[3]] && resultados[posiciones[0]] != 0) {
                ganador = true;
                break;
            }
        }
        return ganador;
    }

    public void ReiniciarClick(View view){
        Button btn;
        for (int i= 0; i<valores.length; i++){
            btn = findViewById(valores[i]);
            btn.setEnabled(true);
            btn.setText("");
            btn.setBackgroundResource(0);
            int color = getResources().getColor(R.color.teal);
            btn.setBackgroundColor(color);
            resultados[i] = 0;
        }
        contadorR = 0;
    }

    public void Volver(View view){
        Intent intento = new Intent(this, jugadores.class);
        startActivity(intento);
    }
}