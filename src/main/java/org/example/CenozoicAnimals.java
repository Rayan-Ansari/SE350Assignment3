// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the Cenozoic class is to initialize animals
// from this time period into 3 different cataegories
package org.example;

public class CenozoicAnimals {
    /** @implements the landanimal to then return the given animal and it's action*/
    static class Mammoth implements LandAnimal {
        public String Name()    { return "Mammoth"; }
        public String Walks() { return "stomping"; }
    }
    static class CaveLion implements LandAnimal {
        public String Name()    { return "Cave lion"; }
        public String Walks() { return "walking"; }
    }
    static class WoollyRhino implements LandAnimal {
        public String Name()    { return "Woolly rhino"; }
        public String Walks() { return "running"; }
    }
    /** @implements the SeaAnimal that then returns the given sea animal and it's action*/
    static class Otodus implements SeaAnimal {
        public String Name()     { return "Otodus"; }
        public String Swims() { return "hunting"; }
    }
    static class Whale implements SeaAnimal {
        public String Name()     { return "Whale"; }
        public String Swims() { return "swimming"; }
    }
    /** @implements the Skyanimal that then returns the given sky animal and it's action*/
    static class Argentavis implements SkyAnimal {
        public String Name()   { return "Argentavis"; }
        public String Flies() { return "flapping"; }
    }
}
