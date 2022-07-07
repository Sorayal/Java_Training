package java_tutorial;

public class PlayerAndDoorAsPoints {
    public static void main(String[] args) {
        java.awt.Point player = new java.awt.Point();
        player.x = player.y = 10;

        java.awt.Point door = new java.awt.Point();
        door.setLocation(10,100);

        // 90.0
        System.out.println(player.distance(door));
    }
}
