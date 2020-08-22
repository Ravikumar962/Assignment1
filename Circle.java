public class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){

    }
    Circle(double radius){

    }
    public double getRadius(){
        return this.radius;
    }
    public double getarea(){
        return 3.14*radius*radius;
    }

}
