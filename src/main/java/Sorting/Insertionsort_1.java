package Sorting;
public class Insertionsort_1 {
     public static void main(String[] args) {
        int B[] = {25, 7, 9, 13, 3};
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i]+ " ");
        }
        for (int i = 1; i < B.length; i++){
            int key = B[i];
            int j = i - 1;
            while((j >= 0) && (B[j] > key)){
                
                B[j + 1] = B[j];
                j--;
            }
            B[j + 1] = key;
        }
        System.out.println("Rizki Bimo Wijaya");
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i]+ " ");
        }
    }
}
    

