package mobile.contents.contest.Adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import mobile.contents.contest.Keypads.Bin_Pad;
import mobile.contents.contest.Keypads.Dec_Pad;
import mobile.contents.contest.Keypads.Hex_Pad;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return Bin_Pad.newInstance();
            case 1:
                return Dec_Pad.newInstance();
            case 2:
                return Hex_Pad.newInstance();
            //case 3:
                //return Tab4Layout.newInstance();
        }
        Log.d("완료", "geatItem()");
        return new Fragment();
    }

    @Override
    public int getCount() {
        Log.d("완료", "getCount()");
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0 :
                return "길이 계산";
            case 1 :
                return "무게 계산";
            case 2 :
                return "데이터양 계산";
            case 3 :
                return "PPI 계산(Beta)";
        }return "error";
    }

}