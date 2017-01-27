package com.agnik.priyankakargupta.spanishconjugation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Future;


public class FutureScoring extends ActionBarActivity {
    public String[] yoform = {"estudiaré","andaré","ayudaré", "llegaré", "buscaré", "caminaré", "cantaré", "necesitaré", "pagaré", "trabajaré",
            "venderé", "poseeré", "leeré", "esconderé", "deberé", "creeré", "correré", "comprenderé", "comeré", "aprenderé", "abriré", "decidiré",
            "describiré", "escribiré", "permitiré", "iré", "viviré", "existiré", "admitiré", "omitiré"};
    public String[] tuform = {"estudiarás","andarás","ayudarás", "llegarás", "buscarás", "caminarás", "cantarás", "necesitarás", "pagarás", "trabajarás",
            "venderás", "poseerás", "leerás", "esconderás", "deberás", "creerás", "correrás", "comprenderás", "comerás", "aprenderás", "abrirás", "decidirás",
            "describirás", "escribirás", "permitirás", "irás", "vivirás", "existirás", "admitirás", "omitirás"};
    public String[] elform = {"estudiará","andará","ayudará", "llegará", "buscará", "caminará", "cantará", "necesitará", "pagará", "trabajará",
            "venderá", "poseerá", "leerá", "esconderá", "deberá", "creerá", "correrá", "comprenderá", "comerá", "aprenderá", "abrirá", "decidirá",
            "describirá", "escribirá", "permitirá", "irá", "vivirá", "existirá", "admitirá", "omitirá"};
    public String[] nosform = {"estudiaremos","andaremos","ayudaremos", "llegaremos", "buscaremos", "caminaremos", "cantaremos", "necesitaremos", "pagaremos", "trabajaremos",
            "venderemos", "poseeremos", "leeremos", "esconderemos", "deberemos", "creeremos", "correremos", "comprenderemos", "comeremos", "aprenderemos", "abriremos", "decidiremos",
            "describiremos", "escribiremos", "permitiremos", "iremos", "viviremos", "existiremos", "admitiremos", "omitiremos"};
    public String[] vosform = {"estudiaréis","andaréis","ayudaréis", "llegaréis", "buscaréis", "caminaréis", "cantaréis", "necesitaréis", "pagaréis", "trabajaréis",
            "venderéis", "poseeréis", "leeréis", "esconderéis", "deberéis", "leeréis", "correréis", "comprenderéis", "comeréis", "aprenderéis", "abriréis", "decidiréis",
            "describiréis", "escribiréis", "permitiréis", "iréis", "viviréis", "existiréis", "admitiréis", "omitiréis"};
    public String[] ellosform = {"estudiarán","andarán","ayudarán", "llegarán", "buscarán", "caminarán", "cantarán", "necesitarán", "pagarán", "trabajarán",
            "venderán", "poseerán", "leerán", "esconderán", "deberán", "creerán", "correrán", "comprenderán", "comerán", "aprenderán", "abrirán", "decidirán",
            "describirán", "escribirán", "permitirán", "irán", "vivirán", "existirán", "admitirán", "omitirán"};
    TextView finalscore, answerlist;
    int a, b, c , d, e, f, g, h, i, j, score;
    ImageView stars;
    ImageButton share;

