package java.codechalange.main;

import java.codechalange.data.Customer;
import java.codechalange.data.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InputReader
{
	public static void main(final String[] args)
	{
		final InputReader reader = new InputReader();
		final File f = new File("resources/1_victoria_lake.txt");
		try
		{
			final FileInputStream inputStream = new FileInputStream(f);
			final Scanner sc = new Scanner(inputStream, "UTF-8");

			System.out.println("Start reading file......");


			final String firstLine = sc.nextLine();
			final String[] firstArr = firstLine.split("\\s");
			int customerOffices = Integer.parseInt(firstArr[2]);

			final int n = Integer.parseInt(firstArr[0]);
			final int m = Integer.parseInt(firstArr[1]);
			final char[][] grid = new char[m][n];

			final List<Customer> customers = new ArrayList<>();

			while (customerOffices > 0)
			{
				final String cutomerOffice = sc.nextLine();
				final String[] arrCustOffice = cutomerOffice.split("\\s");

				final Point point = new Point(Integer.parseInt(arrCustOffice[0]), Integer.parseInt(arrCustOffice[1]));
				final Customer customer = new Customer(point,
						Integer.parseInt(arrCustOffice[2]));
				customers.add(customer);

				customerOffices--;
			}

			int countRow = 0;

			while (sc.hasNextLine())
			{

				final String line = sc.nextLine();
				for (int i = 0; i < n; i++)
				{
					grid[countRow][i] = line.charAt(i);
				}
				countRow++;
			}
			System.out.println("Finished reading file......");

			//create Route iterator for each coordinate in the grid

			//Iterate the Route iterator to find the apt offices

			//populate the Output object

			//convert the output object to a file
		}
		catch (final FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
