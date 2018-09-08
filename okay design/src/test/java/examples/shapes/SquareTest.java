package examples.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void testValidConstruction() throws ShapeException {
        Point center = new Point(1,2);
        Square mySquare = new Square(center, 5);
        assertEquals(5, mySquare.getHeight(), 0);
        mySquare = new Square(1.3, 2.6, 2.5);
        assertEquals(2.5, mySquare.getHeight(), 0);
    }

    @Test
    public void testInvalidConstruction() throws Exception {

        try {
            new Square( new Point(1, 2), Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid height", e.getMessage());
        }

        try {
            new Square(new Point(1, 2), Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid height", e.getMessage());
        }

        try {
            new Square(new Point(1, 2), Double.NaN);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid height", e.getMessage());
        }

    }

    @Test
    public void testGetArea() throws ShapeException {
        Point center = new Point(2,1);
        Square mySquare = new Square(center, 5);
        assertEquals(25,mySquare.getArea(),0);
        Square newSquare = new Square(center, 6.43);
        assertEquals(41.3449,newSquare.getArea(),0.0001);

    }

    @Test
    public void testGetHeight() throws ShapeException{
        Point center = new Point(2,1);
        Square mySquare = new Square(center, 5);
        assertEquals(5,mySquare.getHeight(),0);
        Square newSquare = new Square(center, 6.43);
        assertEquals(6.43,newSquare.getHeight(),0);
    }

    @Test
    public void testSetHeight() throws ShapeException{
        Point center = new Point(2,1);
        Square mySquare = new Square(center, 5);
        mySquare.setHeight(6);
        assertEquals(6,mySquare.getHeight(),0);
        mySquare.setHeight(6.43);
        assertEquals(6.43,mySquare.getHeight(),0);
        try{
            mySquare.setHeight(Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid height", e.getMessage());
        }
        try{
            mySquare.setHeight(Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid height", e.getMessage());
        }
        try{
            mySquare.setHeight(Double.NaN);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid height", e.getMessage());
        }
    }
}