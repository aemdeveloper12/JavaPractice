public class Example6{
    public static void main(String[] args) {
		String s3="JAVA"+"PYTHON";
		String s4="JAVA"+"PYTHON";
        
        if(s3==s4){
            System.out.println("References are equal");
        }else{
            System.out.println("Reference are not equal");
        }
		
		if(s3.equals(s4)){
            System.out.println("Values are equal");
        }else{
            System.out.println("Values are not equal");
        }
    }
}