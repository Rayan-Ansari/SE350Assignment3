// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the JurassicAnimalFactory is to produce the different
// animals from the Jurassic era
package org.example;

import java.util.List;

public class JurassicAnimalFactory implements AnimalAbstractFactory {
    /**
     * @return the era
     */
    public String getEra() {
        return "Jurassic";
    }
    /**
     * @return a list of all the land animals
     */
    public List<LandAnimal> createLandAnimals() {
        return List.of(new JurassicAnimals.Stegosaurus(), new JurassicAnimals.Dilophosaurus(), new JurassicAnimals.Brachiosaurus());
    }
    /**
     * @return a list of all the Sea animals
     */
    public List<SeaAnimal> createSeaAnimals() {
        return List.of(new JurassicAnimals.Plesiosaurus(), new JurassicAnimals.Ichthyosaurus());
    }
    /**
     * @return a list of all the Sky animals
     */
    public List<SkyAnimal> createSkyAnimals() {
        return List.of(new JurassicAnimals.Pterodactylus());
    }
}
