package com.example.bookebusinessapplication.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.bookebusinessapplication.R;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;


public class EmployeeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{

    public static final String TAG = "EmployeeActivity";


    private AppBarConfiguration mAppBarConfiguration;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_main_layout);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbaras);
//        toolbar.setVisibility(View.GONE);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        View headerView = navigationView.getHeaderView(0);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_specials, R.id.nav_employee_rattings, R.id.nav_service_history,
//                R.id.nav_employee_messages, R.id.nav_employee_support, R.id.nav_signout)
//                .setDrawerLayout(drawer)
//                .build();

       // NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       // NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
       // NavigationUI.setupWithNavController(navigationView, navController);







    }








    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }






    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }




    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_specials) {
            Toast.makeText(getApplicationContext(), "Nav Specials",Toast.LENGTH_LONG).show();

            //goToEmployeeProfileActivity();
        } else if (id == R.id.nav_employee_rattings) {

            Toast.makeText(getApplicationContext(), "Employee Rattings",Toast.LENGTH_LONG).show();

            //ratting class call
            //   goToRattingsClass();


        } else if (id == R.id.nav_service_history) {

            Toast.makeText(getApplicationContext(), "Service History",Toast.LENGTH_LONG).show();

            //     goToServiceHistoryActivity();
            //go toServiceHistory call


        } else if (id == R.id.nav_employee_messages) {
            // goToBookedServiceConfirmation();
            Toast.makeText(getApplicationContext(), "Employee Message",Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_employee_support) {
            // goToSupportActivity();

            Toast.makeText(getApplicationContext(), "Employee Support",Toast.LENGTH_LONG).show();



        } else if (id == R.id.nav_signout) {
            //   mAuth.signOut();
            Toast.makeText(getApplicationContext(), "Employee Sign out",Toast.LENGTH_LONG).show();


            //sign out func
            finish();

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture)
    {

    }





}
