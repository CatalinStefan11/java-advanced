package _4_nested_class;

public class Main {
  public static void main(String... args) {

    Greeters greeters = new Greeters();

    Greeters.Portuguese portuguese = greeters.new Portuguese();

    portuguese.greet();

    Greeters.Romanian romanian = new Greeters.Romanian();

    romanian.greet();

//    (new Greeters.Romanian()).greet();

  }
}

/*
 *  A top-level class.
 */
class Greeters {
  private static final String ROMANIAN_GREETING = "Buna ziua!";
  private static final String PORTUGUESE_GREETING = "Ola!";

  /**
   * A static nested class.
   *
   * Can be declared public, "package private", protected, or private; and
   * has access to other static [and only static] members of the enclosing
   * class even if they are private.
   */
  static class Romanian {
    public void greet() {
      System.out.println(ROMANIAN_GREETING);
    }
  } // Romanian


  /**
   * A non-static nested class (an inner class).
   *
   * Can be declared public, "package private", protected, or private; and
   * has access to other members of the enclosing class even if they are
   * private.
   */
  class Portuguese {
    public void greet() {
      System.out.println(PORTUGUESE_GREETING);
    }
  } // Portuguese
} 
