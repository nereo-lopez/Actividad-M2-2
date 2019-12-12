package Bussines.Satelites;

import Bussines.CuerpoCeleste;
import Bussines.Orbita;

public class SateliteNatural extends CuerpoCeleste{
    
    private Orbita orbita;

    public SateliteNatural(String path, int posx, int posy) {
        super(path, posx, posy);
    }
    
}