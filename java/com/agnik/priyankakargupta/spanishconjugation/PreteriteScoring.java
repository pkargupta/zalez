package com.agnik.priyankakargupta.spanishconjugation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;


public class PreteriteScoring extends ActionBarActivity {


    public String[] yoform = {"estudié","anduve","ayudé", "llegué", "busqué", "caminé", "canté", "necesité", "pagué", "trabajé",
            "vendí", "poseí", "leí", "escondí", "debí", "creí", "corrí", "comprendí", "comí", "aprendí", "abrí", "decidí",
            "describí", "escribí", "permití", "fui", "viví", "existí", "admití", "omití"};
    public String[] tuform = {"estudiaste","anduviste","ayudaste", "llegaste", "buscaste", "caminaste", "cantaste", "necesitaste", "pagaste", "trabajas",
            "vendiste", "poseíste", "leíste", "escondiste", "debiste", "creíste", "corriste", "comprendiste", "comiste", "aprendiste", "abriste", "decidiste",
            "describiste", "escribiste", "permitiste", "fuiste", "viviste", "exististe", "admitiste", "omitiste"};
    public String[] elform = {"estudió","anduvo","ayudó", "llegó", "buscó", "caminó", "cantó", "necesitó", "pagó", "trabajó",
            "vendió", "poseyó", "leyó", "escondió", "debió", "creyó", "corrió", "comprendió", "comió", "aprendió", "abrió", "decidió",
            "describió", "escribió", "permitió", "fue", "vivió", "existió", "admitió", "omitió"};
    public String[] nosform = {"estudiamos","anduvimos","ayudamos", "llegamos", "buscamos", "caminamos", "cantamos", "necesitamos", "pagamos", "trabajamos",
            "vendimos", "poseímos", "leímos", "escondimos", "debimos", "creímos", "corrimos", "comprendimos", "comimos", "aprendimos", "abrimos", "decidimos",
            "describimos", "escribimos", "permitimos", "fuimos", "vivimos", "existimos", "admitimos", "omitimos"};
    public String[] vosform = {"estudiasteis","anduvisteis","ayudasteis", "llegasteis", "buscasteis", "caminasteis", "cantasteis", "necesitasteis", "pagasteis", "trabajasteis",
            "vendisteis", "poseísteis", "leísteis", "escondisteis", "debisteis", "leísteis", "corristeis", "comprendisteis", "comisteis", "aprendisteis", "abristeis", "decidisteis",
            "describisteis", "escribisteis", "permitisteis", "fuisteis", "vivisteis", "exististeis", "admitisteis", "omitisteis"};
    public String[] ellosform = {"estudiaron","anduvieron","ayudaron", "llegaron", "buscaron", "caminaron", "cantaron", "necesitaron", "pagaron", "trabajaron",
            "vendieron", "poseyeron", "leyeron", "escondieron", "debieron", "creyeron", "corrieron", "comprendieron", "comieron", "aprendieron", "abrieron", "decidieron",
            "describieron", "escribieron", "permitieron", "fueron", "vivieron", "existieron", "admitieron", "omitieron"};
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
        setContentView(R.layout.activity_preterite_scoring);
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
        if (yo.equals(yoform[PreteriteActivity.yoindex])){

            a = 1;
        } else if (!yo.equals(yoform[PreteriteActivity.yoindex])){a = 0;

            answerlist.setText("1. Yo " + yoform[PreteriteActivity.yoindex]);
        }
        if (tu.equals(tuform[PreteriteActivity.tuindex])){
            b = 1;
        } else if (!tu.equals(tuform[PreteriteActivity.tuindex])){ b = 0;
            answerlist.setText(answerlist.getText() + "\n" + "2. Tú " + tuform[PreteriteActivity.tuindex]);
        }
        if (el.equals(elform[PreteriteActivity.elindex])){
            c = 1;
        } else if (!el.equals(elform[PreteriteActivity.elindex])){ c = 0;
            answerlist.setText(answerlist.getText() + "\n" + "3. Él " + elform[PreteriteActivity.elindex]);
        }
        if (ella.equals(elform[PreteriteActivity.ellaindex])){
            d = 1;
        } else if (!ella.equals(elform[PreteriteActivity.ellaindex])){d = 0;
            answerlist.setText(answerlist.getText() + "\n" + "4. Ella " + elform[PreteriteActivity.ellaindex]);
        }
        if (usted.equals(elform[PreteriteActivity.udindex])){
            e = 1;
        } else if (!usted.equals(elform[PreteriteActivity.udindex])){e = 0;
            answerlist.setText(answerlist.getText() + "\n" + "5. Usted " + elform[PreteriteActivity.udindex]);
        }
        if (nosotros.equals(nosform[PreteriteActivity.nosindex])){
            f = 1;
        } else if (!nosotros.equals(nosform[PreteriteActivity.nosindex])){f = 0;
            answerlist.setText(answerlist.getText() + "\n" + "6. Nosotros " + nosform[PreteriteActivity.nosindex]);
        }
        if (vosotros.equals(vosform[PreteriteActivity.vosindex])){
            g = 1;
        } else if (!vosotros.equals(vosform[PreteriteActivity.vosindex])){g = 0;
            answerlist.setText(answerlist.getText() + "\n" + "7. Vosotros " + vosform[PreteriteActivity.vosindex]);
        }
        if (ellos.equals(ellosform[PreteriteActivity.ellosindex])){
            h = 1;
        } else if (!ellos.equals(ellosform[PreteriteActivity.ellosindex])){ h = 0;
            answerlist.setText(answerlist.getText() + "\n" + "8. Ellos " + ellosform[PreteriteActivity.ellosindex]);
        }
        if (ellas.equals(ellosform[PreteriteActivity.ellasindex])){
            i = 1;
        } else if (!ellas.equals(ellosform[PreteriteActivity.ellasindex])){i = 0;
            answerlist.setText(answerlist.getText() + "\n" + "9. Ellas " + ellosform[PreteriteActivity.ellasindex]);
        }
        if (ustedes.equals(ellosform[PreteriteActivity.udsindex])){
            j = 1;
        } else if (!ustedes.equals(ellosform[PreteriteActivity.udsindex])){j = 0;
            answerlist.setText(answerlist.getText() + "\n" + "10. Ustedes " + ellosform[PreteriteActivity.udsindex]);
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
        getMenuInflater().inflate(R.menu.menu_preterite_scoring, menu);
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
