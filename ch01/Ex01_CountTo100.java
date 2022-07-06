public class Ex01_CountTo100 {
    public static void main(String args[]){
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println("Cats have 9 lives!");
            } else {
                System.out.println(i);
            }
        }
    }
}
