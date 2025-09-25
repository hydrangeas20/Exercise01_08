public class PerfectSquare { // define class - perfect square 
    
    public static void main(String[] args) {  //main method 
    // system will print out out result to the console 
        System.out.println(isPerfectSquare(1));   // will print true           
        System.out.println(isPerfectSquare(4));   // will print true              
        System.out.println(isPerfectSquare(Integer.MAX_VALUE/100)); // will print false 
        System.out.println(isPerfectSquare(255));  // will print false                
    }
    
    public static boolean isPerfectSquare(int num) { // define method called perfectsquare
        for(int i = 1; i <= num; i++) {          // for loop interates thru all numbers starting with one 
            if(i * i == num) {                   // checks if square is equal to num
                return true; 
        } else if (i * i > num) { // checks if square is greater than num
                return false;
            }
        }
        return false;  // loop finshes 
    }

}
