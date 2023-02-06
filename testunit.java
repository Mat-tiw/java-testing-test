import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testunit {
    QuizOneJunit obj = new QuizOneJunit();
    //Test if equals
  @Test
  public void testSquare() {
    assertEquals(9, obj.square(3));
  }
  //Test if return null
  @Test 
  public void testNull() {
    assertNotNull(obj.square(5));
  }
  //Test if it equals or not
  @Test 
  public void testNotEquals() {
    assertNotEquals(5, obj.square(6));
  }
  //Test counting with assertEquals
  @Test
  public void testCountLetterA() {
    assertEquals(3, obj.countLetterA("banana"));
  }
  //Test check two letters with expected false
  @Test
  public void testCheckTwoLetterFalse() {
    assertFalse(obj.checkTwoLetter("aabb"));
  }
  //Test check two letters with expected true
  @Test
  public void testCheckTwoLetterTrue(){
    assertTrue(obj.checkTwoLetter("aa"));
  }
}
