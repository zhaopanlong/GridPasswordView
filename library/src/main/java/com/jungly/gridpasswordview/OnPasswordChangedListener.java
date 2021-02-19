package com.jungly.gridpasswordview;

public interface OnPasswordChangedListener {

    /**
     * @param position current position
     * @return if deal With Default IME return false;
     */
    boolean beforeInput(int position);
    /**
     * Invoked when the password changed.
     * @param psw new text
     */
    void onTextChanged(String psw);

    /**
     * Invoked when the password is at the maximum length.
     * @param psw complete text
     */
    void onInputFinish(String psw);
}
