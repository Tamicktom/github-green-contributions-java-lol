/**
 * Estudando programação 💻
 * Data: 05/09/2015
 * Commit #1
 */

public class DailyActivity {

    private String[] activities = {
        "Implementando padrões de projeto",
        "Corrigindo exceptions e logs",
        "Otimizando queries JPA/Hibernate",
        "Escrevendo testes JUnit",
        "Refatorando código Spring Boot",
        "Implementando APIs RESTful"
    };

    private String currentActivity = "Estudando programação 💻";
    private String date = "05/09/2015";

    public void executeActivity() {
        System.out.println("Data: " + date);
        System.out.println("Atividade: " + currentActivity);
    }

    public static void main(String[] args) {
        DailyActivity activity = new DailyActivity();
        activity.executeActivity();
    }
}
