public class MultiplyEasy {

    public static int multiply(int a, int b) {
        int result = 0;

        boolean isNegative = false;

        if (b < 0) {
            isNegative = true;
            b = -b;  
        }

        for (int i = 0; i < b; i++) {
            result = result + a; 
        }
        if (isNegative) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 3)); 
        System.out.println(multiply(-3, -5));  
    }
}
    
