package com.boss.unitsmaster;
import android.os.Bundle;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 调用模板里的方法，自动加载底部广告
        loadBanner(R.id.adView);
    }
}
