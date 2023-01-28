public class TestBank {
    public static void main(String[] args) {
        Banka ba = new Banka();
        Bankb bb = new Bankb();
        Bankc bc =  new Bankc();
        System.out.println("Balance of bank a, b, c are "+ba.getBalance()+" "+bb.getBalance()+" "+bc.getBalance());
    }       
}