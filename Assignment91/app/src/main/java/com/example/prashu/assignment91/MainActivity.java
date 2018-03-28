package com.example.prashu.assignment91;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        t=(TextView) findViewById(R.id.text);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.red){
          t.setTextColor(Color.RED);
        }
        else if(id==R.id.blue){
            t.setTextColor(Color.BLUE);
        }
        else if(id==R.id.green){
            t.setTextColor(Color.GREEN);
        }
        else if(id==R.id.yellow){

            t.setTextColor(Color.YELLOW);
        }
        return super.onOptionsItemSelected(item);
    }
}
