package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    AXE(70, 0.9),
    BOW(40, 1.5);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public Integer getDamage() { // Test Integer.class bekliyor
        return damage;
    }

    public Double getAttackSpeed() { // Test Double.class bekliyor
        return attackSpeed;
    }
}
