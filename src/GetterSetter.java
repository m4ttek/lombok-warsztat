import lombok.Getter;
import lombok.Setter;

/**
 * @author Mateusz Kamiński
 */
public class GetterSetter {

    public static void main(String... args) {
        Worker borsuk = new Worker();
        borsuk.setName(null);
        borsuk.setPosition("Programmer");
        borsuk.setOccupation(Occupation.PROGRAMMER);

        String card = String.join(" - ", borsuk.getName(), borsuk.getPosition(), borsuk.getSalary());
        System.out.println(card);

    }
}

@Getter
@Setter
class Worker {
    // non null
    protected String name;
    private Occupation occupation;
    // deprecated
    // "Sup dawg, we heard you like annotations, so we put annotations in your annotations so you can annotate while you're annotating."
    private String position;
    // no access!
    private String salary;
}

enum Occupation {
    PROGRAMMER, WEBDEV, ARCHITECT
}
