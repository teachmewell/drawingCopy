public class Transcribe{


public static void main(String[] args){

/*
int[][] a = IntoFile.loadImage("drawn.png");
Predefined.printText(a);
*/

  //___________________________________________________________________________________________________________________________
  //Rename a file into template.png then All red bits from that file will be copied into drawn.pgn
  
  int[][] a = IntoFile.loadImage("drawn.png");
  int[][] tem = IntoFile.loadImage("template.png");
int alen = a.length; int tlen = t.length; int aglen = a[0].length; int tglen = tem[0].length;  
  int alendif = alen-tlen; // negative if tlen is bigger
  int aglendif = aglen - tglen; // negative if tglen is bigger
if(alendif > 0){ tem= Img.addRight(tem, alendif); }
  else{ a = Img.addRight(a, alendif); }
if(aglendif > 0){ tem= Img.addDown(tem, aglendif); }
  else{ a = Img.addDown(a, algendif); }
  
for(int y = 0; y<tem[0].length; y++){
  for(int x = 0; x<tem.length; x++){

if(tem[x][y] == 0xFF0000 ){a[x][y] = 0x000000;} 
    
  }
}
  
}

}
