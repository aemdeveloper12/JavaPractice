class CustomerConstructor2{
    private int cID;
    private String cName;
    private long cNum;
	public CustomerConstructor2(){
		cID=1;
		cName="rupanjali";
		cNum=887175L;
	}
	public CustomerConstructor2(String cName){
		this();
		this.cName=cName;
	}
    public CustomerConstructor2(int cID, String cName, long cNum){
		this(cName);
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
class Encaps5{
    public static void main(String[] args) {
        CustomerConstructor2 c = new CustomerConstructor2(1, "Anjali", 998765L);
        System.out.println(c.getcID());
        System.out.println(c.getcName());
        System.out.println(c.getcNum());
        
    }
}