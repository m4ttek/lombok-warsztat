import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Mateusz Kamiński
 */
public class GetterSetter {

    public static void main(String... args) {
        Worker borsuk = new Worker();
        borsuk.setName("Badger");
        borsuk.setPosition("Programmer");
        borsuk.setOccupation(Occupation.PROGRAMMER);

        String card = String.join(" - ", borsuk.getName(), borsuk.getPosition());
        System.out.println(card);

    }
}

@Getter
@Setter
@ToString
class Worker {
    // non null
    @NonNull
    protected String name;
    protected Occupation occupation;
    // deprecated
    // "Sup dawg, we heard you like annotations, so we put annotations in your annotations so you can annotate while you're annotating."
    @Getter(onMethod = @__(@Deprecated))
    protected String position;
    // no access!111
    @Getter(AccessLevel.PRIVATE)
    protected String salary;
}

enum Occupation {
    PROGRAMMER, WEBDEV, ARCHITECT
}
