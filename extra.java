import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class extra{


    public static void HoraActual(){
        LocalDateTime Actual = LocalDateTime.now();
        System.out.println(Actual);
    }

    public static void Cinco(){
        LocalDateTime cinco = LocalDateTime.of(2022, 12, 02, 10, 0, 0);
        System.out.println(cinco);
    }

    public static void DiferentesHoras(){
            LocalDateTime Fecha_Anterior = LocalDateTime.of(2021, 5, 14, 8, 27, 20);
            LocalDateTime Fecha_Posterior = LocalDateTime.of(2022, 10, 7, 5, 16, 40);

            System.out.println(Fecha_Anterior + "/n");
            System.out.println(Fecha_Posterior  + "/n");

            long diferente_horas = ChronoUnit.DAYS.between(Fecha_Anterior, Fecha_Posterior);

            System.out.println("Diferencia entre las dos horas" + diferente_horas);

    }

    public static void main(String[] args) {
        // HoraActual();
        // Cinco();
        // DiferentesHoras();
    }
}