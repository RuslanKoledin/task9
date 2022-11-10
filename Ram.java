public class Ram {
    private int size;
    private String  manufacture;

    public Ram(int size, String manufacture) {
        this.size = size;
        this.manufacture = manufacture;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "size=" + size +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
