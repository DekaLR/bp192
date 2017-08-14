package mobile.contents.contest;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import mobile.contents.contest.Adapter.ViewPagerAdapter;
import mobile.contents.contest.CelLib.Input_Data;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    TextView typ, num_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        final ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager_maincel);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        Log.d("완료", "뷰페이저  로딩");
        typ = (TextView)findViewById(R.id.typ);
        num_view = (TextView)findViewById(R.id.num_view);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Overridegit
            public void onPageSelected(int position) {
                switch (position) {
                    case 0 :
                        typ.setText("(2)");
                        break;
                    case 1 :
                        typ.setText("(10)");
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setAdapter(adapter);
        Log.d("완료", "뷰페이저 어댑터 셋팅");

        typ = (TextView)findViewById(R.id.typ);
        num_view = (TextView)findViewById(R.id.num_view);



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Toast.makeText(this, "Back 버튼을 한번 더 누르시면 종료됩니다", Toast.LENGTH_SHORT).show();
            //moveTaskToBack(true);
            //finish();
            super.onBackPressed();
            //android.os.Process.killProcess(android.os.Process.myPid());
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
        // automatically handle clicks on the Home/Up button, so long
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
        int id = item.getItemId();

        /*Fragment fragment = null;
        String title = getString(R.string.app_name);
        int color = Color.parseColor("#FFFFFF");

        if (id == R.id.nav_maincelactivity) {
            fragment = new MainCelActivity();
            title = "MainCelActivity";
            color = Color.parseColor("#424242");
        } else if (id == R.id.nav_2) {
            fragment = new MainConvertActivity();
            title = "MainConvertActivity";
            color = Color.parseColor("#ec407a");
        } else if (id == R.id.nav_3) {
            title = "InfoActivity";
            color = Color.parseColor("#673ab7");
        } else if (id == R.id.nav_4) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        if(toolbar != null) {
            toolbar.setBackgroundColor(color);
            toolbar.setTitle(title);
        }

        if(fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.mainfragment, fragment);
            ft.addToBackStack(null); //text code
            ft.commit();
        }

        //ActionBar(ToolBar)에 타이틀 텍스트 적용
        /*if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setBackgroundDrawable( new ColorDrawable(Color.parseColor("#4885ed")));
        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
