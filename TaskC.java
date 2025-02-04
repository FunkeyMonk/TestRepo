//Jordan Fleming
//CS1400
//Assignment 3
//9/24/2024
public class TaskC {
    public static void main(String[] args) {
        for(int i = 5; i>0; i--){ //counts down from 5 to 0 to create 5 rows with each row lower being one less than the row above
            for (int a = 0; a<i; a++){ //uses row # to find how many cheers to put ex. 4th row = 4 cheers
                System.out.print("\\o/");
            }
            System.out.println("\n");
        }
    }
}
