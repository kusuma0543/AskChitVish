package com.k3ench.chitvish;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Categories extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button  contact;
    FragmentTransaction fragmentTransaction;
    String share_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.i6:
                      String YourPageURL="https://m.facebook.com/askchitvish/";
                        Intent facebook=new Intent(Intent.ACTION_VIEW,Uri.parse(YourPageURL));
                        startActivity(facebook);
                        break;
                    case R.id.i7:
                        Intent intentm=new Intent(Intent.ACTION_SEND);
                        intentm.setData(Uri.parse("mailto:"));
                        String[ ] to={"appchitwish@gmail.com"};
                        intentm.putExtra(Intent.EXTRA_EMAIL,to);
                        intentm.putExtra(Intent.EXTRA_SUBJECT,"FeedBack");
                        intentm.putExtra(Intent.EXTRA_TEXT,"");
                        intentm.setType("message/rfc822");
                        Intent chooser=null;
                         chooser=Intent.createChooser(intentm,"send mail");
                        startActivity(chooser);
                        break;
                    case R.id.i8:
                        Intent sendIntent=new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(sendIntent.EXTRA_TEXT,"I am happy with this app.Please click the link to download" +
                                " https://play.google.com/store/apps/details?id=com.askchitvish.activity.prem&hl=en");
                        //sendIntent.putExtra("android.intent.extra.SUBJECT",share_data);
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);
                        break;
                    case R.id.i9:
                        Intent intentab = new Intent(Categories.this, About.class);
                        startActivity(intentab);
                        break;
                }
                return false;
            }
        });
        contact=(Button)findViewById(R.id.bt);

      contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Intent intent = new Intent(Categories.this, About.class);
              //  startActivity(intent);
                Toast.makeText(Categories.this,"hi",Toast.LENGTH_SHORT).show();
                          }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
          //  super.onBackPressed();
            createDialog();
        }

    }
    public void createDialog()
    {

        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setTitle("Exit");
        alertDialog.setMessage("Are you sure to exit?");
        alertDialog.setCancelable(false);
        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Categories.super.onBackPressed();
            }
        });
        alertDialog.create().show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.categories, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.i1) {
            // Handle the camera action
        } else if (id == R.id.i2) {

        } else if (id == R.id.i3) {

        } else if (id == R.id.i4) {

        } else if (id == R.id.i9) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
