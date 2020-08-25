package ASIris;

public class Cat implements Moveable {
    private int maxJump;
    private int maxRun;
    private boolean compete = true;

    @Override
    public boolean isCompete() {
        return compete;
    }

    public Cat(int maxJump, int maxRun) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public void jump(int high) {
        if (this.maxJump >= high) {
            System.out.println("Cat is jumping..");
        } else {
            System.out.println("Cat can't continue..");
            this.compete = false;
        }
    }

    @Override
    public void run(int distance) {
        if (this.maxRun >= distance) {
            System.out.println("Cat is running..");
        } else {
            System.out.println("Cat can't continue..");
            this.compete = false;
        }
    }
}
