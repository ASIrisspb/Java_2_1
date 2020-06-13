package ASIris;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Object[] players = new Object[6];
        players[0] = new Human();
        players[1] = new Human();
        players[2] = new Cat();
        players[3] = new Cat();
        players[4] = new Robot();
        players[5] = new Robot();
        Difficulty[] difficulty = new Difficulty[4];
        difficulty[0] = new Wall(2);
        difficulty[1] = new Wall(4);
        difficulty[2] = new Treadmill(3);
        difficulty[3] = new Treadmill(5);

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < difficulty.length; j++) {
                difficulty[j].over(players[i]);
            }
        }
    }
}
