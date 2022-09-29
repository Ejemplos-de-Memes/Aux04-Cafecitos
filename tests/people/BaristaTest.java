package people;

import static org.junit.Assert.*;

import drinks.Glass;
import ingredients.Coffee;
import ingredients.Milk;
import ingredients.Syrup;
import ingredients.interfaces.Ingredient;
import java.util.ArrayList;
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

  @Test
  public void makeCoffee() {
    ArrayList<Ingredient> ingredients = new ArrayList<>();
    ingredients.add(new Coffee(60));
    ingredients.add(new Syrup(10));
    ingredients.add(new Milk(170));

    Glass glass = barista1.makeCoffee(ingredients);
    Glass otherGlass = new Glass();
    for (Ingredient ingredient: ingredients) otherGlass.add(ingredient);

    assertEquals("El café hecho por el barista no es igual al esperado.",
        otherGlass, glass);
  }
}