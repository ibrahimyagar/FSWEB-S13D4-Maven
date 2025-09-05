package org.example;

public class Main {
    public static void main(String[] args) {
        // Point test
        Point p1 = new Point(6, 5);
        Point p2 = new Point(3, 1);

        System.out.println("distance(0,0)= " + p1.distance());
        System.out.println("distance(p2)= " + p1.distance(p2));
        System.out.println("distance(2,2)= " + p1.distance(2, 2));

        // Player test
        Player player = new Player("John", 100, Weapon.SWORD);
        System.out.println("Player health: " + player.healthRemaining());

        player.loseHealth(20);
        System.out.println("After damage health: " + player.healthRemaining());

        player.restoreHealth(15);
        System.out.println("After restore health: " + player.healthRemaining());
    }
}
