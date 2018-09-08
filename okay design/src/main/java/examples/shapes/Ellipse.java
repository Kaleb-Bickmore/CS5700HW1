package examples.shapes;

public class Ellipse extends Circle {

    private double yAxisRadius;

    /**
     *
     * @param x
     * @param y
     * @param xAxisRadius
     * @param yAxisRadius
     * @throws ShapeException
     */
    public Ellipse(double x, double y, double xAxisRadius, double yAxisRadius) throws ShapeException {
        super(new Point(x,y),xAxisRadius);
        Validator.validatePositiveDouble(yAxisRadius, "Invalid yAxisRadius");
        this.yAxisRadius = yAxisRadius;
    }

    /**
     *
     * @param center
     * @param xAxisRadius
     * @param yAxisRadius
     * @throws ShapeException
     */
    public Ellipse(Point center,  double xAxisRadius, double yAxisRadius) throws ShapeException {
        super(center,xAxisRadius);
        Validator.validatePositiveDouble(yAxisRadius, "Invalid yAxisRadius");
        this.yAxisRadius = yAxisRadius;
    }

    /**
     *
     * @return
     */
    public double getYAxisRadius() {
        return yAxisRadius;
    }

    /**
     *
     * @param yAxisRadius
     */
    public void setYAxisRadius(double yAxisRadius) throws ShapeException {
        Validator.validatePositiveDouble(yAxisRadius,"Invalid yAxisRadius");
        this.yAxisRadius = yAxisRadius;
    }

    /**
     *
     * @param xAxisRadius
     * @param yAxisRadius
     */
    public void setAllRadius(double xAxisRadius, double yAxisRadius) throws ShapeException{
        Validator.validatePositiveDouble(yAxisRadius, "Invalid yAxisRadius");
        this.yAxisRadius = yAxisRadius;
        this.setXAxisRadius(xAxisRadius);
    }
    public void scale(double scaleFactor) throws ShapeException {
        Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        this.setXAxisRadius(this.getXAxisRadius()*scaleFactor);
        this.yAxisRadius *= scaleFactor;
    }

    /**
     * @return  The area of the ellipse.
     */
    public double computeArea() {
        return Math.PI * this.getXAxisRadius() * this.yAxisRadius;
    }
}