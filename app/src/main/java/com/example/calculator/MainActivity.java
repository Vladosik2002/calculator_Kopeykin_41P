package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int Reset = 1;
    boolean fnum = true;
    boolean boolplus, boolmin, booldel, boolum = false;

    Button but0, but1, but2, but3, but4, but5, but6,
            but7, but8, but9, but10, but11, but12, but13, but14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but0 = (Button) findViewById(R.id.but0);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);

        but10 = (Button) findViewById(R.id.butplus);
        but11 = (Button) findViewById(R.id.butminus);
        but12 = (Button) findViewById(R.id.butdel);
        but13 = (Button) findViewById(R.id.butumn);
        but14 = (Button) findViewById(R.id.butravno);

        Button butR = (Button) findViewById(R.id.butreset);

        TextView vivod = findViewById(R.id.vivod);
        EditText vvod1 = findViewById(R.id.vvod1);
        EditText vvod2 = findViewById(R.id.vvod2);
        EditText znak = findViewById(R.id.znak);




        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum = !fnum;
                boolplus = true;
                znak.setText("+");
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum = !fnum;
                boolmin = true;
                znak.setText("-");
            }
        });
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum = !fnum;
                booldel = true;
                znak.setText("/");
            }
        });
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fnum = !fnum;
                boolum = true;
                znak.setText("*");
            }
        });


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "1";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "1";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "2";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "2";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "3";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "3";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "4";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "4";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "5";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "5";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "6";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "6";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "7";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "7";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "8";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "8";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "9";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "9";
                    vvod2.setText(vvod2_text);
                }
            }
        });
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fnum) {
                    String vvod1_text = vvod1.getText().toString();
                    vvod1_text += "0";
                    vvod1.setText(vvod1_text);
                } else {
                    String vvod2_text = vvod2.getText().toString();
                    vvod2_text += "0";
                    vvod2.setText(vvod2_text);
                }
            }
        });

        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer vvod1_text = Integer.valueOf(vvod1.getText().toString());
                Integer vvod2_text = Integer.valueOf(vvod2.getText().toString());

                if (boolplus == true) {
                    Integer sum = vvod1_text + vvod2_text;
                    vivod.setText(sum.toString());
                    boolplus = false;
                }else {}
                if (boolmin == true) {
                    Integer min = vvod1_text - vvod2_text;
                    vivod.setText(min.toString());
                    boolmin = false;
                }else {}
                if (booldel == true) {
                    Integer del = vvod1_text / vvod2_text;
                    vivod.setText(del.toString());
                    booldel = false;
                }else {}
                if (boolum == true) {
                    Integer um = vvod1_text * vvod2_text;
                    vivod.setText(um.toString());
                    boolum = true;
                }else {}
            }
        });
        butR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvod1.setText("");
                vvod2.setText("");
                vivod.setText("");
                znak.setText("");
                fnum = true;
            }
        });
    }
}





