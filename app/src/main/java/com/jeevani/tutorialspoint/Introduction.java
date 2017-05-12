package com.jeevani.tutorialspoint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Jeevani on 5/11/2017.
 */

public class Introduction extends AppCompatActivity {

    TextView intro,intro1,intro2,intro3;

    String htmlStr = "<P><h4>Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. " +
            "Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX. " +
            "This tutorial gives a complete understanding of Java.</h4></P>";

    String htmlStr1 = "<P><h4><b>Object-Oriented Programming<b> is a methodology or paradigm to design a program using classes and objects. " +
            "It simplifies the software development and maintenance by providing some concepts:<h4><P>\n" +
            "<h4>1. Class</h4>\n" +
            "<h4>2. Object</h4>\n" +
            "<h4>3. Inheritance</h4>\n" +
            "<h4>4. Polymerphism</h4>\n" +
            "<h4>5. Encapsulation</h4>\n" +
            "<h4>6. Abstraction</h4>\n" ;

    String htmlStr2 = "<h4>1. Object Oriented</h4>\n" +
            "<h4>2. Platform Independent</h4>\n" +
            "<h4>3. Simple</h4>\n" +
            "<h4>4. Secure</h4>\n" +
            "<h4>5. Architecture-neutral</h4>\n" +
            "<h4>6. Portable </h4>\n" +
            "<h4>7. Robust </h4>\n" +
            "<h4>8. Multithreaded </h4>\n" +
            "<h4>9. Interpreted </h4>\n" +
            "<h4>10. High Performance</h4>\n" +
            "<h4>11. Distributed</h4>\n" +
            "<h4>12. Dynamic</h4>\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        intro = (TextView) findViewById(R.id.intro);
        intro.setText(Html.fromHtml(htmlStr));
        intro1 = (TextView) findViewById(R.id.intro1);
        intro1.setText(Html.fromHtml(htmlStr1));
        intro2 = (TextView) findViewById(R.id.intro2);
        intro2.setText(Html.fromHtml(htmlStr2));
        intro3 = (TextView) findViewById(R.id.intro3);
        intro3.setText(Html.fromHtml(htmlStr1));
    }
}
