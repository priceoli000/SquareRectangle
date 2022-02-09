public final class Square extends Rectangle{

    public Square(double sideLength) {
        //What goes here?
        super(sideLength, sideLength);
        this.length = sideLength;
        this.width = sideLength;
    }

    public double getSideLength(){
        return this.length;
    }

    public void setSideLength(double sideLength){
        //What goes here?
        this.length = sideLength;
        this.width = sideLength;
    }


}
