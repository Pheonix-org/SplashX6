package utility;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * <h1>independant application to process tile images</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 22/03/2021</a>
 * @version 1
 * @since v1
 */
public class tilesetSplitter {
    //#region constants
    private static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    //#endregion constants

    //#region fields
    //#endregion fields

    //#region constructors
    //#endregion constructors

    //#region operations
    public static void main(String[] args) throws URISyntaxException, IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(ClassLoader.getSystemResource("unprocessed").toURI()))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(v -> {
                        process(v);
                    });
        }
    }

    private static void process(Path pathtofile){
        System.out.println("Processing " + pathtofile.toString());
        if (!pathtofile.toString().endsWith(".png")) return;
        File f = new File(String.valueOf(pathtofile));
        InputStream in = tilesetSplitter.class.getClassLoader().getResourceAsStream(String.valueOf(Paths.get(pathtofile.toString().substring(pathtofile.toString().indexOf("unprocessed/")))));
        if (in == null){
            return;
        }
        try {
            // get image
            BufferedImage inImage = ImageIO.read(in);
            BufferedImage image = new BufferedImage(inImage.getWidth(), inImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = image.createGraphics();
            g.drawImage(makeColorTransparent(inImage, Color.black), 0, 0, null);
            g.dispose();

            Path export = Paths.get(pathtofile.getParent() + "/test/");
            Files.createDirectories(export);


            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setSize(image.getWidth() + 100, image.getHeight() + 100);
            ImageIcon icon = new ImageIcon(image);
            JLabel label = new JLabel(icon);
            frame.add(label);

            System.out.println("This sheet has __ COLUMNS?");
            int cols = Integer.parseInt(obj.readLine());

            System.out.println("This sheet has __ ROWS?");
            int rows = Integer.parseInt(obj.readLine());

            frame.dispose();
            int segheight = image.getHeight() / rows;
            int segwidth = image.getWidth() / cols;

            System.out.println("Segments are " + segwidth + " x " + segheight);
            int idx = 0;
            for (int y = 0; y < image.getHeight(); y += segheight) {
                for (int x = 0; x < image.getWidth(); x += segwidth) {
                    ImageIO.write(image.getSubimage(x, y, segwidth, segheight), "png", new File(export + "/" + f.getName() + "-" + idx + ".png"));
                    idx++;
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        // split into multiple based on tile size
        // save
    }

    public static Image makeColorTransparent(final BufferedImage im, final Color color)
    {
        final ImageFilter filter = new RGBImageFilter()
        {
            // the color we are looking for (white)... Alpha bits are set to opaque
            public int markerRGB = color.getRGB();

            public final int filterRGB(final int x, final int y, final int rgb)
            {
                if ((rgb | 0xFF000000) == markerRGB)
                {
                    // Mark the alpha bits as zero - transparent
                    return 0x00FFFFFF & rgb;
                }
                else
                {
                    // nothing to do
                    return rgb;
                }
            }
        };

        final ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
        return Toolkit.getDefaultToolkit().createImage(ip);
    //#endregion operations

    //#region static
    //#endregion static
    }
}
