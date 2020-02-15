PImage face;
  
   
void setup() {
  face = loadImage("Pewdiepie.png");
  size(300,400);
  face.resize(300,400);
}

void draw() {
  if(mouseX>114 || mouseX <106 || mouseY > 123 || mouseY < 117){
   mouseX=110;
   mouseY=120;
  }
  
  
  
  background(face);
  noStroke();
  fill(50,150,255);
  ellipse(110,120, 16,20);
  
  noStroke();
  fill(0,0,0);
  ellipse(mouseX,mouseY,8,15);
  
  noStroke();
  fill(50,150,255);
  ellipse(150,120, 16,20);
  
  noStroke();
  fill(0,0,0);
  ellipse(mouseX + 40,mouseY  ,8,15);
}
