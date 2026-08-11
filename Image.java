import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Img extends JPanel {
    public int color;
    public int[][] pic; // MOST UPDATED
    public BufferedImage image;
    int scale = 13;
    JLabel label;

    public Img(int[][] img, int rgb){
        this.color = rgb;
        this.pic = img;
        this.image = new BufferedImage(pic.length, pic[0].length, BufferedImage.TYPE_INT_RGB);
        label = new JLabel(new ImageIcon( scaleImage(image, scale) ));

        label.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX() / scale;
                int y = e.getY()/scale;
                System.out.println("else if(x=="+x+" && y =="+ y+"){a[x][y]=0xFF0000;}");
                setPixel(x,y,color);
            }

            @Override
            public void mouseDragged(MouseEvent e){
                int x = e.getX() / scale;
                int y = e.getY()/scale;
                setPixel(x,y,color);
            }
        });
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

    public BufferedImage scaleImage(BufferedImage old, int by){
        int newWidth = old.getWidth() * by;
        int newHeight = old.getHeight() * by;

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

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setPixel(int x, int y, int color){
        pic[x][y] = color;
        image.setRGB(x,y,color);

        label.setIcon(new ImageIcon(scaleImage(image, scale)));
        IntoFile.saveImage(this.pic);
    }

}
