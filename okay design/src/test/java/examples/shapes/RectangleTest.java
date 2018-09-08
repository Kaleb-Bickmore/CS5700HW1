package examples.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void testValidConstruction() throws ShapeException {
        Point center = new Point(1,2);
        Rectangle myRectangle = new Rectangle(center, 5, 7);
        assertEquals(7, myRectangle.getWidth(), 0);
        myRectangle = new Rectangle(1.3, 2.6, 2.5, 7.3);
        assertEquals(7.3, myRectangle.getWidth(), 0);
    }

    @Test
    public void testInvalidConstruction() throws Exception {

        try {
            new Rectangle( new Point(1, 2),1, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid width", e.getMessage());
        }

        try {
            new Rectangle(new Point(1, 2), 1,Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid width", e.getMessage());
        }

        try {
            new Rectangle(new Point(1, 2), 1,Double.NaN);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid width", e.getMessage());
        }

    }

    @Test
    public void testGetArea() throws ShapeException {
        Point center = new Point(2,1);
        Rectangle myRectangle = new Rectangle(center, 5,5);
        assertEquals(25,myRectangle.getArea(),0);
        Rectangle newRectangle = new Rectangle(center, 6.43,7.49);
        assertEquals(48.1607,newRectangle.getArea(),0.0001);

    }

    @Test
    public void testGetWidth() {
    }

    @Test
    public void testSetWidth() {
    }

    @Test
    public void testSetSize() {
    }
}