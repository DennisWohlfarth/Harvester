package Grain;


import Harvester.Position;

public class Wheat {

    private Position position;

    private short numberOfGrain;

    public Wheat(Short numberOfGrain)
    {
        this.numberOfGrain = numberOfGrain;
    }

    public short getNumberOfGrain() {
        return numberOfGrain;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
