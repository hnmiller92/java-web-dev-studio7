package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisk{
    public DVD(String name, double capacity, String discType, double usedSpace, boolean isPlaying) {
        super(name, capacity, discType, usedSpace, isPlaying);
    }

    @Override
    public void spinDisk() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");

    }

    @Override
    public void readDisk() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
