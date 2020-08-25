package ASIris;

public class Wall implements Obstacle{
    public int high;

    public Wall(int high) {
        this.high = high;
    }

    @Override
    public void overcome(Moveable moveable) {
        moveable.jump(this.high);
    }
}
