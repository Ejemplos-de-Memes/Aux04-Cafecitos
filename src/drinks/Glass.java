package drinks;

import ingredients.interfaces.Ingredient;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 * Representa un vaso con ingredientes.
 */
public class Glass {
  private final ArrayList<Ingredient> ingredients;

  /**
   * Constructor del vaso.
   *
   * @param ingredients Lista de ingredientes.
   */
  protected Glass(ArrayList<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  /** Constructor por default. */
  public Glass() {
    this(new ArrayList<>());
  }

  /** Consigue la lista de ingredientes */
  private List<Ingredient> getIngredients() {
    return ingredients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Glass glass)) {
      return false;
    }

    return getIngredients() != null ? getIngredients().equals(glass.getIngredients())
        : glass.getIngredients() == null;
  }

  @Override
  public int hashCode() {
    return getIngredients() != null ? getIngredients().hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Glass{" +
        "ingredients=" + ingredients +
        '}';
  }


  /** Retorna la cantidad de contenido en el vaso total en mililitros. */
  public @NotNull Integer totalContent() {
    Integer suma = 0;
    for (Ingredient ingredient: ingredients) {
      suma += ingredient.getContent();
    }
    return suma;
  }

  /** Vacia el contenido del vaso. */
  public void emptyContent() {
    getIngredients().clear();
  }

  public boolean isEmpty() {
    return totalContent() == 0;
  }

  public void add(Ingredient ingredient) {
    getIngredients().add(ingredient);
  }
}
