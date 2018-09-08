package examples.shapes;

public class Triangle extends Shape{
    private double firstSide;
    private double secondSide;
    private Double thirdSide;

    /**
     *
     * @param center
     * @param firstSide
     * @param secondSide
     * @param thirdSide
     * @throws ShapeException
     */
    public Triangle(Point center, double firstSide, double secondSide, double thirdSide ) throws ShapeException {
        super(center);
        Validator.validateTriangle(firstSide, secondSide,thirdSide,"invalid triangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = firstSide;
    }
    /**
     * This function uses Heron's formula to calculate the area of our triangle
     * @return area of the triangle
     */
    public double computeArea(){

        double s=(1/2)*(firstSide+secondSide+thirdSide);
        double area =Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
        return area;
    }

}
