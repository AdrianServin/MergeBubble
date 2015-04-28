package adrianservin.ordenamiento;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Comparable datos[]={1,2,4,62,98,6,45,6,3,5,8,56,34,7,53,345,8};
    int []dato={1,2,4,62,98,6,45,6,3,5,8,56,34,7,53,345,8};
    long startTime,stopTime,time;
    Merge merge= new Merge();
    Bubble bubble= new Bubble();

    public EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btnMerge= findViewById(R.id.btnMerge);
        btnMerge.setOnClickListener(this);
        View btnBubble= findViewById(R.id.btnburbuja);
        btnBubble.setOnClickListener(this);

        text= (EditText)findViewById(R.id.editText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View vista) {
        if(vista.getId()==findViewById(R.id.btnMerge).getId()){

            startTime = System.nanoTime();
                merge.sort(datos);
            stopTime = System.nanoTime();
            time = stopTime - startTime;

            text.setText("");
            for (int i=0;i<datos.length;i++){
                text.append("-"+datos[i]);
            }
            text.append("\nTiempo Ejecucion: "+time+" n");
        }


        if(vista.getId()==findViewById(R.id.btnburbuja).getId()){

            startTime = System.nanoTime();
                bubble.sort(dato);
            stopTime = System.nanoTime();
            time = stopTime - startTime;

            text.setText("");
            for (int i=0;i<dato.length;i++){
                text.append("-"+dato[i]);
            }
            text.append("\nTiempo Ejecucion: "+time+" n");
        }
    }


}
