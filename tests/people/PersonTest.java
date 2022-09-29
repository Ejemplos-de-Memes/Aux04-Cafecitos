package people;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
  Person persona1;
  Person persona2;
  Person persona3;

  @Before
  public void setUp() throws Exception {
    persona1 = new Person("Mario");
    persona2 = new Person("Mario");
    persona3 = new Person("María");
  }

  @Test
  public void testEquals() {
    // Persona 1 es igual a sí misma
    assertEquals("Una persona no es igual a sí misma.",
        persona1, persona1);
    // Persona debe arrojar false si no es de la misma instancia.
    assertNotEquals("Clase persona arroja true cuando no es de la misma instancia.",
        persona1, "Person{name='" + persona1.getName() + "'}");
    // Persona 1 y persona 2 son iguales
    assertEquals("Dos personas con el mismo nombre no son iguales.",
        persona1, persona2);
    // Persona 1 y persona 3 NO son iguales
    assertNotEquals("Dos personas con distinto nombre son iguales.",
        persona1, persona3);
  }

  @Test
  public void testHashCode() {
    // Persona 1 y persona 2 son iguales
    assertEquals("Dos personas iguales tienen distinto hashCode.",
        persona1.hashCode(), persona2.hashCode());
    // Persona 1 y persona 3 NO son iguales
    assertNotEquals("Dos personas distintas tienen igual hashCode.",
        persona1.hashCode(), persona3.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Método toString no funciona en la clase persona.",
        "Person{name='" + persona1.getName() + "'}", persona1.toString());
  }
}