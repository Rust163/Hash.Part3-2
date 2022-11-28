import java.util.*;

public class Numbers {
    private final int NUMBER_ONE;
    private final int NUMBER_TWO;

    public Numbers(int NUMBER_ONE, int NUMBER_TWO) {
        this.NUMBER_ONE = NUMBER_ONE;
        this.NUMBER_TWO = NUMBER_TWO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return NUMBER_TWO == numbers.NUMBER_TWO && NUMBER_TWO == numbers.NUMBER_TWO;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NUMBER_ONE, NUMBER_TWO);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = ", this.NUMBER_ONE, this.NUMBER_TWO);
    }
}
