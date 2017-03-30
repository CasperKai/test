package com.casper.test;

/**
 * Created by Casper on 2016/7/15.
 */
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class ZoomListenter implements OnTouchListener {

    private int mode = 0;
    float oldDist = 0;
    float textSize = 0;
    TextView textView = null;
    private float x, y;    // 原本圖片存在的X,Y軸位置
    private float mx, my; // 圖片被拖曳的X ,Y軸距離長度
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        textView = (TextView) v;
        if (textSize == 0) {
            textSize = textView.getTextSize()/2;
        }
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                x = event.getX();                  //觸控的X軸位置
                y = event.getY();                  //觸控的Y軸位置
                mode = 1;
                break;
            case MotionEvent.ACTION_UP:
                mode = 0;
                break;
            case MotionEvent.ACTION_POINTER_UP:
                mode = 0;
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                oldDist = spacing(event);
                mode += 1;
                break;
            case MotionEvent.ACTION_CANCEL:
                v.getParent().requestDisallowInterceptTouchEvent(false);
                break;
            case MotionEvent.ACTION_MOVE:
                /*if(mode==1){
                    mx=x-event.getX();
                    my=y-event.getY();
                    if(mx>2){
                        v.layout((int)v.getX()-(int)mx,(int)v.getY(),(int)v.getX()-(int)mx+v.getWidth(),(int)v.getY()+v.getHeight());
                    }
                    if(mx<-2){
                        v.layout((int)v.getX()+Math.abs((int)mx),(int)v.getY(),(int)v.getX()+Math.abs((int)mx)+v.getWidth(),(int)v.getY()+v.getHeight());
                    }
                    if(my>2){
                        v.layout((int)v.getX(),(int)v.getY()-(int)my,(int)v.getX()+v.getWidth(),(int)v.getY()-(int)my+v.getHeight());
                    }
                    if(my<-2){
                        v.layout((int)v.getX(),(int)v.getY()+Math.abs((int)my),(int)v.getX()+v.getWidth(),(int)v.getY()+Math.abs((int)my)+v.getHeight());
                    }
                }*/
                //mx = (int) (event.getRawX()-x);
                //my = (int) (event.getRawY()-y);
                //v.layout(mx, my, mx + v.getWidth(), my + v.getHeight());
                //textView.setText(""+my);

                if (mode >= 2) {
                    v.getParent().requestDisallowInterceptTouchEvent(true);
                    float newDist = spacing(event);
                    if (newDist > oldDist + 1) {
                        zoom(newDist / oldDist);
                        oldDist = newDist;
                    }
                    if (newDist < oldDist + 1) {
                        zoom(newDist / oldDist);
                        oldDist = newDist;
                    }
                }
                break;
        } return true;
    }

    public void zoom(float f) {
        textView.setTextSize(textSize *= f);
    }
    private float spacing(MotionEvent event) {
        float x = event.getX(0) - event.getX(1);
        float y = event.getY(0) - event.getY(1);
        return (float)Math.sqrt(x * x + y * y);
    }
}