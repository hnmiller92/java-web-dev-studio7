package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisk{
    public CD(String name, double capacity, String discType, double usedSpace, boolean isPlaying) {
        super(name, capacity, discType, usedSpace, isPlaying);
    }

    @Override
    public void spinDisk() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void readDisk() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
