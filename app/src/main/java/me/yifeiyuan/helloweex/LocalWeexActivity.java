package me.yifeiyuan.helloweex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.utils.WXFileUtils;

/**
 * 加载 local 的 jsbundle
 */
public class LocalWeexActivity extends AppCompatActivity implements IWXRenderListener {

    private static final String TAG = "WeexActivity";

    WXSDKInstance mWXSDKInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weex);

        mWXSDKInstance = new WXSDKInstance(this);
        mWXSDKInstance.registerRenderListener(this);
        /**
         * WXSample 可以替换成自定义的字符串，针对埋点有效。
         * template 是.we transform 后的 js文件。
         * option 可以为空，或者通过option传入 js需要的参数。例如bundle js的地址等。
         * jsonInitData 可以为空。
         * width 为-1 默认全屏，可以自己定制。
         * height =-1 默认全屏，可以自己定制。
         */

        mWXSDKInstance.render("Local jsbundle", WXFileUtils.loadAsset("local-bundle-test.js",this),null, null, WXRenderStrategy.APPEND_ASYNC);
    }

    @Override
    public void onViewCreated(final WXSDKInstance instance, final View view) {
        Log.d(TAG, "onViewCreated() called with: instance = [" + instance + "], view = [" + view + "]");
        setContentView(view);
    }

    @Override
    public void onRenderSuccess(final WXSDKInstance instance, final int width, final int height) {
        Log.d(TAG, "onRenderSuccess() called with: instance = [" + instance + "], width = [" + width + "], height = [" + height + "]");
    }

    @Override
    public void onRefreshSuccess(final WXSDKInstance instance, final int width, final int height) {
        Log.d(TAG, "onRefreshSuccess() called with: instance = [" + instance + "], width = [" + width + "], height = [" + height + "]");
    }

    @Override
    public void onException(final WXSDKInstance instance, final String errCode, final String msg) {
        Log.d(TAG, "onException() called with: instance = [" + instance + "], errCode = [" + errCode + "], msg = [" + msg + "]");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mWXSDKInstance != null) {
            mWXSDKInstance.onActivityResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mWXSDKInstance != null) {
            mWXSDKInstance.onActivityPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mWXSDKInstance != null) {
            mWXSDKInstance.onActivityStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mWXSDKInstance != null) {
            mWXSDKInstance.onActivityDestroy();
        }
    }
}
