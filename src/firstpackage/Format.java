package firstpackage;

public class Format {
    public static void main (String[] arg){
       String word = "Java is fun";
       float myNumber =78.98f;
        System.out.format("Do you think %s ", word);
        System.out.format("Yes %f of the people thinks it is fun ", myNumber);
        System.out.format("Yes %f2 of the people thinks it is fun ", myNumber);
    }
}
