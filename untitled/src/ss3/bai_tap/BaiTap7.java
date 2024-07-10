package ss3.bai_tap;


public class BaiTap7 {
    public static void main(String[] args) {
     int []arr={1,2,3,4,5,6,7,8,9};
     int [] arr1={1,2,3,4,5,6,7,8,9};
     int [] newArr= new int[arr.length + arr1.length];
     for(int i=0;i<arr.length;i++){
         newArr[i]=arr[i];
     }
     for(int i=0;i<arr1.length;i++){
         newArr[arr1.length+i]=arr1[i];
     }System.out.println("New array is:");
     for(int i=0;i<newArr.length;i++){
         System.out.print(newArr[i]+" ");
      }
    }
}