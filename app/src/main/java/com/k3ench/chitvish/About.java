package com.k3ench.chitvish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView =(TextView)findViewById(R.id.t1);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


        String text = "<p align=\"justify\"><br><font color=\"black\">Chitvish is now a household name across the globe.Her countless recipes have taken the culinaryworld by storm.Each and every mouth watering recipe of hers is tried meticulously by a lonely bride in Alaska or Australia living far away from her dear parents.When she is able to cook a dish just the way her mother did thanks to chitvish`s recipes,her joy knows no bounds and her homesickness vanishes instantly.</font></p>"+
                "            <p><font color=\"black\">Despite her strong South Indian roots,Chitvish`s recipes transcend national and international barriers.Be it the typically Tamilian akkaravadisal,the Gujarathi dhokia,the Rajastani Lapsi or the Mexican fajita,her avid followers just make a beeline to her recipes whenever they want to make it.Ask Chitvish is the mantra chanted by thousands day in and day out!</font></p><br>" +
                "            <font color=\"black\"> Welcome to the Wonderland of Chitvish!</font><br><br><br>" +
                "              <h4><u><font color=\"black\">Reviews</font></u><h4><br>";
        String text1="<h4><a href='http://www.thehindu.com/features/metroplus/hits-likes-and-sambar/article6163393.ece'><font color=\"red\">The Hindu</font></a><br> <br><a href='http://www.thenewindianexpress.com.cities/chennai/2014/oct/09/Akkaravadisal-for-the-South-Indian-Soul-669706.html'><font color=\"red\">New Indian Express</font></a><br><br><a href='http://m.rediff.com/getahead/slide-show/slide-show-1-achievers-75-yr-old-chitra-viswanathan-has-a-cooking-app-to-her-name/21040728.htm'><font color=\"red\">Rediff</font></a><br><br></h4><br><h4><u><font color=\"black\">Testimonilas</u></h4><br><br><u><h5><font color=\"black\">Shyamala Srivastan</u></h5><br><font color=\"black\">Very useful and handy(on hand all the time) cook book from an experienced culinary expert.Chitra has expalined everything neatly and clearly.<br><br><h5><u><font color=\"black\">Sundar Matpadi</h5></u><br><font color=\"black\">Wonderful Collection of recipe, all personally made and verified by the author<br><br><h5><u><font color=\"black\">Jayashree Arvind</h5></u><font color=\"black\">Best app and every one must try in every mobile.lots of tips and detailed step by step recipe with photos.Since every thing has been tried,it comes out perfectly.<br><br><h5><u><font color=\"black\">Ayesha Fakhrudin</h5></u><br><font color=\"black\">Best Companion in the kitchen";


        textView.setText(Html.fromHtml(text+text1));
    }
    public void onBackPressed()
   {
        Intent intent = new Intent(About.this, Categories.class);
       startActivity(intent);
    }


}
