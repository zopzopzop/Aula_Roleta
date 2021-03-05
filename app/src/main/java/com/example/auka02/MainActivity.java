package com.example.auka02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.text.method.SingleLineTransformationMethod;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

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
        TextView parabens = findViewById(R.id.button);
        EditText Sorteou = findViewById(R.id.ImputNumber);
        String Sortnum = String.valueOf(randomNumber);
        texto.setText("0" +Sortnum);
        if (randomNumber == Integer.parseInt(Sorteou.getText().toString())){
            parabens.setText(("Você Ganhou"));


        } else {
            parabens.setText(("Você Perdeu"));
        }

    }
}