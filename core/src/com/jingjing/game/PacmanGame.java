package com.jingjing.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class PacmanGame extends Game {
//public class PacmanGame extends ApplicationAdapter{
	public SpriteBatch batch;
	public static final int HEIGHT = 200;
	public static final int WIDTH = 200;
	@Override
	public void create () {
        batch = new SpriteBatch();
        setScreen(new GameScreen(this));
    }
	
	@Override
	public void render () {
		super.render();
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}

