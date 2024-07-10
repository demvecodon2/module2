package ss3.thuc_hanh;



public class ThucHanh5 {
    public static void main(String[] args) {
       int [] arr={1,2,3,4,5};
       int []arr1={1,2,3,4,5};
       int []newarr= new int [arr.length+arr1.length];
        for (int i = 0,j=0,k=0; i <newarr.length ; i++,j++,k++) {
            if (k>=arr.length){
                newarr[k] = arr[j];
            }else {
                newarr[k] = arr[i];
                j--;
            }

        }
        System.out.println("NEW ARRAY");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(newarr[i]);
        }
        }
    }

