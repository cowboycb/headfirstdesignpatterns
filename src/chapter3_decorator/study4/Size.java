package chapter3_decorator.study4;

public enum Size {
    TALL("tall"), GRANDE("grande"), VENTI("venti");
    private String size;
    Size(String size) {
        this.size = size;
    }
    public String getName(){
        return size;
    }
}
