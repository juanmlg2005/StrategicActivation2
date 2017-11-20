package com.example.juanmanuel.strategicactivation;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ListView listView;
    private List<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Typeface TF = Typeface.createFromAsset(getAssets(), "fonts/IndieFlower.ttf");
        //Add ListView to show options
        listView = (ListView) findViewById(R.id.listview);



        names = new ArrayList<String>();
        // Data to show
        names.add("Brazos");
        names.add("Cabeza");
        names.add("Cuello");
        names.add("Espalda");
        names.add("Manos");
        names.add("Ojos");
        names.add("Piernas y pies");
        names.add("Relajación");
        //Visual Adapter to show our data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        //Join the adapter to the list view
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view,int position,long id){
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(Main2Activity.this, IndustriaBrazos.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(Main2Activity.this, Industriacabeza.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(Main2Activity.this, Icuello.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(Main2Activity.this, Iespalda.class);
                        startActivity(newActivity3);
                        break;
                    case 4:
                        Intent newActivity4 = new Intent(Main2Activity.this, Imanos.class);
                        startActivity(newActivity4);
                        break;
                    case 5:
                        Intent newActivity5 = new Intent(Main2Activity.this, Iojo.class);
                        startActivity(newActivity5);
                        break;
                    case 6:
                        Intent newActivity6 = new Intent(Main2Activity.this, Ipierna.class);
                        startActivity(newActivity6);
                        break;
                    case 7:
                        Intent newActivity7 = new Intent(Main2Activity.this, Irelajacion.class);
                        startActivity(newActivity7);
                        break;
                }
            }
        });
    }
}
