package e.pc.projektexe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import e.pc.projektexe.R;

public class MainActivity extends AppCompatActivity {

    Button buttonLewy;
    Button buttonPrawy;
    ImageView blockDef;
    View edgeEnd;
    View edgeLewy;
    View edgePrawy;
    View edgeGora;
    TextView textView;
    TextView liczbaPrawy;
    TextView liczbaLewy;

    float a,b;
    float x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPrawy = findViewById(R.id.buttonPrawy);
        textView = findViewById(R.id.textView);
        blockDef = findViewById(R.id.blockDef);
        buttonLewy = findViewById(R.id.buttonLewy);
        liczbaPrawy = findViewById(R.id.liczbaPrawy);
        liczbaLewy = findViewById(R.id.liczbaLewy);


        a = blockDef.getX();
        liczbaPrawy.setText(String.valueOf(a));
        liczbaLewy.setText(String.valueOf(a));




       buttonPrawy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = blockDef.getX();


               if(a<457) {
                    a += 20;
                    blockDef.setX(a);
                }
                liczbaPrawy.setText(String.valueOf(a));
                liczbaLewy.setText(String.valueOf(a));

            }

        });

        buttonLewy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = blockDef.getX();
                if(a>-3) {
                    a -= 20;
                    blockDef.setX(a);
                }
                liczbaLewy.setText(String.valueOf(a));
                liczbaPrawy.setText(String.valueOf(a));
            }
        });



    }

    @Override
    protected void onStart() {

        super.onStart();

    }



}
