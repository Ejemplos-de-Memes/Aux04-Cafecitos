package ingredients.abstract_classes;

import ingredients.interfaces.Ingredient;

/**
 * Clase abstracta para representar ingredientes.
 */
public abstract class AbstractIngredient implements Ingredient {
  private Integer content;
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
  public Integer getContent() {
    return content;
  }

  /** Cambia el contenido del ingrediente. */
  protected void setContent(Integer content) {
    this.content = content;
  }
}
