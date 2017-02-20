/**
 * JEP 286: Local-Variable Type Inference
 *
 * @author Mateusz Kamiński
 */
public class Val {

    public static void main(String... args) {
        VeryLongWorkerTypeNameWorker borsuk = new VeryLongWorkerTypeNameWorker();
        borsuk.setName(null);
        borsuk.setPosition("Programmer");
        borsuk.setOccupation(Occupation.PROGRAMMER);

        VeryLongWorkerTypeNameWorker borsuk2 = borsuk.clone();
        String card = String.join(" - ", borsuk2.getName(), borsuk2.getPosition());
        System.out.println(card);
    }

}

class VeryLongWorkerTypeNameWorker extends Worker implements Cloneable {

    @Override
    public VeryLongWorkerTypeNameWorker clone() {
        VeryLongWorkerTypeNameWorker veryLongWorkerTypeNameWorker = new VeryLongWorkerTypeNameWorker();
        veryLongWorkerTypeNameWorker.setName(veryLongWorkerTypeNameWorker.getName());
        veryLongWorkerTypeNameWorker.setOccupation(veryLongWorkerTypeNameWorker.getOccupation());
        return veryLongWorkerTypeNameWorker;
    }
}