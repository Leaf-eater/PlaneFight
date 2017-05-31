package com.yuhang.planefight.Game;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by 宇航 on 2017/5/31.
 *  游戏的视图位置
 *  1.画出飞机
 */

public class GameView extends SurfaceView implements SurfaceHolder.Callback{
    private SurfaceHolder mHolder;
    private DrawThread drawThread;

    public GameView(Context context) {
        super(context);
        mHolder = this.getHolder();
        mHolder.addCallback(this);
        drawThread = new DrawThread(mHolder);
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        drawThread.isRun = true;
        drawThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        drawThread.isRun = false;
    }

    class DrawThread extends Thread {
        private SurfaceHolder holder;
        public boolean isRun;
        DrawThread(SurfaceHolder holder) {
            this.holder = holder;
            isRun = true;
        }

        @Override
        public void run() {

        }
    }
}
