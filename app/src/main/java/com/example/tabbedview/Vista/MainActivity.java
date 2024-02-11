package com.example.tabbedview.Vista;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.tabbedview.Fragments.FragmentGenero;
import com.example.tabbedview.Fragments.FragmentPeliculas;
import com.example.tabbedview.Fragments.FragmentSeries;
import com.example.tabbedview.Fragments.FragmentVideojuegos;
import com.example.tabbedview.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.paginador);
        FragmentStateAdapter pagerAdapter = new ScreenSlidePagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = findViewById(R.id.pestanias);
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0: { tab.setText("Peliculas");
                            tab.setIcon(ContextCompat.getDrawable(this, R.drawable.movies2));

                        }
                        break;
                        case 1: tab.setText("Series");
                        tab.setIcon(ContextCompat.getDrawable(this,R.drawable.series));

                        break;
                        case 2: tab.setText("Juegos");
                            tab.setIcon(ContextCompat.getDrawable(this,R.drawable.videogames));
                        break;


                    }
                }).attach();
    }

    private static class ScreenSlidePagerAdapter extends FragmentStateAdapter {

        public ScreenSlidePagerAdapter(FragmentActivity fa) {
            super(fa);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            Fragment fragment;
            switch (position) {
                case 0:
                    fragment = new FragmentGenero();
                    break;
                case 1:
                    fragment = new FragmentSeries();
                    break;
                case 2:
                    fragment = new FragmentVideojuegos();
                    break;

                default: fragment = null;

            }
            return fragment;
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
}