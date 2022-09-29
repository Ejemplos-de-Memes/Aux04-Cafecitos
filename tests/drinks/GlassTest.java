package drinks;

import static org.junit.Assert.*;

import ingredients.Coffee;
import ingredients.Milk;
import ingredients.interfaces.Ingredient;
import java.util.ArrayList;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;

public class GlassTest {
  Glass glass1;
  ArrayList<Ingredient> ingredients;
  Glass glass2;

  @Before
  public void setUp() throws Exception {
    glass1 = new Glass();
    ingredients = new ArrayList<>();
    ingredients.add(new Coffee(60));
    ingredients.add(new Milk(180));
    glass2 = new Glass(ingredients);
  }

  @Test
  public void totalContent() {
    assertEquals("Contenido de un vaso vacío no es 0.",
        0, (int) glass1.totalContent());
    assertNotEquals("Contenido de un vaso que no es vacío es 0",
        0, (int) glass2.totalContent());
    assertEquals("El contenido del vaso no coincide con lo esperado.",
        240, (int) glass2.totalContent());
  }

  @Test
  public void emptyContent() {
    assertNotEquals(0, (int) glass2.totalContent());
    glass2.emptyContent();
    assertEquals("Se esperaba que el contenido se vaciara.",
        0, (int) glass2.totalContent());
    assertEquals("Se esperaba que el contenido se vaciara.",
        glass1, glass2);
  }
}