public class Ractangle extends GeometricShape {
    private double firsSide;
    private double secondSide;

    public Ractangle(double firsSide, double secondSide) {
       this.firsSide = firsSide;
        this.secondSide = secondSide;
    }

    public double getFirsSide() {
        return firsSide;
    }

    public void setFirsSide(double firsSide) {
        this.firsSide = firsSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }
}
