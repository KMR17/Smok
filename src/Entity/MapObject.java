package Entity;

import TileMap;

public abstract class MapObject {
 
  //tile stuff
 protected TileMap tileMap;
 protected int tileSize;
 protected double xmap;
 protected double ymap;
  
  // position and vector 
 protected double x;
 protected double y;
 protected double dx;
 protected double dy;
  
  // dimensions
 protected int width;
 protected int height;

  // collision box
 protected int cwidth;
 protected int cheight;
  
  // collision
	protected int currRow;
	protected int currCol;
	protected double xdest;
	protected double ydest;
	protected double xtemp;
	protected double ytemp;
	protected boolean topLeft;
	protected boolean topRight;
	protected boolean bottomLeft;
	protected boolean bottomRight;
  
  // animation
	protected Animation animation;
	protected int currentAction;
	protected int previousAction;
	protected boolean facingRight;
  
}
