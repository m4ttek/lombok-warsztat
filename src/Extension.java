import lombok.experimental.ExtensionMethod;

/**
 * @author Mateusz Kamiński
 */
@ExtensionMethod(Extensions.class)
public class Extension {

    public static void main(String... args) {
        Worker worker = new Worker();
        worker.setName("Borsuk");
        worker.fly();
        Extensions.fly(worker);
    }

}

class Extensions {

    public static void fly(Worker worker) {
        System.out.println(worker.getName() + " is flying!");
    }
}


