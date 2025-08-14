public class Main {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartDevice("Smart Light");
        SmartDevice device2 = new SmartDevice("Smart Thermostat");

        device1.displayDevice();
        device2.displayDevice();

        device1 = null;
        device2 = null;

        System.gc(); // Request garbage collection

        try {
            Thread.sleep(1000); // Wait for GC
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method");
    }
}
