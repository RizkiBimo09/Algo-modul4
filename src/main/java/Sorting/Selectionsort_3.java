package Sorting;
public class Selectionsort_3 {
    public static void main(String[] args){ 
    int B[] = {25, 7, 9, 13, 3};
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        int smallIndex;
        int temp;
        for (int i = 0; i < B.length - 1; i++){
             smallIndex = i;
            for (int j = i + 1; j < B.length; j++){
                if (B[j] < B[smallIndex]){
                    smallIndex = j;
                }
            }
             temp = B[i];
            B[i] = B[smallIndex];
            B[smallIndex] = temp;
        }
        System.out.println("Rizki Bimo Wijaya"); 
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}

