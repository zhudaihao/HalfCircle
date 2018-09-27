package cn.zdh.halfcircle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class MainActivity extends AppCompatActivity {

    OvalImageView ovalImageView;
    ImageView iv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ovalImageView=(OvalImageView)findViewById(R.id.ov);
        iv= (ImageView) findViewById(R.id.iv);
        //方法一使用自定义OvalImageView

        //方法二使用 RoundedCornersTransformation
        Glide.with(this).load(R.mipmap.cs).bitmapTransform(new RoundedCornersTransformation(this,10,0,RoundedCornersTransformation.CornerType.TOP)).into(iv);

    }
}
