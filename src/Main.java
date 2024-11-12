// Interfejs Quest, który zawiera metodę execute()
interface Quest {
    void execute();
}

class DragonSlayerQuest implements Quest {
    public void execute() {
        System.out.println("Rycerz wykonał zadanie: Pokonanie smoka.");
    }
}

class TreasureHunterQuest implements Quest {
    public void execute() {
        System.out.println("Rycerz wykonał zadanie: Znalezienie skarbu.");
    }
}

// Klasa Knight, która przyjmuje różne zadania i wykonuje je
class Knight {
    private Quest quest;

    // Konstruktor przyjmujący zadanie implementujące interfejs Quest
    public Knight(Quest quest) {
        this.quest = quest;
    }

    // Metoda wywołująca metodę execute() przekazanego zadania
    public void beginQuest() {
        quest.execute();
    }
}

// Główna klasa programu
public class Main {
    public static void main(String[] args) {
        // Tworzenie różnych zadań
        Quest dragonSlayerQuest = new DragonSlayerQuest();
        Quest treasureHunterQuest = new TreasureHunterQuest();

        // Przekazanie zadań rycerzowi i wykonanie ich
        Knight knight1 = new Knight(dragonSlayerQuest);
        knight1.beginQuest();

        Knight knight2 = new Knight(treasureHunterQuest);
        knight2.beginQuest();
    }
}