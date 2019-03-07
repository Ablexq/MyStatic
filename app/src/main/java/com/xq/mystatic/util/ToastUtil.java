package com.xq.mystatic.util;

import android.view.Gravity;
import android.widget.Toast;

import com.xq.mystatic.MyApplication;

/**
 * 防止多次点击，Toast重复显示,
 */

public class ToastUtil {

    private static Toast toast;

    public static void showToast(String content) {
        if (toast == null) {
            toast = Toast.makeText(MyApplication.getMyApplication(), content, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            toast.setText(content);
        }

        toast.show();
    }
}
