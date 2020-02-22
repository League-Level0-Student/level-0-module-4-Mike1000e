int loX = 60;
int loY = 77;
int a = 20;
int b = 20;

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
              
    boolean ha = isNear(loX+ 10,mouseX);       
    if(ha == true){ 
     fill(20,20,255);           
     
    }
     ellipse(mouseX,mouseY,20,20);  
}
 boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
boolean isNear2(int q, int w) {
if (abs(q - w) < 10)
     return true;
else
     return false;
}
