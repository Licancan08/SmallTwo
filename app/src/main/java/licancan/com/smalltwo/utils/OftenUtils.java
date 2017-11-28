package licancan.com.smalltwo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by robot on 2017/11/21.
 */

public class OftenUtils extends Activity{
    //跳转
    public void intent(Context context, Class classs)
    {
        Intent intent=new Intent(context,classs);
        OftenUtils.this.startActivity(intent);
    }


}
