package com.example.as.uestc.Answer.fragments;

import android.animation.Animator;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.as.uestc.R;

/**
 * 用来展示班级历史足迹的Dialog
 * 界面就只是一个ImageView 和 一个 Button
 */
public class ClassHistoryDialog extends DialogFragment {
    private ImageView history;
    private Button cancle;
    private ClassHistoryDialog dialog;

    @Override
    public void onStart() {
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        getDialog().getWindow().setLayout((int)(dm.widthPixels * 1.0), (int)(dm.heightPixels * 1.0));
        super.onStart();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dialog = this;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.answer_dialog_classhistory,container,false);
        history = (ImageView)view.findViewById(R.id.answer_dialog_classhistory_image);
        cancle = (Button)view.findViewById(R.id.answer_dialog_classhistory_cancle);

        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction=getActivity().getFragmentManager().beginTransaction();
                transaction.remove(dialog);
                transaction.commit();
            }
        });
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
