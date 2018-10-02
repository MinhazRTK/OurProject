package com.batch2.m0nk3y.ourproject;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentTransaction ft = getFragmentManager().beginTransaction();
            Fragment frag = null;
            switch (item.getItemId()) {
                case R.id.navigation_google:
                    frag = new GoogleFragment();
                    ft.replace(R.id.frame,frag);
                    ft.commit();

                    return true;
                case R.id.navigation_bookmarks:
                    frag = new BookmarkFragment();
                    ft.replace(R.id.frame,frag);
                    ft.commit();
                    return true;
                case R.id.navigation_browser:
                    frag = new AboutFragment();
                    ft.replace(R.id.frame,frag);
                    ft.commit();
                    return true;
            }
            ft.commit();
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
