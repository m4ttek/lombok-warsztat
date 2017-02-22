import lombok.NonNull;

/**
 * @author Mateusz Kamiński
 */
public class Delegate {

    public static void main(String... args) {
        FinalWorker finalWorker = new FinalWorker();
        finalWorker.setName("Borsuk");

        Borsuk borsuk = new Borsuk(finalWorker);
        System.out.println(finalWorker.getName());
        System.out.println(borsuk.getName());
    }

}

class Borsuk {

    @lombok.experimental.Delegate
    private FinalWorker finalWorker;


    public Borsuk(FinalWorker finalWorker) {
        this.finalWorker = finalWorker;
    }

}

/**
 * Nie możemy tej klasy rozszerzyć, a chcielibyśmy...
 */
final class FinalWorker extends Worker {

}
