package com.example.bookebusinessapplication.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bookebusinessapplication.R;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class EmployeeActivity extends AppCompatActivity
{

    public static final String TAG = "EmployeeActivity";


    private AppBarConfiguration mAppBarConfiguration;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_main_layout);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       // toolbar.setVisibility(View.GONE);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);



//         Passing each menu ID as a set of Ids because each
//         menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_specials, R.id.nav_employee_rattings, R.id.nav_service_history,
                R.id.nav_employee_messages, R.id.nav_employee_support)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);







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


//
//
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//
//        if (id == R.id.nav_specials) {
//            Toast.makeText(getApplicationContext(), "Nav Specials",Toast.LENGTH_LONG).show();
//
//            //goToEmployeeProfileActivity();
//        } else if (id == R.id.nav_employee_rattings) {
//
//            Toast.makeText(getApplicationContext(), "Employee Rattings",Toast.LENGTH_LONG).show();
//
//            //ratting class call
//            //   goToRattingsClass();
//
//
//        } else if (id == R.id.nav_service_history) {
//
//            Toast.makeText(getApplicationContext(), "Service History",Toast.LENGTH_LONG).show();
//
//            //     goToServiceHistoryActivity();
//            //go toServiceHistory call
//
//
//        } else if (id == R.id.nav_employee_messages) {
//            // goToBookedServiceConfirmation();
//            Toast.makeText(getApplicationContext(), "Employee Message",Toast.LENGTH_LONG).show();
//
//        } else if (id == R.id.nav_employee_support) {
//            // goToSupportActivity();
//
//            Toast.makeText(getApplicationContext(), "Employee Support",Toast.LENGTH_LONG).show();
//
//
//
//        } else if (id == R.id.nav_signout) {
//            //   mAuth.signOut();
//            Toast.makeText(getApplicationContext(), "Employee Sign out",Toast.LENGTH_LONG).show();
//
//
//            //sign out func
//            finish();
//
//        }
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture)
    {

    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }




}
