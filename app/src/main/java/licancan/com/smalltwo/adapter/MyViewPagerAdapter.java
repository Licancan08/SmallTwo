package licancan.com.smalltwo.adapter;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import licancan.com.smalltwo.R;

/**
 * Created by robot on 2017/11/17.
 */

public class MyViewPagerAdapter extends PagerAdapter {

    Context context;

    public MyViewPagerAdapter(Context context) {
        this.context = context;
    }

    int[] imgs={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.shanping};


    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    /**
     * 加载视图
     * @param container
     * @param position
     * @return
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view=View.inflate(context,R.layout.loadviewpager_item,null);
        ImageView load_img=view.findViewById(R.id.load_img);
        ImageView load_img_gif=view.findViewById(R.id.load_img_gif);
        if(position==3)
        {
            Glide.with(context).load(R.drawable.shanping).into(new GlideDrawableImageViewTarget(load_img_gif,1));
        }
        else{
            load_img.setImageResource(imgs[position]);

        }
        container.addView(view);
        return view;
    }

}
