package ingredients;

import ingredients.abstract_classes.AbstractIngredient;

/**
 * Clase para representar el ingrediente de café.
 */
public class Coffee extends AbstractIngredient {

  /**
   * Constructor.
   *
   * @param content Cantidad de contenido en mililitros.
   */
  public Coffee(Integer content) {
    super(content, "Coffee");
  }
}
