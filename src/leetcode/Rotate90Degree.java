/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
*/
package leetcode;

/**
 *
 * @author Pratik
 */
public class Rotate90Degree {
    public void rotate(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException();
        }
        
        final int N = matrix.length;
        
        // for each layer
        // a matrix with N = 4 has two layers, N=5 has 2 layers (middle element never needs to be moved)
        for (int i = 0; i < N / 2; i++) {
            // when i = 0, layer has N - 1 elements. each subsequent layer has 2 less 
            for (int j = i; j < N - 1 - i; j++) {
                // save top in temp var
                int top = matrix[i][j];
                
                // top = left
                matrix[i][j] = matrix[N - 1 - j][i];
                
                // left = bottom
                matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
                
                // bottom = right
                matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
                
                // right = top
                matrix[j][N - 1 - i] = top;
            }
        }
    }
    
}
