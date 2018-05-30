package zhuangshiqi;

public class ShapeDec implements Shape{
    protected Shape shapedec;
    public ShapeDec(Shape shapedec){
        this.shapedec = shapedec;
    }
    @Override
    public void draw() {
        shapedec.draw();
    }
}
