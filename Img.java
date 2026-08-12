import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.Math;

public class Img extends JPanel {
    public int color;
    public int[][] pic; // MOST UPDATED
    public BufferedImage image;
    double scale;
    JLabel label;

    public Img(int[][] img, int rgb, boolean autofill){
     // int z =1000 / Math.max(img[0].length, img.length);
      //  if(z<1){z=1;}
        this.scale = Math.min(1000.0/img[0].length,  1000.0/img.length);
        this.color = rgb;
        this.pic = img;
        this.image = new BufferedImage(pic.length, pic[0].length, BufferedImage.TYPE_INT_RGB);
        label = new JLabel(new ImageIcon( scaleImage(image, scale) ));

        label.addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseDragged(MouseEvent e){
                int x = (int) (e.getX() / scale);
                int y = (int) (e.getY()/ scale);
                setPixel(x,y,color);
            }}); // END OF MOUSEMOTIONLISTENER
        
                                    
                                     label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!autofill){
                int x = (int) (e.getX() /scale);
                int y = (int) (e.getY()/ scale);
                //System.out.println("else if(x=="+x+" && y =="+ y+"){a[x][y]=0xFF0000;}");
                setPixel(x,y,color);
            }else{
                      int x = (int) (e.getX() /scale);
                int y = (int) (e.getY()/ scale);
               // System.out.println("else if(x=="+x+" && y =="+ y+"){a[x][y]=0xFF0000;}");
                autofill(x,y,color, img[x][y]);
            }
            
            }

                                         
                                     } 
                                    );// END OF MOUSELISTENER
        }


    public void display(){
        for(int y = 0; y < pic[0].length; y++){
            for(int x = 0; x < pic.length; x++ ){
                if(pic[x][y] == 0){ image.setRGB(x, y, 0x000000);} // red, green, blue
                else{ image.setRGB(x, y, pic[x][y]); }
            }
        } //calculation of every pixel done.
        // image = scaleImage(image, 100);
        label.setIcon(new ImageIcon(scaleImage(image, scale)));
        intoImage(image);
    }
//____________________________________________________________________________________________________________________________________

    public BufferedImage scaleImage(BufferedImage old, double by){
        int newWidth = (int) Math.max(1, old.getWidth() * by);
         int newHeight = (int) Math.max(1, old.getHeight() * by);

        BufferedImage result = new BufferedImage(
                newWidth,
                newHeight,
                BufferedImage.TYPE_INT_RGB
        );

        Graphics2D g = result.createGraphics();

        g.setRenderingHint(
                RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR
        );

        g.drawImage(old, 0, 0, newWidth, newHeight, null);

        g.dispose();

        return result;
    }

    //______________________________________________________________________________________________________________________________________________
    public void intoImage(BufferedImage image){
        JFrame frame = new JFrame("Name");

        frame.add(label);

        frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            IntoFile.saveImage(pic);
            frame.dispose();
        }
    });
        

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setPixel(int x, int y, int color){
        pic[x][y] = color;
        image.setRGB(x,y,color);

        label.setIcon(new ImageIcon(scaleImage(image, scale)));
        IntoFile.saveImage(this.pic);
    }
//_________________________________________________________________________________________________________________________________________
    public static int[][] addLeft(int[][] png, int bits){
int[][] res = new int[png.length + bits][png[0].length];
        for (int h=0; h<png[0].length; h++){
    for(int w=0; w < png.length; w++ ){ 
        res[w+bits][h] = png[w][h];
    }
}
        return res;
    }
//_______________________________________________________________________________________________________________________________________________
public static int[][] deleteLeft(int[][] png, int bits){
int[][] res = new int[png.length - bits][png[0].length];
        for (int h=0; h<res[0].length; h++){
    for(int w=0; w < res.length; w++ ){ 
        res[w][h] = png[w+bits][h];
    }
}
        return res;
    }//_________________________________________________________________________________________________________________________________________
    public static int[][] addRight(int[][] png, int bits){
int[][] res = new int[png.length + bits][png[0].length];
        for (int h=0; h<png[0].length; h++){
    for(int w=0; w < png.length; w++ ){ 
        res[w][h] = png[w][h];
    }
}
        return res;
    }
//_______________________________________________________________________________________________________________________________________________
public static int[][] deleteRight(int[][] png, int bits){
int[][] res = new int[png.length - bits][png[0].length];
        for (int h=0; h<res[0].length; h++){
    for(int w=0; w < res.length; w++ ){ 
        res[w][h] = png[w][h];
    }
}
        return res;
    }
//___________________________________________________________________________________________________________________________________
    public static int[][] deleteUp(int[][] png, int bits){
int[][] res = new int[png.length][png[0].length - bits];
        for (int h=0; h<res[0].length; h++){
    for(int w=0; w < res.length; w++ ){ 
        res[w][h] = png[w][h+bits];
    }
}
        return res;
    }
    //___________________________________________________________________________________________________________________________________
    public static int[][] addUp(int[][] png, int bits){
int[][] res = new int[png.length][png[0].length + bits];
        for (int h=0; h<png[0].length; h++){
    for(int w=0; w < png.length; w++ ){ 
        res[w][h+bits] = png[w][h];
    }
}
        return res;
    }
     //___________________________________________________________________________________________________________________________________
    public static int[][] addDown(int[][] png, int bits){
int[][] res = new int[png.length][png[0].length + bits];
        for (int h=0; h<png[0].length; h++){
    for(int w=0; w < png.length; w++ ){ 
        res[w][h] = png[w][h];
    }
}
        return res;
    }
    //___________________________________________________________________________________________________________________________________
    public static int[][] deleteDown(int[][] png, int bits){
int[][] res = new int[png.length][png[0].length - bits];
        for (int h=0; h<res[0].length; h++){
    for(int w=0; w < res.length; w++ ){ 
        res[w][h] = png[w][h];
    }
}
        return res;
    }
      //___________________________________________________________________________________________________________________________________

public void autofill(int x, int y, int color, int myColor){
if(pic[x][y]!=myColor){return;}
    if(pic[x][y]==color){return;}
    else{
        this.setPixel(x,y,color);
if(x< pic.length-1){ autofill(x+1,y,color,myColor);}
 if(x>0){ autofill(x-1,y,color, myColor);}
 if(y< pic[0].length-1) {autofill(x,y+1,color,myColor);}
 if(y>0){ autofill(x,y-1,color,myColor);}}
    }
}
