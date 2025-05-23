//------------------------------------------------------
// Assignment (3)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the JurassicAnimalFactoryTest is to make sure
// the proper era and animals are expected whether it flies, walks, or swims
package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;


class JurassicAnimalFactoryTest {

    private final AnimalAbstractFactory f = new JurassicAnimalFactory();
    /** tests whether it's the correct era*/
    @Test
    void testEra() {
        assertEquals("Jurassic", f.getEra());
    }

    /** tests whether the animal is actually a land animal and if the actions
     * fits their given animal
     */
    @Test
    void testLandAnimals() {
        List<LandAnimal> land = f.createLandAnimals();
        assertEquals(3, land.size(), "Should be land animals");

        assertTrue(land.stream().anyMatch(a ->
                a.Name().equals("Stegosaurus") && a.Walks().equals("plodding")));
        assertTrue(land.stream().anyMatch(a ->
                a.Name().equals("Dilophosaurus") && a.Walks().equals("prowling")));
        assertTrue(land.stream().anyMatch(a ->
                a.Name().equals("Brachiosaurus") && a.Walks().equals("lumbering")));
    }
    /** tests whether the animal is actually a sea animal and if the actions
     * fits their given animal
     */
    @Test
    void testSeaAnimals() {
        List<SeaAnimal> sea = f.createSeaAnimals();
        assertEquals(2, sea.size(), "Should be 2 sea animals");

        assertTrue(sea.stream().anyMatch(a ->
                a.Name().equals("Plesiosaurus") && a.Swims().equals("paddling")));
        assertTrue(sea.stream().anyMatch(a ->
                a.Name().equals("Ichthyosaurus") && a.Swims().equals("darting")));
    }
    /** tests whether the animal is actually a sky animal and if the actions
     * fits their given animal
     */
    @Test
    void testSkyAnimals() {
        List<SkyAnimal> sky = f.createSkyAnimals();
        assertEquals(1, sky.size(), "Should be 1 sky animal");

        SkyAnimal a = sky.get(0);
        assertEquals("Pterodactylus", a.Name());
        assertEquals("gliding", a.Flies());
    }
}
