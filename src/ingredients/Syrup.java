package ingredients;

import ingredients.abstract_classes.AbstractIngredient;

/**
 * Clase para representar al ingrediente de sirope.
 */
public class Syrup extends AbstractIngredient {

  /**
   * Constructor.
   *
   * @param content Cantidad de contenido en mililitros.
   */
  public Syrup(Integer content) {
    super(content, "Syrup");
  }
}
