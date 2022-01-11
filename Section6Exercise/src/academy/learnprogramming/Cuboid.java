package academy.learnprogramming;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(this.height < 0) {
            this.height = 0;
        } else{
            this.height = height;
        }
    }

    public double getHeight() {
        if(this.height < 0) {
            return 0;
        } else{
            return this.height ;
        }
    }

    public double getVolume() {
        return (getArea() * this.getHeight());
    }
}