class Main 
{
  private int max;
  /**
   * Find the maximum of three integers a b c
   * @return maximum of a b c
   */
  public static int intMax(int a, int b, int c)
  {
    int max = (a > b) ? a : b;
    max = (max > c) ? max : c;
    return max;
     
  }

  public static void main(String[] args)
  {
    System.out.println("intMax( 4, 4, 3) = "+intMax( 4, 4, 3)+" : "+(intMax( 4, 4, 3)== 4?"OK":"FAIL"));
    System.out.println("intMax( 1, 3, 2) = "+intMax( 1, 3, 2)+" : "+(intMax( 1, 3, 2)== 3?"OK":"FAIL"));
    System.out.println("intMax( 3, 2, 1) = "+intMax( 3, 2, 1)+" : "+(intMax( 3, 2, 1)== 3?"OK":"FAIL"));
    System.out.println("intMax( 0, 3, 3) = "+intMax( 0, 3, 3)+" : "+(intMax( 0, 3, 3)== 3?"OK":"FAIL"));
    System.out.println("intMax( 3, 9, 3) = "+intMax( 3, 9, 3)+" : "+(intMax( 3, 9, 3)== 9?"OK":"FAIL"));
    System.out.println("intMax( 3, 3, 9) = "+intMax( 3, 3, 9)+" : "+(intMax( 3, 3, 9)== 9?"OK":"FAIL"));
    System.out.println("intMax( 8, 2, 3) = "+intMax( 8, 2, 3)+" : "+(intMax( 8, 2, 3)== 8?"OK":"FAIL"));
    System.out.println("intMax(-3,-1,-2) = "+intMax(-3,-1,-2)+" : "+(intMax(-3,-1,-2)==-1?"OK":"FAIL"));
    System.out.println("intMax( 5, 2, 5) = "+intMax( 5, 2, 5)+" : "+(intMax( 5, 2, 5)== 5?"OK":"FAIL"));
    System.out.println("intMax( 5, 6, 2) = "+intMax( 5, 6, 2)+" : "+(intMax( 5, 6, 2)== 6?"OK":"FAIL"));
    System.out.println("intMax( 5, 2, 6) = "+intMax( 5, 2, 6)+" : "+(intMax( 5, 2, 6)== 6?"OK":"FAIL"));
  }
}