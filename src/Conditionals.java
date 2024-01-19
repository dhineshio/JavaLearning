public class Conditionals {
  public static void main(String args[]) {
    // Conditionals -> if,else,else if

    // If,Else
    int age = 18;
    if (age >= 18) {
      System.out.println("Eligible");
    } else {
      System.out.println("Not eligible");
    }

    // Else if
    int mark = 89;
    if (mark >= 80) {
      System.out.println("A");
    } else if (mark >= 60) {
      System.out.println("B");
    } else if (mark >= 40) {
      System.out.println("C");
    } else {
      System.out.println("Fail");
    }
  }
}
