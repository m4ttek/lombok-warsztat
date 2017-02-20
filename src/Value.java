import lombok.Getter;
import lombok.Setter;

/**
 * @author Mateusz Kamiński
 */
public class Value {

    public static void main(String... args) {
        BorsukWorker borsukWorker = new BorsukWorker();
        borsukWorker.setName("Badger");
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

@Setter
@Getter
class BorsukWorker {
    private String name;
    // zmienne?
    private String position;

    public BorsukWorker() {

    }

    public BorsukWorker(String name, String position) {
        this.name = name;
        this.position = position;
    }

}
