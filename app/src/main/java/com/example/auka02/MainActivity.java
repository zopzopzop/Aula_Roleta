package com.example.auka02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterar(View view) {
        Random randon = new Random();
        int randomNumber = randon.nextInt(11) + 1;
        TextView texto = findViewById(R.id.textView2);
        texto.setText("0" +randomNumber);

    }
}