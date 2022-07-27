package generics.generic_test;

public class GenPaar<T> {
    private T l, r;

    public GenPaar(T r, T l) {
        this.l = l;
        this.r = r;
    }

    public T getL() {
        return l;
    }

    public void setL(T l) {
        this.l = l;
    }

    public T getR() {
        return r;
    }

    public void setR(T r) {
        this.r = r;
    }

    public String toString() {
        return "(l,r) = (" + l + "," + r + ")";
    }
}
