package com.trianacodes.script.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ib1(View view){

        Toast.makeText(this, "Botón del niño",Toast.LENGTH_LONG).show();

    }

    public void ib2(View view){

        Toast.makeText(this, "Botón del teléfono",Toast.LENGTH_LONG).show();

    }

}
