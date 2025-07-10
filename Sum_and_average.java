public class Sum_and_average{
    public static void main(String[] args) {
       int sum = 0;
       double average = 0.0;
       for(int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {
                sum += j;
            }

            average = (double) sum / i;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
      
    }
}
