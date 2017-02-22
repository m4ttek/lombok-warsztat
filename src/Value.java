import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.NonFinal;

/**
 * @author Mateusz Kamiński
 */
public class Value {

    public static void main(String... args) {
        BorsukWorker borsukWorker = new BorsukWorker("Borsuk", "Programmer");
        borsukWorker.setPosition("Programmer");

        // 1.
        System.out.println(borsukWorker);
        // 2.
        System.out.println(checkIfRealBorsuk(borsukWorker));
    }

    public static boolean checkIfRealBorsuk(BorsukWorker worker) {
        return new BorsukWorker("Borsuk", "Programmer").equals(worker);
    }
}

@lombok.Value
class BorsukWorker {
    private String name;
    // zmienne?
    @NonFinal
    @Setter
    private String position;

}
