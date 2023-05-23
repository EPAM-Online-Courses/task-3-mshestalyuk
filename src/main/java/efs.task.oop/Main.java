public class Main {
    public static void main(String[] args) throws Exception {
        // Zadanie 1
        Villager v1 = new Villager("Kashya", 30);
        v1.SayHello();
        Villager v3 = new Villager("Gheed", 50);
        v3.SayHello();
        Villager v5 = new Villager("Warriv", 35);
        v5.SayHello();
        Villager v6 = new Villager("Flawia", 25);
        v6.SayHello();

        // Zadanie 2
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);

        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;

        // Bitwa
        while (Monsters.getMonstersHealth() > 0) {
            // Atak osadnika na potwora
            if(v1.getHealth() > 0)
            v1.attack(Monsters.andariel);
            if(v3.getHealth() > 0)
            v3.attack(Monsters.andariel);
            if(v5.getHealth() > 0)
            v5.attack(Monsters.blacksmith);
            if(v6.getHealth() > 0)
            v6.attack(Monsters.blacksmith);

            if(Monsters.andariel.getHealth() >= 0)
                Monsters.andariel.attack(v1);
            if(Monsters.andariel.getHealth() >= 0)
                Monsters.andariel.attack(v3);
            if(Monsters.blacksmith.getHealth() >= 0)
                Monsters.blacksmith.attack(v5);
            if(Monsters.blacksmith.getHealth() >= 0)
                Monsters.blacksmith.attack(v6);

                if (v1.getHealth() <= 0 && v3.getHealth() <= 0  && v5.getHealth() <= 0  && v6.getHealth() <= 0)  {
                System.out.println("Osadnicy martwi, zakończ bitwę");
                break;
            }
        }

        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
        akara = (ExtraordinaryVillager) objectAkara;

        deckardCain.SayHello();
        akara.SayHello();

        if (Monsters.getMonstersHealth() <= 0) {
            System.out.println("Obozowisko ocalone!");
        }
    }
}
