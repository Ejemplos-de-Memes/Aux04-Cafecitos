package people;

import drinks.Glass;
import ingredients.interfaces.Ingredient;
import java.util.List;

/**
 * Clase para representar Baristas. Estas personas pueden hacer café.
 */
public class Barista extends Person {

  /**
   * Constructor de la clase barista.
   *
   * @param name El nombre del barista.
   */
  public Barista(String name) {
    super(name, true);
  }

  @Override
  public String toString() {
    return "Barista{" +
        "name='" + getName() + '\'' +
        '}';
  }

  /**
   * Método para hacer un café.
   *
   * @param ingredients lista de ingredientes a partir del cuál se hará un café.
   * @return Un vaso con café.
   */
  public Glass makeCoffee(List<Ingredient> ingredients) {
    Glass glassToReturn = new Glass();
    for (Ingredient ingredient: ingredients) glassToReturn.add(ingredient);
    return glassToReturn;
  }
}
