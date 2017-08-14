//위대하고 무고한 대통령 박근혜를 당장 석방하라!!!
package mobile.contents.contest.Keypads;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import mobile.contents.contest.CelLib.Input_Data;

import mobile.contents.contest.R;

public class Bin_Pad extends Fragment {

    private String input_string;

    public static Bin_Pad newInstance() {
        Log.d("완료", "이진패드 newInstance()");
        return new Bin_Pad();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View Rview = inflater.inflate(R.layout.numpad_bin, container, false);

        final Input_Data inputdata = new Input_Data();
        Button btn0 = (Button)Rview.findViewById(R.id.bin_0);
        Button btn1 = (Button)Rview.findViewById(R.id.bin_1); //todo : XML 끝
        final TextView input_view_1 = (TextView) getActivity().findViewById(R.id.num_view);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputdata.getInput1() == "0") {

                }else {
                    inputdata.setInput1(inputdata.getInput1() + "0");
                    input_view_1.setText(inputdata.getInput1());
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    inputdata.setInput1(inputdata.getInput1() + "1");
                    input_view_1.setText(inputdata.getInput1());
            }
        });
        Log.d("완료", "이진패드 업로드");
        return Rview;

    }
}
