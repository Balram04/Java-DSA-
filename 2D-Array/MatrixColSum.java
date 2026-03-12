import java.util.Scanner;
public class MatrixColSum{
    public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    int row =sc.nextInt();
    int col =sc.nextInt();
    int matrix[][]=new int[row][col];

    for(int i=0;i<col;i++){
        for(int j=0;j<row;j++){
            matrix[i][j]=sc.nextInt();
        }
     }
     for(int i=0;i<col;i++){
          int sum=0;
        for(int j=0;j<row;j++){
             sum+=matrix[i][j];
        }
        System.out.println("sum of col "+(i+1)+" is "+ sum);
     }

    }
}