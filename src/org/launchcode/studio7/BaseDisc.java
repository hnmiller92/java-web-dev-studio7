package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private double capacity;
    private String discType;
    private double usedSpace;
    private boolean isPlaying = true;

    public BaseDisc(String name, double capacity, String discType, double usedSpace, boolean isPlaying) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.usedSpace = usedSpace;
        this.isPlaying = isPlaying;
    }

    public boolean pauseDisk() {
        isPlaying = ! isPlaying;
        return isPlaying;
    }

    public void stop() {
        System.out.println("Stopping");
        isPlaying = false;
    }

    public void fastForward() {
        System.out.println("Fast-forwarding");
    }

    public void rewind() {
        System.out.println("Rewind");
    }

    public double findRemainingCapacity() {
        return capacity - usedSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(double usedSpace) {
        this.usedSpace = usedSpace;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}