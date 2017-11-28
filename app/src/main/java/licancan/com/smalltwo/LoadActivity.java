package licancan.com.smalltwo;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import licancan.com.smalltwo.adapter.MyViewPagerAdapter;

public class LoadActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {

    private ViewPager load_viewPager;
    int[] imgs={R.drawable.a,R.drawable.b,R.drawable.c,};
    private MyViewPagerAdapter pagerAdapter;
    private ImageView login_into;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        initView();
        initData();
    }


    private void initView() {
        login_into = findViewById(R.id.login_into);
        load_viewPager = findViewById(R.id.load_viewPager);
        load_viewPager.setOnPageChangeListener(this);
        login_into.setOnClickListener(this);
    }
    private void initData() {
        pagerAdapter = new MyViewPagerAdapter(this);
        load_viewPager.setAdapter(pagerAdapter);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(position==3)
        {
            login_into.setVisibility(View.VISIBLE);
        }else{
            login_into.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     * 进入按钮的点击事件
     * @param view
     */
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
