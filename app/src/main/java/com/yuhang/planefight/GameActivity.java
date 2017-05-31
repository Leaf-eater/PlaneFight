package com.yuhang.planefight;

import android.app.Activity;
import android.os.Bundle;

import com.yuhang.planefight.Game.GameView;

/**
 * Created by 宇航 on 2017/5/31.
 * 游戏界面
 */

public class GameActivity extends Activity{
    private GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
        setContentView(gameView);
    }

}
