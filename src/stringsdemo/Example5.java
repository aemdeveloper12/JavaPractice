package stringsdemo;
public class Example5{
    public static void main(String[] args) {
        String s1="Java";
        String s2="JAVA";
        
        if(s1==s2){
            System.out.println("References are equal");
        }else{
            System.out.println("Reference are not equal");
        }
		
		if(s1.equals(s2)){
            System.out.println("Values are equal");
        }else{
            System.out.println("Values are not equal");
        }
    }
}