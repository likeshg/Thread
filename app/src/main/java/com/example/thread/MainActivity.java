package com.example.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb1, pb2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final ProgressBar pb1;
//        Button btnInc, btnDec;
//        pb1 = (ProgressBar) findViewById(R.id.progressBar1);
//        btnInc = (Button) findViewById(R.id.btnInc);
//        btnDec = (Button) findViewById(R.id.btnDec);
//
//        btnInc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                pb1.incrementProgressBy(10);
//            }
//        });
//
//        btnDec.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                pb1.incrementProgressBy(-10);
//            }
//        });
//
//        final TextView tvSeek = (TextView) findViewById(R.id.tvSeek);
//        SeekBar seekBar1 = (SeekBar) findViewById(R.id.SeekBar1);
//
//        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                tvSeek.setText("진행률 : " + progress + " %");
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });


        pb1 = (ProgressBar) findViewById(R.id.pb1);
        pb2 = (ProgressBar) findViewById(R.id.pb2);
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i < 100; i++){
                    pb1.setProgress(pb1.getProgress()+2);
                    pb2.setProgress(pb2.getProgress()+1);
                    SystemClock.sleep(100);
                }

            }
        });

    }
}