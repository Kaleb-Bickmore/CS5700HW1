package examples.shapes;

public class Ellipse extends Shape {

    private double xAxisRadius;
    private double yAxisRadius;

    public Ellipse(double x, double y, double xAxisRadius, double yAxisRadius) throws ShapeException {
        super(new Point(x,y));
        Validator.validatePositiveDouble(xAxisRadius, "Invalid x axis radius radius");
        Validator.validatePositiveDouble(yAxisRadius, "Invalid y axis radius");
        this.xAxisRadius = xAxisRadius;
        this.yAxisRadius = yAxisRadius;
    }

    public Ellipse(Point center,  double xAxisRadius, double yAxisRadius) throws ShapeException {
        super(center);
        Validator.validatePositiveDouble(xAxisRadius, "Invalid x axis radius radius");
        Validator.validatePositiveDouble(yAxisRadius, "Invalid y axis radius");
        this.xAxisRadius = xAxisRadius;
        this.yAxisRadius = yAxisRadius;
    }
    public double getxAxisRadius() {
        return xAxisRadius;
    }

    public void setxAxisRadius(double xAxisRadius) {
        this.xAxisRadius = xAxisRadius;
    }
    public double getyAxisRadius() {
        return yAxisRadius;
    }

    public void setyAxisRadius(double yAxisRadius) {
        this.yAxisRadius = yAxisRadius;
    }
}