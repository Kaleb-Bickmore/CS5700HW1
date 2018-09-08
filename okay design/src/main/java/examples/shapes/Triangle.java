package examples.shapes;

/**
 *  Triangle
 *  This class represents a triangle that expands on the shape class.
 */
public class Triangle extends Shape{
    private double firstSide;
    private double secondSide;
    private Double thirdSide;

    /**
     *
     * @param center            the center of our triangle
     * @param firstSide         the length of one of our sides on the triangle
     * @param secondSide        the length of one of our sides on the triangle
     * @param thirdSide         the length of one of our sides on the triangle
     * @throws ShapeException   throws exception if one of the sides is invalid or if the sides
     *                          do not make a valid triangle
     */
    public Triangle(Point center, double firstSide, double secondSide, double thirdSide ) throws ShapeException {
        super(center);
        Validator.validatePositiveDouble(firstSide,"Invalid side");
        Validator.validatePositiveDouble(secondSide,"Invalid side");
        Validator.validatePositiveDouble(thirdSide,"Invalid side");
        Validator.validateTriangle(firstSide, secondSide,thirdSide,"Invalid triangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    /**
     *
     * @param x                 x coordinate of the triangle
     * @param y                 y coordinate of the triangle
     * @param firstSide         the length of one of our sides on the triangle
     * @param secondSide        the length of one of our sides on the triangle
     * @param thirdSide         the length of one of our sides on the triangle
     * @throws ShapeException   throws exception if one of the sides is invalid or if the sides
     *                          do not make a valid triangle
     */
    public Triangle(double x, double y, double firstSide, double secondSide, double thirdSide ) throws ShapeException {
        super(new Point(x,y));
        Validator.validatePositiveDouble(firstSide,"Invalid side");
        Validator.validatePositiveDouble(secondSide,"Invalid side");
        Validator.validatePositiveDouble(thirdSide,"Invalid side");
        Validator.validateTriangle(firstSide, secondSide,thirdSide,"Invalid triangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    /**
     * This function uses Heron's formula to calculate the area of our triangle
     * @return area of the triangle
     */
    public double getArea(){
        double s=(firstSide+secondSide+thirdSide)/2;
        return Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
    }

    /**
     *
     * @param firstSide         the length of one of our sides on the triangle we will set
     * @param secondSide        the length of one of our sides on the triangle we will set
     * @param thirdSide         the length of one of our sides on the triangle we will set
     * @throws ShapeException   throws exception if one of the sides is invalid or if the sides
     *                          do not make a valid triangle
     */
    public void setSize(double firstSide, double secondSide, double thirdSide)throws ShapeException{
        Validator.validatePositiveDouble(firstSide,"Invalid side");
        Validator.validatePositiveDouble(secondSide,"Invalid side");
        Validator.validatePositiveDouble(thirdSide,"Invalid side");
        Validator.validateTriangle(firstSide, secondSide,thirdSide,"Invalid triangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    /**
     *  Gives the side lengths in an array
     * @return array of side lengths of the triangle
     */
    public double[] getSideLengths(){
        double[] arrayOfSideLengths ={firstSide,secondSide,thirdSide};
        return arrayOfSideLengths;
    }
}
