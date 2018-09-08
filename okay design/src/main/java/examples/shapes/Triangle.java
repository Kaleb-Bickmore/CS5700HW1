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
     * @param firstSide
     * @param secondSide
     * @param thirdSide
     * @throws ShapeException
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
