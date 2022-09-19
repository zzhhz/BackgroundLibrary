package com.noober.androidx;

import android.app.ListActivity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.noober.background.drawable.DrawableCreator;
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity;

import androidx.annotation.Nullable;

public class Main2Activity extends RxAppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main_2);
    }


    public int dip2px(float dipValue) {
        float scale = getResources().getDisplayMetrics().density;
        return (int)(dipValue * scale + 0.5F);
    }

}
