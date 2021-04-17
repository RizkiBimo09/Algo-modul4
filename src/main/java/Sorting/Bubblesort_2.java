package Sorting;
public class Bubblesort_2 {
    public static void main(String[] args) {
        int B[] = {25, 7, 9, 13, 3};
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        int k=1;
        int temp;
        while (k<B.length){
            int j = B.length-1;
            while (j>=1){
                if (B[j-1]>B[j]){
                     temp = B[j];
                    B[j] = B[j-1];
                    B[j-1] = temp;
                }
                j = j - 1;
            }
            k = k + 1;
        }
        System.out.println("Rizki Bimo Wijaya");
        for (int i=0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}

