class CustomerEncaps2{
    private int cID;
    private String cName;
    private long cNum;
    public void setData(int cID, String cName, long cNum){
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
class Encaps2{
    public static void main(String[] args) {
        CustomerEncaps2 c = new CustomerEncaps2();
		c.setData(1,"Rohit",987654L);
        System.out.println(c.getcID());
        System.out.println(c.getcName());
        System.out.println(c.getcNum());
        
    }
}