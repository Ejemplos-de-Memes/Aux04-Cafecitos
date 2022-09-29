package ingredients.abstract_classes;

import ingredients.interfaces.Ingredient;

/**
 * Clase abstracta para representar ingredientes.
 */
public abstract class AbstractIngredient implements Ingredient {
  private final Integer content;
  private final String ingredientName;

  /**
   * Constructor.
   *
   * @param content        Cantidad de contenido en mililitros.
   * @param ingredientName Nombre del ingrediente.
   */
  protected AbstractIngredient(Integer content, String ingredientName) {
    this.content = content;
    this.ingredientName = ingredientName;
  }

  @Override
  public String toString() {
    return ingredientName + "{" +
        "content=" + content +
        '}';
  }

  /** Consigue el contenido. */
  @Override
  public Integer getContent() {
    return content;
  }
}
