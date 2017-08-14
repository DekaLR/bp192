package mobile.contents.contest.FragmentActivitys;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.lang.*;

import mobile.contents.contest.Adapter.ViewPagerAdapter;
import mobile.contents.contest.CelLib.Input_Data;
import mobile.contents.contest.R;


public class MainCelActivity extends Fragment{

    //public static MainCelActivity newInstance() {return new MainCelActivity(); }
    private FragmentActivity mCtx;

    public MainCelActivity() {}

    @Override
    public void onAttach(Activity activity) {
        mCtx=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View Rview = inflater.inflate(R.layout.maincelactivity, container, false);

        final ViewPager viewPager = (ViewPager) Rview.findViewById(R.id.viewpager_maincel);
        ViewPagerAdapter adapter = new ViewPagerAdapter(mCtx.getSupportFragmentManager());
        viewPager.setOffscreenPageLimit(3);
        Log.d("완료", "뷰페이저  로딩");
        /*viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });*/
        viewPager.setAdapter(adapter);
        Log.d("완료", "뷰페이저 어댑터 셋팅");




        //test_code
        /*  Input_Data input = new Input_Data();
        final TextView result = (TextView) Rview.findViewById(R.id.text_result);
        Button btn_equal = (Button) Rview.findViewById(R.id.btn_equal);
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("dd "+input.input1);
            }
        }); */

        return Rview;
    }
}


