package Array;

class ReverseArray{

    public static String reverseString(String s) {
        StringBuffer str = new StringBuffer(s);
        return str.reverse().toString();
    }
   public static void main(String args[])
   {
       String s = "Shivanjali";
       System.out.println(reverseString(s));
   }
}