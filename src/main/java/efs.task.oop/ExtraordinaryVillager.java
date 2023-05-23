package efs.task.oop;
public class ExtraordinaryVillager extends Villager{
    private final Skill skill;
    public enum Skill{
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");
        private final String description;

        Skill(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old. " + skill.getDescription());
    }
    @Override
    public void attack(Fighter victim) {
        // ExtraordinaryVillager does not deal any damage
    }

    @Override
    public void takeHit(int damage) {
        setHealth(0); // ExtraordinaryVillager dies from a single hit
    }
    
}
