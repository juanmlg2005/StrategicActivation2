package com.example.juanmanuel.strategicactivation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    private ListView listView2;
    private List<String> names2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Add ListView to show options
        listView2 = (ListView) findViewById(R.id.listview2);
        names2 = new ArrayList<String>();

        //List<String> names2 = new ArrayList<String>();
        // Data to show
        names2.add("Brazos");
        names2.add("Cabeza");
        names2.add("Cuello");
        names2.add("Espalda");
        names2.add("Manos");
        names2.add("Ojos");
        names2.add("Piernas y pies");
        names2.add("Hombros");
        //Visual Adapter to show our data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names2);
        //Join the adapter to the list view
        listView2.setAdapter(adapter);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id){
                switch (position) {
                    case 0:
                        Intent newActivity0 = new Intent(Main3Activity.this, OBrazos.class);
                        startActivity(newActivity0);
                    case 1:
                        Intent newActivity1 = new Intent(Main3Activity.this, Ocabeza.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(Main3Activity.this, Ocuello.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(Main3Activity.this, Oespalda.class);
                        startActivity(newActivity3);
                        break;
                    case 4:
                        Intent newActivity4 = new Intent(Main3Activity.this, Omanos.class);
                        startActivity(newActivity4);
                        break;
                    case 5:
                        Intent newActivity5 = new Intent(Main3Activity.this, Oojos.class);
                        startActivity(newActivity5);
                        break;
                    case 6:
                        Intent newActivity6 = new Intent(Main3Activity.this, Opierna.class);
                        startActivity(newActivity6);
                        break;
                    case 7:
                        Intent newActivity7 = new Intent(Main3Activity.this, Ohombro.class);
                        startActivity(newActivity7);
                        break;
                }
            }
        });


    }
}