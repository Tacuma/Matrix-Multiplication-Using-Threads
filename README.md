#Matrix Multiplication Using Threads


#Data Structures/Concepts Used
Object Oriented Programming, Arrays, Threads


#Description
Given two matrices, A and B, where matrix A contains M rows and K columns and matrix B contains K rows and N columns, the matrix product of A and B for matrix C,
where C contains M rows and N columns. This program calculates each element C in a separate worker thread.

The values of M, K, and M are declared and initialized using public static integers. The matrices A and B are declared and initialized in the form 
of 2 dimensional arrays with memory being allocated for matrix C. 
These matrices are declared public so that they can be accessed by the workers. 2 classes are used in the implementation, 
the MatrixMultiplication class and the WorkerThread class. 

MatrixMuliplication class :  
This is the main class. This class initializes the matrices as public. A 2 dimensional array of WorkerThreads is also declared to hold the threads as they initialized in main. When in the main, a nested loop invokes 9 new WorkerThreads, which  is started and run, each thread representing a space in Matrix C for a value to be calculated. The threads are run, and the value of matrix C is displayed to the screen. 
 
WorkerThread class:   
                This class is the representation of a worker thread. It contains values for its identifying column and row, and the values of Matrices A and B. The thread, using its run method, then calculates its individual value for C, each thread corresponding with a single piece of the C matrix.


#Output:
	Elements of Matrix C:
	[0,0] = 28
	[0,1] = 23
	[0,2] = 18
	[1,0] = 41
	[1,1] = 34
	[1,2] = 27
	[2,0] = 54
	[2,1] = 45
	[2,2] = 36
