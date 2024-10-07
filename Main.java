public class Main
{
  public static void main(String[] args)
  {
    public static String lastFirstN(final String s1, final String s2, final int n)
  {
   int indexOfNthtoLast = s1.length()-n;
   String last = s1.substring(indexOfNthToLast);
    String first = s2.substring(0, n);

  return last + first;
  }

  public static void StringManip(final String s1, final String s2)
  {
    System.out.println(s1.toUpperCase());

    String firstLetter = s2.substring(0,1);
    firstLetter = firstLetter.toUpperCase();

    String lower = s2.toLowerCase();
    String restOfs2 = s2.substring(1);
    system.out.println(firstLetter + restOfs2);
  }
  }
}

