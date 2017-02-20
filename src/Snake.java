import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Mateusz Kamiński
 */
public class Snake {

    public static void main(String... args) {
        System.out.println(getHoneyBadgerWithoutSnakes());
        // 1.
        //System.out.println(getHoneyBadgerWithSnakes());
        // 2.
        //System.out.println(getHoneyBadgerWithBuilder());
    }

    static HoneyBadger getHoneyBadgerWithoutSnakes() {
        HoneyBadger honeyBadger = new HoneyBadger();
        honeyBadger.setName("Borsuk");
        honeyBadger.setSnakesEaten(0);
        return honeyBadger;
    }

    /*
    static HoneyBadger getHoneyBadgerWithSnakes() {
        return getHoneyBadgerWithoutSnakes()
                .setSnakesEaten(100);
    }*/


    /*
    static HoneyBadger getHoneyBadgerWithBuilder() {
        return getHoneyBadgerWithoutSnakes()
                .toBuilder()
                .snakesEaten(100)
                .child(getHoneyBadgerWithoutSnakes())
                .child(getHoneyBadgerWithoutSnakes())
                .build();
    }*/

}

@ToString(of = {"snakesEaten"})
class HoneyBadger extends Worker {

    @Setter
    @Getter
    private Integer snakesEaten;

    private List<HoneyBadger> children;

}