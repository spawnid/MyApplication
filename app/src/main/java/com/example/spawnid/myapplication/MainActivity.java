package com.example.spawnid.myapplication;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnFolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFolder = (Button) findViewById(R.id.button);

        btnFolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), Environment.getDataDirectory().getPath(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), Environment.getExternalStorageDirectory().getPath(), Toast.LENGTH_SHORT).show();
            }

        });
    }


}
