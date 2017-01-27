package com.agnik.priyankakargupta.spanishconjugation;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class FutureActivity extends ActionBarActivity {
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

    public String[] verbs = {"estudiar","andar","ayudar", "llegar", "buscar", "caminar", "cantar", "necesitar", "pagar", "trabajar",
            "vender", "poseer", "leer", "esconder", "deber", "creer", "correr", "comprender", "comer", "aprender", "abrir", "decidir",
            "describir", "escribir", "permitir", "ir", "vivir", "existir", "admitir", "omitir"};
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
            "vender", "poseer", "leer", "esconder", "deber", "creer", "correr", "comprender", "comer", "aprender", "abrir", "decidir",
            "describen", "escriben", "permiten", "van", "viven", "existen", "admiten", "omiten"};
    public static int yoindex;
    public static int tuindex;
    public static int elindex;
    public static int ellaindex;
    public static int udindex;
    public static int nosindex;
    public static int vosindex;
    public static int ellosindex;
    public static int ellasindex;
    public static int udsindex;
    TextView yolabel, tulabel, ellabel, ellalabel, udlabel, noslabel, voslabel, elloslabel, ellaslabel, udslabel;
    Button check;
    int a, b, c , d, e, f, g, h, i, j, score;
    public EditText yo, tu, el, ella, usted, nos, vos, ellos, ellas, uds;
    public void calcScore(View view) {
        // Do something in response to button
        yo = (EditText) findViewById(R.id.YoInput);
        tu = (EditText) findViewById(R.id.TuInput);
        el = (EditText) findViewById(R.id.ElInput);
        ella = (EditText) findViewById(R.id.EllaInput);
        usted = (EditText) findViewById(R.id.UstedInput);
        nos = (EditText) findViewById(R.id.NosotrosInput);
        vos = (EditText) findViewById(R.id.VosotrosInput);
        ellos = (EditText) findViewById(R.id.EllosInput);
        ellas = (EditText) findViewById(R.id.EllasInput);
        uds = (EditText) findViewById(R.id.UstedesInput);
        Intent intent = new Intent(this, FutureScoring.class);
        intent.putExtra("yo", yo.getText().toString().toLowerCase().trim());
        intent.putExtra("tu", tu.getText().toString().toLowerCase().trim());
        intent.putExtra("el", el.getText().toString().toLowerCase().trim());
        intent.putExtra("ella", ella.getText().toString().toLowerCase().trim());
        intent.putExtra("usted", usted.getText().toString().toLowerCase().trim());
        intent.putExtra("nosotros", nos.getText().toString().toLowerCase().trim());
        intent.putExtra("vosotros", vos.getText().toString().toLowerCase().trim());
        intent.putExtra("ellos", ellos.getText().toString().toLowerCase().trim());
        intent.putExtra("ellas", ellas.getText().toString().toLowerCase().trim());
        intent.putExtra("ustedes", uds.getText().toString().toLowerCase().trim());
        startActivity(intent);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
        check = (Button) findViewById(R.id.button);
        yo = (EditText) findViewById(R.id.YoInput);
        tu = (EditText) findViewById(R.id.TuInput);
        el = (EditText) findViewById(R.id.ElInput);
        ella = (EditText) findViewById(R.id.EllaInput);
        usted = (EditText) findViewById(R.id.UstedInput);
        nos = (EditText) findViewById(R.id.NosotrosInput);
        vos = (EditText) findViewById(R.id.VosotrosInput);
        ellos = (EditText) findViewById(R.id.EllosInput);
        ellas = (EditText) findViewById(R.id.EllasInput);
        uds = (EditText) findViewById(R.id.UstedesInput);
        yolabel = (TextView) findViewById(R.id.YoVerb);
        tulabel = (TextView) findViewById(R.id.TuVerb);
        ellabel = (TextView) findViewById(R.id.ElVerb);
        ellalabel = (TextView) findViewById(R.id.EllaVerb);
        udlabel = (TextView) findViewById(R.id.UstedVerb);
        noslabel = (TextView) findViewById(R.id.NosotrosVerb);
        voslabel = (TextView) findViewById(R.id.VosotrosVerb);
        elloslabel = (TextView) findViewById(R.id.EllosVerb);
        ellaslabel = (TextView) findViewById(R.id.EllasVerb);
        udslabel = (TextView) findViewById(R.id.UstedesVerb);
        Random random = new Random();
        yoindex = random.nextInt(verbs.length);
        yolabel.setText(verbs[yoindex]);
        tuindex = random.nextInt(verbs.length);
        tulabel.setText(verbs[tuindex]);
        elindex = random.nextInt(verbs.length);
        ellabel.setText(verbs[elindex]);
        ellaindex = random.nextInt(verbs.length);
        ellalabel.setText(verbs[ellaindex]);
        udindex = random.nextInt(verbs.length);
        udlabel.setText(verbs[udindex]);
        nosindex = random.nextInt(verbs.length);
        noslabel.setText(verbs[nosindex]);
        vosindex = random.nextInt(verbs.length);
        voslabel.setText(verbs[vosindex]);
        ellosindex = random.nextInt(verbs.length);
        elloslabel.setText(verbs[ellosindex]);
        ellasindex = random.nextInt(verbs.length);
        ellaslabel.setText(verbs[ellasindex]);
        udsindex = random.nextInt(verbs.length);
        udslabel.setText(verbs[udsindex]);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_future, menu);
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
