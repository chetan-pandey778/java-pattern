public class increment_decrement{
    public static void main(String[] args) {
        int a=5;
        // POST INCREMENT
        int b=a++;
      System.out.println("value off a "+a);
      System.out.println("value of b "+b);
      // PRE INCREMENT
      int a1=5;
      int b1=++a1;
      System.out.println("value of a1 "+a1);
      System.out.println("value of b1 is "+b1);

      // QUS 1

      int c=5;
      int d;
      d = c++ + ++c + ++c + c++ + --c + c--;
      System.out.println("value of c "+c);
      System.out.println("value of d "+d);

    }
}