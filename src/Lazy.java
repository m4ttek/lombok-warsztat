/**
 * @author Mateusz Kamiński
 */
public class Lazy {

    public static void main(String... args) {
        Worker borsuk = new WorkingWorker();
        borsuk.setName("Borsuk");
        borsuk.setPosition("Programmer");
        borsuk.setOccupation(Occupation.PROGRAMMER);

        System.out.println(borsuk.getName());
    }

}

class WorkingWorker extends Worker {

    private final double[] completedWork = work();

    private double[] work() {
        double[] result = new double[1000000000];
        for (int i = 0; i < result.length; i++) {
              result[i] = Math.asin(i);
        }
        return result;
    }

}
