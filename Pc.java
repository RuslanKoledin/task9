public class Pc {
    private String display;
    private String marka;
    private String color;
    private Ssd ssd;
    private Ram ram;
    private String videoCard;
    private UsbPort usbPort;
    private Keyboard keyboard;


    public Pc(Ssd ssd, Display display, Ram ram, UsbPort usbPort) {
        this.display = "Retina 13.3";
        this.marka = "MacBook Air";
        this.color = "space gray";
        this.ssd = ssd;
        this.ram = ram;
        this.videoCard = "M1";
        this.usbPort = usbPort;
        this.keyboard = new Keyboard("Yea","Nope");
    }

    @Override
    public String toString() {
        return "Pc{" +
                "display='" + display + '\'' +
                ", marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", sdd=" + ssd +
                ", ram=" + ram +
                ", videoCard='" + videoCard + '\'' +
                ", usbPort=" + usbPort +
                ", keyboard=" + keyboard +
                '}';
    }
}
