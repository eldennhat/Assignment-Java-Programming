package org.example.Bai2;

public class Main {
    public static void main(String[] args) {
        Computer PC1 = new Computer.ComputerBuilder("256GB", "8GB").build();
        Computer PC2 = new Computer.ComputerBuilder("512GB", "32GB").setBluetoothEnabled(true).build();

        System.out.println(PC1);
        System.out.println(PC2);
    }
}
