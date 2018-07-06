package com.example.dell.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   ListView lv;
   String[] myfriends = {"aamin", "rishav", "aditya", "faijan",
           "simran", "anamika", "jyoti", "bunty", "rahul", "karan", "shrestha"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.list);
        ArrayAdapter<String> adt = new ArrayAdapter<String>(this, R.layout.data, myfriends);
        lv.setAdapter(adt);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tx = (TextView)view;
                String str = tx.getText().toString();
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });


    }
}
