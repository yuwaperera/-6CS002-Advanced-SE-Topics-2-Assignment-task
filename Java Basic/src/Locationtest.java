import org.junit.Test;
import static org.junit.Assert.*;

public class Locationtest {

	 @Test
	    public void testConstructor() {
	        // Arrange
	        Location location = new Location(2, 3);

	        // Act
	        int row = location.getRow();
	        int col = location.getColumn();

	        // Assert
	        assertEquals(2, row);
	        assertEquals(3, col);
	    }

	    @Test
	    public void testConstructorWithDirection() {
	        // Arrange
	        Location location = new Location(2, 3, Location.DIRECTION.HORIZONTAL);

	        // Act
	        int row = location.getRow();
	        int col = location.getColumn();
	        Location.DIRECTION direction = location.getDirection();

	        // Assert
	        assertEquals(2, row);
	        assertEquals(3, col);
	        assertEquals(Location.DIRECTION.HORIZONTAL, direction);
	    }

	    @Test
	    public void testToStringWithoutDirection() {
	     
	        Location location = new Location(2, 3);

	       
	        String result = location.toString();

	        
	        assertEquals("(4,3)", result);
	    }

	    @Test
	    public void testToStringWithDirection() {
	        
	        Location location = new Location(2, 3, Location.DIRECTION.VERTICAL);

	       
	        String result = location.toString();

	       
	        assertEquals("(4,3,VERTICAL)", result);
	    }

	    @Test
	    public void testDrawGridLines() {
	        
	        Location location = new Location(0, 0);

	       
	        location.drawGridLines(null);
	    }

	    @Test
	    public void testGetInt() {
	        
	        System.setIn(new java.io.ByteArrayInputStream("42\n".getBytes()));

	        
	        int result = Location.getInt();

	       
	        assertEquals(42, result);
	    }
}
