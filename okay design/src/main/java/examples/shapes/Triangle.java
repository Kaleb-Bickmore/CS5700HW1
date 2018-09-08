package examples.shapes;

public class Triangle extends Shape{
    private Line firstLine;
    private Line secondLine;
    private Line thirdLine;

    /**
     * @param center center of the triangle
     * @param firstPoint this is one of the points on the triangle
     * @param secondPoint this is one of the points on the triangle
     * @param thirdPoint this is one of the points on the triangle
     * @throws ShapeException
     */
    public Triangle(Point center, Point firstPoint, Point secondPoint, Point thirdPoint ) throws ShapeException {
        super(center);
        Validator.validateTriangle(new Line(firstPoint, secondPoint),new Line(secondPoint, thirdPoint),
                new Line(thirdPoint, firstPoint),"Invalid points for triangle");
        this.firstLine = new Line(firstPoint, secondPoint);
        this.secondLine = new Line(secondPoint, thirdPoint);
        this.thirdLine = new Line(thirdPoint, firstPoint);
    }
    /**
     * This function uses Heron's formula to calculate the area of our triangle
     * @return area of the triangle
     */
    public double computeArea(){

        double s=(1/2)*(firstLine.computeLength()+secondLine.computeLength()+thirdLine.computeLength());
        double area =Math.sqrt(s*(s-firstLine.computeLength())*(s-secondLine.computeLength())*(s-thirdLine.computeLength()));
        return area;
    }

}
