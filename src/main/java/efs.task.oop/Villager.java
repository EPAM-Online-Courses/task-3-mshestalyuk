
public class Villager implements Fighter{
    String name;
    double age;
    int health;
    Villager(){}
    Villager(String name, double age){
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    void sayHello(){
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old");
    }

    @Override
    public void attack(Fighter victim) {
        double damage = (100 - age * 0.5) / 10;
        int roundedDamage = (int) damage;
        victim.takeHit(roundedDamage);
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
    }
    public double getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
