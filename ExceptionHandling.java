
package String;
public class ExceptionHandling {
    
    public static void main(String[] args) {
      int a = 15, b = 0, c;
	try {
		c = a/b;
	} catch (Exception x) {
		System.out.println(x);
	}
    }
    
}
