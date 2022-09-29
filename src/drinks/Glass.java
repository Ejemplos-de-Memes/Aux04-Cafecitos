package drinks;

import ingredients.interfaces.Ingredient;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un vaso con ingredientes.
 */
public class Glass {
  private ArrayList<Ingredient> ingredients;

  /**
   * Constructor del vaso.
   *
   * @param ingredients Lista de ingredientes.
   */
  public Glass(ArrayList<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  /** Consigue la lista de ingredientes */
  public List<Ingredient> getIngredients() {
    return ingredients;
  }

  /** Cambia la lista de ingredientes. */
  protected void setIngredients(ArrayList<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  /** Retorna la cantidad de contenido en el vaso total en mililitros. */
  public Integer totalContent() {
    return 0;
  }

  /** Vacia el contenido del vaso. */
  public void emptyContent() {
    // Hacer algo uwu
  }
}
