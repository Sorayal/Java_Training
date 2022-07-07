package java_tutorial;

public class Distances {
    public static void main(String[] args) {
        java.awt.Point player = new java.awt.Point();
        player.setLocation(10, 10);

        java.awt.Point door = new java.awt.Point();
        door.setLocation(10, 10);

        java.awt.Point snake = new java.awt.Point();
        snake.setLocation(20, 10);

        System.out.println(player.distance(door));
        System.out.println(player.distance(snake));
        System.out.println(player.distance(snake.x, snake.y));
    }
}
