package licancan.com.smalltwo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import licancan.com.smalltwo.fragment.Fragment1;
import licancan.com.smalltwo.fragment.Fragment2;
import licancan.com.smalltwo.fragment.MainFragment;

/**
 * Created by robot on 2017/11/20.
 */

public class MainViewPagerAdapter extends FragmentPagerAdapter{

    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment=new Fragment1();
                break;
            case 1:
                fragment=new Fragment2();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
