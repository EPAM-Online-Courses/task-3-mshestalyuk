public abstract class Monster implements Fighter  {
    int health;
    int damage;
    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }
    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
