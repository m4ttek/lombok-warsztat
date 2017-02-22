import lombok.experimental.var;
import lombok.val;

/**
 * JEP 286: Local-Variable Type Inference
 *
 * @author Mateusz Kamiński
 */
public class Val {

    public static void main(String... args) {
        val borsuk = new VeryLongWorkerTypeNameWorker();
        borsuk.setName(null);
        borsuk.setPosition("Programmer");
        borsuk.setOccupation(Occupation.PROGRAMMER);

        val borsuk2 = borsuk.clone();
        String card = String.join(" - ", borsuk2.getName(), borsuk2.getPosition());
        System.out.println(card);
    }

}

class VeryLongWorkerTypeNameWorker extends Worker implements Cloneable {

    @Override
    public VeryLongWorkerTypeNameWorker clone() {
        VeryLongWorkerTypeNameWorker veryLongWorkerTypeNameWorker = new VeryLongWorkerTypeNameWorker();
        veryLongWorkerTypeNameWorker.setName(this.getName());
        veryLongWorkerTypeNameWorker.setOccupation(this.getOccupation());
        return veryLongWorkerTypeNameWorker;
    }
}