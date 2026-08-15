public class ChangeColor{


public static void main(String[] args) {    // If you use this main: flags -f num .t num  With from color to color change. 
     int[][] pic = IntoFile.loadImage("drawn.png");
int from = 0;
int to = 0;

 for(int l = 0; l<args.length; l++){
  if(args[l].equals("-f")){
       from = Integer.parseInt(args[l+1], 16);
       l++;
    }
   else if(args[l].equals("-t")){
       to = Integer.parseInt(args[l+1], 16);
       l++;
    }
 }
for( int y = 0; y < pic[0].length ; y++){
for(int x = 0; x< pic.length; x++){
if( pic[x][y] == from){ pic[x][y] = to; }
}
}
    IntoFile.saveImage(pic);
     
        System.out.println("\n\nProcess of changing colour from "+ from + " to " + to + " ended. View the results inside drawn.png \n");
 }
  

}
