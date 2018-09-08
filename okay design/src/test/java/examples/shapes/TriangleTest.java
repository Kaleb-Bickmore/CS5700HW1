package examples.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void testValidConstruction() throws ShapeException {
        Point center = new Point(0,1);
        Triangle myTriangle = new Triangle(center,1,1,1);
        double[] compareArray={1,1,1};
        assertArrayEquals(compareArray, myTriangle.getSideLengths(),0);
        double [] compareArray2= {.5,.5,.5};
        myTriangle = new Triangle(center,.5,.5,.5);
        assertArrayEquals(compareArray2, myTriangle.getSideLengths(),0);
    }

    @Test
    public void testInvalidConstruction() throws ShapeException {
        try {
            new Triangle(new Point(1,1), 2.5,2.5, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 2.5,2.5, Double.NaN);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 2.5,2.5, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 2.5,Double.POSITIVE_INFINITY,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 2.5,Double.NaN,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 2.5, Double.NEGATIVE_INFINITY,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), Double.POSITIVE_INFINITY,2.5,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), Double.NaN,2.5,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), Double.NEGATIVE_INFINITY,2.5,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 2.5,0,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid triangle", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 2.5,2.5,0);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid triangle", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 0,2.5,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid triangle", e.getMessage());
        }
        try {
            new Triangle(new Point(1,1), 0,0,0);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid triangle", e.getMessage());
        }

    }

    @Test
    public void testComputeArea() throws ShapeException{
        Point center = new Point(1,1);
        Triangle myTriangle = new Triangle(center, 2,2,2);
        assertEquals(1.732,myTriangle.getArea(),0.001);
        myTriangle = new Triangle(center, 1.3, 2.5, 1.4);
        assertEquals(0.637, myTriangle.getArea(),0.001);
    }
    @Test
    public void testGetSideLengths() throws ShapeException{
        Point center = new Point(1,1);
        Triangle myTriangle= new Triangle(center, 2,2,2);
        double [] compareArray = {2,2,2};
        assertArrayEquals(compareArray,myTriangle.getSideLengths(),0);
        myTriangle= new Triangle(center,1.3,2.5,1.4);
        double [] compareArray2 = {1.3,2.5,1.4};
        assertArrayEquals(compareArray2,myTriangle.getSideLengths(),0);
    }
    @Test
    public void testSetSize() throws ShapeException {
        Point center = new Point(1,1);
        Triangle myTriangle= new Triangle(center, 2,2,2);
        myTriangle.setSize(1,1,1);
        double [] compareArray = {1,1,1};
        assertArrayEquals(compareArray,myTriangle.getSideLengths(),0);
        myTriangle.setSize(1.3,2.5,1.4);
        double [] compareArray2 = {1.3,2.5,1.4};
        assertArrayEquals(compareArray2,myTriangle.getSideLengths(),0);
        try {
            myTriangle.setSize( 2.5,2.5, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize( 2.5,2.5, Double.NaN);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize( 2.5,2.5, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize(2.5,Double.POSITIVE_INFINITY,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize(2.5,Double.NaN,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize(2.5, Double.NEGATIVE_INFINITY,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize( Double.POSITIVE_INFINITY,2.5,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize( Double.NaN,2.5,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize(Double.NEGATIVE_INFINITY,2.5,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid side", e.getMessage());
        }
        try {
            myTriangle.setSize(2.5,0,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid triangle", e.getMessage());
        }
        try {
            myTriangle.setSize( 2.5,2.5,0);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid triangle", e.getMessage());
        }
        try {
            myTriangle.setSize(0,2.5,2.5);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid triangle", e.getMessage());
        }
        try {
            myTriangle.setSize( 0,0,0);
            fail("Expected exception not thrown");
        } catch (ShapeException e) {
            assertEquals("Invalid triangle", e.getMessage());
        }

    }


}