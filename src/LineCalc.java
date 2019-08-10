public class LineCalc {
    Line2D line2D = new Line2D(2,3,1,6);
            double lineLength (Line2D line2D){
              double a = Math.pow(line2D.getX1()-line2D.getX2(),2);
              double b = Math.pow(line2D.getY1()-line2D.getY2(),2);
              return Math.sqrt(a+b);

            }


    @Override
    public String toString() {
        return "Linia = " + line2D;
    }
}
