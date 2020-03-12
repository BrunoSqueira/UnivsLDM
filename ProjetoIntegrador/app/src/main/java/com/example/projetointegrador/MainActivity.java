package com.example.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoSortear;
    private EditText textoDigitato;

    private String[] equipe1 = {"Sara", "Alicia", "Lara"};
    private String[] equipe2 = {"Alan", "Danylo", "Victor", "Felipe"};
    private String[] equipe3 = {"Mateus", "De Cellis", "Suennaby", "Jorge", "Thiago"};
    private String[] equipe4 = {"Gabriel", "Lucas", "Fabricio", "Bruno", "Eduardo"};
    private String[] equipe5 = {"Icaro", "Vinicios", "Tayrone", "Carlos", "Hyago"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSortear = findViewById(R.id.bt_sorteio);
        textoDigitato = findViewById(R.id.tf_numero);



        if(textoDigitato.getText().toString().isEmpty()){
            int numero = Integer.parseInt(textoDigitato.getText().toString();
            String nome;
            if(numero += 1 && <= 5){

                if(numero == 1){
                nome = equipe1[new Random().nextInt(equipe1.length)];
            }else if(numero == 2){
                nome = equipe2[new Random().nextInt(equipe2.length)];
            }else if(numero == 3){
                nome = equipe3[new Random().nextInt(equipe3.length)];
            }else if(numero == 4){
                nome = equipe4[new Random().nextInt(equipe4.length)];
            }else if(numero == 5){
                nome = equipe5[new Random().nextInt(equipe5.length)];
            }

            Toast.makeText(this, nome, Toast.LENGTH_LONG).show();
            }
        }
    }
}