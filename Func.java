public class Func{

public static void main(String[] args){
 int[][] a = new int[6000][6000];

  int lenX = a.length; 
  int lenY = a[0].length;
  double step = 3.0 / (double)a.length;
for(int y =0; y< a[0].length; y++){
for (int x = 0; x< a.length; x++){
 a[x][y]= func(-1.5+ x*step, -1.5+y*step);
}
}

  IntoFile.saveImage(a, "func.png");
}


  public static int func(double cx, double cy){
double x=0; 
   double y=0;
   
    int itermax = 100; //max iterations
    int iter = 0;
while(x*x+y*y<4 && iter<itermax){
  double oldx = x;
  x = x*x-y*y+cx;
  y= 2*oldx*y+cy;
  iter++;
}
    if(iter == itermax){
      return 0xFF0000;
    }
    else{return 0xFFFFFF;}
    
  }
  
}
