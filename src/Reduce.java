public class Reduce {
    static void main(String[] args) {
        reducetozero(100);

    }

    private static void reducetozero(int nume) {
        int num = nume;

        System.out.println(num);
        while (num != 0){
            if (num % 2 == 0){
                num /= 2;
                System.out.println(num);
            }else {
                num--;
                System.out.println(num);
            }
        }
    }
}
