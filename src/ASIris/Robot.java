package ASIris;

public class Robot implements Moveable {
    private int maxJump;
    private int maxRun;
    private boolean compete = true;

    public Robot(int maxJump, int maxRun) {
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
            System.out.println("Robot is jumping..");
        } else {
            System.out.println("Robot can't continue..");
            this.compete = false;
        }
    }

    @Override
    public void run(int distance) {
        if (this.maxRun >= distance) {
            System.out.println("Robot is running..");
        } else {
            System.out.println("Robot can't continue..");
            this.compete = false;
        }
    }
}
