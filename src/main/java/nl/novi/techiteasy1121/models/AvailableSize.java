package nl.novi.techiteasy1121.models;

public enum AvailableSize {
    S(50),
    M(55),
    L(60),
    XL(65);

    public final int size;
    private AvailableSize(int size){
        this.size = size;
    }

}
