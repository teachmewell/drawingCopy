

public class Refactor{

public static void main(String[] args){
    String filename= "drawn.png";
   int[][] a = IntoFile.loadImage("drawn.png");
  int r=0;
  int left=0;
  int u=0;
  int d=0;
   boolean copyColor= true;
   boolean addRight=false;
   boolean addLeft=false;
   boolean addUp = false;
   boolean addDown = false;

   for(int l = 0; l<args.length; l++){

       if(args[l].equals("-t")){
    if(l+1 >= args.length){System.out.println("You mmust specify the filename after -t . Example: java Stat -t template.png"); return;}
    filename = args[l+1];
 a = IntoFile.loadImage( filename );
  
    l++;
 }
      
 if(args[l].equals( "-b")){
    copyColor = false;
 }
     if(args[l].equals( "-d")){
if(l+1 >= args.length){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -d 15"); break;}
             if(args[l+1].startsWith("-r") ){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -d 15"); break;}
             d =Integer.parseInt(args[l+1]);
             l++;
        addDown = true;
   }
        
     
      if(args[l].equals( "-u")){
if(l+1 >= args.length){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -u 15"); break;}
             if(args[l+1].startsWith("-l") ){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -u 15"); break;}
             u =Integer.parseInt(args[l+1]);
             l++;
         addUp = true;
      }
        
     
       if(args[l].equals( "-l")){
if(l+1 >= args.length){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -l 15"); break;}
             if(args[l+1].startsWith("-d") ){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -l 15"); break;}
             left =Integer.parseInt(args[l+1]);
             l++;
   addLeft = true;
       
        }
     
       if(args[l].equals( "-r")){
if(l+1 >= args.length){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -r 15"); break;}
             if(args[l+1].startsWith("-u") ){System.out.println("You must write the number of bits to be deleted after -d. Example: \njava Refactor -r 15"); break;}
             r =Integer.parseInt(args[l+1]);
             l++;
          addRight = true;}
   }

if(addRight){
    if(r<0){a=Img.deleteRight(a,-r);} else{a=Img.addRight(a,r, copyColor);
}}

   
if(addLeft){
   if(left<0){a=Img.deleteLeft(a,-left);} else{a=Img.addLeft(a,left, copyColor);
}}

   
if(addUp){if(u<0){a=Img.deleteUp(a,-u);} else{a=Img.addUp(a,u, copyColor);}}

   
if(addDown){ if(d<0){a=Img.deleteDown(a,-d);} else{a=Img.addDown(a,d, copyColor);}}


    IntoFile.saveImage(a, filename);
   
        System.out.println("\n\n New size of the image in bits: width: " +a.length +" , height: "+a[0].length );
        System.out.println("Process of refactoring the image located indide "+filename+" ended. View the results inside drawn.png \n");
}
}
