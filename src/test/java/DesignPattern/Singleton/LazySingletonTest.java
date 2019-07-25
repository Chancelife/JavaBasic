package DesignPattern.Singleton;


import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingletonTest {
    @Test
    public void getInstanceTest() {
        LazySingleton obj = LazySingleton.getInstance();
        assertTrue("Object from getInstance() is null!", obj!=null);
    }
}
