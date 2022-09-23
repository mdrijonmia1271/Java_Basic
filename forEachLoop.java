public class forEachLoop {
    public static void main(String[] args) {
        
        String[] names = {"Rijon", "MOhosin", "Momin", "Mithu", "Tahbila"};
        int[] num = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for(String x : names){
            System.out.println(x);
        }
        for(int m : num){
            System.out.println(m);
            sum = sum+m;
        }
        System.out.println("Result of Sum = "+sum);

    }
}
