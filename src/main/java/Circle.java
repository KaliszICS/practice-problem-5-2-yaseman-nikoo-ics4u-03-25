public class Circle{
    protected double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double diameter(){
        return this.radius*2;
    }
    public double perimeter(){
        return Math.PI*2*this.radius;
    }
    public double area(){
        return (Math.PI)*Math.pow(this.radius,2);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}