package com.example.as.uestc.base.mvp.view;

import com.example.as.uestc.Answer.beans.ClassList;
import com.example.as.uestc.Answer.beans.CurrentClass;
import com.example.as.uestc.base.mvp.EventListener;

/**
 * Created by as on 2017/11/5.
 * 之所以有抽象类这个阶段，是因为增加抽象类这一层可以尽可能实现一些通用的方法，减少实现类
 * 的重复代码
 */

public interface BaseView extends MVPView {

    EventListener getListener();
    void setEventListener(EventListener eventListener);

    /**
     * 该方法通过所有的数据初始化界面
     * @param classList 班级数据
     */
    void initView(ClassList classList);

    /**
     * 该方法通过当前班级信息初始化Fragment
     * @param currentClass 当前班级的信息
     * @param position 当前班级在ClassList中的位置
     * @param state 表示是否提交的状态
     */
    void initFragment(CurrentClass currentClass,int position,int state);
}
