package com.github.contextdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/10/15.
 */

public class ToolsUtils {
    /**
     * 带参数的context
     */
    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
    /**全局的context*/
    public static void showToast(String msg){
        Toast.makeText(MyApplication.getContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
