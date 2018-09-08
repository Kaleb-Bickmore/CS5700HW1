package examples.shapes;

public class Square extends Shape {
    private Point center;
    private Double height;
    public Square(Point center, double size) throws ShapeException{
        super(center);
        Validator.validatePositiveDouble(size,"Not a valid size");
        this.height = size;
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
     * @param size
     */
    public void setHeight(Double size) {
        this.height = size;
    }
}
