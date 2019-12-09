package com.example.bookebusinessapplication.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bookebusinessapplication.R;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class EmployerActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_main_layout);


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
            //goToEmployeeProfileActivity();
        } else if (id == R.id.nav_employee_rattings) {

            goToRattingsClass();


        } else if (id == R.id.nav_service_history) {

            goToServiceHistoryActivity();



        } else if (id == R.id.nav_employee_messages) {
            // goToBookedServiceConfirmation();

        } else if (id == R.id.nav_employee_support) {
            goToSupportActivity();

        } else if (id == R.id.nav_signout) {
            mAuth.signOut();
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
