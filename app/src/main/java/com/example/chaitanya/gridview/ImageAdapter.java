package com.example.chaitanya.gridview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int [] mImages=new int[]{R.color.one,R.color.two,R.color.three,R.color.four};
    ImageAdapter (Context context)
    {
        mContext=context;
    }
    @Override
    public int getCount() {
        return mImages.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
    //press control and O

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImages[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
