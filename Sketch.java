import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1920, 1080);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Walls & Roof
    
    stroke(0);
    fill(200,0,255);
    rect((float)(width/4), (float)(height/2), (float)(width/2), (float)(height/0.75));
    triangle((float)(width/2), (float)(height/4), (float)(width/1.333), (float)(height/2), (float)(width/4), (float)(height/2));

    // Windows
    
    fill(128,128,128);
    rect((float)(width/1.7), (float)(height/1.8), (float)(width/8), (float)(height/8));
    rect((float)(width/3.4), (float)(height/1.8), (float)(width/8), (float)(height/8));


    // Door

    fill(150,75,0);
    rect((float)(width/2.3), (float)(height/1.4), (float)(width/8), (float)(height/1));
    fill(255,255,0);
    ellipse((float)(width/2.2), (float)(height/1.2), (float)(width/30), (float)(height/30));

    // Clouds

    fill(255,255,255);
    ellipse((float)(width/1.3), (float)(height/4), (float)(width/4), (float)(height/8));
    ellipse((float)(width/2.5), (float)(height/8), (float)(width/4), (float)(height/8));
    ellipse((float)(width/7), (float)(height/4), (float)(width/4), (float)(height/8));

    // Grass

    fill(0,255,130);
    rect((float)(0), (float)(height/1.1), (float)(width/1), (float)(height/4));

  }
  
  // define other methods down here.
}