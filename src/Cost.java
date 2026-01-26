//abstract class Shape{
//
//
//    //these are abstract methods
//    abstract  double area();
//
//
//    //abstract class can be constructor
//    public Shape(String color){
//        System.out.println("shape constructor called");
//        this.color = color;
//    }
//
//    //this is concrete method
//    public String getColor(){
//        return color;
//    }
//}
//
//Class Circle extends Shape{
//     double radius;
//
//     public Circle(String color,double radius){
//
//         super(color); //Calling SHAPE construcor
//         System.out.println("circle is called");
//         this.radius = radius;
//     }
//
//     @Override double area(){
//         return Math.PI * Math.pow(radius,2);
//    }
//
//    @Override public String toString(){
//         return "CIRCLE" + super.getColor() + "and arae is:" + area();
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Shape s1 = new Circle("12.3",2.2);
//
//        System.out.println(s1.toString());
//    }
//}
