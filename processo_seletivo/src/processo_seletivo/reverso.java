package processo_seletivo;

public class reverso {
	 public static void main(String[] args) {
	        String original = "Hello, world!";
	        String reversed = "";
	        
	        for (int i = original.length() - 1; i >= 0; i--) {
	            reversed += original.charAt(i);
	        }
	        
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }
}
