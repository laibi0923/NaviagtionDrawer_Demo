package leaningcode.leo.com.naviagtiondrawer_demo;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView mToolbar_Title;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nagivation_drawer);
        init_Toolbar();
        init_DrawerLayout();
        init_NavigationView();
    }

    final void init_Toolbar(){
        mToolbar = findViewById(R.id.mToolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_USE_LOGO | ActionBar.DISPLAY_HOME_AS_UP);

        mToolbar_Title = findViewById(R.id.mToolbar_Titile);
        mToolbar_Title.setText(getResources().getString(R.string.app_name));
    }

    final void init_DrawerLayout(){
        mDrawerLayout = findViewById(R.id.mDrawerLayout);
        ActionBarDrawerToggle mActionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                mDrawerLayout,
                mToolbar,
                R.string.drawer_open,
                R.string.drawer_close
        );

        mActionBarDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);
    }

    final void init_NavigationView(){
        mNavigationView = findViewById(R.id.mNavigationView);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(!item.isChecked()){

                    switch (item.getItemId()){

                        case R.id.nav_item1:
                            break;

                        case R.id.nav_item2:
                            break;

                        case R.id.nav_item3:
                            break;
                    }

                    item.setChecked(true);
                }

                mDrawerLayout.closeDrawers();
                return true;
            }
        });

        mNavigationView.getMenu().getItem(0).setChecked(true);
    }



}
