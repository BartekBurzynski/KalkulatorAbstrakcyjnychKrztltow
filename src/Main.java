import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(4);

        Cirlce cirlce = new Cirlce(3);

        Cube cube = new Cube(2);

        Ractangle ractangle = new Ractangle(6,3);



        ShapeCalculator shapeCalculator = new ShapeCalculator();
        LineCalc lineCalc = new LineCalc();

        System.out.println(shapeCalculator.ballVolume(ball));
        System.out.println(shapeCalculator.circleArea(cirlce));
        System.out.println(shapeCalculator.cubeVolume(cube));
        System.out.println(shapeCalculator.rectangleArea(ractangle));
        System.out.println(lineCalc.lineLength(lineCalc.line2D));

    }
    }


