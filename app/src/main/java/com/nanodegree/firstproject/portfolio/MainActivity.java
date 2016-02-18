package com.nanodegree.firstproject.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.title);
        setContentView(R.layout.activity_main);
        // Binding the static id of the views created in XML with the Java counterparts
        Button project1 = (Button)findViewById(R.id.button1);
        Button project2 = (Button)findViewById(R.id.button2);
        Button project3 = (Button)findViewById(R.id.button3);
        Button project4 = (Button)findViewById(R.id.button4);
        Button project5 = (Button)findViewById(R.id.button5);
        Button capstoneProject = (Button)this.findViewById(R.id.button6);

        // Registering the Listener with the Views
        project1.setOnClickListener(this);
        project2.setOnClickListener(this);
        project3.setOnClickListener(this);
        project4.setOnClickListener(this);
        project5.setOnClickListener(this);
        capstoneProject.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        int uniqueID = view.getId();
        Toast toast;
        Context context = getApplicationContext();
        switch(uniqueID){
            case R.id.button1: {
                toast = Toast.makeText(context,getString(R.string.button1_toastMessage),Toast.LENGTH_LONG);
                toast.show();
                break;
            }
            case R.id.button2: {
                toast = Toast.makeText(context,getString(R.string.button2_toastMessage),Toast.LENGTH_LONG);
                toast.show();
                break;
            }
            case R.id.button3: {
                toast = Toast.makeText(context,getString(R.string.button3_toastMessage),Toast.LENGTH_LONG);
                toast.show();
                break;
            }
            case R.id.button4: {
                toast = Toast.makeText(context,getString(R.string.button4_toastMessage),Toast.LENGTH_LONG);
                toast.show();
                break;
            }
            case R.id.button5: {
                toast = Toast.makeText(context,getString(R.string.button5_toastMessage),Toast.LENGTH_LONG);
                toast.show();
                break;
            }
            case R.id.button6: {
                toast = Toast.makeText(context,getString(R.string.button6_toastMessage),Toast.LENGTH_LONG);
                toast.show();
                break;
            }
            default:
                break;
        }

    }
}
