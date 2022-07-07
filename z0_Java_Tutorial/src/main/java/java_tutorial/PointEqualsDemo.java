package java_tutorial;

public class PointEqualsDemo {
    public static void main(String[] args) {
        java.awt.Point player = new java.awt.Point();
        player.x = player.y = 10;

        java.awt.Point door = new java.awt.Point();
        door.setLocation(10, 10);

        // Equals schaut, ob die Punktwerte übereinstimmen
        System.out.println(player.equals(door));
        System.out.println(door.equals(player));

        java.awt.Point snake = new java.awt.Point();
        snake.setLocation(20, 22);
        System.out.println(snake.equals(door));
    }
}
