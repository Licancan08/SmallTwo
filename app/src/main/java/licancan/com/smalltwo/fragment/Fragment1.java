package licancan.com.smalltwo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import licancan.com.smalltwo.R;


/**
 * Created by robot on 2017/11/20.
 */

public class Fragment1 extends Fragment {
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment1,container,false);
        return view;
    }
}
