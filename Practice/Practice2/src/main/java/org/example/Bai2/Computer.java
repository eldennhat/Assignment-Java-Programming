package org.example.Bai2;

public class Computer {
    private String HDD;
    private String RAM;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }
    @Override
    public String toString() {
        return "Computer [RAM = " + RAM + ", HDD = " + HDD + ", Bluetooth = " + (isBluetoothEnabled ? "Co" : "Khong") + "]";
    }
    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
