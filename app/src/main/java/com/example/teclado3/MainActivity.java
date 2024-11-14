package com.example.teclado3;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /*EVENTOS*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //La clase R contiene los IDS
        Button boton9 = findViewById(R.id.miBoton9);
        // al boton le añades un listener, en este caso onclick y overrideas el metodo
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("Lo has clickado");
                //Asi llamas a otro componente desde el click de uno
                //findViewById()

            }
        });

        // esto sirve cuando en el mainActivity.xml tengo un android: onClickComoYoLoLlame y la implemento aqui
        /*public void onClickMovida (View view){

        };*/

        //esta es la manera rapida de hacer lo de arriba el view -> alallaal... le añade a la variable view el valor de lo de despues de la ->
        findViewById(R.id.miBoton1).setOnClickListener(view ->  System.out.println("Funciono"));

        boton9.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View view, DragEvent dragEvent) {
                return false;
            }
        });

    }

    @Override
    public void onClick(View view) {


    }
}