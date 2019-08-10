public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Cirlce circle) {
      return Math.PI * Math.pow(circle.getRadius(),2);
    }

    @Override
    public double rectangleArea(Ractangle rectangle) {
        return rectangle.getFirsSide()* rectangle.getSecondSide();
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4/3*Math.PI*Math.pow(ball.getRadius(),3 );
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getEdge(),3);
    }
}
