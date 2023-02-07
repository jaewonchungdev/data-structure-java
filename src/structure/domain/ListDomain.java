package structure.domain;

public class ListDomain {
    public final int value;
    public ListDomain nextDomain;

    public ListDomain(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
