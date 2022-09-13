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
    public boolean ganador;
    public boolean cambiar;

    public boolean j1;
    public boolean j2;
    public boolean j3;
    public boolean j4;
    public boolean j5;
    public boolean j6;
    public boolean j7;
    public boolean j8;
    public boolean j9;
    public boolean j10;
    public boolean j11;
    public boolean j12;
    public boolean j13;
    public boolean j14;
    public boolean j15;
    public boolean j16;
    public boolean j17;
    public boolean j18;
    public boolean j19;
    public boolean j20;
    public boolean j21;
    public boolean j22;
    public boolean j23;
    public boolean j24;
    public boolean j25;
    public boolean j26;
    public boolean j27;
    public boolean j28;
    public boolean j29;
    public boolean j30;
    public boolean j31;
    public boolean j32;
    public boolean j33;
    public boolean j34;
    public boolean j35;
    public boolean j36;


    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;
    public Button btn17;
    public Button btn18;
    public Button btn19;
    public Button btn20;
    public Button btn21;
    public Button btn22;
    public Button btn23;
    public Button btn24;
    public Button btn25;
    public Button btn26;
    public Button btn27;
    public Button btn28;
    public Button btn29;
    public Button btn30;
    public Button btn31;
    public Button btn32;
    public Button btn33;
    public Button btn34;
    public Button btn35;
    public Button btn36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugadores = getIntent().getStringArrayExtra("nombresJugadores");
        jugador1 = findViewById(R.id.textViewJ1);
        jugador2 = findViewById(R.id.textViewJ2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        btn26 = findViewById(R.id.btn26);
        btn27 = findViewById(R.id.btn27);
        btn28 = findViewById(R.id.btn28);
        btn29 = findViewById(R.id.btn29);
        btn30 = findViewById(R.id.btn30);
        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);
        btn35 = findViewById(R.id.btn35);
        btn36 = findViewById(R.id.btn36);

        j1 =true;
        j2 =true;
        j3 =true;
        j4 =true;
        j5 =true;
        j6 =true;
        j7 =true;
        j8 =true;
        j9 =true;
        j10 =true;
        j11 =true;
        j12 =true;
        j13 =true;
        j14 =true;
        j15 =true;
        j16 =true;
        j17 =true;
        j18 =true;
        j19 =true;
        j20 =true;
        j21 =true;
        j22 =true;
        j23 =true;
        j24 =true;
        j25 =true;
        j26 =true;
        j27 =true;
        j28 =true;
        j29 =true;
        j30 =true;
        j31 =true;
        j32 =true;
        j33 =true;
        j34 =true;
        j35 =true;
        j36 =true;

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

        jugador = false;
        ganador = false;

        }

    public void presionar1(View v){
        if (!ganador) {
            if (j1) {
                if (cambiar) {
                    btn1.setBackgroundResource(R.drawable.circulo);
                    btn1.setText("O");
                    cambiar = false;
                    j1 = false;
                } else {
                    btn1.setBackgroundResource(R.drawable.tache);
                    btn1.setText("X");
                    cambiar = true;
                    j1 = false;
                }
            } else {
                if (j7) {
                    if (cambiar) {
                        btn7.setBackgroundResource(R.drawable.circulo);
                        btn7.setText("O");
                        cambiar = false;
                        j7 = false;
                    } else {
                        btn7.setBackgroundResource(R.drawable.tache);
                        btn7.setText("X");
                        cambiar = true;
                        j7 = false;
                    }
                } else {
                    if (j13) {
                        if (cambiar) {
                            btn13.setBackgroundResource(R.drawable.circulo);
                            btn13.setText("O");
                            cambiar = false;
                            j13 = false;
                        } else {
                            btn13.setBackgroundResource(R.drawable.tache);
                            btn13.setText("X");
                            cambiar = true;
                            j13 = false;
                        }
                    } else {
                        if (j19) {
                            if (cambiar) {
                                btn19.setBackgroundResource(R.drawable.circulo);
                                btn19.setText("O");
                                cambiar = false;
                                j19 = false;
                            } else {
                                btn19.setBackgroundResource(R.drawable.tache);
                                btn19.setText("X");
                                cambiar = true;
                                j19 = false;
                            }
                        } else {
                            if (j25) {
                                if (cambiar) {
                                    btn25.setBackgroundResource(R.drawable.circulo);
                                    btn25.setText("O");
                                    cambiar = false;
                                    j25 = false;
                                } else {
                                    btn25.setBackgroundResource(R.drawable.tache);
                                    btn25.setText("X");
                                    cambiar = true;
                                    j25 = false;
                                }
                            } else {
                                if (j31) {
                                    if (cambiar) {
                                        btn31.setBackgroundResource(R.drawable.circulo);
                                        btn31.setText("O");
                                        cambiar = false;
                                        j31 = false;
                                    } else {
                                        btn31.setBackgroundResource(R.drawable.tache);
                                        btn31.setText("X");
                                        cambiar = true;
                                        j31 = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ganador();
        }
    }
    public void presionar2(View v){
        if (!ganador) {
            if (j2) {
                if (cambiar) {
                    btn2.setBackgroundResource(R.drawable.circulo);
                    btn2.setText("O");
                    cambiar = false;
                    j2 = false;
                } else {
                    btn2.setBackgroundResource(R.drawable.tache);
                    btn2.setText("X");
                    cambiar = true;
                    j2 = false;
                }
            } else {
                if (j8) {
                    if (cambiar) {
                        btn8.setBackgroundResource(R.drawable.circulo);
                        btn8.setText("O");
                        cambiar = false;
                        j8 = false;
                    } else {
                        btn8.setBackgroundResource(R.drawable.tache);
                        btn8.setText("X");
                        cambiar = true;
                        j8 = false;
                    }
                } else {
                    if (j14) {
                        if (cambiar) {
                            btn14.setBackgroundResource(R.drawable.circulo);
                            btn14.setText("O");
                            cambiar = false;
                            j14 = false;
                        } else {
                            btn14.setBackgroundResource(R.drawable.tache);
                            btn14.setText("X");
                            cambiar = true;
                            j14 = false;
                        }
                    } else {
                        if (j20) {
                            if (cambiar) {
                                btn20.setBackgroundResource(R.drawable.circulo);
                                btn20.setText("O");
                                cambiar = false;
                                j20 = false;
                            } else {
                                btn20.setBackgroundResource(R.drawable.tache);
                                btn20.setText("X");
                                cambiar = true;
                                j20 = false;
                            }
                        } else {
                            if (j26) {
                                if (cambiar) {
                                    btn26.setBackgroundResource(R.drawable.circulo);
                                    btn26.setText("O");
                                    cambiar = false;
                                    j26 = false;
                                } else {
                                    btn26.setBackgroundResource(R.drawable.tache);
                                    btn26.setText("X");
                                    cambiar = true;
                                    j26 = false;
                                }
                            } else {
                                if (j32) {
                                    if (cambiar) {
                                        btn32.setBackgroundResource(R.drawable.circulo);
                                        btn32.setText("O");
                                        cambiar = false;
                                        j32 = false;
                                    } else {
                                        btn32.setBackgroundResource(R.drawable.tache);
                                        btn32.setText("X");
                                        cambiar = true;
                                        j32 = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ganador();
        }
    }

    public void presionar3(View v){
        if (!ganador) {
            if (j3) {
                if (cambiar) {
                    btn3.setBackgroundResource(R.drawable.circulo);
                    btn3.setText("O");
                    cambiar = false;
                    j3 = false;
                } else {
                    btn3.setBackgroundResource(R.drawable.tache);
                    btn3.setText("X");
                    cambiar = true;
                    j3 = false;
                }
            } else {
                if (j9) {
                    if (cambiar) {
                        btn9.setBackgroundResource(R.drawable.circulo);
                        btn9.setText("O");
                        cambiar = false;
                        j9 = false;
                    } else {
                        btn9.setBackgroundResource(R.drawable.tache);
                        btn9.setText("X");
                        cambiar = true;
                        j9 = false;
                    }
                } else {
                    if (j15) {
                        if (cambiar) {
                            btn15.setBackgroundResource(R.drawable.circulo);
                            btn15.setText("O");
                            cambiar = false;
                            j15 = false;
                        } else {
                            btn15.setBackgroundResource(R.drawable.tache);
                            btn15.setText("X");
                            cambiar = true;
                            j15 = false;
                        }
                    } else {
                        if (j21) {
                            if (cambiar) {
                                btn21.setBackgroundResource(R.drawable.circulo);
                                btn21.setText("O");
                                cambiar = false;
                                j21 = false;
                            } else {
                                btn21.setBackgroundResource(R.drawable.tache);
                                btn21.setText("X");
                                cambiar = true;
                                j21 = false;
                            }
                        } else {
                            if (j27) {
                                if (cambiar) {
                                    btn27.setBackgroundResource(R.drawable.circulo);
                                    btn27.setText("O");
                                    cambiar = false;
                                    j27 = false;
                                } else {
                                    btn27.setBackgroundResource(R.drawable.tache);
                                    btn27.setText("X");
                                    cambiar = true;
                                    j27 = false;
                                }
                            } else {
                                if (j33) {
                                    if (cambiar) {
                                        btn33.setBackgroundResource(R.drawable.circulo);
                                        btn33.setText("O");
                                        cambiar = false;
                                        j33 = false;
                                    } else {
                                        btn33.setBackgroundResource(R.drawable.tache);
                                        btn33.setText("X");
                                        cambiar = true;
                                        j33 = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ganador();
        }
    }

    public void presionar4(View v){
        if (!ganador) {
            if (j4) {
                if (cambiar) {
                    btn4.setBackgroundResource(R.drawable.circulo);
                    btn4.setText("O");
                    cambiar = false;
                    j4 = false;
                } else {
                    btn4.setBackgroundResource(R.drawable.tache);
                    btn4.setText("X");
                    cambiar = true;
                    j4 = false;
                }
            } else {
                if (j10) {
                    if (cambiar) {
                        btn10.setBackgroundResource(R.drawable.circulo);
                        btn10.setText("O");
                        cambiar = false;
                        j10 = false;
                    } else {
                        btn10.setBackgroundResource(R.drawable.tache);
                        btn10.setText("X");
                        cambiar = true;
                        j10 = false;
                    }
                } else {
                    if (j16) {
                        if (cambiar) {
                            btn16.setBackgroundResource(R.drawable.circulo);
                            btn16.setText("O");
                            cambiar = false;
                            j16 = false;
                        } else {
                            btn16.setBackgroundResource(R.drawable.tache);
                            btn16.setText("X");
                            cambiar = true;
                            j16 = false;
                        }
                    } else {
                        if (j22) {
                            if (cambiar) {
                                btn22.setBackgroundResource(R.drawable.circulo);
                                btn22.setText("O");
                                cambiar = false;
                                j22 = false;
                            } else {
                                btn22.setBackgroundResource(R.drawable.tache);
                                btn22.setText("X");
                                cambiar = true;
                                j22 = false;
                            }
                        } else {
                            if (j28) {
                                if (cambiar) {
                                    btn28.setBackgroundResource(R.drawable.circulo);
                                    btn28.setText("O");
                                    cambiar = false;
                                    j28 = false;
                                } else {
                                    btn28.setBackgroundResource(R.drawable.tache);
                                    btn28.setText("X");
                                    cambiar = true;
                                    j28 = false;
                                }
                            } else {
                                if (j34) {
                                    if (cambiar) {
                                        btn34.setBackgroundResource(R.drawable.circulo);
                                        btn34.setText("O");
                                        cambiar = false;
                                        j34 = false;
                                    } else {
                                        btn34.setBackgroundResource(R.drawable.tache);
                                        btn34.setText("X");
                                        cambiar = true;
                                        j34 = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ganador();
        }
    }

    public void presionar5(View v){
        if (!ganador) {
            if (j5) {
                if (cambiar) {
                    btn5.setBackgroundResource(R.drawable.circulo);
                    btn5.setText("O");
                    cambiar = false;
                    j5 = false;
                } else {
                    btn5.setBackgroundResource(R.drawable.tache);
                    btn5.setText("X");
                    cambiar = true;
                    j5 = false;
                }
            } else {
                if (j11) {
                    if (cambiar) {
                        btn11.setBackgroundResource(R.drawable.circulo);
                        btn11.setText("O");
                        cambiar = false;
                        j11 = false;
                    } else {
                        btn11.setBackgroundResource(R.drawable.tache);
                        btn11.setText("X");
                        cambiar = true;
                        j11 = false;
                    }
                } else {
                    if (j17) {
                        if (cambiar) {
                            btn17.setBackgroundResource(R.drawable.circulo);
                            btn17.setText("O");
                            cambiar = false;
                            j17 = false;
                        } else {
                            btn17.setBackgroundResource(R.drawable.tache);
                            btn17.setText("X");
                            cambiar = true;
                            j17 = false;
                        }
                    } else {
                        if (j23) {
                            if (cambiar) {
                                btn23.setBackgroundResource(R.drawable.circulo);
                                btn23.setText("O");
                                cambiar = false;
                                j23 = false;
                            } else {
                                btn23.setBackgroundResource(R.drawable.tache);
                                btn23.setText("X");
                                cambiar = true;
                                j23 = false;
                            }
                        } else {
                            if (j29) {
                                if (cambiar) {
                                    btn29.setBackgroundResource(R.drawable.circulo);
                                    btn29.setText("O");
                                    cambiar = false;
                                    j29 = false;
                                } else {
                                    btn29.setBackgroundResource(R.drawable.tache);
                                    btn29.setText("X");
                                    cambiar = true;
                                    j29 = false;
                                }
                            } else {
                                if (j35) {
                                    if (cambiar) {
                                        btn35.setBackgroundResource(R.drawable.circulo);
                                        btn35.setText("O");
                                        cambiar = false;
                                        j35 = false;
                                    } else {
                                        btn35.setBackgroundResource(R.drawable.tache);
                                        btn35.setText("X");
                                        cambiar = true;
                                        j35 = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ganador();
        }
    }


    public void presionar6(View v){
        if (!ganador) {
            if (j6) {
                if (cambiar) {
                    btn6.setBackgroundResource(R.drawable.circulo);
                    btn6.setText("O");
                    cambiar = false;
                    j6 = false;
                } else {
                    btn6.setBackgroundResource(R.drawable.tache);
                    btn6.setText("X");
                    cambiar = true;
                    j6 = false;
                }
            } else {
                if (j12) {
                    if (cambiar) {
                        btn12.setBackgroundResource(R.drawable.circulo);
                        btn12.setText("O");
                        cambiar = false;
                        j12 = false;
                    } else {
                        btn12.setBackgroundResource(R.drawable.tache);
                        btn12.setText("X");
                        cambiar = true;
                        j12 = false;
                    }
                } else {
                    if (j18) {
                        if (cambiar) {
                            btn18.setBackgroundResource(R.drawable.circulo);
                            btn18.setText("O");
                            cambiar = false;
                            j18 = false;
                        } else {
                            btn18.setBackgroundResource(R.drawable.tache);
                            btn18.setText("X");
                            cambiar = true;
                            j18 = false;
                        }
                    } else {
                        if (j24) {
                            if (cambiar) {
                                btn24.setBackgroundResource(R.drawable.circulo);
                                btn24.setText("O");
                                cambiar = false;
                                j24 = false;
                            } else {
                                btn24.setBackgroundResource(R.drawable.tache);
                                btn24.setText("X");
                                cambiar = true;
                                j24 = false;
                            }
                        } else {
                            if (j30) {
                                if (cambiar) {
                                    btn30.setBackgroundResource(R.drawable.circulo);
                                    btn30.setText("O");
                                    cambiar = false;
                                    j30 = false;
                                } else {
                                    btn30.setBackgroundResource(R.drawable.tache);
                                    btn30.setText("X");
                                    cambiar = true;
                                    j30 = false;
                                }
                            } else {
                                if (j36) {
                                    if (cambiar) {
                                        btn36.setBackgroundResource(R.drawable.circulo);
                                        btn36.setText("O");
                                        cambiar = false;
                                        j36 = false;
                                    } else {
                                        btn36.setBackgroundResource(R.drawable.tache);
                                        btn36.setText("X");
                                        cambiar = true;
                                        j36 = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ganador();
        }
    }



    public void ganador(){
        if (btn1.getText().toString() == "X" & btn7.getText().toString() == "x" & btn13.getText().toString() == "X" & btn19.getText().toString() == "X" || btn7.getText().toString() == "X" & btn13.getText().toString() == "X" & btn19.getText().toString() == "X" & btn25.getText().toString() == "X" || btn13.getText().toString() == "X" & btn19.getText().toString() == "X" & btn25.getText().toString() == "X" & btn31.getText().toString() == "X"
                || btn2.getText().toString() == "X" & btn8.getText().toString() == "X" & btn14.getText().toString() == "X" & btn20.getText().toString() == "X" || btn8.getText().toString() == "X" & btn14.getText().toString() == "X" & btn20.getText().toString() == "X" & btn26.getText().toString() == "X" || btn14.getText().toString() == "X" & btn20.getText().toString() == "X" & btn26.getText().toString() == "X" & btn32.getText().toString() == "X"
                || btn3.getText().toString() == "X" & btn9.getText().toString() == "X" & btn15.getText().toString() == "X" & btn21.getText().toString() == "X" || btn9.getText().toString() == "X" & btn15.getText().toString() == "X" & btn21.getText().toString() == "X" & btn27.getText().toString() == "X" || btn15.getText().toString() == "X" & btn21.getText().toString() == "X" & btn27.getText().toString() == "X" & btn33.getText().toString() == "X"
                || btn4.getText().toString() == "X" & btn10.getText().toString() == "X" & btn16.getText().toString() == "X" & btn22.getText().toString() == "X" || btn10.getText().toString() == "X" & btn16.getText().toString() == "X" & btn22.getText().toString() == "X" & btn28.getText().toString() == "X" || btn16.getText().toString() == "X" & btn22.getText().toString() == "X" & btn28.getText().toString() == "X" & btn34.getText().toString() == "X"
                || btn5.getText().toString() == "X" & btn11.getText().toString() == "X" & btn17.getText().toString() == "X" & btn23.getText().toString() == "X" || btn11.getText().toString() == "X" & btn17.getText().toString() == "X" & btn23.getText().toString() == "X" & btn29.getText().toString() == "X" || btn17.getText().toString() == "X" & btn23.getText().toString() == "X" & btn29.getText().toString() == "X" & btn35.getText().toString() == "X"
                || btn6.getText().toString() == "X" & btn12.getText().toString() == "X" & btn18.getText().toString() == "X" & btn24.getText().toString() == "X" || btn12.getText().toString() == "X" & btn18.getText().toString() == "X" & btn24.getText().toString() == "X" & btn30.getText().toString() == "X" || btn18.getText().toString() == "X" & btn24.getText().toString() == "X" & btn30.getText().toString() == "X" & btn36.getText().toString() == "X"
                || btn1.getText().toString() == "X" & btn2.getText().toString() == "X" & btn3.getText().toString() == "X" & btn4.getText().toString() == "X" || btn2.getText().toString() == "X" & btn3.getText().toString() == "X" & btn4.getText().toString() == "X" & btn5.getText().toString() == "X" || btn3.getText().toString() == "X" & btn4.getText().toString() == "X" & btn5.getText().toString() == "X" & btn6.getText().toString() == "X"
                || btn7.getText().toString() == "X" & btn8.getText().toString() == "X" & btn9.getText().toString() == "X" & btn10.getText().toString() == "X" || btn8.getText().toString() == "X" & btn9.getText().toString() == "X" & btn10.getText().toString() == "X" & btn11.getText().toString() == "X" || btn9.getText().toString() == "X" & btn10.getText().toString() == "X" & btn11.getText().toString() == "X" & btn12.getText().toString() == "X"
                || btn13.getText().toString() == "X" & btn14.getText().toString() == "X" & btn15.getText().toString() == "X" & btn16.getText().toString() == "X" || btn14.getText().toString() == "X" & btn15.getText().toString() == "X" & btn16.getText().toString() == "X" & btn17.getText().toString() == "X" || btn15.getText().toString() == "X" & btn16.getText().toString() == "X" & btn17.getText().toString() == "X" & btn18.getText().toString() == "X"
                || btn19.getText().toString() == "X" & btn20.getText().toString() == "X" & btn21.getText().toString() == "X" & btn22.getText().toString() == "X" || btn20.getText().toString() == "X" & btn21.getText().toString() == "X" & btn22.getText().toString() == "X" & btn23.getText().toString() == "X" || btn21.getText().toString() == "X" & btn22.getText().toString() == "X" & btn23.getText().toString() == "X" & btn24.getText().toString() == "X"
                || btn25.getText().toString() == "X" & btn26.getText().toString() == "X" & btn27.getText().toString() == "X" & btn28.getText().toString() == "X" || btn26.getText().toString() == "X" & btn27.getText().toString() == "X" & btn28.getText().toString() == "X" & btn29.getText().toString() == "X" || btn27.getText().toString() == "X" & btn28.getText().toString() == "X" & btn29.getText().toString() == "X" & btn30.getText().toString() == "X"
                || btn31.getText().toString() == "X" & btn32.getText().toString() == "X" & btn33.getText().toString() == "X" & btn34.getText().toString() == "X" || btn32.getText().toString() == "X" & btn33.getText().toString() == "X" & btn34.getText().toString() == "X" & btn35.getText().toString() == "X" || btn33.getText().toString() == "X" & btn34.getText().toString() == "X" & btn35.getText().toString() == "X" & btn36.getText().toString() == "X"
                || btn3.getText().toString() == "X" & btn10.getText().toString() == "X" & btn17.getText().toString() == "X" & btn24.getText().toString() == "X" || btn2.getText().toString() == "X" & btn9.getText().toString() == "X" & btn16.getText().toString() == "X" & btn23.getText().toString() == "X" || btn9.getText().toString() == "X" & btn16.getText().toString() == "X" & btn23.getText().toString() == "X" & btn30.getText().toString() == "X"
                || btn1.getText().toString() == "X" & btn8.getText().toString() == "X" & btn15.getText().toString() == "X" & btn22.getText().toString() == "X" || btn8.getText().toString() == "X" & btn15.getText().toString() == "X" & btn22.getText().toString() == "X" & btn29.getText().toString() == "X" || btn15.getText().toString() == "X" & btn22.getText().toString() == "X" & btn29.getText().toString() == "X" & btn36.getText().toString() == "X"
                || btn7.getText().toString() == "X" & btn14.getText().toString() == "X" & btn21.getText().toString() == "X" & btn28.getText().toString() == "X" || btn14.getText().toString() == "X" & btn21.getText().toString() == "X" & btn28.getText().toString() == "X" & btn35.getText().toString() == "X" || btn13.getText().toString() == "X" & btn20.getText().toString() == "X" & btn27.getText().toString() == "X" & btn34.getText().toString() == "X"
                || btn4.getText().toString() == "X" & btn9.getText().toString() == "X" & btn14.getText().toString() == "X" & btn19.getText().toString() == "X" || btn5.getText().toString() == "X" & btn10.getText().toString() == "X" & btn15.getText().toString() == "X" & btn20.getText().toString() == "X" || btn10.getText().toString() == "X" & btn15.getText().toString() == "X" & btn20.getText().toString() == "X" & btn25.getText().toString() == "X"
                || btn6.getText().toString() == "X" & btn11.getText().toString() == "X" & btn16.getText().toString() == "X" & btn21.getText().toString() == "X" || btn11.getText().toString() == "X" & btn16.getText().toString() == "X" & btn21.getText().toString() == "X" & btn26.getText().toString() == "X" || btn16.getText().toString() == "X" & btn21.getText().toString() == "X" & btn26.getText().toString() == "X" & btn31.getText().toString() == "X"
                || btn12.getText().toString() == "X" & btn17.getText().toString() == "X" & btn22.getText().toString() == "X" & btn27.getText().toString() == "X" || btn17.getText().toString() == "X" & btn22.getText().toString() == "X" & btn27.getText().toString() == "X" & btn32.getText().toString() == "X" || btn18.getText().toString() == "X" & btn23.getText().toString() == "X" & btn28.getText().toString() == "X" & btn33.getText().toString() == "X") {
            ganador = true;
            String texto = "Ganó " + jugadores[0]+ " !";
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();

        } else {
            if (btn1.getText().toString() == "O" & btn7.getText().toString() == "O" & btn13.getText().toString() == "O" & btn19.getText().toString() == "O" || btn7.getText().toString() == "O" & btn13.getText().toString() == "O" & btn19.getText().toString() == "O" & btn25.getText().toString() == "O" || btn13.getText().toString() == "O" & btn19.getText().toString() == "O" & btn25.getText().toString() == "O" & btn31.getText().toString() == "O"
                    || btn2.getText().toString() == "O" & btn8.getText().toString() == "O" & btn14.getText().toString() == "O" & btn20.getText().toString() == "O" || btn8.getText().toString() == "O" & btn14.getText().toString() == "O" & btn20.getText().toString() == "O" & btn26.getText().toString() == "O" || btn14.getText().toString() == "O" & btn20.getText().toString() == "O" & btn26.getText().toString() == "O" & btn32.getText().toString() == "O"
                    || btn3.getText().toString() == "O" & btn9.getText().toString() == "O" & btn15.getText().toString() == "O" & btn21.getText().toString() == "O" || btn9.getText().toString() == "O" & btn15.getText().toString() == "O" & btn21.getText().toString() == "O" & btn27.getText().toString() == "O" || btn15.getText().toString() == "O" & btn21.getText().toString() == "O" & btn27.getText().toString() == "O" & btn33.getText().toString() == "O"
                    || btn4.getText().toString() == "O" & btn10.getText().toString() == "O" & btn16.getText().toString() == "O" & btn22.getText().toString() == "O" || btn10.getText().toString() == "O" & btn16.getText().toString() == "O" & btn22.getText().toString() == "O" & btn28.getText().toString() == "O" || btn16.getText().toString() == "O" & btn22.getText().toString() == "O" & btn28.getText().toString() == "O" & btn34.getText().toString() == "O"
                    || btn5.getText().toString() == "O" & btn11.getText().toString() == "O" & btn17.getText().toString() == "O" & btn23.getText().toString() == "O" || btn11.getText().toString() == "O" & btn17.getText().toString() == "O" & btn23.getText().toString() == "O" & btn29.getText().toString() == "O" || btn17.getText().toString() == "O" & btn23.getText().toString() == "O" & btn29.getText().toString() == "O" & btn35.getText().toString() == "O"
                    || btn6.getText().toString() == "O" & btn12.getText().toString() == "O" & btn18.getText().toString() == "O" & btn24.getText().toString() == "O" || btn12.getText().toString() == "O" & btn18.getText().toString() == "O" & btn24.getText().toString() == "O" & btn30.getText().toString() == "O" || btn18.getText().toString() == "O" & btn24.getText().toString() == "O" & btn30.getText().toString() == "O" & btn36.getText().toString() == "O"
                    || btn1.getText().toString() == "O" & btn2.getText().toString() == "O" & btn3.getText().toString() == "O" & btn4.getText().toString() == "O" || btn2.getText().toString() == "O" & btn3.getText().toString() == "O" & btn4.getText().toString() == "O" & btn5.getText().toString() == "O" || btn3.getText().toString() == "O" & btn4.getText().toString() == "O" & btn5.getText().toString() == "O" & btn6.getText().toString() == "O"
                    || btn7.getText().toString() == "O" & btn8.getText().toString() == "O" & btn9.getText().toString() == "O" & btn10.getText().toString() == "O" || btn8.getText().toString() == "O" & btn9.getText().toString() == "O" & btn10.getText().toString() == "O" & btn11.getText().toString() == "O" || btn9.getText().toString() == "O" & btn10.getText().toString() == "O" & btn11.getText().toString() == "O" & btn12.getText().toString() == "O"
                    || btn13.getText().toString() == "O" & btn14.getText().toString() == "O" & btn15.getText().toString() == "O" & btn16.getText().toString() == "O" || btn14.getText().toString() == "O" & btn15.getText().toString() == "O" & btn16.getText().toString() == "O" & btn17.getText().toString() == "O" || btn15.getText().toString() == "O" & btn16.getText().toString() == "O" & btn17.getText().toString() == "O" & btn18.getText().toString() == "O"
                    || btn19.getText().toString() == "O" & btn20.getText().toString() == "O" & btn21.getText().toString() == "O" & btn22.getText().toString() == "O" || btn20.getText().toString() == "O" & btn21.getText().toString() == "O" & btn22.getText().toString() == "O" & btn23.getText().toString() == "O" || btn21.getText().toString() == "O" & btn22.getText().toString() == "O" & btn23.getText().toString() == "O" & btn24.getText().toString() == "O"
                    || btn25.getText().toString() == "O" & btn26.getText().toString() == "O" & btn27.getText().toString() == "O" & btn28.getText().toString() == "O" || btn26.getText().toString() == "O" & btn27.getText().toString() == "O" & btn28.getText().toString() == "O" & btn29.getText().toString() == "O" || btn27.getText().toString() == "O" & btn28.getText().toString() == "O" & btn29.getText().toString() == "O" & btn30.getText().toString() == "O"
                    || btn31.getText().toString() == "O" & btn32.getText().toString() == "O" & btn33.getText().toString() == "O" & btn34.getText().toString() == "O" || btn32.getText().toString() == "O" & btn33.getText().toString() == "O" & btn34.getText().toString() == "O" & btn35.getText().toString() == "O" || btn33.getText().toString() == "O" & btn34.getText().toString() == "O" & btn35.getText().toString() == "O" & btn36.getText().toString() == "O"
                    || btn3.getText().toString() == "O" & btn10.getText().toString() == "O" & btn17.getText().toString() == "O" & btn24.getText().toString() == "O" || btn2.getText().toString() == "O" & btn9.getText().toString() == "O" & btn16.getText().toString() == "O" & btn23.getText().toString() == "O" || btn9.getText().toString() == "O" & btn16.getText().toString() == "O" & btn23.getText().toString() == "O" & btn30.getText().toString() == "O"
                    || btn1.getText().toString() == "O" & btn8.getText().toString() == "O" & btn15.getText().toString() == "O" & btn22.getText().toString() == "O" || btn8.getText().toString() == "O" & btn15.getText().toString() == "O" & btn22.getText().toString() == "O" & btn29.getText().toString() == "O" || btn15.getText().toString() == "O" & btn22.getText().toString() == "O" & btn29.getText().toString() == "O" & btn36.getText().toString() == "O"
                    || btn7.getText().toString() == "O" & btn14.getText().toString() == "O" & btn21.getText().toString() == "O" & btn28.getText().toString() == "O" || btn14.getText().toString() == "O" & btn21.getText().toString() == "O" & btn28.getText().toString() == "O" & btn35.getText().toString() == "O" || btn13.getText().toString() == "O" & btn20.getText().toString() == "O" & btn27.getText().toString() == "O" & btn34.getText().toString() == "O"
                    || btn4.getText().toString() == "O" & btn9.getText().toString() == "O" & btn14.getText().toString() == "O" & btn19.getText().toString() == "O" || btn5.getText().toString() == "O" & btn10.getText().toString() == "O" & btn15.getText().toString() == "O" & btn20.getText().toString() == "O" || btn10.getText().toString() == "O" & btn15.getText().toString() == "O" & btn20.getText().toString() == "O" & btn25.getText().toString() == "O"
                    || btn6.getText().toString() == "O" & btn11.getText().toString() == "O" & btn16.getText().toString() == "O" & btn21.getText().toString() == "O" || btn11.getText().toString() == "O" & btn16.getText().toString() == "O" & btn21.getText().toString() == "O" & btn26.getText().toString() == "O" || btn16.getText().toString() == "O" & btn21.getText().toString() == "O" & btn26.getText().toString() == "O" & btn31.getText().toString() == "O"
                    || btn12.getText().toString() == "O" & btn17.getText().toString() == "O" & btn22.getText().toString() == "O" & btn27.getText().toString() == "O" || btn17.getText().toString() == "O" & btn22.getText().toString() == "O" & btn27.getText().toString() == "O" & btn32.getText().toString() == "O" || btn18.getText().toString() == "O" & btn23.getText().toString() == "O" & btn28.getText().toString() == "O" & btn33.getText().toString() == "O") {
                ganador = true;
                String texto = "Ganó " + jugadores[1]+ " !";
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
            } else {
                if (!j1 & !j2 & !j3 & !j4 & !j5 & !j6
                        & !j7 & !j8 & !j9 & !j10 & !j11 & !j12
                        & !j13 & !j14 & !j15 & !j16 & !j17 & !j18
                        & !j19 & !j20 & !j21 & !j22 & !j23 & !j24
                        & !j25 & !j26 & !j27 & !j28 & !j29 & !j30
                        & !j31 & !j32 & !j33 & !j34 & !j35 & !j36) {
                    ganador = true;
                    Toast.makeText(this, "Empate...", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

            public void ReiniciarClick (View view){
                ganador = false;
                cambiar = false;
                j1 =true;
                j2 =true;
                j3 =true;
                j4 =true;
                j5 =true;
                j6 =true;
                j7 =true;
                j8 =true;
                j9 =true;
                j10 =true;
                j11 =true;
                j12 =true;
                j13 =true;
                j14 =true;
                j15 =true;
                j16 =true;
                j17 =true;
                j18 =true;
                j19 =true;
                j20 =true;
                j21 =true;
                j22 =true;
                j23 =true;
                j24 =true;
                j25 =true;
                j26 =true;
                j27 =true;
                j28 =true;
                j29 =true;
                j30 =true;
                j31 =true;
                j32 =true;
                j33 =true;
                j34 =true;
                j35 =true;
                j36 =true;
                int color = getResources().getColor(R.color.teal);
                btn1.setBackgroundColor(color);
                btn1.setText("");
                btn2.setBackgroundColor(color);
                btn2.setText("");
                btn3.setBackgroundColor(color);
                btn3.setText("");
                btn4.setBackgroundColor(color);
                btn4.setText("");
                btn5.setBackgroundColor(color);
                btn5.setText("");
                btn6.setBackgroundColor(color);
                btn6.setText("");
                btn7.setBackgroundColor(color);
                btn7.setText("");
                btn8.setBackgroundColor(color);
                btn8.setText("");
                btn9.setBackgroundColor(color);
                btn9.setText("");
                btn10.setBackgroundColor(color);
                btn10.setText("");
                btn11.setBackgroundColor(color);
                btn11.setText("");
                btn12.setBackgroundColor(color);
                btn12.setText("");
                btn13.setBackgroundColor(color);
                btn13.setText("");
                btn14.setBackgroundColor(color);
                btn14.setText("");
                btn15.setBackgroundColor(color);
                btn15.setText("");
                btn16.setBackgroundColor(color);
                btn16.setText("");
                btn17.setBackgroundColor(color);
                btn17.setText("");
                btn18.setBackgroundColor(color);
                btn18.setText("");
                btn19.setBackgroundColor(color);
                btn19.setText("");
                btn20.setBackgroundColor(color);
                btn20.setText("");
                btn21.setBackgroundColor(color);
                btn21.setText("");
                btn22.setBackgroundColor(color);
                btn22.setText("");
                btn23.setBackgroundColor(color);
                btn23.setText("");
                btn24.setBackgroundColor(color);
                btn24.setText("");
                btn25.setBackgroundColor(color);
                btn25.setText("");
                btn26.setBackgroundColor(color);
                btn26.setText("");
                btn27.setBackgroundColor(color);
                btn27.setText("");
                btn28.setBackgroundColor(color);
                btn28.setText("");
                btn29.setBackgroundColor(color);
                btn29.setText("");
                btn30.setBackgroundColor(color);
                btn30.setText("");
                btn31.setBackgroundColor(color);
                btn31.setText("");
                btn32.setBackgroundColor(color);
                btn32.setText("");
                btn33.setBackgroundColor(color);
                btn33.setText("");
                btn34.setBackgroundColor(color);
                btn34.setText("");
                btn35.setBackgroundColor(color);
                btn35.setText("");
                btn36.setBackgroundColor(color);
                btn36.setText("");
            }

            public void Volver (View view){
                Intent intento = new Intent(this, jugadores.class);
                startActivity(intento);
            }
        }