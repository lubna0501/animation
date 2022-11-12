package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class seq extends AppCompatActivity {
    EditText email,password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seq);
        email=findViewById(R.id.edit);
        password=findViewById(R.id.edit2);
        btn=findViewById(R.id.btn);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        email.startAnimation(animation);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate2);
        password.startAnimation(animation2);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequence);
        btn.startAnimation(animation3);
    }
}