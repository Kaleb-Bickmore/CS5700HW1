package examples.shapes;

/**
 *  Square
 *
 *  This represents a square class that extends on the shape class.
 */
public class Square extends Shape {
    private Double height;

    /**
     *
     * @param center center of our square
     * @param height height of our square
     * @throws ShapeException throws exception if the height of the square is invalid
     */
    public Square(Point center, double height) throws ShapeException{
        super(center);
        Validator.validatePositiveDouble(height,"Invalid height");
        this.height = height;
    }

    /**
     *
     * @param x x coordinate of our square
     * @param y y coordinate of our square
     * @param height height of our square
     * @throws ShapeException throws exception if the height of the square is invalid
     */
    public Square(double x, double y, double height) throws ShapeException{
        super(new Point(x, y));
        Validator.validatePositiveDouble(height,"Invalid height");
        this.height = height;
    }

    /**
     *
     * @return Area of our square
     */
    public double getArea(){return height*height;}

    /**
     *
     * @return height of our square
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @param height The height that we will set for the square
     * @throws ShapeException throws exception if the height is invalid
     */
    public void setHeight(double height)throws ShapeException {
        Validator.validatePositiveDouble(height, "Invalid height");
        this.height = height;
    }
}
