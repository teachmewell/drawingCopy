import java.io.IOException;
import java.lang.Math;
import java.awt.image.BufferedImage;

//WILL SAVE THE PICTURE INTO DRAWN.PNG
// USING ANYTHING OTHER THAN OPTION 4 WILL OVERWRITE YOUR DRAWING

public class Main {
    public static void main(String[] args) throws IOException {
        
        int[][] a = new int[120][60]; //was 130 77 before
        int m= (int) (Math.random() * 0xFF00FF); //color
        boolean autofill = false;
        int brushsize = 1;
boolean shouldScale = true;
        boolean usedOld = false;
        boolean usedAutofill = false;
        boolean usedColor = false;
        boolean usedBrushsize = false;
        boolean usedScale = false;
        
      for(int l = 0; l<args.length; l++){
        if(args[l].equals( "-q")){
            a = Predefined.neutralGlobe();
            Img img = new Img(a, m, autofill, brushsize, shouldScale);
        img.display();
        System.out.println("\n\nProcess of running main ended. View the results inside drawn.png \n");
            return;
        }
  if(args[l].equals( "-o")){
       a = IntoFile.loadImage("drawn.png");
            usedOld = true;
        }
           if(args[l].equals( "-s")){
     shouldScale=false;
        }
 if(args[l].equals( "-a")){
            usedAutofill = true;
     autofill = true;
        }
         if(args[l].equals( "-c")){
if(l+1 >= args.length){System.out.println("You must write a number after -c. Example: \njava Main -c FF00FF"); break;}
             if(args[l+1].startsWith("-") ){System.out.println("You must write a number after -c. Example: \njava Main -c FF00FF"); break;}
             m =Integer.parseInt(args[l+1], 16);
             l++;
            usedColor = true;
        }  
  if(args[l].equals( "-b")){
if(l+1 >= args.length){System.out.println("You must write a number after -c. Example: \njava Main -c FF00FF"); break;}
             if(args[l+1].startsWith("-") ){System.out.println("You must write a number after -c. Example: \njava Main -c FF00FF"); break;}
              brushsize =Integer.parseInt(args[l+1]);
             l++;
            usedBrushsize = true;
        }  
          
      } // end of flagchecks
      int version = 0;
          boolean end = true;
        
if(!usedOld){
while(true){
        System.out.println("\n \n what do you want to start with? \n[1] a template (enter 1)");
        System.out.println("[2] white png (enter 2)");
        System.out.println("[3] randomly coloured (enter 3)");
        System.out.println("[4] from a file(Do not choose this first time, because it would be 0 bytes big) (enter 4)");
        System.out.println("[5] use your template.png");
       version = System.in.read();
        switch(version){
            case '1': version=1; break;
            case '2': version=2; break;
            case '3': version=3; break;
            case '4': version = 4; break;
            case '5': version = 5; a = IntoFile.loadImage("template.png"); break;
        }
    if(version <6 && version >0){break;}
} 
            
        while(end) {
            System.out.println("\n\nHello, here you can draw. ");
            System.out.println("choose color, enter their character:");
            System.out.println("r= red. o= orange. y= yellow. x=dark yellow. l= lightgreen.");
            System.out.println("g= green. s= springgreen. c= cyan. a=azure.");
            System.out.println("b= blue. v=violet. e=light purple. i=purple. m=magenta. d=rose. w=white. n=black.");
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
            System.out.println("\n\npress 1 for map, press 2 for symbol, press 3 for template.png \n");
        int af = System.in.read();
        if(af == '1'){a = Predefined.neutralGlobe();break; }   
if(af=='2'){a=Predefined.symbolTemplate(); break;}
        if(af == '3'){a = Predefined.templateTemplate();break; }   
        }
            

                //   else{  a[x][y]= (int)(Math.random() * 0xFFFFFF);}
        } } // end of <if (usedOld) >

      if(!usedBrushsize){
        brushsize = 0;
        while(brushsize==0){
            
            System.out.println("\n\nWhat Brushsize do you want? You can only enter one number (from 0-9). The brushsize will be 1, 3, 5, 9, 11, 15, 17, 21, 25, 35  ");
        int af = System.in.read();
            switch(af){
                case '0': brushsize = 1 ;  break;
                case '1': brushsize = 3 ;  break;
                case '2': brushsize = 5 ;  break;
                case '3': brushsize = 9 ;  break;
                case '4': brushsize = 11 ;  break;
                case '5': brushsize = 15 ;  break;
                case '6': brushsize = 27 ;  break;
                case '7': brushsize = 21 ;  break;
                case '8': brushsize = 25 ;  break;
                case '9': brushsize = 35 ;  break;
                default: System.out.println(" You must enter 0-9. ");
            }
    } }  // end of usedBrushSize

        if(!usedAutofill){
           while(true){
            System.out.println("\n\nDo you want autofill? Enter 1 for yes. Enter 0 for no.");
            System.out.println("Keep in mind: Autofill is very slow. ");
        int af = System.in.read();
        if(af == '1'){autofill=true;break;}
if(af=='0'){autofill =false; break;}
    } } // end of usedAutofill
          
      
        Img img = new Img(a, m, autofill, brushsize, shouldScale);

        img.display();

        System.out.println("\n\nProcess of running main ended. View the results inside drawn.png \n");
    }
}
