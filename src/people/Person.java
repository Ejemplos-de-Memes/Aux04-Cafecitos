package people;

import drinks.Glass;

/**
 * Clase para representar a una persona cualquiera.
 */
public class Person {
  private final String name;
  private final boolean canMakeCoffee;

  /**
   * Constructor de la clase persona.
   *
   * @param name          El nombre de la persona.
   * @param canMakeCoffee Valor que retorna si la persona puede o no hacer café.
   */
  protected Person(String name, boolean canMakeCoffee) {
    this.name = name;
    this.canMakeCoffee = canMakeCoffee;
  }

  public Person(String name) {
    this(name, false);
  }

  /** Consigue el nombre. */
  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Person person)) {
      return false;
    }

    if (canMakeCoffee != person.canMakeCoffee) {
      return false;
    }
    return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
  }

  @Override
  public int hashCode() {
    int result = getName() != null ? getName().hashCode() : 0;
    result = 31 * result + (canMakeCoffee ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }

  public void drink(Glass drinkable) {
    // No implementada uwu
  }
}
