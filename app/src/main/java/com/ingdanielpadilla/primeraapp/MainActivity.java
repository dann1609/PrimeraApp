package com.ingdanielpadilla.primeraapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.danielpadilla.primeraapp.R;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Metodo1(View view) {
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        Toast.makeText(this,buttonText,Toast.LENGTH_SHORT).show();
    }
}
