package ASIris;

public class Treadmill extends Difficulty {
    public int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void over(Object o) {
        if (o instanceof Cat) {
            if (((Cat) o).maxRun >= length) System.out.println("Success run!");
            else System.out.println("Fail run");
        }
        if (o instanceof Human) {
            if (((Human) o).maxRun >= length) System.out.println("Success run!");
            else System.out.println("Fail run");
        }
        if (o instanceof Robot) {
            if (((Robot) o).maxRun >= length) System.out.println("Success run!");
            else System.out.println("Fail run");

        }
    }
}
