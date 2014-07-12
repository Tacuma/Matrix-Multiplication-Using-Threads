/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplication;

/**
 *
 * @author TaKuma
 */
public class WorkerThread extends Thread{
    private int row;
    private int col;
    private int [][] A;
    private int [][] B;
    private int [][] C;
    
    public WorkerThread(int row, int col, int[][] A,
      int[][] B, int[][] C) {
        this.row = row;
        this.col = col;
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public void run() {
        C[row][col] = (A[row][0] * B[0][col])+ (A[row][1]*B[1][col]) ; 
    }   
}
