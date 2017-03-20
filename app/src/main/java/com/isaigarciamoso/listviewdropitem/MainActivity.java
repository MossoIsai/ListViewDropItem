package com.isaigarciamoso.listviewdropitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter adapter;
    private ArrayList<String> nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }
    public void initViews(){

        listView =  (ListView)findViewById(R.id.listView);
        nombres = new ArrayList<>();
        nombres.add("ISAI GARCIA MOSO");
        nombres.add("ABRAHAM GARCIA MOSO");
        nombres.add("JESUS GARCIA MOSO");
        nombres.add("ISRAEL GARCIA MOSO");
        nombres.add("PEDRO GARCIA MOSO");
        nombres.add("CORONEL GARCIA MOSO");
        nombres.add("JUAN GARCIA MOSO");
        nombres.add("MATEO GARCIA MOSO");
        nombres.add("MATIAS GARCIA MOSO");
        nombres.add("ADRIAN GARCIA MOSO");
        nombres.add("KIKIL GARCIA MOSO");
        nombres.add("MARIA GARCIA MOSO");
        nombres.add("RAUL GARCIA MOSO");
        nombres.add("ALEJANDRO GARCIA MOSO");
        nombres.add("ALBERTO GARCIA MOSO");

        adapter =  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombres);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                      System.out.print("Posicion eliminada: "+position);
                Log.d("CONSOLE",position+"");
                nombres.remove(position);
                //Actilizando la modificacion
                adapter.notifyDataSetChanged();
            }
        });

    }
}
