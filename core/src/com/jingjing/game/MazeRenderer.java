package com.jingjing.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MazeRenderer {
	private Maze maze;
    private SpriteBatch batch;
    private Texture sandImage;
    private Texture blockImage;
    private Texture waterImage;
    private Texture coinImage;///////////////////////
    private Texture kol_buttonImage;
    private Texture bomb_buttonImage;
    private Texture freez_buttonImage;
    private Texture kol_priceImage;
    private Texture bomb_priceImage;
    private Texture freez_priceImage;
    private Texture area_weaponImage;
    private Texture treeImage;
    private Texture grassImage;
    private Texture castleImage;
    private Texture windowImage;
    World world;
 
    public MazeRenderer(SpriteBatch batch, Maze maze) {
        sandImage = new Texture("sand.png");
        waterImage = new Texture("water.png");
        blockImage = new Texture("block.png");
        coinImage = new Texture("coin_canuse.png");
        kol_buttonImage = new Texture("kol_button.png");
        bomb_buttonImage = new Texture("bomb_button.png");
        freez_buttonImage = new Texture("freez_button.png");
        kol_priceImage = new Texture("kol_price.png");
        bomb_priceImage = new Texture("bomb_price.png");
        freez_priceImage = new Texture("freez_price.png");
        area_weaponImage = new Texture("past.png");
        treeImage = new Texture("trees.png");
        grassImage = new Texture("green.png");
        castleImage = new Texture("castle.png");
        windowImage = new Texture("platformIndustrial_095.png");
        
        this.maze = maze;
        this.batch = batch;
      
  
    }
 
    public void render(float delta) {
    	//this.batch.begin();
        for(int r = 0; r < maze.getHeight(); r++) {
            for(int c = 0; c < maze.getWidth(); c++) {
                int x = c * WorldRenderer.BLOCK_SIZE;
                int y = PacmanGame.HEIGHT - (r * WorldRenderer.BLOCK_SIZE) - WorldRenderer.BLOCK_SIZE;
         
                if(maze.hasWindowAt(r, c)) {
                    batch.draw(windowImage, x, y);
                }
                
            }
        }
       // this.batch.end();
    }
}
