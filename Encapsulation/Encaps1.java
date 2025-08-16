class BankAccount{
    private float bal;
    public void setData(float x){
        if(x>0){
            bal=x;
        }
        
    }
    public float getData(){
        return bal;
    }
}
class Encaps1 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setData(1000);
        System.out.println(ba.getData());
        
    }
}