package com.example.xx.htmlproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import app.MyActivityStackManager;

/**
 * 关于内容界面
 */
public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);

        /**把当前activity加入管理队列中*/
        MyActivityStackManager myActivityStackManager=MyActivityStackManager.getInstance();
        myActivityStackManager.addActivity(AboutActivity.this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.id_about_toolbar);
        if (toolbar != null) {
            toolbar.setTitle("关于");
            toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
            setSupportActionBar(toolbar);
            toolbar.setNavigationIcon(R.drawable.back);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }

    }
}
