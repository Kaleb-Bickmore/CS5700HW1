package examples.shapes;

public class Rectangle extends Square {
    private double width;
    public Rectangle(Point center,double height, double width)throws ShapeException{
        super(center,height);
        Validator.validatePositiveDouble(width,"Invalid width");
        this.width=width;
    }
    public Rectangle(double x, double y,double height, double width)throws ShapeException{
        super(x,y,height);
        Validator.validatePositiveDouble(width,"Invalid width");
        this.width=width;
    }

    public double getArea(){return width*this.getHeight();}

    public double getWidth() {

        return this.width;
    }

    public void setWidth(Double width) throws ShapeException {
        Validator.validatePositiveDouble(width, "Invalid width");
        this.width = width;

    }

    public void setSize(Double width, double height) throws ShapeException{
        Validator.validatePositiveDouble(width,"Invalid width");
        this.width = width;
        this.setHeight(height);
    }


}
