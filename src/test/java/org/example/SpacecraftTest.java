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
}