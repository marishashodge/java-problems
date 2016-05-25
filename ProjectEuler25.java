public class ProjectEuler25 {

  public static void main(String args[]) {

    String argString = args[0];
    int digits = Integer.parseInt(argString);
    if (digits == 1) {
        System.out.println(1);
    }

    else {

      int fPrev = 1;
      int fPrevPrev = 1;

      int index = 2;

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
