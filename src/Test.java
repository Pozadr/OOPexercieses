/*
Code wars task. Change String for different String where:
A -> T
T -> A
G -> C
C -> G
 */
public class Test {

    public String changeLetters(String input){
        String[] arr = input.split("");
       // System.out.print(arr[0]);
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("A")){
                arr[i] = "T";
            }
            else if(arr[i].equals("T")){
                arr[i] = "A";
            }
            else if(arr[i].equals("G")){
                arr[i] = "C";
            }
            else if(arr[i].equals("C")){
                arr[i] = "G";
            }
        }


        return String.join("", arr);
    }
}
