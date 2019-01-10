package me.yifeiyuan.helloweex;

import android.app.Application;
import android.util.Log;
import android.widget.ImageView;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;

/**
 * Created by 程序亦非猿 on 2019/1/10.
 */
public class App extends Application {

    private static final String TAG = "App";

    @Override
    public void onCreate() {
        super.onCreate();

        InitConfig initConfig = new InitConfig.Builder().setImgAdapter(new IWXImgLoaderAdapter() {
            @Override
            public void setImage(final String url, final ImageView view, final WXImageQuality quality, final WXImageStrategy strategy) {
                Log.d(TAG, "setImage() called with: url = [" + url + "], view = [" + view + "], quality = [" + quality + "], strategy = [" + strategy + "]");
            }
        }).build();

        WXSDKEngine.initialize(this, initConfig);
    }

}
