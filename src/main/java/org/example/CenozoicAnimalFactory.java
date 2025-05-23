// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the CenozoicAnimalFactory is to produce the different
// animals from the Cenozoic ers
package org.example;
import java.util.List;


public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    /**
     * @return the era
     */
    public String getEra() { return "Cenozoic"; }
    /**
     * @return a list of all the land animals
     */
    public List<LandAnimal> createLandAnimals() {
        return List.of(new CenozoicAnimals.Mammoth(), new CenozoicAnimals.CaveLion(), new CenozoicAnimals.WoollyRhino());
    }
    /**
     * @return a list of all the sea animals
     */
    public List<SeaAnimal> createSeaAnimals() {
        return List.of(new CenozoicAnimals.Otodus(), new CenozoicAnimals.Whale());
    }
    /**
     * @return a list of all the sky animals
     */
    public List<SkyAnimal> createSkyAnimals() {
        return List.of(new CenozoicAnimals.Argentavis());
    }
}
