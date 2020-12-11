package com.example.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MakeNewRecord extends AppCompatActivity {

    EditText name;

    Button record, quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_new_record);

        name = (EditText) findViewById(R.id.nameField);

        record = (Button) findViewById(R.id.confirmRecordButton);

        quit = (Button) findViewById(R.id.makeRecordQuitButton);

        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Add code calling Record Class Methods
                Intent intent = new Intent(MakeNewRecord.this, RecordsScreen.class);
                startActivity(intent);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakeNewRecord.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}