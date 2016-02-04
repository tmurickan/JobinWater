package com.thomasmurickan.waterup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Questions extends Activity {

    public void goBack(View view) {

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        ListView listView = (ListView) findViewById(R.id.listView);

        final ArrayList<String> questions = new ArrayList<String>();

        questions.add("Drinking & Cooking");
        questions.add("Cleaning");
        questions.add("Medical Questions");
        questions.add("What Happened?");
        questions.add("Find Water Bottles");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, questions);

        listView.setAdapter(arrayAdapter);

        final ArrayList<String> answers = new ArrayList<String>();
        answers.add("All about Drinking/Cooking"); //where i put the respective paragraphs of information
        answers.add("Info about Cleaning");
        answers.add("Med Stuff");
        answers.add("What went wrong?");
        answers.add("");



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                switch(position) {
                    case 0:

                        Intent i = new Intent(getApplicationContext(), Answers.class);
                        i.putExtra("name", answers.get(position));

                        startActivity(i);
                        break;
                    case 1:

                        Intent i1 = new Intent(getApplicationContext(), Answers.class);
                        i1.putExtra("name", answers.get(position));
                        startActivity(i1);
                        break;

                    case 2:

                        Intent i2 = new Intent(getApplicationContext(), Answers.class);
                        i2.putExtra("name", answers.get(position));
                        startActivity(i2);
                        break;

                    case 3:

                        Intent i3 = new Intent(getApplicationContext(), Answers.class);
                        i3.putExtra("name", answers.get(position));
                        startActivity(i3);
                        break;

                    case 4:

                        Intent i4 = new Intent(getApplicationContext(), MapsActivity.class);
                        i4.putExtra("name", answers.get(position));
                        startActivity(i4);

                        break;


                }







            }


        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_questions, menu);
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
}
