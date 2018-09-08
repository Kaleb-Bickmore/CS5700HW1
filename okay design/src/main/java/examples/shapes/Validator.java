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

    public static void validateTriangle(Line firstLine, Line secondLine, Line thirdLine, String errorMessage)//...
            throws ShapeException{
        if(firstLine.computeLength()<secondLine.computeLength()+thirdLine.computeLength()||//...
                thirdLine.computeLength()< secondLine.computeLength()+firstLine.computeLength()||//...
                secondLine.computeLength()<thirdLine.computeLength()+firstLine.computeLength())
        {
            throw new ShapeException(errorMessage);
        }
    }
}
