package com.harvey.recyclerviewdemo;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

import java.util.Random;

/**
 * <pre>
 *     author : Harvey
 *     time   : 2018/08/13
 *     desc   :
 * </pre>
 */
public class Item {
    public Drawable color;
    public String des;

    public Item(String des) {
        this.des = des;
        color = getBgColor();
    }

    private Drawable getBgColor() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(4);
        drawable.setColor(Color.rgb(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
        return drawable;
    }
}
