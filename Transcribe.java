import java.lang.Math;

public class Transcribe{


public static void main(String[] args){
   // Needs a file named template.png  Will copy all red bits into drawn.png as black ones. 
  int[][] a = IntoFile.loadImage("drawn.png");
  int[][] tem = IntoFile.loadImage("template.png");
   
   int color = 0xFF0000;
   boolean resize = true;
   int inverse= 0;
   boolean copyColor = true;

   for(int l = 0; l<args.length; l++){
 if(args[l].equals( "-b")){
    copyColor = false;
 }
      if(args[l].equals( "-s")){
    resize = false;
 }
    if(args[l].equals( "-c")){
if(l+1 >= args.length){System.out.println("You must write a hexadecimal number after -c. Example: \njava Transcribe -c FF00FF"); break;}
            color = Integer.parseInt(args[l+1], 16);
       l++;
        }
       if(args[l].equals( "-v")){
            inverse = 1;
        }  
      }
  
 
if(resize){
// enlarge the smaller until fits exactly
if(a.length< tem.length && a[0].length< tem[0].length){
    int enl = Math.max( Math.min(tem.length/ a.length, tem[0].length/ a[0].length), 1 );
        a = Stat.enlarge(a, enl);
} else if(tem.length< a.length && tem[0].length< a[0].length){
     int enl = Math.max( Math.min(a.length/ tem.length, a[0].length/ tem[0].length), 1 );
        tem = Stat.enlarge(tem, enl);
    }

   //make them same size
int alen = a.length; int tlen = tem.length; int aglen = a[0].length; int tglen = tem[0].length;  
  int alendif = alen-tlen; // negative if tlen is bigger
  int aglendif = aglen - tglen; // negative if tglen is bigger
  if(alendif == 0){}
else if(alendif > 0){ tem= Img.addRight(tem, alendif-alendif/2, copyColor); tem=Img.addLeft(tem, alendif/2, copyColor); }
  else{ a = Img.addRight(a, -alendif/2, copyColor); a=Img.addLeft(a, alendif/2-alendif, copyColor); }
if(aglendif ==0){}
 else if(aglendif > 0){ tem= Img.addDown(tem, aglendif/2, copyColor); tem=Img.addUp(tem, aglendif-aglendif/2, copyColor);  }
  else{ a = Img.addDown(a, -aglendif/2, copyColor); a=Img.addUp(a, -aglendif-(-aglendif/2), copyColor);}
}
   
   
   
for(int y = 0; y< Math.min(a[0].length, tem[0].length); y++){
  for(int x = 0; x< Math.min(a.length, tem.length); x++){
 if( inverse==0){if (tem[x][y]== color) { a[x][y]= color; } }
else{ if(tem[x][y] == color ){a[x][y] = (~a[x][y]) & 0xFFFFFF;} } //takes the inverse
  }
}

  IntoFile.saveImage(a);
        System.out.println("\n\nProcess of copying all bits of colour "+ color +" from template.png into drawn.png ended. View the results inside drawn.png \n");
}

}