    public void openPresent (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openPreterite (View view){
        Intent intent = new Intent(this, PreteriteActivity.class);
        startActivity(intent);
    }
    public void openImperfect (View view){
        Intent intent = new Intent(this, ImperfectActivity.class);
        startActivity(intent);
    }
    public void openFuture (View view){
        Intent intent = new Intent(this, FutureActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_scoring);
        finalscore = (TextView) findViewById(R.id.finalscore);
        share = (ImageButton) findViewById(R.id.sharingbtn);
        Intent intent = getIntent();
        String yo = intent.getStringExtra("yo");
        String tu = intent.getStringExtra("tu");
        String el = intent.getStringExtra("el");
        String ella = intent.getStringExtra("ella");
        String usted = intent.getStringExtra("usted");
        String nosotros = intent.getStringExtra("nosotros");
        String vosotros = intent.getStringExtra("vosotros");
        String ellos = intent.getStringExtra("ellos");
        String ellas = intent.getStringExtra("ellas");
        String ustedes = intent.getStringExtra("ustedes");
        answerlist = (TextView)findViewById(R.id.answerlist);
        if (yo.equals(yoform[FutureActivity.yoindex])){

            a = 1;
        } else if (!yo.equals(yoform[FutureActivity.yoindex])){a = 0;

            answerlist.setText("1. Yo " + yoform[FutureActivity.yoindex]);
        }
        if (tu.equals(tuform[FutureActivity.tuindex])){
            b = 1;
        } else if (!tu.equals(tuform[FutureActivity.tuindex])){ b = 0;
            answerlist.setText(answerlist.getText() + "\n" + "2. Tú " + tuform[FutureActivity.tuindex]);
        }
        if (el.equals(elform[FutureActivity.elindex])){
            c = 1;
        } else if (!el.equals(elform[FutureActivity.elindex])){ c = 0;
            answerlist.setText(answerlist.getText() + "\n" + "3. Él " + elform[FutureActivity.elindex]);
        }
        if (ella.equals(elform[FutureActivity.ellaindex])){
            d = 1;
        } else if (!ella.equals(elform[FutureActivity.ellaindex])){d = 0;
            answerlist.setText(answerlist.getText() + "\n" + "4. Ella " + elform[FutureActivity.ellaindex]);
        }
        if (usted.equals(elform[FutureActivity.udindex])){
            e = 1;
        } else if (!usted.equals(elform[FutureActivity.udindex])){e = 0;
            answerlist.setText(answerlist.getText() + "\n" + "5. Usted " + elform[FutureActivity.udindex]);
        }
        if (nosotros.equals(nosform[FutureActivity.nosindex])){
            f = 1;
        } else if (!nosotros.equals(nosform[FutureActivity.nosindex])){f = 0;
            answerlist.setText(answerlist.getText() + "\n" + "6. Nosotros " + nosform[FutureActivity.nosindex]);
        }
        if (vosotros.equals(vosform[FutureActivity.vosindex])){
            g = 1;
        } else if (!vosotros.equals(vosform[FutureActivity.vosindex])){g = 0;
            answerlist.setText(answerlist.getText() + "\n" + "7. Vosotros " + vosform[FutureActivity.vosindex]);
        }
        if (ellos.equals(ellosform[FutureActivity.ellosindex])){
            h = 1;
        } else if (!ellos.equals(ellosform[FutureActivity.ellosindex])){ h = 0;
            answerlist.setText(answerlist.getText() + "\n" + "8. Ellos " + ellosform[FutureActivity.ellosindex]);
        }
        if (ellas.equals(ellosform[FutureActivity.ellasindex])){
            i = 1;
        } else if (!ellas.equals(ellosform[FutureActivity.ellasindex])){i = 0;
            answerlist.setText(answerlist.getText() + "\n" + "9. Ellas " + ellosform[FutureActivity.ellasindex]);
        }
        if (ustedes.equals(ellosform[FutureActivity.udsindex])){
            j = 1;
        } else if (!ustedes.equals(ellosform[FutureActivity.udsindex])){j = 0;
            answerlist.setText(answerlist.getText() + "\n" + "10. Ustedes " + ellosform[FutureActivity.udsindex]);
        }
        score = a + b + c + d + e + f + g + h + i + j;

        finalscore.setText("Your final score is: " + score + "/10");

        ImageView stars = (ImageView) findViewById(R.id.stars);

        if (score == 0){
            stars.setImageResource(R.drawable.zero);
        }
        if (score == 1){
            stars.setImageResource(R.drawable.half);
        }
        if (score == 2){
            stars.setImageResource(R.drawable.one);
        }
        if (score == 3){
            stars.setImageResource(R.drawable.oneandhalf);
        }
        if (score == 4){
            stars.setImageResource(R.drawable.two);
        }
        if (score == 5){
            stars.setImageResource(R.drawable.twoandhalf);
        }
        if (score == 6){
            stars.setImageResource(R.drawable.three);
        }
        if (score == 7){
            stars.setImageResource(R.drawable.threeandhalf);
        }
        if (score == 8){
            stars.setImageResource(R.drawable.four);
        }
        if (score == 9){
            stars.setImageResource(R.drawable.fourandhalf);
        }
        if (score == 10){
            stars.setImageResource(R.drawable.five);
            answerlist = (TextView)findViewById(R.id.answerlist);
            answerlist.setText("You conjugated all of the verbs correctly!");}
    }

        public void shareIt(View view) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Check out Zalez!");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "I got a " + score + "/10 on Zalez. Check out Zalez to practice your conjugation skills!");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_future_scoring, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
