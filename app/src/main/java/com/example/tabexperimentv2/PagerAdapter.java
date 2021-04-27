package com.example.tabexperimentv2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }//fin del constructor

    /**
     *  regresa el fragment asociado con una posición especifica
     * @param position
     * @return position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new TabFragment1();
            case 1: return new TabFragment2();
            case 2: return new TabFragment3();
            default: return null;
        }
    }//fin del método Fragment

    /**
     *
     * @return número de views que hay disponibles
     */
    @Override
    public int getCount() {
        return mNumOfTabs;
    }//fin del método getCount

}//fin de la clase PAgerAdapter
