public class Operators {
  public static void main(String args[]) {
    // OPERATORS
    // Arithmetic Operator,
    // Assignment Operator,
    // Relational Operator,
    // Logical Operator,
    // Ternary Operator

    // Arithmetic Operator -> +,-,*,/,%,++,--
    int a = 10;
    int b = 20;
    int c = a + b;
    int d = a - b;
    int e = a * b;
    int f = a / b;
    int g = a % b;
    int h = a++;
    int i = b--;

    // Assignment Operator -> =
    int j = b;

    // Relational Operator (Outcome Boolean) -> >,<,>=,<=,==,!=

    boolean k = a < b;
    boolean l = a > b;
    boolean m = a <= b;
    boolean n = a >= b;
    boolean o = a == b;
    boolean p = a != b;

    // Logical Operator(outcome Boolean) -> &&, ||, !

    boolean q = a < b && c > d; // both satified returns true
    boolean r = a < b || c > d; // Any one statisfied returns false
    boolean s = !r; // it return oppsited of the result

    // TERNARY Operator -> ? :

    int age = 18;
    String res = age >= 18 ? "Eligible" : "Not Eligible";
    System.out.println(res);

  }
}
