package efs.task.oop;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Zadanie 1
        Villager kashya = new Villager("Kashya", 30);
        Villager akara = new Villager("Akara", 40);
        Villager gheed = new Villager("Gheed", 50);
        Villager deckardCain = new Villager("Deckard Cain", 85);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);
        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();

        // Zadanie 2
        deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);

        deckardCain.sayHello();
        akara.sayHello();

        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;
        LinkedList<Villager> villagers = new LinkedList<>();

        villagers.add(kashya);
        villagers.add(gheed);
        villagers.add(warriv);
        villagers.add(flawia);

        LinkedList<Monster> monsters = new LinkedList<>();
        monsters.add(Monsters.getAndariel());
        monsters.add(Monsters.getBlacksmith());


        System.out.println("Monster health: " + Monsters.getMonstersHealth());
        while (Monsters.getMonstersHealth() > 0) {
            System.out.println("Aktualnie walczacy osadnik to " + villagers.peek().getName());
            villagers.peek().attack(monsters.peek());
            System.out.println("Monster health: " + Monsters.getMonstersHealth());
            if (monsters.peek().getHealth() <= 0) {
                monsters.pop();
                if (monsters.peek() == null) break;
            }
            monsters.peek().attack(villagers.peek());
            if (villagers.peek().getHealth() <= 0) {
                villagers.pop();
            }
        }
        System.out.println("Obozowisko ocalone!");

        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
        akara = (ExtraordinaryVillager) objectAkara;

        deckardCain.sayHello();
        akara.sayHello();
    }
}
