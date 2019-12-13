/**
 * Implementando features ✨
 * Data: 12/12/2019
 * Commit #4
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

    private String currentActivity = "Implementando features ✨";
    private String date = "12/12/2019";

    public void executeActivity() {
        System.out.println("Data: " + date);
        System.out.println("Atividade: " + currentActivity);
    }

    public static void main(String[] args) {
        DailyActivity activity = new DailyActivity();
        activity.executeActivity();
    }
}
