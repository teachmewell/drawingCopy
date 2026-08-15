import java.io.IOException;

public class Stat{
//______________________________________________________________________________________________________________________________

   public static void main(String[] args) throws IOException {

      String filename= "drawn.png";
       int[][] a = IntoFile.loadImage("drawn.png");
      int input = 5;
      int inputX = 5;
      int inputY = 5;
  
      for(int l = 0; l<args.length; l++){

 if(args[l].equals("-t")){
    if(l+1 >= args.length){System.out.println("You mmust specify the filename after -t . Example: java Stat -t template.png"); return;}
    filename = args[l+1];
 a = IntoFile.loadImage( filename );
  
    l++;
 }

         
// if two arguments
 if(args[l].equals("-w")){
        if(l+2 >= args.length ){ System.out.println("You must specify one or two numbers (plus or minus) after -s. Examples: \njava Stat -s 4 \njava Stat -s 3 -2"); return;}
    
    inputX = Integer.parseInt(args[l+1]); 
     inputY = Integer.parseInt(args[l+2]);
     if(inputX == 0 || inputY == 0){ System.out.println("you cannot map an image onto 0 size."); return;}
     if(inputX >0){ a = mapEnlarge(a, inputX, 1);} else{a = mapShrink(a, -inputX, 1);} 
     if(inputY >0){ a = mapEnlarge(a, 1, inputY);} else{a = mapShrink(a, 1, -inputY);} 
   IntoFile.saveImage(a, filename);
         System.out.println("\n\nProcess of Stat ended. Your image inside drawn.png is now, with \n x * "+ inputX+" times bigger and y * "+ inputY+" times bigger \n");
       return;
      }

         // if one argument
    if(args[l].equals("-q")){ //one argument
        if(l+1 >= args.length ){ System.out.println("You must specify one or two numbers (plus or minus) after -s. Examples: \njava Stat -s 4 \njava Stat -s 3 -2"); return;}
    
  
     input = Integer.parseInt(args[l+1]);
       l++;
    if(input == 0){ System.out.println("you cannot map an image onto 0 size."); return;}
     else if(input >0){ a =  enlarge(a, input);} else{a = shrink(a, -input);} 
   IntoFile.saveImage(a, filename);
      
        System.out.println("\n\nProcess of Stat ended. Your image inside drawn.png is now "+ input+" times bigger \n");
       return;
    }   
      } //end of flag check loop

      System.out.println("Sizes of drawn.png : x = "+ a.length + " , y = "+ a[0].length);
             try{  int[][] b = IntoFile.loadImage("template.png");
                 System.out.println("Sizes of template.png : x = "+ b.length + " , y = "+ b[0].length);}
             catch ( Exception e ) { return; } 
return;  
}

   //___________________________________________________________________________________________________________
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

   //_____________________________________________________________________________________________________
   
   public static int[][] mapEnlarge(int[][] pic, int bitsX, int bitsY){
int[][] res = new int[pic.length * bitsX][pic[0].length * bitsY];
for( int y = 0; y < pic[0].length ; y++){
for(int x = 0; x< pic.length; x++){

  for(int m = 0; m< bitsY; m++){
    for (int z = 0; z<bitsX; z++){
       res[x * bitsX +z][y*bitsY+m] = pic[x][y]; 
    }
  }
}
}
    return res;}

   //_____________________________________________________________________________________________________

      public static int[][] enlargeColourSame(int[][] pic, int bits){
int[][] res = new int[pic.length * bits][pic[0].length * bits];
         int colour = pic[0][0];
 for( int y = 0; y < pic[0].length ; y++){
for(int x = 0; x< pic.length; x++){

  for(int z = 0; z< bits; z++){
    for (int m = 0; m<bits; m++){res[x * bits +z][y*bits+m] = colour; }
  }
}
}
    return res;} 
   
//______________________________________________________________________________________________________
   public static int[][] shrink(int[][] pic, int bits){
    int[][] res = new int[pic.length/bits][pic[0].length/bits];

    for(int y = 0; y < res[0].length; y++){
    for(int x = 0; x < res.length; x++){
    res[x][y] = pic[x * bits][y * bits];
    }
    }
    return res;
}

   //______________________________________________________________________________________________________
   public static int[][] mapShrink(int[][] pic, int bitsX, int bitsY){
    int[][] res = new int[pic.length/bitsX][pic[0].length/bitsY];

    for(int y = 0; y < res[0].length; y++){
    for(int x = 0; x < res.length; x++){
    res[x][y] = pic[x * bitsX][y * bitsY];
    }
    }
    return res;
}
   

 //______________________________________________________________________________________________________________________________
/* public static void main(String[] args) {    // If you use this main: flags -f num .t num  With from color to color change. 
     int[][] pic = IntoFile.loadImage("drawn.png");
int from = 0;
int to = 0;

 for(int l = 0; l<args.length; l++){
  if(args[l].equals("-f")){
       from = Integer.parseInt(args[l+1]);
       l++;
    }
    if(args[l].equals("-t")){
       to = Integer.parseInt(args[l+1]);
       l++;
    }
 }
for( int y = 0; y < pic[0].length ; y++){
for(int x = 0; x< pic.length; x++){
if( pic[x][y] == from){ pic[x][y] = to; }
}
}
    IntoFile.saveImage(pic);
 }*/

   public static int[][] intoBlackWhite(int[][] a){
      for (int y = 0; y < a[0].length; y++) {
    for (int x = 0; x < a.length; x++) {

        int r = (a[x][y] >> 16) & 0xFF;
        int g = (a[x][y] >> 8) & 0xFF;
        int b = a[x][y] & 0xFF;

        int brightness = (r + g + b) / 3;

        if (brightness >= 128)
        {a[x][y] = 0xFFFFFF;}  // white
        else
        {a[x][y] = 0x000000;}  // black
    }
}
   return a;}
   
   
}
