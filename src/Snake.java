import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author Mateusz Kamiński
 */
public class Snake {

    public static void main(String... args) {
        System.out.println(getHoneyBadgerWithoutSnakes());
        // 1.
        System.out.println(getHoneyBadgerWithSnakes());
        // 2.
        System.out.println(getHoneyBadgerWithBuilder());
    }

    static HoneyBadger getHoneyBadgerWithoutSnakes() {
        HoneyBadger honeyBadger = new HoneyBadger();
        honeyBadger.setName("Borsuk");
        honeyBadger.setSnakesEaten(0);
        return honeyBadger;
    }


    static HoneyBadger getHoneyBadgerWithSnakes() {
        return getHoneyBadgerWithoutSnakes()
                .setSnakesEaten(100);
    }



    static HoneyBadger getHoneyBadgerWithBuilder() {
        return getHoneyBadgerWithoutSnakes()
                .toBuilder()
                .snakesEaten(100)
                .child(getHoneyBadgerWithoutSnakes())
                .child(getHoneyBadgerWithoutSnakes())
                .build();
    }

}

@ToString(callSuper = true)
@Accessors(chain = true)

class HoneyBadger extends Worker {

    @Setter
    @Getter
    private Integer snakesEaten;

    private List<HoneyBadger> children = new ArrayList<>();

    public HoneyBadger() {

    }

    @Builder(toBuilder = true)
    public HoneyBadger(Integer snakesEaten,
                       @Singular
                       List<HoneyBadger> children, String name) {
        this.snakesEaten = snakesEaten;
        this.children = children;
        this.name = name;
    }
}