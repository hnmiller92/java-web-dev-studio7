package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD("Taylor Swift", 10.0, "CD", 5.0, true);
        DVD myDVD = new DVD("The Proposal", 25.0, "DVD", 25.0, true);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.spinDisk();
        myDVD.spinDisk();

    }
}
