package com.agnik.priyankakargupta.spanishconjugation;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class ImperfectScoring extends ActionBarActivity {
    public String[] yoform = {"estudiaba","andaba","ayudaba", "llegaba", "buscaba", "caminaba", "cantaba", "necesitaba", "pagaba", "trabajaba",
            "vendía", "poseía", "leía", "escondía", "debía", "creía", "corría", "comprendía", "comía", "aprendía", "abría", "decidía",
            "describía", "escribía", "permitía", "iba", "vivía", "existía", "admitía", "omitía"};
    public String[] tuform = {"estudiabas","andabas","ayudabas", "llegabas", "buscabas", "caminabas", "cantabas", "necesitabas", "pagabas", "trabajabas",
            "vendías", "poseías", "leías", "escondías", "debías", "creías", "corrías", "comprendías", "comías", "aprendías", "abrías", "decidías",
            "describías", "escribías", "permitías", "ibas", "vivías", "existías", "admitías", "omitías"};
    public String[] elform = {"estudiaba","andaba","ayudaba", "llegaba", "buscaba", "caminaba", "cantaba", "necesitaba", "pagaba", "trabajaba",
            "vendía", "poseía", "leía", "escondía", "debía", "creía", "corría", "comprendía", "comía", "aprendía", "abría", "decidía",
            "describía", "escribía", "permitía", "iba", "vivía", "existía", "admitía", "omitía"};
    public String[] nosform = {"estudiábamos","andábamos","ayudábamos", "llegábamos", "buscábamos", "caminábamos", "cantábamos", "necesitábamos", "pagábamos", "trabajábamos",
            "vendíamos", "poseíamos", "leíamos", "escondíamos", "debíamos", "creíamos", "corríamos", "comprendíamos", "comíamos", "aprendíamos", "abríamos", "decidíamos",
            "describíamos", "escribíamos", "permitíamos", "íbamos", "vivimos", "existimos", "admitimos", "omitimos"};
    public String[] vosform = {"estudiabais","andabais","ayudabais", "llegabais", "buscabais", "caminabais", "cantabais", "necesitabais", "pagabais", "trabajabais",
            "vendíais", "poseíais", "leíais", "escondíais", "debíais", "creíais", "corríais", "comprendíais", "comíais", "aprendíais", "abríais", "decidíais",
            "describíais", "escribíais", "permitíais", "vaíais", "vivíais", "existíais", "admitíais", "omitíais"};
    public String[] ellosform = {"estudiaban","andaban","ayudaban", "llegaban", "buscaban", "caminaban", "cantaban", "necesitaban", "pagaban", "trabajaban",
            "vendían", "poseían", "leían", "escondían", "debían", "creían", "corrían", "comprendían", "comían", "aprendían", "abrían", "decidían",
            "describían", "escribían", "permitían", "iban", "vivían", "existían", "admitían", "omitían"};
    TextView finalscore, answerlist;
    int a, b, c , d, e, f, g, h, i, j, score;
    ImageView stars;

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
        setContentView(R.layout.activity_imperfect_scoring);
        finalscore = (TextView) findViewById(R.id.finalscore);

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
        if (yo.equals(yoform[ImperfectActivity.yoindex])){

            a = 1;
        } else if (!yo.equals(yoform[ImperfectActivity.yoindex])){a = 0;

            answerlist.setText("1. Yo " + yoform[ImperfectActivity.yoindex]);
        }
        if (tu.equals(tuform[ImperfectActivity.tuindex])){
            b = 1;
        } else if (!tu.equals(tuform[ImperfectActivity.tuindex])){ b = 0;
            answerlist.setText(answerlist.getText() + "\n" + "2. Tú " + tuform[ImperfectActivity.tuindex]);
        }
        if (el.equals(elform[ImperfectActivity.elindex])){
            c = 1;
        } else if (!el.equals(elform[ImperfectActivity.elindex])){ c = 0;
            answerlist.setText(answerlist.getText() + "\n" + "3. Él " + elform[ImperfectActivity.elindex]);
        }
        if (ella.equals(elform[ImperfectActivity.ellaindex])){
            d = 1;
        } else if (!ella.equals(elform[ImperfectActivity.ellaindex])){d = 0;
            answerlist.setText(answerlist.getText() + "\n" + "4. Ella " + elform[ImperfectActivity.ellaindex]);
        }
        if (usted.equals(elform[ImperfectActivity.udindex])){
            e = 1;
        } else if (!usted.equals(elform[ImperfectActivity.udindex])){e = 0;
            answerlist.setText(answerlist.getText() + "\n" + "5. Usted " + elform[ImperfectActivity.udindex]);
        }
        if (nosotros.equals(nosform[ImperfectActivity.nosindex])){
            f = 1;
        } else if (!nosotros.equals(nosform[ImperfectActivity.nosindex])){f = 0;
            answerlist.setText(answerlist.getText() + "\n" + "6. Nosotros " + nosform[ImperfectActivity.nosindex]);
        }
        if (vosotros.equals(vosform[ImperfectActivity.vosindex])){
            g = 1;
        } else if (!vosotros.equals(vosform[ImperfectActivity.vosindex])){g = 0;
            answerlist.setText(answerlist.getText() + "\n" + "7. Vosotros " + vosform[ImperfectActivity.vosindex]);
        }
        if (ellos.equals(ellosform[ImperfectActivity.ellosindex])){
            h = 1;
        } else if (!ellos.equals(ellosform[ImperfectActivity.ellosindex])){ h = 0;
            answerlist.setText(answerlist.getText() + "\n" + "8. Ellos " + ellosform[ImperfectActivity.ellosindex]);
        }
        if (ellas.equals(ellosform[ImperfectActivity.ellasindex])){
            i = 1;
        } else if (!ellas.equals(ellosform[ImperfectActivity.ellasindex])){i = 0;
            answerlist.setText(answerlist.getText() + "\n" + "9. Ellas " + ellosform[ImperfectActivity.ellasindex]);
        }
        if (ustedes.equals(ellosform[ImperfectActivity.udsindex])){
            j = 1;
        } else if (!ustedes.equals(ellosform[ImperfectActivity.udsindex])){j = 0;
            answerlist.setText(answerlist.getText() + "\n" + "10. Ustedes " + ellosform[ImperfectActivity.udsindex]);
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
            answerlist.setText("You conjugated all of the verbs correctly!");

        }
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
        getMenuInflater().inflate(R.menu.menu_imperfect_scoring, menu);
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
