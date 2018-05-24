package com.upeu.msr.proyectoapp;


import android.graphics.Color;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button button = (Button)findViewById(R.id.regresar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(Menu.this, Login.class);
                startActivity(ir);
            }
        });

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {

        int color;

        View contenedor = v.getRootView();

        switch (v.getId()) {
            case R.id.button:
                color = Color.parseColor("#80CBC4"); // Verde azulado
                break;
            case R.id.button2:
                color = Color.parseColor("#A5D6A7"); // Verde
                break;
            default:
                color = Color.WHITE; // Blano
        }

        contenedor.setBackgroundColor(color);
    }
}

