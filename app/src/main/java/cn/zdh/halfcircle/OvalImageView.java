package cn.zdh.halfcircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

/**
 * 用来显示不规则图片，
 * 上面两个是圆角，下面两个是直角
 */
public class OvalImageView extends android.support.v7.widget.AppCompatImageView {
    public OvalImageView(Context context) {
        super(context);
        init();
    }

    public OvalImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private Path path;
    private void init() {
        path = new Path();
    }

    /*圆角的半径，依次为左上角xy半径，右上角，右下角，左下角*/
    private float[] rids = {10.0f, 10.0f, 10.0f, 10.0f, 0.0f, 0.0f, 0.0f, 0.0f,};


    @Override
    protected void onDraw(Canvas canvas) {
        int w = this.getWidth();
        int h = this.getHeight();
         /*向路径中添加圆角矩形。radii数组定义圆角矩形的四个圆角的x,y半径。radii长度必须为8*/
        path.addRoundRect(new RectF(0, 0, w, h), rids,Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);


    }
}
