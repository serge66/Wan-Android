package com.github.serge66.wanandroid.api;

import com.github.serge66.wanandroid.bean.LoginResultBean;
import com.github.serge66.wanandroid.utils.URLConstant;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    //登录
    @FormUrlEncoded
    @POST(URLConstant.URL_LOGIN)
    Observable<LoginResultBean> login(@Field("username") String username,
                                      @Field("password") String password);
}
