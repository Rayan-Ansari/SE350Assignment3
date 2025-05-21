//------------------------------------------------------
// Assignment (3)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the Lazysingleton class is to not create an object until requested
package org.example;
public class LazySingleton {
    /** this holds the singleton once they've been made*/
    private static final LazySingleton[] INSTANCES = new LazySingleton[3];

    private final int id;
    /**
     *
     *
     * @param id the number of the slot being made
     */
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    /**
     * it returns the object into it's slot, and it constructs it
     * if it's the first  request
     *
     * @param id 0 ≤ id ≤ 2
     * @return   the lazy slot for that id has been made
     * @throws IllegalArgumentException if the object is outside 0-2
     */
    public static LazySingleton getInstance(int id) {
        if (id < 0 || id > 2) {
            throw new IllegalArgumentException("id must be 0-2");
        }
        if (INSTANCES[id] == null) {
            INSTANCES[id] = new LazySingleton(id);
        }
        return INSTANCES[id];
    }

    public int getId() {
        return id;
    }
}