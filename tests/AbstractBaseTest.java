import java.util.Random;

//import org.apache.commons.lang3.RandomStringUtils;


public class AbstractBaseTest {

  // Random settings
  int seed;
  Random rng;
  String messageSeed;

  /**
   * To change the seed in case it is needed. Method to adapt in case you wish to use template
   * pattern. Every random value will be generated with this seed.
   *
   * @param aSeed A seed as an int.
   */
  protected void setSeed(int aSeed) {
    this.seed = aSeed;
  }

  private void setSettings() {
    // Initialize a random seed and a random rng
    setSeed(new Random().nextInt());
    messageSeed = " Seed: " + seed;
    rng = new Random(seed);
  }

  /**
   * Draw a random float.
   *
   * @param rng         random generator.
   * @param maxExponent max exponent.
   * @return            a random float.
   */
  public static double generateAFloatRandom(Random rng, int maxExponent) {
    int randomExponent = rng.nextInt(maxExponent + 1);
    int maxSize = rng.nextInt((int) Math.pow(10, randomExponent));
    int sgn = (int) Math.pow(-1, rng.nextInt(2));
    return sgn * rng.nextDouble() * maxSize;
  }

  /**
   * Generates a random int.
   *
   * @param rng         random generator
   * @param maxExponent max exponent
   * @return a random int
   */
  public static int generateAnIntRandom(Random rng, int maxExponent) {
    int randomExponent = rng.nextInt(maxExponent + 1);
    int maxSize = rng.nextInt((int) Math.pow(10, randomExponent)) + 1;
    int sgn = (int) Math.pow(-1, rng.nextInt(2));
    return sgn * rng.nextInt(maxSize);
  }

//  /**
//   * Generates a random string.
//   *
//   * @param rng       random generator
//   * @param maxLength max length
//   * @return a random string
//   */
//  protected static String generateAStringRandom(Random rng, int maxLength) {
//    int strSize = rng.nextInt(maxLength + 1);
//     return RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT,
//        true, true, null, rng);
//  }

  public void setRandomValues() {
    setSettings();
    // Generar dos nombres distintos y aleatorios
  }

}
