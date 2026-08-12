import java.io.IOException;
import java.lang.Math;
import java.awt.image.BufferedImage;

//WILL SAVE THE PICTURE INTO DRAWN.PNG
// USING ANYTHING OTHER THAN OPTION 4 WILL OVERWRITE YOUR DRAWING

public class Main {
    public static void main(String[] args) throws IOException {
        
        int[][] a = new int[130][77];
        int m=0;
        boolean autofill = false;

        boolean usedQuick = false;
        
      for(int l = 0; l<args.length; l++){
        if(args[l].equals( "-q")){
            m = (int) (Math.random() * 0xFFFFFF);
            a = Predefined.neutralGlobe();
            autofill = false;
            usedQuick = true;
            Img img = new Img(a, m, autofill);
        img.display();
            return;
        }
      }
      
      if(usedQuick == false){  
int version = 0;
          boolean end = true;
while(true){
        System.out.println("\n \n what do you want to start with? \n[1] a template (enter 1)");
        System.out.println("[2] white png (enter 2)");
        System.out.println("[3] randomly coloured (enter 3)");
        System.out.println("[4] from a file(Do not choose this first time, because it would be 0 bytes big) (enter 4)");
       version = System.in.read();
        switch(version){
            case '1': version=1; break;
            case '2': version=2; break;
            case '3': version=3; break;
            case '4': version = 4; break;
        }
    if(version <5 && version >0){break;}
}
            
        while(end) {
            System.out.println("\n\nHello, here you can draw. ");
            System.out.println("choose color, enter their character:");
            System.out.println("r= red. o= orange. y= yellow. x=dark yellow. l= lightgreen.");
            System.out.println("g= green. s= springgreen. c= cyan. a=azure.");
            System.out.println("b= blue. v=violet. e=light blue. i=purple. m=magenta. d=rose. w=white. n=black.");
            System.out.println("p= pink. f=olive. t=brown. q=random.");
            m = System.in.read();
            switch(m){
                case 'r': m=0xFF0000; end=false; break;
                case 'o': m=0xFF7F00; end=false; break;
                case 'y': m=0xFFFF00; end=false; break;
                case 'l': m=0x7FFF00; end=false; break;
                case 'g': m=0x008000; end=false; break;
                case 's': m=0x00FFF0; end=false; break;
                case 'c': m=0x00FFFF; end=false; break;
                case 'a': m=0x07F0FF; end=false; break;
                case 'b': m=0x0000FF; end=false; break;
                case 'x': m=0xFFCC33; end=false; break;
                case 'v': m=0x7F00FF; end=false; break;
                case 'e': m=0x9999FF; end=false; break;
                case 'i': m=0x4B0082; end=false; break;
                case 'm': m=0xFF00FF; end=false; break;
                case 'd': m=0xFF007F; end=false; break;
                case 'n': m=0x000000; end=false; break;
                case 'w': m=0xFFFFFF; end=false; break;
                case 'p': m=0xFC0FC0; end=false; break;
                case 'f': m=0x556B2F; end=false; break; 
                case 't': m=0x895129; end=false; break; 
                case 'q': m= (int) (Math.random()*0xFFFFFF); end=false; break; 
                        
                default: System.out.println(" \n \n CHOOSE ONE OF THE OPTIONS ");
            }
        }

     if(version ==3){
            for(int k = 0; k < a.length; k++){
                for( int j = 0; j< a[0].length; j++){
                    a[k][j]= (int)(Math.random() * 0xFFFFFF);
                }}
        }

        if(version ==2){
            a = new int[120][59];
            for(int k = 0; k < a.length; k++){
                for( int j = 0; j< a[0].length; j++){
                    a[k][j]=0xFFFFFF;
                }}

        }

        if(version == 4){
            a = IntoFile.loadImage("drawn.png");
        }

        
        if(version ==1){
   /* if(Math.random() > 0.5){a = Predefined.globeTemplate(); } 
            else{a=Predefined.symbolTemplate();} m*/
//else{  a[x][y]= (int)(Math.random() * 0xFFFFFF);}
           
        while(true){
            System.out.println("\n\npress 1 for map, press 2 for symbol, press 3 for map+symbol \n");
        int af = System.in.read();
        if(af == '1'){a = Predefined.neutralGlobe();break; }   
if(af=='2'){a=Predefined.symbolTemplate(); break;}
        if(af == '3'){a = Predefined.globeTemplate();break; }   
    }

                //   else{  a[x][y]= (int)(Math.random() * 0xFFFFFF);}
        } 
       
        while(true){
            System.out.println("\n\nDo you want autofill? Enter 1 for yes. Enter 0 for no.");
            System.out.println("Keep in mind: Autofill is very slow. ");
        int af = System.in.read();
        if(af == '1'){autofill=true;break;}
if(af=='0'){autofill =false; break;}
    }
        
        Img img = new Img(a, m, autofill);

        img.display();
      }
    }
}
