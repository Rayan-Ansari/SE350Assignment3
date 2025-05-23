// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the Jurassic class is to initialize animals
// from this time period into 3 different cataegories
package org.example;

public class JurassicAnimals {
    /** @implements the landanimal to then return the given animal and it's action*/
    static class Stegosaurus implements LandAnimal {
        public String Name()    { return "Stegosaurus"; }
        public String Walks() { return "plodding"; }
    }
    static class Dilophosaurus implements LandAnimal {
        public String Name()    { return "Dilophosaurus"; }
        public String Walks() { return "prowling"; }
    }
    static class Brachiosaurus implements LandAnimal {
        public String Name()    { return "Brachiosaurus"; }
        public String Walks() { return "lumbering"; }
    }
    /** @implements the Seaanimal to then return the given animal and it's action*/
    static class Plesiosaurus implements SeaAnimal {
        public String Name()     { return "Plesiosaurus"; }
        public String Swims() { return "paddling"; }
    }
    static class Ichthyosaurus implements SeaAnimal {
        public String Name()     { return "Ichthyosaurus"; }
        public String Swims() { return "darting"; }
    }
    /** @implements the Skyanimal to then return the given animal and it's action*/
    static class Pterodactylus implements SkyAnimal {
        public String Name()   { return "Pterodactylus"; }
        public String Flies() { return "gliding"; }
    }
}
