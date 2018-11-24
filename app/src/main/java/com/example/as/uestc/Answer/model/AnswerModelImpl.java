package com.example.as.uestc.Answer.model;

import com.example.as.uestc.Answer.beans.ClassList;
import com.example.as.uestc.Answer.beans.CurrentClass;
import com.example.as.uestc.Answer.beans.ScorePost;
import com.example.as.uestc.Answer.beans.ScoreRes;
import com.example.as.uestc.Answer.networks.RetrofitManager;

import io.reactivex.Observable;

/**
 * Created by as on 2017/11/5.
 */

public class AnswerModelImpl extends AnswerModel {

    private RetrofitManager manager;     //进行网络请求的Manager对象
    private ClassList current;    //当前的班级列表

    public AnswerModelImpl() {
        this.manager=RetrofitManager.getInstance();
    }

    public Observable<ClassList> getCurrentClass(String token) {
        return this.manager.getCurrentClass(token);
    }

    public Observable<CurrentClass> getCurrent(String classID) {
        return this.manager.getCurrent(classID);
    }

    public Observable<ScoreRes> getPostRes(ScorePost scorePost) {
        return this.manager.getPostRes(scorePost);
    }

}
