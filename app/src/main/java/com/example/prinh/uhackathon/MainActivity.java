package com.example.prinh.uhackathon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends FragmentActivity{
    private String[] level ={"1 of 6 ","2 of 6","3 of 6"," 4 of 6","5 of 6","6 of 6"};
    private ViewPager viewPager;
    private TextView  leveltrack;
    private Button next;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.pager);
        next = (Button)findViewById(R.id.next);
        leveltrack = (TextView)findViewById(R.id.step);
       viewPager.setAdapter(new SimplePagerAdapter(getSupportFragmentManager()));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = getItem(+1);
                leveltrack.setText(level[current]);
                if (current<6){

                    viewPager.setCurrentItem(current);
                }else{
                    //launch home Activity
                }
            }
        });
    }



    public int getItem(int i){
        return viewPager.getCurrentItem()+i;
    }
        ViewPager.OnPageChangeListener viewPageListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                leveltrack.setText(level[position]);

            }
            @Override
            public void onPageScrollStateChanged(int state) {
                leveltrack.setText(level[state]);
            }
        };

    public class SimplePagerAdapter extends FragmentPagerAdapter {


        public SimplePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            switch (position) {
                case 0:
             return new question_model();
                    

                case 1:
                    return new question_model();
                case 2:
                    return new Part_languages();
                case 3:
                    return new Tools();
                case 4:
                    return new Classes();
                case 5:
                    return new Profile();
                default:
                    return null;

            }

        }


        @Override
        public int getCount() {
            return 5;
        }
    }
    }



