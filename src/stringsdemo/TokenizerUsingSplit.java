package stringsdemo;
class TokenizerUsingSplit {
    public static void main(String[] args) {
        String s = "JAVA PYTHON SQL AI";
        String[] parts=s.split("A");
        
        for(String token:parts){
            System.out.println(token);
        }
    }
}