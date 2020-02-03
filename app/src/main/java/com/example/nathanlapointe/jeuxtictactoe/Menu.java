package com.example.nathanlapointe.jeuxtictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void quitter_click(View v)
    {
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        dlgAlert.setMessage("Voulez vous vraiment quitter");
        dlgAlert.setTitle("Quitter");

        dlgAlert.setCancelable(true);
        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                });
        dlgAlert.create().show();
    }

    public void apropos_click(View v)
    {
        Intent myIntent = new Intent(Menu.this, apropos.class);
        Menu.this.startActivity(myIntent);
    }

    public void Mode1Joueur_click(View v)
    {
        Intent myIntent = new Intent(Menu.this,Mode1Joueur.class);
        Menu.this.startActivity(myIntent);
    }

    public void Mode2Joueurs_click(View v)
    {
        Intent myIntent = new Intent(Menu.this,Mode2Joueurs.class);
        Menu.this.startActivity(myIntent);
    }
}
