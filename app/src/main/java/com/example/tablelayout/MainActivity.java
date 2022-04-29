/*package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/
package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;
import  android.view.View ;
import android.widget.Button ;
import android.widget.TableLayout ;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button b ;
    TextView    txtt;
    private boolean flag ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void btnSub(View v)
    {
        TableLayout t = (TableLayout) findViewById(R.id.table1);
        Button  sBtn = (Button) findViewById(R.id.btn);
        TextView    txtt    =   (TextView)findViewById(R.id.txt1);
        t.setColumnCollapsed(1,flag);
       // t.setColumnCollapsed(2,flag);
        if(flag)
        {
            flag = false ;
            sBtn.setText("Show Detail ");
        }
        else
        {
            flag = true ;
            sBtn.setText("Hide ");
        }
    }
}