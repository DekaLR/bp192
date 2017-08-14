package mobile.contents.contest.Keypads;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mobile.contents.contest.R;

public class Dec_Pad extends Fragment implements View.OnClickListener {

    public static Dec_Pad newInstance() {
        return new Dec_Pad();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View Rview = inflater.inflate(R.layout.numpad_dec, container, false);

        Button dec1 = (Button)Rview.findViewById(R.id.dec_1);
        Button dec2 = (Button)Rview.findViewById(R.id.dec_2);
        Button dec3 = (Button)Rview.findViewById(R.id.dec_3);
        Button dec4 = (Button)Rview.findViewById(R.id.dec_4);
        Button dec5 = (Button)Rview.findViewById(R.id.dec_5);
        Button dec6 = (Button)Rview.findViewById(R.id.dec_6);
        Button dec7 = (Button)Rview.findViewById(R.id.dec_7);
        Button dec8 = (Button)Rview.findViewById(R.id.dec_8);
        Button dec9 = (Button)Rview.findViewById(R.id.dec_9);
        Button dec0 = (Button)Rview.findViewById(R.id.dec_0);

        dec1.setOnClickListener(this);
        dec2.setOnClickListener(this);
        dec3.setOnClickListener(this);
        dec4.setOnClickListener(this);
        dec5.setOnClickListener(this);
        dec6.setOnClickListener(this);
        dec7.setOnClickListener(this);
        dec8.setOnClickListener(this);
        dec9.setOnClickListener(this);
        dec0.setOnClickListener(this);

        return Rview;
    }

    @Override
    public void onClick(View view) {

    }
}