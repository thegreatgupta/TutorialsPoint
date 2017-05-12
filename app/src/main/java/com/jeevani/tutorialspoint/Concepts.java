package com.jeevani.tutorialspoint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Concepts extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    GridView grid;
    String[] web = {"C", "Java", "Android", "C", "Java", "Android", "C", "Java", "Android", "C", "Java", "Android", "C", "Java", "Android"} ;

    int[] imageId = {
            R.drawable.c_img,
            R.drawable.java_img,
            R.drawable.android_img,
            R.drawable.c_img,
            R.drawable.java_img,
            R.drawable.android_img,
            R.drawable.c_img,
            R.drawable.java_img,
            R.drawable.android_img,
            R.drawable.c_img,
            R.drawable.java_img,
            R.drawable.android_img,
            R.drawable.c_img,
            R.drawable.java_img,
            R.drawable.android_img
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ConceptTopicsCustomGrid adapter = new ConceptTopicsCustomGrid(Concepts.this, web, imageId);
        grid=(GridView)findViewById(R.id.gridConcept);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                /*Intent intent = new Intent(Concepts.this, ConceptTopicLists.class);
                startActivity(intent);*/
                if(position==0){
                    Toast.makeText(Concepts.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Intent intro = new Intent(getApplicationContext(), ConceptTopicLists.class);
                    startActivity(intro);
                    Toast.makeText(Concepts.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(Concepts.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                }
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Concepts/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.concepts) {
            Intent intent = new Intent(getApplicationContext(), Concepts.class);
            startActivity(intent);
        } else if (id == R.id.programs) {
            Intent intent = new Intent(getApplicationContext(), Programs.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
