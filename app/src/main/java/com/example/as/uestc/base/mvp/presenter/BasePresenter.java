package com.example.as.uestc.base.mvp.presenter;

import com.example.as.uestc.base.mvp.model.BaseModel;
import com.example.as.uestc.base.mvp.view.BaseView;

/**
 * Created by as on 2017/11/5.
 * MVP中Presenter的抽象类
 * 之所以有抽象类这个阶段，是因为增加抽象类这一层可以尽可能实现一些通用的方法，减少实现类
 * 的重复代码
 */

public interface BasePresenter extends MVPPresenter {

    /**
     * 该方法是将Model和View绑定到Presenter中
     * @param answerView View层对象
     * @param answerModel Model层对象
     */
    void attach(BaseView answerView, BaseModel answerModel);
    //List getInitDataFromModel();
    //void pushScores();
    //List getClassDetails();

    /**
     * 该方法是View层对象的getter方法
     * @return View层对象
     */
    BaseView getView();

    /**
     * 该方法是Model层对象的getter方法
     * @return Model层对象
     */
    BaseModel getModel();
}
