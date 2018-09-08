package examples.shapes;

/**
 *  Rectangle
 *
 *  This class represents a rectangle. This class expands on the square class and implements new methods.
 */
public class Rectangle extends Square {

    private double width;

    /**
     *
     * @param center center position of the rectangle
     * @param height height of the rectangle
     * @param width width of the rectangle
     * @throws ShapeException throws exception if either height or width are invalid
     */
    public Rectangle(Point center,double height, double width)throws ShapeException{
        super(center,height);
        Validator.validatePositiveDouble(width,"Invalid width");
        this.width=width;
    }

    /**
     *
     * @param x x coordinate of the recctangle's position
     * @param y y coordinate of the recctangle's position
     * @param height height of the rectangle
     * @param width width of the rectangle
     * @throws ShapeException throws exception if either height or width are invalid
     */
    public Rectangle(double x, double y,double height, double width)throws ShapeException{
        super(x,y,height);
        Validator.validatePositiveDouble(width,"Invalid width");
        this.width=width;
    }

    /**
     *
     * @return area of the rectangle
     */
    public double getArea(){return width*this.getHeight();}

    /**
     *
     * @return width of the rectangle
     */
    public double getWidth() {

        return this.width;
    }

    /**
     *
     * @param width Some positive number that is what we will set the width of the rectangle to.
     * @throws ShapeException throws exception if the width is invalid
     */
    public void setWidth(double width) throws ShapeException {
        Validator.validatePositiveDouble(width, "Invalid width");
        this.width = width;

    }

    /**
     *
     * @param height height of the rectangle
     * @param width width of the rectangle
     * @throws ShapeException throws exception if either height or width are invalid
     */
    public void setSize(double height, double width) throws ShapeException{
        Validator.validatePositiveDouble(width,"Invalid width");
        this.width = width;
        this.setHeight(height);
    }


}
