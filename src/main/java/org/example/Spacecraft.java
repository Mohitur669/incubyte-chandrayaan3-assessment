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

    // function to move the spacecraft in forward direction
    public void moveForward() {
        if (direction == 'N') y++;
        else if (direction == 'S') y--;
        else if (direction == 'E') x++;
        else if (direction == 'W') x--;
        else if (direction == 'U') z++;
        else if (direction == 'D') z--;
    }

    // function to move the spacecraft in backward direction
    public void moveBackward() {
        if (direction == 'N') y--;
        else if (direction == 'S') y++;
        else if (direction == 'E') x--;
        else if (direction == 'W') x++;
        else if (direction == 'U') z--;
        else if (direction == 'D') z++;
    }

    // function to turn the spacecraft left
    public void turnLeft() {
        if (direction == 'N') direction = 'W';
        else if (direction == 'S') direction = 'E';
        else if (direction == 'E') direction = 'N';
        else if (direction == 'W') direction = 'S';
    }

    // function to turn the spacecraft right
    public void turnRight() {
        if (direction == 'N') direction = 'E';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'E') direction = 'S';
        else if (direction == 'W') direction = 'N';
    }

    // function to turn the spacecraft up
    public void turnUp() {
        if (direction == 'N' || direction == 'S') direction = 'U';
    }

    // function to turn the spacecraft down
    public void turnDown() {
        if (direction == 'N' || direction == 'S') direction = 'D';
    }

    // function to execute a single command with given direction
    private void executeSingleCommand(char command) {
        if (command == 'f') {
            moveForward();
        } else if (command == 'b') {
            moveBackward();
        } else if (command == 'l') {
            turnLeft();
        } else if (command == 'r') {
            turnRight();
        } else if (command == 'u') {
            turnUp();
        } else if (command == 'd') {
            turnDown();
        }
    }

    // function to get the current position of the spacecraft
    public String getPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    // function to get the current direction of the spacecraft
    public char getDirection() {
        return direction;
    }

    // function to execute a series of commands
    public void executeCommands(char[] commands) {
        for (char command : commands) {
            if (isValidCommand(command)) {
                executeSingleCommand(command);
            } else {
                System.out.println("Invalid command: " + command);
            }
        }
    }

    // function to check if the command is valid
    private boolean isValidCommand(char command) {
        return command == 'f' || command == 'b' || command == 'l' || command == 'r' || command == 'u' || command == 'd';
    }
}