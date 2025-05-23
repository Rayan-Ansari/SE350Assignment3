// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the AnimalAbstractFactory is to produce the different
// animals from each era
package org.example;

import java.util.List;

public interface AnimalAbstractFactory {
    /**
     * @return the era the animal is in
     */
    String getEra();
    /**
     * Create all the land animals for the era
     *@return a list of landanimals that will then be iterated through
     * to select the landanimals
     */
    List<LandAnimal> createLandAnimals();
    /**
     * Create all the sea animals for the era
     *@return a list of seaanimals that will then be iterated through
     * to select the seaanimals
     */
    List<SeaAnimal>  createSeaAnimals();
    /**
     * Create all the sea animals for the era
     *@return a list of seaanimals that will then be iterated through
     * to select the seaanimals
     */
    List<SkyAnimal>  createSkyAnimals();
}
