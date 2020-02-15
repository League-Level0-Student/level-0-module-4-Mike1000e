int loX = 60;
int loY = 77;


PImage creeper;     //at the top of your program
void setup() {
  size(600,350);
  PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(width, height);          //in setup method
background(minecraft);          //in setup method
creeper=loadImage("creeper.png");     //in setup metho
creeper.resize(50,50);
}

void draw() {
     image(creeper, loX, loY);     //in draw method
     fill(255,30,30);
     ellipse(loX+23,loY+23,60,60);
      
}
