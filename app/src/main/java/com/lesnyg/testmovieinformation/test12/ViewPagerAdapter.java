package com.lesnyg.testmovieinformation.test12;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lesnyg.testmovieinformation.R;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment>  mList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        mList.add(MovieInfoFragment.newInstance(R.drawable.avengers,"어벤져스"));
        mList.add(MovieInfoFragment.newInstance(R.drawable.babydriver,"베이비 드라이버"));
        mList.add(MovieInfoFragment.newInstance(R.drawable.himalayas,"히말라야"));
        mList.add(MovieInfoFragment.newInstance(R.drawable.monster,"괴물"));
        mList.add(MovieInfoFragment.newInstance(R.drawable.raraland,"라라랜드"));

    }

    @Override
    public Fragment getItem(int i) {

        return mList.get(i);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
