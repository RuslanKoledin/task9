public class Ssd {
    private int storage;
    private int divided;//разделен

    public Ssd(int storage, int divided) {
        this.storage = storage;
        this.divided = divided;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getDivided() {
        return divided;
    }

    public void setDivided(int divided) {
        this.divided = divided;
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "storage=" + storage +
                ", divided=" + divided +
                '}';
    }
}
