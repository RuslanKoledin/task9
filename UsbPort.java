public class UsbPort {
    private double typeOfPort;
    private double idOfPort;

    public UsbPort(double typeOfPort, double idOfPort) {
        this.typeOfPort = typeOfPort;
        this.idOfPort = idOfPort;
    }


    public double getTypeOfPort() {
        return typeOfPort;
    }

    public void setTypeOfPort(double typeOfPort) {
        this.typeOfPort = typeOfPort;
    }

    public double getIdOfPort() {
        return idOfPort;
    }

    public void setIdOfPort(double idOfPort) {
        this.idOfPort = idOfPort;
    }

    @Override
    public String toString() {
        return "UsbPort{" +
                "typeOfPort=" + typeOfPort +
                ", idOfPort=" + idOfPort +
                '}';
    }
}
