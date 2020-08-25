package ASIris;

public class Human implements Moveable {
    private int maxJump;
    private int maxRun;
    private boolean compete = true;

    public Human(int maxJump, int maxRun) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public boolean isCompete() {
        return compete;
    }

    @Override
    public void jump(int high) {
        if (this.maxJump >= high) {
            System.out.println("Human is jumping..");
        } else {
            System.out.println("Human can't continue..");
            this.compete = false;
        }
    }

    @Override
    public void run(int distance) {
        if (this.maxRun >= distance) {
            System.out.println("Human is running..");
        } else {
            System.out.println("Human can't continue..");
            this.compete = false;
        }
    }
}
