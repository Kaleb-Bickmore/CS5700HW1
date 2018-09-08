package examples.shapes;

public class Validator {
    public static void validateDouble(double value, String errorMessage) throws ShapeException {
        if (Double.isInfinite(value) || Double.isNaN(value))
            throw new ShapeException(errorMessage);
    }

    public static void validatePositiveDouble(double value, String errorMessage) throws ShapeException {
        validateDouble(value, errorMessage);
        if (value<0)
            throw new ShapeException(errorMessage);
    }

    public static void validateTriangle(double firstSide, double secondSide, double thirdSide, String errorMessage)//...
            throws ShapeException{
        if(firstSide >= secondSide+thirdSide|| thirdSide >= secondSide+firstSide||secondSide >= thirdSide+firstSide)
        {
            throw new ShapeException(errorMessage);
        }
    }
}
