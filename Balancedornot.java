import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Balancedornot
{
	
    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
    	int[] ans = new int[maxReplacements.length];
    	for(int i=0; i<expressions.length;i++){
    		   ans[i] = Checker(expressions[i], maxReplacements[i]);
    	}
    	return ans;
    }
 
    static int Checker(String expression, int maxReplacement){
        //<<
    Stack<Character> stack = new Stack<Character>();
    int count = 0;
    for(char ch : expression.toCharArray()){
      if(ch == '<'){
        stack.push('<');
      }
      else if(stack.empty()){
        count++;
      }
      else{
        stack.pop();
      }
      }
 
 
      if(!stack.empty()){
          count+= stack.size();
      }else{
	return 0;
      }
 
       return count <= maxReplacement ? 1 : 0;
 
    }
 
 
 
  public static void main(String[] args) {
    String[] input = {"<<<><><>", "<><>>"}; //<> > <>
    int[] in = {2, 2};
    int[] res = balancedOrNot(input, in);
    for(int i : res){
      System.out.println(i);
    }
  }
}