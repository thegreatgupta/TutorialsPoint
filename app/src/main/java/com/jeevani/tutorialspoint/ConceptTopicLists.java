package com.jeevani.tutorialspoint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jeevani on 5/10/2017.
 */

public class ConceptTopicLists extends AppCompatActivity {

    private ListView list;
    private ArrayAdapter arrayAdapter;
    private String[] topics = { "Introduction  of OOPs", "Class", "Object", "Abstraction", "Encapsulation",
            "Inheritance", "Polymorphism", "Interface" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concept_topic_lists);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        list = (ListView) findViewById(R.id.conceptLists);
        ConceptCustomAdapter adapter = new ConceptCustomAdapter(this,topics);
        list.setAdapter(adapter);

        /*list = (ListView) findViewById(R.id.lists);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, topics);
        list.setAdapter(arrayAdapter);*/

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                if(position==0){
                    Intent intro = new Intent(getApplicationContext(), Introduction.class);
                    startActivity(intro);
                }
                if(position==1){
                    Toast.makeText(getApplicationContext(),"You have selected pst2", Toast.LENGTH_LONG).show();
                }
                if(position==2){
                    Toast.makeText(getApplicationContext(),"You have selected pst3", Toast.LENGTH_LONG).show();
                }

                /*String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();*/
                /*Intent intent = new Intent(ConceptTopicLists.this, Concepts.class);
                startActivity(intent);*/

                /*AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        TopicLists.this);

                alertDialogBuilder.setTitle("Wanna Add Baseline Information");

                alertDialogBuilder
                        .setMessage("Click No to exit")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(getApplicationContext(),TopicLists.class);
                                startActivity(intent);

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();*/

            }
        });
    }
}

class ConceptCustomAdapter extends ArrayAdapter<String>
{
    Context context;
    String[] title;

    ConceptCustomAdapter(Context c, String[] title)
    {

        super(c, R.layout.activity_concept_topic_list_items,title);
        this.context = c;
        this.title=title;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = vi.inflate(R.layout.activity_concept_topic_list_items, parent, false);
        TextView txt = (TextView) row.findViewById(R.id.conceptItem);
        int pos = position+1;
        txt.setText(+pos + ". " + title[position]);
        pos++;
        return row;
    }

}