public class Square extends Rectangle {


    Square() {

    }

    Square(double side) {
        super(side,side);
    }

    Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide(){
        return this.getLength();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        this.setSide(side);
    }

    public void setLength(double side){
        this.setSide(side);
    }

    public String toString() {
        return super.toString();
    }



}
