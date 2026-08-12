import java.io.IOException;

public class Stat{

   public static int[][] enlarge(int[][] pic, int bits){
int[][] res = new int[pic.length * bits][pic[0].length * bits];
for( int y = 0; y < pic[0].length ; y++){
for(int x = 0; x< pic.length; x++){

  for(int z = 0; z< bits; z++){
    for (int m = 0; m<bits; m++){res[x * bits +z][y*bits+m] = pic[x][y]; }
  }
}
}
    return res;}

  //______________________________________________________________________________________________________________________________

   public static void main(String[] args) throws IOException {
      
       int[][] a = IntoFile.loadImage("drawn.png");
      boolean loo=true;
      int input = 10;
  
      for(int l = 0; l<args.length; l++){
    if(args[l].equals("-s")){
       input = Integer.parseInt(args[l+1]);
    }
      }
    a =  enlarge(a, input);
   IntoFile.saveImage(a);
   
}
}
