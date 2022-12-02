import java.util.*;

public class Numbers {
    private final int numberOne;
    private final int numberTwo;

    public Numbers(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return numberTwo == numbers.numberTwo;
    }
    @Override
    public int hashCode() {
        return Objects.hash(numberOne, numberTwo);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = ", this.numberOne, this.numberTwo);
    }
}
