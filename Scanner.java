//Scanner,Broker,Hammer,Jamoon,Banner,CarrotHalwa,Tower

class Scanner {

    String[] scanTypes;
    Device[] devices;

    Scanner(String[] scanTypes, Device[] devices) {
        this.scanTypes = scanTypes;
        this.devices = devices;
    }

    void display() {
        System.out.println("Length of scan types: " + scanTypes.length);
        for (String type : scanTypes) {
            System.out.println("Scan Type: " + type);
        }

        System.out.println("Length of devices: " + devices.length);
        for (Device d : devices) {
            System.out.println("Device: " + d.name);
        }
    }
}