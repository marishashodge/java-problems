public class ProjectEuler25 {

  public static void main(String args[]) {
    // convert argument to integer
    String argString = args[0];
    int digits = Integer.parseInt(argString);

    if (digits == 1) {
        System.out.println(1);
    }

    else {
      // we know the first two Fibonnacci numbers are 1
      int fPrev = 1;
      int fPrevPrev = 1;
      int index = 2;

      // use a bottom-up approach to move up the Fibonnacci sequence until
      // the digits argument matches the number of digits at a certain Fibonnacci sequence
      while (true) {
          int fNext = fPrev + fPrevPrev;
          fPrevPrev = fPrev;
          fPrev = fNext;
          index += 1;

          int length = String.valueOf(fNext).length();

          if (length == digits) {
              System.out.println(index);
              break;

          }
      }
    }
  }
}
