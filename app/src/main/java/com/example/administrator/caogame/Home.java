package com.example.administrator.caogame;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.example.administrator.view.GameView;

public class Home extends ActionBarActivity {

    private GameView mGameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout  rl_home_center = (RelativeLayout) findViewById(R.id.rl_home_center);

        mGameView = new GameView(this);

        rl_home_center.addView(mGameView);
    }
}
