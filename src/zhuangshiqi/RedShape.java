package zhuangshiqi;

public class RedShape extends ShapeDec{
    public RedShape(Shape shapedec) {
        super(shapedec);
    }

    @Override
    public void draw() {
        setRed();
        super.draw();
    }
    public static void setRed(){
        System.out.println("red");
    }
}
