package Bussines.Planets;

import Bussines.Objetos.Anillo;
import Bussines.CuerpoCeleste;
import Bussines.Orbita;
import Bussines.Satelites.SateliteNatural;
import java.util.ArrayList;

public class Planeta extends CuerpoCeleste {

    private ArrayList<SateliteNatural> satelitesNatural = new ArrayList<SateliteNatural>();
    private Orbita orbita;
    private ArrayList<Anillo> anillos = new ArrayList<Anillo>();

    public Planeta(String path, int posx, int posy) {
        super(path, posx, posy);
    }
    
}
