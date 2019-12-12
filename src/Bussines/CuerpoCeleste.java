package Bussines;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class CuerpoCeleste {

    private String path;
    private Image texture;
    private int posX;
    private int posY;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Image getTexture() {
        return texture;
    }

    public int getPosx() {
        return posX;
    }

    public void setPosx(int posx) {
        this.posX = posx;
    }

    public int getPosy() {
        return posY;
    }

    public void setPosy(int posy) {
        this.posY = posy;
    }

    public CuerpoCeleste(String path, int posx, int posy) {
        this.path = path;
        this.posX = posx;
        this.posY = posy;

        try {
            this.texture = ImageIO.read(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(CuerpoCeleste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
