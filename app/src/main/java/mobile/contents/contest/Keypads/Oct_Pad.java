package mobile.contents.contest.Keypads;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import mobile.contents.contest.R;

public class Oct_Pad extends Fragment {

    public static Oct_Pad newInstance() {
        return new Oct_Pad();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View Rview = inflater.inflate(R.layout.numpad_peftest, container, false);
        return Rview;
    }
}
