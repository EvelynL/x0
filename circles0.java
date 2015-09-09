//// Wild circles #0.

// Setup:  screen size. //
void setup() {
  size(400, 400);                // Try changing the width & height.
}

// Next frame:  circle at (x,y). //
void draw() {
  fill(225,0,0);//inside circle color
  stroke(0,0,225);//outside color
  ellipse( width/2,height/2, 30,30 );       // Try changing the (x,y) and size.
}
