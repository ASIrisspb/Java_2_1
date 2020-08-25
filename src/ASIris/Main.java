package ASIris;

public class Main {

    public static void main(String[] args) {

        //создаем массив участников
        Moveable[] players = {
	        new Cat(2,3),
            new Human(3,4),
            new Robot(6,7),
//            new Cat(5,6),
//            new Human(6,7),
//            new Robot(7,8)
        };

	    //массив препятствий
        Obstacle[] obstacles = {
	        new Wall(3),
            new Track(2),
            new Wall(6),
            new Track(7)
        };

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (players[i].isCompete()) {
                    obstacles[j].overcome(players[i]);
                }
            }
        }

    }
}
