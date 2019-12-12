package Bussines;

import Bussines.Objetos.Asteroide;
import Bussines.Objetos.Cometa;
import Bussines.Planets.Estrella;
import Bussines.Planets.PlanetaJoviano;
import Bussines.Planets.PlanetaRocoso;
import java.util.ArrayList;

public class SistemaSolar {

    private ArrayList<Cometa> cometas = new ArrayList<Cometa>();
    private ArrayList<Estrella> Estrellas = new ArrayList<Estrella>();
    private ArrayList<Asteroide> asteroides = new ArrayList<Asteroide>();
    private ArrayList<PlanetaJoviano> planetasJovianos = new ArrayList<PlanetaJoviano>();
    private ArrayList<PlanetaRocoso> planetasRocosos = new ArrayList<PlanetaRocoso>();

    public void addCometa(Cometa cometa) {
        this.cometas.add(cometa);
    }

    public void addEstrella(Estrella estrella) {
        this.Estrellas.add(estrella);

    }

    public void addAsteroide(Asteroide asteroide) {
        this.asteroides.add(asteroide);

    }

    public ArrayList<Cometa> getCometas() {
        return cometas;
    }

    public ArrayList<Estrella> getEstrellas() {
        return Estrellas;
    }

    public ArrayList<Asteroide> getAsteroides() {
        return asteroides;
    }

    public void addJoviano(PlanetaJoviano planetaJoviano) {
        this.planetasJovianos.add(planetaJoviano);

    }

    public void addRocoso(PlanetaRocoso planetaRocoso) {
        this.planetasRocosos.add(planetaRocoso);

    }

    public ArrayList<PlanetaJoviano> getPlanetasJovianos() {
        return planetasJovianos;
    }

    public ArrayList<PlanetaRocoso> getPlanetasRocosos() {
        return planetasRocosos;
    }

}
