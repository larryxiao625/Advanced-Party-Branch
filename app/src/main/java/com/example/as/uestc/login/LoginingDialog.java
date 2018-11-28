package com.example.as.uestc.login;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.as.uestc.R;

public class LoginingDialog extends DialogFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_logining_dialog,container,false);
        return view;
    }

    @Override
    public void onStart() {
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        getDialog().getWindow().setLayout((int)(dm.widthPixels * 0.3), (int)(dm.heightPixels * 0.2));
        getDialog().getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.shape_dialog_background,null));
        super.onStart();
    }
}
