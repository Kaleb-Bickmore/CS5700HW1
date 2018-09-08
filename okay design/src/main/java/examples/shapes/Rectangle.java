package examples.shapes;

public class Rectangle extends Square {
    private Point center;
    private double width;
    private double height;
    public Rectangle(Point center, double width, double height)throws ShapeException{
        super(center,height);
        Validator.validatePositiveDouble(width,"invalid width");
        this.width=width;
    }

    public double getArea(){return width*height;}

    public double getWidth() {

        return this.width;
    }

    public void setWidth(Double size) {
        this.width = size;

    }

    public void setSize(Double width, double height) {
        this.width = width;
        this.height = height;
    }


}
