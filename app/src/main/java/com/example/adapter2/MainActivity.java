package com.example.adapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> phones=new ArrayList<>();
    ArrayAdapter<String> adapter;
    ListView phonesList;
    EditText text;
    Button add,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phones.add("iPhone 10");
        phones.add("Samsung");
        phonesList=findViewById(R.id.phonesList);
        text=findViewById(R.id.phone);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,phones);
        phonesList.setAdapter(adapter);
    }
}
