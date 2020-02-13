package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.Point;


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

			final List<Point> customers = new ArrayList<>();

			while (customerOffices > 0)
			{
				final String cutomerOffice = sc.nextLine();
				final String[] arrCustOffice = cutomerOffice.split("\\s");

				final Point point = new Point(Integer.parseInt(arrCustOffice[0]), Integer.parseInt(arrCustOffice[1]),
						Integer.parseInt(arrCustOffice[2]));
				customers.add(point);

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
		}
		catch (final FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}


	// get file from classpath, resources folder
	private File getFileFromResources(final String fileName)
	{

		final ClassLoader classLoader = getClass().getClassLoader();

		final URL resource = classLoader.getResource(fileName);
		if (resource == null)
		{
			throw new IllegalArgumentException("file is not found!");
		}
		else
		{
			return new File(resource.getFile());
		}

	}
}
