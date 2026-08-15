import java.io.IOException;
import java.lang.Math;

public class CombineTwoPics{

    public static void main(String[] args) throws IOException {
boolean leftright = true; 
      boolean left = true;
      boolean up= true;
      int[][] a;
      int[][] b;
      int m;
      int[][] c;

      
      while(true){
        System.out.println("add them next to each other (1) or  above/below each other (2)?");
            m = System.in.read();
      if(m=='1'){leftright = true; break;} 
        if(m == '2'){leftright = false; break;}
      }


      if(leftright){
       
while(true){
        System.out.println("drawn.png should be on the right (r) or left (l)? ");
            m = System.in.read();
      if(m=='r'){left = true; break;} 
        if(m == 'l'){left = false; break;}
      }
        
       if(left){  a = IntoFile.loadImage("template.png");  b = IntoFile.loadImage("drawn.png");}
        else{  a = IntoFile.loadImage("drawn.png"); b = IntoFile.loadImage("template.png"); }
      
      c = new int[a.length + b.length][Math.max(a[0].length, b[0].length)];

        for (int y = 0; y < a[0].length; y++) {
            for (int x = 0; x < a.length; x++) {
                c[x][y] = a[x][y];
            }
        }

        for (int y = 0; y < b[0].length; y++) {
            for (int x = 0; x < b.length; x++) {
                c[x + a.length][y] = b[x][y];
            }
        }
      }
else{ // up down
  

while(true){
        System.out.println("drawn.png should be below (b) or above (a)? ");
            m = System.in.read();
      if(m=='a'){up = true; break;} 
        if(m == 'b'){up = false; break;}
      }


   if(up){ a = IntoFile.loadImage("drawn.png");  b = IntoFile.loadImage("template.png");}
        else{ a = IntoFile.loadImage("template.png"); b = IntoFile.loadImage("drawn.png"); }
      
c = new int[Math.max(a.length, b.length)] [a[0].length + b[0].length];
  
  for (int y = 0; y < a[0].length; y++) {
    for (int x = 0; x < a.length; x++) {
        c[x][y] = a[x][y];
    }
}
  
for (int y = 0; y < b[0].length; y++) {
    for (int x = 0; x < b.length; x++) {
        c[x][y + a[0].length] = b[x][y];
    }
}
  
}
      
      
        IntoFile.saveImage(c);
        
        System.out.println("\n\nProcess of combining the two pictures (located inside drawn.png and template.png) ended. View the results inside drawn.png \n");
    }
  
}
