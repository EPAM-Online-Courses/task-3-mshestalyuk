public class Monsters {
    public static final Monster andariel = new AndarielMonster(10, 70);
    public static final Monster blacksmith = new BlacksmithMonster(100, 25);

    private static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();

    public static int getMonstersHealth() {
        return monstersHealth;
    }

    public static void setMonstersHealth(int health) {
        monstersHealth = health;
    }

    private static class AndarielMonster extends Monster {
        public AndarielMonster(int health, int damage) {
            super(health, damage);
        }

        @Override
        public void takeHit(int damage) {
            setHealth(getHealth() - damage);
            setMonstersHealth(getMonstersHealth() - damage);
        }

        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }
    }

    private static class BlacksmithMonster extends Monster {
        public BlacksmithMonster(int health, int damage) {
            super(health, damage);
        }

        @Override
        public void takeHit(int damage) {
            setHealth(getHealth() - (5 + damage));
            setMonstersHealth(getMonstersHealth() - (5 + damage));
        }

        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }
    }
}
