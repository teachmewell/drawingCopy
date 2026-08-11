import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class IntoFile {

    public static void saveImage(int[][] pixels /*, String filename*/ ) {

        int height = pixels.length;
        int width = pixels[0].length;

        BufferedImage image= new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, pixels[y][x]);
            }
        }

        try {
            ImageIO.write(image, "png", new File(/*filename*/ "drawn.png"));
        } catch (IOException e) {
              e.printStackTrace();
        }
    }



    public static int[][] loadImage(String filename) {

        try {BufferedImage image = ImageIO.read(new File(filename));

            int width = image.getWidth();
            int height = image.getHeight();

            int[][] pixels = new int[height][width];

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    pixels[y][x] = image.getRGB(x, y) & 0xFFFFFF;
                }
            }
            return pixels;

        } catch (IOException e) {
            return null;
        }
    }
}
