package com.example.as.uestc.login;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * 用来限定账户输入框只能输入英文字符或者数字
 */
public class LoginTextWatcher implements TextWatcher {


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        int length = editable.length();
        if (length == 0)
            return;
        if ((editable.charAt(length - 1)) == ('\r') || (editable.charAt(length - 1)) == ('\n')) {
            editable.delete(length-1,length);
        }
    }
}
