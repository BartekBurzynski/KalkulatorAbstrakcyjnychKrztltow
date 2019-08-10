public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Cirlce circle) {
      return 3.14 * Math.pow(circle.getRadius(),2);
    }

    @Override
    public double rectangleArea(Ractangle rectangle) {
        return rectangle.getFirsSide()* rectangle.getSecondSide();
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4*3.14*Math.pow(ball.getRadius(),2) ;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getEdge(),3);
    }
}
