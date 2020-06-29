package ir.nasim.drum;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        final MediaPlayer sound1=MediaPlayer.create(this,R.raw.sound1);
        final MediaPlayer sound2=MediaPlayer.create(this,R.raw.sound2);
        final MediaPlayer sound3=MediaPlayer.create(this,R.raw.sound3);
        final MediaPlayer sound4=MediaPlayer.create(this,R.raw.sound4);
        final MediaPlayer sound5=MediaPlayer.create(this,R.raw.sound5);
        final MediaPlayer sound6=MediaPlayer.create(this,R.raw.sound6);
        final MediaPlayer sound7=MediaPlayer.create(this,R.raw.sound7);
        final MediaPlayer sound8=MediaPlayer.create(this,R.raw.soun8);
        final MediaPlayer sound9=MediaPlayer.create(this,R.raw.sound9);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound1.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound2.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound3.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound4.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound5.start();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound6.start();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound7.start();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound8.start();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound9.start();
            }
        });
    }

    public void initViews() {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
    }
}