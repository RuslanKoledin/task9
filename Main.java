public class Main {
    public static void main(String[] args) {
        String color = "red";

        Ssd ssd = new Ssd(1000,2);
        Display display = new Display("27","144гц","ips");
        Ram ram = new Ram(8,"Ddr3");
        UsbPort usbPort = new UsbPort(2.0,2.3);//не знаю какой айди надо указывать
        Keyboard keyboard = new Keyboard("Yes","Yes");

        Pc myPc = new Pc(ssd,display,ram,usbPort);

        System.out.println(myPc);
        System.out.println(keyboard);


    }

}