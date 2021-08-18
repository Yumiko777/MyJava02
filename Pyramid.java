public class Pyramid {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 0; i < count; i++ ) {
            for (int j = count - 1; j > i; j-- ) {
                System.out.println("-");
            }
            for (int k = 0; k <= (i * 2); k++ ) {
                System.out.println(" * ");
            }
            System.out.println();
        }
        
    }
    
}
