package ingredients;

import ingredients.abstract_classes.AbstractIngredient;

/**
 * Clase para representar el ingrediente de leche.
 */
public class Milk extends AbstractIngredient {

  /**
   * Constructor.
   *
   * @param content Cantidad de contenido en mililitros.
   */
  public Milk(Integer content) {
    super(content, "Milk");
  }
}
