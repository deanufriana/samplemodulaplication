package com.intala.intalalatihan.myactivity;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.intala.intalalatihan.R;
import com.intala.intalalatihan.fragment.BiruFragment;
import com.intala.intalalatihan.fragment.KuningFragment;

public class ViewpagerActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        tab = findViewById(R.id.tabutama);
        view = findViewById(R.id.viewpage);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        view.setAdapter(adapter);

        tab.setupWithViewPager(view);

    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter {

        String[] tabTitle = {"Kuning", "Biru"};

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new KuningFragment();
                case 1:
                    return new BiruFragment();
                default:
                    return new KuningFragment();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitle[position];
        }
    }
}