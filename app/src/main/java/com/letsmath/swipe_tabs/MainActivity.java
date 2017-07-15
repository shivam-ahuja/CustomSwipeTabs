package com.letsmath.swipe_tabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager=(ViewPager)findViewById(R.id.myviewpager);
        MyAdapter myAdapter=new MyAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(myAdapter);

        mTabLayout=(TabLayout)findViewById(R.id.tablayout);
        mTabLayout.setupWithViewPager(mViewPager);

        View view=getLayoutInflater().from(this).inflate(R.layout.tablayout_item,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageview);
        imageView.setImageResource(R.mipmap.movies);
        TextView textView=(TextView)view.findViewById(R.id.textview);
        textView.setText("movies");
        mTabLayout.getTabAt(0).setCustomView(view);

        View view1=getLayoutInflater().from(this).inflate(R.layout.tablayout_item,null);
        ImageView imageView1=(ImageView)view1.findViewById(R.id.imageview);
        imageView1.setImageResource(R.mipmap.games);
        TextView textView1=(TextView)view1.findViewById(R.id.textview);
        textView1.setText("games");
        mTabLayout.getTabAt(1).setCustomView(view1);

        View view2=getLayoutInflater().from(this).inflate(R.layout.tablayout_item,null);
        ImageView imageView2=(ImageView)view2.findViewById(R.id.imageview);
        imageView2.setImageResource(R.mipmap.books);
        TextView textView2=(TextView)view2.findViewById(R.id.textview);
        textView2.setText("books");
        mTabLayout.getTabAt(2).setCustomView(view2);
    }

}
