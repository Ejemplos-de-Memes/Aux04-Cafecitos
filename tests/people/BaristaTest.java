package people;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BaristaTest extends PersonTest {
  Barista barista1;

  @Before
  public void setUp() throws Exception {
    super.setUp();
    barista1 = new Barista("Mario");
  }

  @Test
  public void testEquals() {
    // Persona 1 y el barista NO deben ser iguales
    assertNotEquals("Barista y persona con el mismo nombre NO deben "
            + "ser iguales y lo están siendo.",
        persona1, barista1);
  }

  @Test
  public void testHashCode() {
    // Persona 1 y barista tienen mismo nombre y no deben tener mismo hash
    assertNotEquals("Persona y barista con el mismo nombre no deben tener mismo hash.",
        persona1.hashCode(), barista1.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Método toString no funciona en la clase Barista.",
        "Barista{name='" + barista1.getName() + "'}", barista1.toString());
  }
}