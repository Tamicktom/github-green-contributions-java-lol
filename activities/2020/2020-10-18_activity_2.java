/**
 * Resolvendo bugs 🐛
 * Data: 18/10/2020
 * Commit #2
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

    private String currentActivity = "Resolvendo bugs 🐛";
    private String date = "18/10/2020";

    public void executeActivity() {
        System.out.println("Data: " + date);
        System.out.println("Atividade: " + currentActivity);
    }

    public static void main(String[] args) {
        DailyActivity activity = new DailyActivity();
        activity.executeActivity();
    }
}
