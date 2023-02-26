import java.util.Scanner;

public class Count_Frequency_Of_Array{
    
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        int number,length;
        System.out.println("Enter Length of the array: ");
        length=input.nextInt();
        int arr[]=new int[length];
        int visited=-1;
        //Make array of your choice.
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Number: ");
            number=input.nextInt();
            arr[i]=number;
        }
        int frequency[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    frequency[j]=visited;
                }
            }
            if(frequency[i]!=visited){
                frequency[i]=count;
            }
        }
        System.out.println("Number  " +  "Frequency");
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]!=visited){
            System.out.println(arr[i]+" " +"          "+frequency[i]);
           }
        }
    }
}