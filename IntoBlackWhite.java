public class IntoBlackWhite{

public static void main(String[] args){
int[][] a = IntoFile.loadImage("drawn.png");
  a= Stat.intoBlackWhite(a);
   IntoFile.saveImage(a);
  
        System.out.println("\n\nProcess of turning image into black-white ended. View the results inside drawn.png");
}
}
