public class Multiples {
    static void main(String[] args) {
        multiples3or5(100);


    }

    private static void multiples3or5(int num) {
        int count = 1;

        while (count < num){
            boolean div3 = count % 3 == 0;
            boolean div5 = count % 5 == 0;

            if (div3 | div5){
                System.out.println(count);
            }

            count++;
        }
    }
}
