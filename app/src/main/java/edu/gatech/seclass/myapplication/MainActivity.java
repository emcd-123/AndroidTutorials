package edu.gatech.seclass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void handleText(View v){
        TextView t = (TextView) findViewById(R.id.source);
        String input = t.getText().toString();
        System.out.println(input);
    }

    public void disable(View v){


        /*v.setEnabled(false);
        Button b = (Button) v;
        b.setText("Disabled");
    */
    }

}