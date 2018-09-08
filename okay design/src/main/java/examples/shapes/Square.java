package examples.shapes;

public class Square extends Shape {
    private Double height;

    /**
     *
     * @param center
     * @param height
     * @throws ShapeException
     */
    public Square(Point center, double height) throws ShapeException{
        super(center);
        Validator.validatePositiveDouble(height,"Invalid height");
        this.height = height;
    }

    /**
     *
     * @param x
     * @param y
     * @param height
     * @throws ShapeException
     */
    public Square(double x, double y, double height) throws ShapeException{
        super(new Point(x, y));
        Validator.validatePositiveDouble(height,"Invalid height");
        this.height = height;
    }

    /**
     *
     * @return
     */
    public double getArea(){return height*height;}

    /**
     *
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(double height)throws ShapeException {
        Validator.validatePositiveDouble(height, "Invalid height");
        this.height = height;
    }
}
