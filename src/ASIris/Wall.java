package ASIris;

public class Wall extends Difficulty {

    public int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void over(Object o) {
        if (o instanceof Cat) {
            if (((Cat) o).maxJump >= height) System.out.println("Success run!");
            else System.out.println("Fail run");
        }
        if (o instanceof Human) {
            if (((Human) o).maxJump >= height) System.out.println("Success run!");
            else System.out.println("Fail run");
        }
        if (o instanceof Robot) {
            if (((Robot) o).maxJump >= height) System.out.println("Success run!");
            else System.out.println("Fail run");
        }
    }
}
