import org.junit.Test;
import static org.junit.Assert.*;

public class DominoTest {

    @Test
    public void testEncapsulation() {
        // Arrange
        Domino domino = new Domino(3, 5);

        // Act
        domino.place(1, 2, 3, 4);

        // Assert
        assertEquals(3, domino.getHigh());
        assertEquals(5, domino.getLow());
        assertEquals(1, domino.getHx());
        assertEquals(2, domino.getHy());
        assertEquals(3, domino.getLx());
        assertEquals(4, domino.getLy());
        assertTrue(domino.isPlaced());
    }

    @Test
    public void testToString() {
        // Arrange
        Domino unplacedDomino = new Domino(1, 2);
        Domino placedDomino = new Domino(3, 4);
        placedDomino.place(1, 1, 2, 2);

        // Act
        String unplacedString = unplacedDomino.toString();
        String placedString = placedDomino.toString();

        // Assert
        assertEquals("[12]unplaced", unplacedString);
        assertEquals("[34](2,2)(3,3)", placedString);
    }
}