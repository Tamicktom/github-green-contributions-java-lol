/**
 * Fazendo code review 👀
 * Data: 30/01/2016
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

    private String currentActivity = "Fazendo code review 👀";
    private String date = "30/01/2016";

    public void executeActivity() {
        System.out.println("Data: " + date);
        System.out.println("Atividade: " + currentActivity);
    }

    public static void main(String[] args) {
        DailyActivity activity = new DailyActivity();
        activity.executeActivity();
    }
}
