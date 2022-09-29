package drinks;

import ingredients.interfaces.Ingredient;
import java.util.List;

/**
 * Representa un vaso con ingredientes.
 */
public class Glass {
  private List<Ingredient> ingredients;

  /**
   * Constructor del vaso.
   *
   * @param ingredients Lista de ingredientes.
   */
  public Glass(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  /** Consigue la lista de ingredientes */
  public List<Ingredient> getIngredients() {
    return ingredients;
  }

  /** Cambia la lista de ingredientes. */
  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }
}
