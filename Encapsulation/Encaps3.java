class CustomerConstructor{
    private int cID;
    private String cName;
    private long cNum;
    public CustomerConstructor(int cID, String cName, long cNum){
		this.cID = cID;
		this.cName = cName;
		this.cNum = cNum;
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
class Encaps3{
    public static void main(String[] args) {
        CustomerConstructor c = new CustomerConstructor(1, "Rohit", 998765L);
        System.out.println(c.getcID());
        System.out.println(c.getcName());
        System.out.println(c.getcNum());
        
    }
}