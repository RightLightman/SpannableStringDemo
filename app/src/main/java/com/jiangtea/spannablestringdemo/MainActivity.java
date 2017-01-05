package com.jiangtea.spannablestringdemo;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv1 = (TextView) findViewById(R.id.tv1);
        //initColor();
//        initBgColor();
//        initSize();
//        initStyle();
//        initDelete();
//        initUnderLine();
        initImage();
    }

    /**
     * 設置顏色
     */
    private void initColor() {
        String string = "今天晚上下雨啦！";
        SpannableString spanColor = new SpannableString(string);
//        spanColor.setSpan(new ForegroundColorSpan(Color.parseColor("#ff3c2a")), string.indexOf("晚上"), string.indexOf("下"), 0);
        spanColor.setSpan(new ForegroundColorSpan(Color.parseColor("#ff3c2a")), 2, 4, 0);
        mTv1.setText(spanColor);
    }

    /**
     * 設置背景顏色
     */
    private void initBgColor() {
        String string = "今天晚上下雨啦！";
        SpannableString spanColor = new SpannableString(string);
        spanColor.setSpan(new BackgroundColorSpan(Color.parseColor("#ff3c2a")), string.indexOf("晚"), string.indexOf("下"), 0);
        mTv1.setText(spanColor);
    }

    /**
     * 設置字體大小
     */
    private void initSize() {
        String string = "今天晚上下雨啦！";
        SpannableString spanColor = new SpannableString(string);
        spanColor.setSpan(new AbsoluteSizeSpan(25), string.indexOf("晚"), string.indexOf("下"), 0);
        mTv1.setText(spanColor);
    }

    /**
     * 設置粗斜體
     */
    private void initStyle() {
        String string = "今天晚上下雨啦！";
        SpannableString spanColor = new SpannableString(string);
        spanColor.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), string.indexOf("晚"), string.indexOf("下"), 0);
        mTv1.setText(spanColor);
    }

    /**
     * 設置刪除線
     */
    private void initDelete() {
        String string = "今天晚上下雨啦！";
        SpannableString spanColor = new SpannableString(string);
        spanColor.setSpan(new StrikethroughSpan(), string.indexOf("晚"), string.indexOf("下"), 0);
        mTv1.setText(spanColor);
    }

    /**
     * 設置下劃線
     */
    private void initUnderLine() {
        String string = "今天晚上下雨啦！";
        SpannableString spanColor = new SpannableString(string);
        spanColor.setSpan(new UnderlineSpan(), string.indexOf("晚"), string.indexOf("下"), 0);
        mTv1.setText(spanColor);
    }

    /**
     * 設置下劃線
     */
    private void initImage() {
        String string = "今天晚上下雨啦！";
        SpannableString spanColor = new SpannableString(string);
        Drawable d = getResources().getDrawable(R.mipmap.ic_launcher);
        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
        ImageSpan span = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);
        spanColor.setSpan(span, string.indexOf("晚"), string.indexOf("下"), 0);
        mTv1.setText(spanColor);
    }

}
