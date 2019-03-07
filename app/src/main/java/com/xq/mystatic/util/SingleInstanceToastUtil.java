package com.xq.mystatic.util;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class SingleInstanceToastUtil {

    private static SingleInstanceToastUtil instance;

    private SingleInstanceToastUtil() {
    }

    public static SingleInstanceToastUtil getInstance() {
        if (instance == null) {
            synchronized (SingleInstanceToastUtil.class) {
                if (instance == null) {
                    instance = new SingleInstanceToastUtil();
                }
            }
        }

        return instance;
    }

    private static Toast toast;

    public void showToast(Context context, String content) {
        if (toast == null) {
            toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            toast.setText(content);
        }

        toast.show();
    }
}