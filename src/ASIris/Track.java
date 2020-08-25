package ASIris;

public class Track implements Obstacle {
    public int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Moveable moveable) {
        moveable.run(this.length);
    }
}
