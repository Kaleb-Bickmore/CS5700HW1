package examples.shapes;

public abstract class Shape {

    private Point center;

    public Shape(Point point) throws ShapeException {
        if (point==null)
            throw new ShapeException("Invalid center point");
        center = point;
    }
    /**
     * Move the Shape
     * @param deltaX            a delta change for the x-location of center of the circle
     * @param deltaY            a delta change for the y-location of center of the circle
     * @throws ShapeException   Exception thrown if either the delta x or y are not valid doubles
     */

    public void move(double deltaX, double deltaY) throws ShapeException {
        center.move(deltaX, deltaY);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
