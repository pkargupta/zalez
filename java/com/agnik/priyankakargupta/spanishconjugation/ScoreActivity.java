package com.agnik.priyankakargupta.spanishconjugation;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class ScoreActivity extends ActionBarActivity {
    public String[] yoform = {"estudio","ando","ayudo", "llego", "busco", "camino", "canto", "necesito", "pago", "trabajo",
            "vendo", "poseo", "leo", "escondo", "debo", "creo", "corro", "comprendo", "como", "aprendo", "abro", "decido",
            "describo", "escribo", "permito", "voy", "vivo", "existio", "admito", "omito"};
    public String[] tuform = {"estudias","andas","ayudas", "llegas", "buscas", "caminas", "cantas", "necesitas", "pagas", "trabajas",
            "vendes", "posees", "lees", "escondes", "debes", "crees", "corres", "comprendes", "comes", "aprendes", "abres", "decides",
            "describes", "escribes", "permites", "vas", "vives", "existes", "admites", "omites"};
    public String[] elform = {"estudia","anda","ayuda", "llega", "busca", "camina", "canta", "necesita", "paga", "trabaja",
            "vende", "posee", "lee", "esconde", "debe", "cree", "corre", "comprende", "come", "aprende", "abre", "decide",
            "describe", "escribe", "permite", "va", "vive", "existe", "admite", "omite"};
    public String[] nosform = {"estudiamos","andamos","ayudamos", "llegamos", "buscamos", "caminamos", "cantamos", "necesitamos", "pagamos", "trabajamos",
            "vendemos", "poseemos", "leemos", "escondemos", "debemos", "creemos", "corremos", "comprendemos", "comemos", "aprendemos", "abrimos", "decidimos",
            "describimos", "escribimos", "permitimos", "vamos", "vivimos", "existimos", "admitimos", "omitimos"};
    public String[] vosform = {"estudiáis","andáis","ayudáis", "llegáis", "buscáis", "camináis", "cantáis", "necesitáis", "pagáis", "trabajáis",
            "vendéis", "poseéis", "leéis", "escondéis", "debéis", "creéis", "corréis", "comprendéis", "coméis", "aprendéis", "abrís", "decidís",
            "describís", "escribís", "permitís", "vaís", "vivís", "existís", "admitís", "omitís"};
    public String[] ellosform = {"estudian","andan","ayudan", "llegan", "buscan", "caminan", "cantan", "necesitan", "pagan", "trabajan",
            "venden", "poseen", "leen", "esconden", "deben", "creen", "corren", "comprenden", "comen", "aprenden", "abren", "deciden",
            "describen", "escriben", "permiten", "van", "viven", "existen", "admiten", "omiten"};
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
        setContentView(R.layout.activity_score);
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
    if (yo.equals(yoform[MainActivity.yoindex])){

        a = 1;
    } else if (!yo.equals(yoform[MainActivity.yoindex])){a = 0;

answerlist.setText("1. Yo " + yoform[MainActivity.yoindex]);
    }
    if (tu.equals(tuform[MainActivity.tuindex])){
        b = 1;
    } else if (!tu.equals(tuform[MainActivity.tuindex])){ b = 0;
        answerlist.setText(answerlist.getText() + "\n" + "2. Tú " + tuform[MainActivity.tuindex]);
    }
    if (el.equals(elform[MainActivity.elindex])){
        c = 1;
    } else if (!el.equals(elform[MainActivity.elindex])){ c = 0;
        answerlist.setText(answerlist.getText() + "\n" + "3. Él " + elform[MainActivity.elindex]);
    }
    if (ella.equals(elform[MainActivity.ellaindex])){
        d = 1;
    } else if (!ella.equals(elform[MainActivity.ellaindex])){d = 0;
        answerlist.setText(answerlist.getText() + "\n" + "4. Ella " + elform[MainActivity.ellaindex]);
    }
    if (usted.equals(elform[MainActivity.udindex])){
        e = 1;
    } else if (!usted.equals(elform[MainActivity.udindex])){e = 0;
        answerlist.setText(answerlist.getText() + "\n" + "5. Usted " + elform[MainActivity.udindex]);
    }
    if (nosotros.equals(nosform[MainActivity.nosindex])){
        f = 1;
    } else if (!nosotros.equals(nosform[MainActivity.nosindex])){f = 0;
        answerlist.setText(answerlist.getText() + "\n" + "6. Nosotros " + nosform[MainActivity.nosindex]);
    }
    if (vosotros.equals(vosform[MainActivity.vosindex])){
        g = 1;
    } else if (!vosotros.equals(vosform[MainActivity.vosindex])){g = 0;
        answerlist.setText(answerlist.getText() + "\n" + "7. Vosotros " + vosform[MainActivity.vosindex]);
    }
    if (ellos.equals(ellosform[MainActivity.ellosindex])){
        h = 1;
    } else if (!ellos.equals(ellosform[MainActivity.ellosindex])){ h = 0;
        answerlist.setText(answerlist.getText() + "\n" + "8. Ellos " + ellosform[MainActivity.ellosindex]);
    }
    if (ellas.equals(ellosform[MainActivity.ellasindex])){
        i = 1;
    } else if (!ellas.equals(ellosform[MainActivity.ellasindex])){i = 0;
        answerlist.setText(answerlist.getText() + "\n" + "9. Ellas " + ellosform[MainActivity.ellasindex]);
    }
    if (ustedes.equals(ellosform[MainActivity.udsindex])){
        j = 1;
    } else if (!ustedes.equals(ellosform[MainActivity.udsindex])){j = 0;
        answerlist.setText(answerlist.getText() + "\n" + "10. Ustedes " + ellosform[MainActivity.udsindex]);
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
        getMenuInflater().inflate(R.menu.menu_score, menu);
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
