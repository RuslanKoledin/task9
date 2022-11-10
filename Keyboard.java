public class Keyboard {

    private String  isBacklight;
    private String isRightNumbers;

    public Keyboard(String isBacklight, String isRightNumbers) {
        this.isBacklight = isBacklight;
        this.isRightNumbers = isRightNumbers;
    }

    public String isBacklight() {

        return isBacklight;
    }

    public void setBacklight(String backlight) {

        isBacklight = backlight;
    }

    public String isRightNumbers() {

        return isRightNumbers;
    }

    public void setRightNumbers(String rightNumbers) {
        isRightNumbers = rightNumbers;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "isBacklight=" + isBacklight +
                ", isRightNumbers=" + isRightNumbers +
                '}';
    }
}
