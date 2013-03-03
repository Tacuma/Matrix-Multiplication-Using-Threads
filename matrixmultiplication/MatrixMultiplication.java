/* Tacuma Solomon
 * @02580808
 * Operating Systems
 * Lab 2 Part B - Project Multi-threaded Matrix Multiply using 1) Java Threads 
 */
package matrixmultiplication;

public class MatrixMultiplication {

    //initializes variables for dimensions
    public static int M = 3;
    public static int K = 2;
    public static int N = 3;
    
    //Declares Arrays A,B,C, and an Array or WorkerThreads
    public static int [][] A = {{1,4}, {2,5}, {3,6}}; //Initializes A
    public static int [][] B = {{8,7,6}, {5,4,3}};    //Initializes B
    public static int [][] C = new int [M][N];
    public static WorkerThread [][] Threads = new WorkerThread [3][3];
    
    
    public static void main(String[] args) {      
        //creates 9 Worker threads. Each thread Calculates a Matrix Value and sets it to C matrix
        for (int i = 0; i<M; i++){
            for (int j=0; j<N; j++){
                Threads[i][j] = new WorkerThread(i,j,A,B,C);
                Threads[i][j].run();
            }
        }
        
        //Outputs the Values of Matrix C
        for (int i = 0; i<M; i++){
            for (int j=0; j<N; j++){
                System.out.println("["+i+","+j+"] = "+C[i][j]);
            }
        }  
    }
}
