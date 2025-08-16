class CustomerConstructor1{
    private int cID;
    private String cName;
    private long cNum;
	public CustomerConstructor1(){
		cID=1;
		cName="rupa";
		cNum=887172L;
	}
    public CustomerConstructor1(int cID, String cName, long cNum){
		this();
	}
    public int getcID(){
        return cID;
    }
    public String getcName(){
        return cName;
    }
    public long getcNum(){
        return cNum;
    }
}
class Encaps4{
    public static void main(String[] args) {
        CustomerConstructor1 c = new CustomerConstructor1(1, "Anjali", 998765L);
        System.out.println(c.getcID());
        System.out.println(c.getcName());
        System.out.println(c.getcNum());
        
    }
}