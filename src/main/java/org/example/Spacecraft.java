package org.example;

public class Spacecraft {
    private int x, y, z;
    private char direction;

    // Constructor
    public Spacecraft(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    // function to move the spacecraft in forward
    public void moveForward() {
        if (direction == 'N') y++;
        else if (direction == 'S') y--;
        else if (direction == 'E') x++;
        else if (direction == 'W') x--;
        else if (direction == 'U') z++;
        else if (direction == 'D') z--;
    }

    // function to get the current position of the spacecraft
    public String getPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    // function to get the current direction of the spacecraft
    public char getDirection() {
        return direction;
    }
}