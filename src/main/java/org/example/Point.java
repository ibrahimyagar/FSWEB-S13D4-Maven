package org.example;

public class Point {
    private int x;   // access modifier private olmalı
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter metodları
    public Integer getX() { // Test instanceOf(Integer.class) beklediği için Integer return ettim
        return x;
    }

    public Integer getY() {
        return y;
    }

    // (x,y) noktasına uzaklık
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Başka Point’e uzaklık
    public double distance(Point other) {
        return distance(other.x, other.y);
    }

    // Parametresiz distance -> (0,0)'a uzaklık
    public double distance() {
        return distance(0, 0);
    }
}
