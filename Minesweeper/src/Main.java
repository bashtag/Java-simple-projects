import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ctrl + Shift + F
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int row, column;
		
		System.out.println("Welcome to Mine Sweeper !\n"
				+ "Please define your game size !\n"
				+ "Row : ");
		row = scan.nextInt();
		System.out.println("Column: ");
		column = scan.nextInt();
		
		MineSweeper mine = new MineSweeper(row, column);
		mine.run();
	}

}
