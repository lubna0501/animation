package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    Button rotate,button,fadein,fadeout,cross,blink,zoomin,zoomout,move,slideup,slidedown,bounce,next,sequential,together;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview=findViewById(R.id.imageview);
        rotate=findViewById(R.id.rotatebtn);
        button=findViewById(R.id.button);
        fadein=findViewById(R.id.fadein);
        fadeout=findViewById(R.id.fadeout);
        cross=findViewById(R.id.crossfading);
        blink=findViewById(R.id.blink);
        zoomin=findViewById(R.id.button5);
        zoomout=findViewById(R.id.button6);
        move=findViewById(R.id.button10);
        slideup=findViewById(R.id.button9);
        slidedown=findViewById(R.id.button7);
        bounce=findViewById(R.id.button8);
        sequential=findViewById(R.id.sequential);
        together=findViewById(R.id.together);
        next=findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,seq.class);
                startActivity(intent);
                finish();
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                imageview.startAnimation(animation);


            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation11 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                imageview.startAnimation(animation11);


            }
        });
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation10 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                imageview.startAnimation(animation10);


            }
        });

        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation9 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                imageview.startAnimation(animation9);


            }
        });
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation8 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.cross_fading);
                imageview.startAnimation(animation8);


            }
        });
        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation7 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                imageview.startAnimation(animation7);


            }
        });
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation6= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                imageview.startAnimation(animation6);


            }
        });
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation5 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                imageview.startAnimation(animation5);


            }
        });
        slidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
                imageview.startAnimation(animation4);


            }
        });
        slideup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
                imageview.startAnimation(animation3);


            }
        });
        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                imageview.startAnimation(animation2);


            }
        });
        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                imageview.startAnimation(animation1);


            }
        });
        sequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation12 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);
                imageview.startAnimation(animation12);


            }
        });
        together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation13 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.together);
                imageview.startAnimation(animation13);


            }
        });
    }
}