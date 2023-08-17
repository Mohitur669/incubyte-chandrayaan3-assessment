package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpacecraftTest {
    // testing moving forward in all directions
    @Test
    public void testMoveForward() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.moveForward();
        assertEquals("(0, 1, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.moveForward();
        assertEquals("(0, -1, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.moveForward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.moveForward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.moveForward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.moveForward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // testing moving backward in all directions
    @Test
    public void testMoveBackward() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.moveBackward();
        assertEquals("(0, -1, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.moveBackward();
        assertEquals("(0, 1, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.moveBackward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.moveBackward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.moveBackward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.moveBackward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // testing spacecraft turning left in all directions
    @Test
    public void testTurnLeft() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnLeft();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnLeft();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnLeft();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnLeft();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // testing spacecraft turning right in all directions
    @Test
    public void testTurnRight() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnRight();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnRight();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnRight();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnRight();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // testing spacecraft turning up in all directions
    @Test
    public void testTurnUp() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());

        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // testing spacecraft turning down in all directions
    @Test
    public void testTurnDown() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnDown();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnDown();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnDown();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnDown();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // testing spacecraft executing series of commands at a single time
    @Test
    public void testExecuteCommands() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        spacecraft.executeCommands(commands);
        assertEquals("(-1, 1, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    // handling the case for executing empty commands
    @Test
    public void testExecuteEmptyCommands() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        char[] commands = {};
        spacecraft.executeCommands(commands);
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    // handling the case for executing eunknown commands
    @Test
    public void testExecuteUnknownCommand() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        char[] commands = {'x', 'y', 'z'};
        spacecraft.executeCommands(commands);
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    // handing case for invalid direction input
    @Test
    public void testSetInvalidDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.setDirection('X');
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    // edge cases for moving forward of the spacecraft in each direction
    @Test
    public void testMoveForwardSouth() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.moveForward();
        assertEquals("(0, -1, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardEast() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.moveForward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardWest() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.moveForward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardUp() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.moveForward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardDown() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.moveForward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // edge cases for moving backward of the spacecraft in each direction
    @Test
    public void testMoveBackwardSouth() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.moveBackward();
        assertEquals("(0, 1, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardEast() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.moveBackward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardWest() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.moveBackward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardUp() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.moveBackward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardDown() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.moveBackward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // testing moving forward of the spacecraft but in a different starting position than (0, 0, 0)
    @Test
    public void testMoveForwardWithDifferentStartingPosition() {
        Spacecraft spacecraft = new Spacecraft(2, -3, 1, 'N');
        spacecraft.moveForward();
        assertEquals("(2, -2, 1)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    // testing moving backward of the spacecraft but in a different starting position than (0, 0, 0)
    @Test
    public void testMoveBackwardWithDifferentStartingPosition() {
        Spacecraft spacecraft = new Spacecraft(2, -3, 1, 'N');
        spacecraft.moveBackward();
        assertEquals("(2, -4, 1)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    // testing turning left of the spacecraft but from up direction
    @Test
    public void testTurnLeftFromUpDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.turnLeft();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());
    }

    // testing turning right of the spacecraft but from up direction
    @Test
    public void testTurnRightFromDownDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnRight();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // testing turning up of the spacecraft but from East direction
    @Test
    public void testTurnUpFromEastDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());
    }

    // testing turning up for more directions (North, South, West, Up, Down)
    @Test
    public void testTurnUpFromNorthDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testTurnUpFromSouthDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testTurnUpFromWestDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    public void testTurnUpFromUpDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testTurnUpFromDownDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnUp();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }


    // testing turning down of the spacecraft but from West direction
    @Test
    public void testTurnDownFromWestDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.turnDown();
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());
    }
}