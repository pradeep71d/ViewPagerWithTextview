package com.example.viewpage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter extends PagerAdapter {
    Context context;
    String s1[] = {"Monet", "Concentrix", "Honda", "MAruti"};

    public Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return s1.length;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;//here returning of object of base class.
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        TextView textView=new TextView(context);
        textView.setText(s1[position]);
        container.addView(textView);
        return textView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((TextView)object);
    }
}
