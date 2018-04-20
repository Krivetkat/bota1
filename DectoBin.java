package dectobin;
import java.util.Stack;

public class DectoBin {
    
    public static void main(String[] args){
      int num = 17;
      Stack<Integer> st = new Stack<>();
      while (num != 0){
          int rem =num % 2;
          st.push(rem);
          num /= 2;
      }
      for (int i = 0; i< st.size(); i++){
          System.out.print(st.get(i));
      }
    }
}
