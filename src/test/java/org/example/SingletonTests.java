//------------------------------------------------------
// Assignment (3)
// Written by: (Rayan Ansari 2174698)
// For SES350 Section (631) – Spring 2025
//Purpose:  the purpose of the SingletonTests class is to tests to see whether the lazysdingleton and
// the easgersingleton follow through with id and slot returns.
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTests {


    @Test
    void eagerIdentityCheck() {
        EagerSingleton s0 = EagerSingleton.getInstance(0);
        EagerSingleton s1 = EagerSingleton.getInstance(1);
        EagerSingleton s2 = EagerSingleton.getInstance(2);

        /** the same id shoudl get the same object*/
        assertSame(s0, EagerSingleton.getInstance(0));
        assertSame(s1, EagerSingleton.getInstance(1));
        assertSame(s2, EagerSingleton.getInstance(2));

        /** differing id's should have differeing slots*/
        assertNotSame(s0, s1);
        assertNotSame(s0, s2);
        assertNotSame(s1, s2);
    }


    @Test
    void lazyIdentityCheck() {
        LazySingleton s0 = LazySingleton.getInstance(0);
        LazySingleton s1 = LazySingleton.getInstance(1);
        LazySingleton s2 = LazySingleton.getInstance(2);
        /** the same id shoudl get the same object*/
        assertSame(s0, LazySingleton.getInstance(0));
        assertSame(s1, LazySingleton.getInstance(1));
        assertSame(s2, LazySingleton.getInstance(2));
        /** differing id's should have differeing slots*/
        assertNotSame(s0, s1);
        assertNotSame(s0, s2);
        assertNotSame(s1, s2);
    }

/** both singletons cant acceept id's that arent between 0-2*/
    @Test
    void invalidIdThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> EagerSingleton.getInstance(3));
        assertThrows(IllegalArgumentException.class,
                () -> LazySingleton.getInstance(-1));
    }
}
