package hw_14_10_2020.container;

public class Main {
    public static void main(String[] args) {
        Cylinder cylyinder = new Cylinder(2, 4);
        Ball ball = new Ball(1);
        Box box = new Box(250);
        Pyramid pyramid = new Pyramid(100, 10);

        System.out.println(box.add(cylyinder));
        if (box.add(cylyinder) == false){
            System.out.println("There is not enough space in the box for the cylinder");
        } else {
            System.out.println("The cylinder is attached to the box");
        }

        System.out.println("");
        System.out.println(box.add(ball));
        if (box.add(ball) == false){
            System.out.println("There is not enough space in the box for the ball");
        } else {
            System.out.println("The ball is attached to the box");
        }

        System.out.println("");
        System.out.println(box.add(pyramid));
        if (box.add(pyramid) == false){
            System.out.println("There is not enough space in the box for the pyramid");
        } else {
            System.out.println("The pyramid is attached to the box");
        }
    }
}
