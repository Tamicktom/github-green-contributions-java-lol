/**
 * Refatorando código 🔧
 * Data: 29/10/2019
 * Commit #3
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

    private String currentActivity = "Refatorando código 🔧";
    private String date = "29/10/2019";

    public void executeActivity() {
        System.out.println("Data: " + date);
        System.out.println("Atividade: " + currentActivity);
    }

    public static void main(String[] args) {
        DailyActivity activity = new DailyActivity();
        activity.executeActivity();
    }
}
