public class MyCalculator implements AdvancedAirthmatic{

    @Override
    public int divisor_sum(int n) {
        // TODO Auto-generated method stub
        if(n>1000){
            System.out.println("error");
            return -1;
        }
        int sum=0;
        for(int i=1;i<=n;i++) if(n%i==0) sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        MyCalculator m = new MyCalculator();
        System.out.println(m.divisor_sum(6));;
    }
    
}
