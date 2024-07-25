

public class Main {
    //First position always will be zero and after 9
    //we continue using Alphabet
    //we could do the same initializing a hashmap with the values
    private static final String ALPHANUMERIC =  "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int MAX_SEQ = 6;
    private static final int MAX_NUMBER_CHARS=36;

    public static void main(String[] args) {
        System.out.println("License generated: "+generateLicenseUsingIndex(999999));
    }

    /**
     * This method get a long index as we need more range than integer
     * and iterate the positions to find in a char array the value of the
     * number
     *
     * @param index - long value set by the user
     * @return String value in order to print
     */
    public static String generateLicenseUsingIndex(long index) {
        //Using StringBuilder better than StringBuffer for concatenate
        //Other way to do it is using and array of char
        StringBuilder concatenateLicense = new StringBuilder();
        char[] alphanumericToArray =ALPHANUMERIC.toCharArray();
        for (int i = 0; i < MAX_SEQ; i++) {
            //Using mod we can know the position in the array
            concatenateLicense.insert(0, alphanumericToArray[(int) (index % MAX_NUMBER_CHARS)]);
            //We need to divide in order to know if there are a next value
            index =index/MAX_NUMBER_CHARS;
        }
        return concatenateLicense.toString();
    }
}