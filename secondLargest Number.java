import java.util.*;
public class secondLargestNumber{
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size= sc.nextInt();
      int [] arr=new int[size];
      for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
      } 
      Arrays.sort(arr);
      for(int i=0;i<size;i++){
      System.out.println(" "+arr[i]);
      }
      System.out.println("the second largest element is:"+arr[arr.length-2]);
       
    }
}
