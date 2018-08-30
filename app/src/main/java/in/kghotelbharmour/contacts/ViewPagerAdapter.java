package in.kghotelbharmour.contacts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> lstFragment = new ArrayList<>();
    private final List<String> lstTitles = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public void startUpdate(ViewGroup container) {

    }

    @Override
    public CharSequence getPageTitle(int position) {
      return lstTitles.get(position);
    }

    @Override
    public int getCount() {
       return lstTitles.size();

    }



    public void AddFragment(Fragment fragment,String title) {
        lstFragment.add(fragment);
        lstTitles.add(title);
    }









    }
