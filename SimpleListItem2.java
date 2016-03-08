package com.aplicacion.lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<String[]> menu= new LinkedList<String[]>();
        menu.add(new String[]{"Titulo","Submenu"});
        menu.add(new String[]{"Titulo 2","Submenu 2"});
        menu.add(new String[]{"Titulo 3","Submenu 3"});
        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String[]> adapter = new ArrayAdapter<String[]>(this,android.R.layout.simple_list_item_2,android.R.id.text1,menu){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                String[] text = menu.get(position);
                TextView text1 = (TextView)view.findViewById(android.R.id.text1);
                TextView text2 = (TextView)view.findViewById(android.R.id.text2);
                text1.setText(text[0]);
                text2.setText(text[1]);
                return view;
            }
        };
        listView.setAdapter(adapter);
    }
}
