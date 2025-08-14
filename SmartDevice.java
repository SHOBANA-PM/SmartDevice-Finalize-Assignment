class SmartDevice {
    private String deviceName;

    // Constructor
    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        System.out.println("Device Created: " + deviceName);
    }

    // Method to display device details
    public void displayDevice() {
        System.out.println("Device Name: " + deviceName);
    }

    // finalize method to display cleanup message
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cleaning up device: " + deviceName);
        super.finalize();
    }
}
