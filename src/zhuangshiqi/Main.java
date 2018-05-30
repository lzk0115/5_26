package zhuangshiqi;

public class Main {
    public static void main(String argv[]){
        Shape circle = new Cricle();
        circle.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();
        Shape redCircle = new RedShape(new Cricle());
        redCircle.draw();
    }
}
