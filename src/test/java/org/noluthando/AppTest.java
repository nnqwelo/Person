package org.noluthando;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import org.junit.Before;
        import org.junit.Ignore;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertSame;


public class AppTest
{

    private App a1;
    private App a2;
    private App a3 = a1;

    @Before
    public void beforeTest()
    {
        a1 = new App(2, "Noluthando" );
        a2 = new App(2, "Noluthando");
    }
    @Test
    public void equalsEqualityTest() throws Exception
    {
        assertEquals(a1, a2);
        assertEquals(a1, a3);
        assertEquals(a1, a3);
    }
    @Test
    public void equalsIdentityTest()
    {
        assertSame(a1, a2);
        assertSame(a1, a3);
        assertSame(a2, a3);
    }
    @Ignore
    @Test
    public void equalsDisableTest()
    {
        assertSame(a1, a2);
        assertSame(a1,a3);
        assertSame(a2,a3);
    }
    @Test(timeout = 900)
    public void timeoutTest() {
        while (true);
    }

}