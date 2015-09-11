//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);        // Try changing the width & height.
  x=  width/2;
  y=  height/2;
  background(0,0,225);
}

// Next frame:  draw three circles. //
void draw() {
  fill(225,0,0);//inside color
  stroke(70,80,90);//outside color
  ellipse(x, y, 80, 80);
  fill(0,225,0);//inside color
  stroke(50,150,10);//outside color
  ellipse(x+60, y+60, 40, 40);
  fill(40,30,20);//inside color
  stroke(0,70,150);//outside color
  ellipse(x+90, y+90, 20, 20);
 x=x+1;
 y=y+1;
 
}
