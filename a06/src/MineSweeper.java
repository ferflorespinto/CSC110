/*
 * Student Name: Jorge Fernando Flores Pinto 
 * ID: V00880059
 *
 * This class MineSweeper consists of the famous game "MineSweeper." It works
 * just like the original game: revealing cells on a grid until the player reveals
 * all cells but the ones with bombs or getting a game over if the players hits a bomb.
 *
 */

import java.util.*;
import java.util.Random;

public class MineSweeper {
	//Places bombs at random on the game grid
	public static String[][] initializeFullGrid(String[][] grid) {
		Random rand = new Random();
		int proximity = 0;
		int a = 0;
		int b = 0;
		for(int i = 1; i <= 10; i++) {
			do {
				a = rand.nextInt(8);
				b = rand.nextInt(8);
			} while (grid[a][b] == "X");
			grid [a][b] = "X";

		}
		return grid;

	}
	//Set the number of mines around each cell
	public static String[][] mapMines(String[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == "X") {
					reckonPoints(i, j, grid);
				}
			}
		}
		return grid;

	}
	//Count the bombs close to the cell
	public static String reckoning(String cell) {
		int newVal = 0;
		if (cell != " ") {
			newVal = Integer.parseInt(cell) + 1;
		} else {
			newVal = 1;

		}
		return Integer.toString(newVal);
	}

	//Finds where the bombs are located and counts how many bombs are around
	// a particular point
	public static String[][] reckonPoints(int a, int b, String[][] arr) {
		String strReck = "";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(Math.abs(a - i) == 1 || (a - i) == 0) {
					if(arr[i][j] != "X") {
						if(Math.abs(b - j) == 1 || (b - j) == 0) {
							arr[i][j] = reckoning(arr[i][j]);

						}

					}
				}
			}
		}
		return arr;
	}
	//Prints the initial grid with points only
	public static void drawFullGrid(String[][] arr) {
		System.out.println("  | 0 1 2 3 4 5 6 7");
		System.out.println("-------------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + " | ");
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ".";
				String print = arr[i][j] + " ";
				System.out.print(print);

			}
			System.out.println();

		}
	}
	/* Reveals the grid as the user plays and interacts with the game.
	 * @param grid, the grid that keeps track of the bombs' placement
	 * @param shellGrid, the grid that the user sees and is revealed as he interacts
	 */
	public static void revealGridCell(int row, int col, String[][] grid, String[][] shellGrid) {
		if(grid[row][col] == " ") {
			if(row == 0 && col == 0) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row][col + 1] = grid[row][col + 1];
				shellGrid[row + 1][col] = grid[row + 1][col];
				shellGrid[row + 1][col + 1] = grid[row + 1][col + 1];

			} else if(row == 0  && col < 7) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row][col + 1] = grid[row][col + 1];
				shellGrid[row][col - 1] = grid[row][col - 1];
				shellGrid[row + 1][col] = grid[row + 1][col];
				shellGrid[row + 1][col - 1] = grid[row + 1][col - 1];
				shellGrid[row + 1][col + 1] = grid[row + 1][col + 1];

			} else if(row == 0 && col == 7) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row][col - 1] = grid[row][col - 1];
				shellGrid[row + 1][col] = grid[row + 1][col];
				shellGrid[row + 1][col - 1] = grid[row + 1][col - 1];

			} else if(row == 7 && col == 0) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row][col + 1] = grid[row][col + 1];
				shellGrid[row - 1][col] = grid[row - 1][col];
				shellGrid[row - 1][col + 1] = grid[row - 1][col + 1];

			} else if(row == 7 && col < 7) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row][col + 1] = grid[row][col + 1];
				shellGrid[row][col - 1] = grid[row][col - 1];
				shellGrid[row - 1][col] = grid[row - 1][col];
				shellGrid[row - 1][col - 1] = grid[row - 1][col - 1];
				shellGrid[row - 1][col + 1] = grid[row - 1][col + 1];

			} else if(row == 7 && col == 7) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row][col - 1] = grid[row][col - 1];
				shellGrid[row - 1][col] = grid[row - 1][col];
				shellGrid[row - 1][col - 1] = grid[row - 1][col - 1];

			} else if (row < 7 && col == 0) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row - 1][col] = grid[row - 1][col];
				shellGrid[row - 1][col + 1] = grid[row - 1][col + 1];
				shellGrid[row][col + 1] = grid[row][col + 1];
				shellGrid[row + 1][col + 1] = grid[row + 1][col + 1];
				shellGrid[row + 1][col] = grid[row + 1][col];

			} else if(row < 7 && col == 7) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row - 1][col] = grid[row - 1][col];
				shellGrid[row - 1][col - 1] = grid[row - 1][col - 1];
				shellGrid[row][col - 1] = grid[row][col - 1];
				shellGrid[row + 1][col - 1] = grid[row + 1][col - 1];
				shellGrid[row + 1][col] = grid[row + 1][col];

			} else if(row < 7 && col < 7) {
				shellGrid[row][col] = grid[row][col];
				shellGrid[row - 1][col - 1] = grid[row - 1][col - 1];
				shellGrid[row - 1][col] = grid[row - 1][col];
				shellGrid[row - 1][col + 1] = grid[row - 1][col + 1];
				shellGrid[row][col - 1] = grid[row][col - 1];
				shellGrid[row + 1][col - 1] = grid[row + 1][col - 1];
				shellGrid[row + 1][col] = grid[row + 1][col];
				shellGrid[row + 1][col + 1] = grid[row + 1][col + 1];
				shellGrid[row][col + 1] = grid[row][col + 1];
			
			}
		//if the user hits a bomb, gets game over
		} else if(grid[row][col] == "X") {
			for(int i = 0; i < grid.length; i++) {
				for(int j = 0; j < grid[i].length; j++) {
					if(grid[i][j] == " ") {
						grid[i][j] = ".";

					} else if(grid[i][j] == "X") {
						grid[i][j] = "B";
						grid[row][col] = "X";
					}
				}
			}
			shellGrid = grid;
			System.out.println("Kaboom! Game Over!");
			printRealGrid(shellGrid);


		}
		shellGrid[row][col] = grid[row][col];

	}


	//Assigns the value of points to an "underlying" grid which will reveal 
	//bombs and numbers as the user interacts with the game
	public static void underlyingGrid(String[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = " ";
				String print = arr[i][j] + " ";

			}
		}
	}
	//Prints the "underlying", or real, grid as the user interacts with the game
	public static void printRealGrid(String[][] arr) {
		System.out.println("  | 0 1 2 3 4 5 6 7");
		System.out.println("-------------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + " | ");
			for(int j = 0; j < arr[i].length; j++) {
				String print = arr[i][j] + " ";
				System.out.print(print);

			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		String [][] grid = new String [8][8];
		String [][] shellGrid = new String[8][8];
		String [][] minedGrid = new String[8][8];

		Scanner input = new Scanner(System.in);
		int row = 0;
		int col = 0;
		int counter = 0;
		drawFullGrid(shellGrid);
		//System.out.println();
		underlyingGrid(grid);
		minedGrid = initializeFullGrid(grid);
		mapMines(minedGrid);
		//printRealGrid(grid);
		System.out.println();
		do {
			System.out.print("Select a cell. Row value (a digit between 0 and 7): ");
			row = input.nextInt();
			while(row > 7) {
				System.out.print("Wrong row value. Please enter a valid value (a digit between 0 and 7): ");
				row = input.nextInt();

			}
			System.out.print("Select a cell. Column value (a digit between 0 and 7): ");
			col = input.nextInt();
			while(col > 7) {
				System.out.print("Wrong column value. Please enter a valid value (a digit between 0 and 7): ");
				col = input.nextInt();

			}
			/* The following lines check the progress of the user in the game.
			 * The program counts how many spaces are left in the grid unrevealed.
			 * Whenever counter reaches 10, that means the user has revealed all spaces
			 * but the ones with a bomb on it, and so has won the game.
			 */
			revealGridCell(row, col, minedGrid, shellGrid);
			for(int i = 0; i < shellGrid.length; i++) {
				for(int j = 0; j < shellGrid[i].length; j++) {
					if(shellGrid[i][j] == ".") {
					counter++;

					}
				}
			}			
			if(counter != 10) {
				counter = 0;
				if(grid[row][col] != "X") {
					printRealGrid(shellGrid);
				}			
			}
			else if(counter == 10) {
				System.out.println("Congrats! You won!");
				for(int i = 0; i < shellGrid.length; i++) {
					for(int j = 0; j < shellGrid[i].length; j++) {
						if(shellGrid[i][j] == ".") {
							shellGrid[i][j] = "B";
								
						}
					}
				}				
				printRealGrid(shellGrid);
				break;

			}				
		} while (grid[row][col] != "X");

	}	
}