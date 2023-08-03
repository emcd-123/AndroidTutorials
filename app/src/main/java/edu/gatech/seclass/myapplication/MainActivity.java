package edu.gatech.seclass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void handleText(View v){
        EditText t = (EditText) findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();


    }

    public void launchSettings(View v){
        //launch a new activity
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);

    }

    public void disable(View v){


        /*v.setEnabled(false);
        Button b = (Button) v;
        b.setText("Disabled");
    */
    }

}