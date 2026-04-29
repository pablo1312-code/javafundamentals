package algorithm;

import java.util.List;

public class RecursiveAlgorithms {
	
	void printStarsRecursive(int count) {
	    if (count == 0) return;
	    System.out.print("* ");
	    printStarsRecursive(count - 1);
	}

	public static void drawGridRecursive(int rows, int cols) {
	    if (rows == 0) return;
	    printStars(cols);
	    System.out.println();
	    drawGridRecursive(rows - 1, cols);
	}
	    // Método printStars convertido a interativo con bucles
	    public static void printStars(int count) {
	        if (count <= 0) return;
	        
	        // Bucle que reemplaza la recursión
	        for (int i = 0; i < count; i++) {
	            System.out.print("* ");
	        }
	    }

	    // Método drawGrid convertido a iterativo con bucles
	    public static void drawGrid(int rows, int cols) {
	        if (rows <= 0 || cols <= 0) return;
	        
	        // Bucle exterior para las filas
	        for (int i = 0; i < rows; i++) {
	            printStars(cols);
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Prueba del ejercicio
	        drawGrid(3, 5);
	        drawGridRecursive(10000000, 100000000);
	    }
	
	
	
	public static int paths(int row, int col) {
        if (row == 0 || col == 0) {
            return 1;
        }
        return paths(row - 1, col) + paths(row, col - 1);
    }
	
	public static int transform(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + transform(n / 10);
    }
	
	
	public static int process(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        int head = list.get(0);
        List<Integer> rest = list.subList(1, list.size());
        
        if (head % 2 != 0) {
            return head + process(rest);
        } else {
            return process(rest);
        }
    }
	
	
	public static <T> int analyze(Node<T> node) {
        if (node == null) {
            return 0;
        }
        
        int a = analyze(node.left);
        int b = analyze(node.right);
        
        return 1 + Math.max(a, b);
    }
	
	
	public static String execute(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return execute(s.substring(1)) + s.charAt(0);
    }
	
	
	private class Node<T> {

		public Node<T> left;
		public Node<T> right;
		
	}
}
