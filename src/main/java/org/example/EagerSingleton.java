//------------------------------------------------------
// Assignment (3)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the Eagersingleton class is to create three objects at compile time
// happy and unhappy scenarios
package org.example;
public class EagerSingleton {

    private static final EagerSingleton[] INSTANCES = new EagerSingleton[3];

    static {
        for (int i = 0; i < 3; i++) {
            INSTANCES[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " instantiated");
        }
    }

    private final int id;
    /**
     * we made it priuvate to prevent it from creating more instances.
     *
     * @param id slot being made
     */
    private EagerSingleton(int id) {
        this.id = id;
    }
    /**
     * Returns one of three singleton objects in the slot needed.
     *
     * @param id 0 ≤ id ≤ 2
     * @return   the already built singleton for that id
     * @throws IllegalArgumentException if the singleton is outside 0-2
     */
    public static EagerSingleton getInstance(int id) {
        if (id < 0 || id > 2) {
            throw new IllegalArgumentException("id must be 0-2");
        }
        return INSTANCES[id];
    }

    public int getId() {
        return id;
    }
}

/**(ready for submission coment)*/