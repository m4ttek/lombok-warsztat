/**
 * @author Mateusz Kamiński
 */
public class Extension {

    public static void main(String... args) {
        Worker worker = new Worker();
        worker.setName("Borsuk");
        // worker.fly();
    }

}

class Extensions {

    public static void fly(Worker worker) {
        System.out.println(worker.getName() + " is flying!");
    }
}


