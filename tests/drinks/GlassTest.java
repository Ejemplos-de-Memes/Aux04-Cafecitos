package drinks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import ingredients.Coffee;
import ingredients.Milk;
import ingredients.interfaces.Ingredient;
import java.util.ArrayList;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;

public class GlassTest {

  int seed;
  Random rng;
  String messageSeed;
  Glass glass1;
  ArrayList<Ingredient> ingredients;
  Glass glass2;
  int mlCoffee;
  int mlMilk;


  @Before
  public void setUp() throws Exception {
    seed = 1206528341;  // new Random().nextInt();
    messageSeed = " Seed: " + seed;
    rng = new Random(seed);

    glass1 = new Glass();
    ingredients = new ArrayList<>();
    mlCoffee = 30 + rng.nextInt(50);
    ingredients.add(new Coffee(mlCoffee));
    mlMilk = rng.nextInt(220);
    ingredients.add(new Milk(mlMilk));
    glass2 = new Glass(ingredients);
  }

  @Test
  public void totalContent() {
    assertEquals("Contenido de un vaso vacío no es 0." + messageSeed,
        0, (int) glass1.totalContent());
    assertNotEquals("Contenido de un vaso que no es vacío es 0" + messageSeed,
        0, (int) glass2.totalContent());
    assertEquals("El contenido del vaso no coincide con lo esperado." + messageSeed,
        mlCoffee + mlMilk, (int) glass2.totalContent());
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