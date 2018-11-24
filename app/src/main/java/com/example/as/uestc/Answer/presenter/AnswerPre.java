package com.example.as.uestc.Answer.presenter;

import android.app.Activity;

import com.example.as.uestc.base.mvp.model.BaseModel;
import com.example.as.uestc.base.mvp.presenter.BasePresenter;
import com.example.as.uestc.base.mvp.view.BaseView;

/**
 * Created by as on 2017/11/5.
 * 之所以有抽象类这个阶段，是因为增加抽象类这一层可以尽可能实现一些通用的方法，减少实现类
 * 的重复代码
 */

abstract class AnswerPre implements BasePresenter {

    protected BaseView mAnswerView;
    protected BaseModel mAnswerModel;

    protected Activity activity;
    @Override
    public void attach(BaseView baseView, BaseModel baseModel) {
        this.mAnswerModel=baseModel;
        this.mAnswerView=baseView;
        baseView.getListener().attachPresenter(this);
    }

    @Override
    public BaseModel getModel() {
        return mAnswerModel;
    }

    @Override
    public BaseView getView() {
        return mAnswerView;
    }
}
