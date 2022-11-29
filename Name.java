public class Name {
    private String last="";
    private String first="";

    public Name(String last, String first) {
        this.last = last;
        this.first = first;
    }

    public Name() {
        this.last = "";
        this.first = "";
    }

    public String getLast() {
        return last;
    }

    public String getFirst() {
        return first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String toString(){
        return first + " " + last;
    }
}
