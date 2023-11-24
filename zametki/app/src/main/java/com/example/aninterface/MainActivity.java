package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenNote(View view){
        setContentView(R.layout.activity_note);
    }
    public class notes{
        public String name;
        public  String text;
        public String date;
    }
    public List<notes> list_nites=new ArrayList<>();
    public void AddNote (View view) {
        notes new_notes = new notes();
        EditText e_name =
                findViewById(R.id.editTextTextPersonName);
        new_notes.name = e_name.getText().toString();
        MultiAutoCompleteTextView e_text = findViewById(R.id.multiAutoCompleteTextView); new_notes.text = e_text.getText().toString();
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat( pattern: "yyyy.MM.dd"); new_notes.date = formatForDateNow.format(dateNow);
        list_nites.add(new_notes);
        setContentView(R.layout.activity_main);
        onLoad();}
}