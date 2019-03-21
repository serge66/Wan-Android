package com.github.serge66.wanandroid.utils;

/**
 * @Description: 全局常量
 * @Author: lishengjiejob@163.com
 * @Time: 2018/8/23 15:14
 */
public class Constants {
    public static final String SP_IS_FIRST = "SP_IS_FIRST";
    public static final String SP_TOKEN = "SP_TOKEN";
    public static final String SP_USER_NAME = "SP_USER_NAME";
    public static final String SP_NICK_NAME = "SP_NICK_NAME";
    public static final String SP_ACCOUNTE = "SP_ACCOUNTE";
    public static final String SP_PWD = "SP_PWD";
    public static final String SP_PHONE = "SP_PHONE";
    public static final String SP_HEADER_URL = "SP_HEADER_URL";//头像
    public static final String SP_USERID = "SP_USERID";

    //    public static final String BASR_URL = BuildConfig.ENVIRONMENT_URL;
    //进出大门所用的baseurl
    //老项目真坑,新的baseurl写好了,发现,这个ip和那个域名是的对应的,日.........
    public static final String BASR_URL_IN_OUT_DOOR = "http://123.13.226.85:9001/";

    public static final String CODE_E600 = "E600";//会员未登陆
    public static final String CODE_E200 = "E200";//您没有该权限
    public static final String CODE_E500 = "E500";//系统异常
    public static final String CODE_E300 = "E300";//登录名或密码错误

    /**
     * 0x003-发送中  0x004-发送失败  0x005-发送成功
     **/
    public static final int CHAT_ITEM_SENDING = 0x003;
    public static final int CHAT_ITEM_SEND_ERROR = 0x004;
    public static final int CHAT_ITEM_SEND_SUCCESS = 0x005;

}
