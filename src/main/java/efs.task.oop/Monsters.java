public class Monsters {

    static final Monster andariel = new Monster(10, 70) {

        @Override
        public void attack(Fighter victim) {
            victim.takeHit(damage);
        }

        @Override
        public void takeHit(int damage) {
            health -= damage;
            monstersHealth -= damage;
        }
    };
    static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(damage);
        }

        @Override
        public void takeHit(int damage) {
            health -= damage + 5;
            monstersHealth -= damage + 5;
        }
    };

    static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();

    public static int getMonstersHealth() {
        return monstersHealth;
    }

    public static Monster getAndariel() {
        return andariel;
    }

    public static Monster getBlacksmith() {
        return blacksmith;
    }
}