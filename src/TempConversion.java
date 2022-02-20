import java.util.Scanner;

public class TempConversion
{

	public static void main(String[] args) 
	{
		try (// scan user choice for conversion
				Scanner scan = new Scanner(System.in)) 
		{
					System.out.println("Enter 1 to Convert celcius to Farenheit");
					System.out.println("Enter 2 to Convert Farenheit to  celcius");
					int choice = scan.nextInt();

					double temperature = 0.0;
					double converted = 0.0;

					// logic for conversion
					if (choice == 1) 
					{
						System.out.println("Enter the temperature is celcius.");
						temperature = scan.nextDouble();
						converted = 9 / 5.0 * temperature + 32;
						System.out.println("Temperature in Fahrenheit is =" + converted);
					}
					else if (choice == 2)
					{
						System.out.println("Enter the temperature is Fahrenheit .");
						temperature = scan.nextDouble();
						converted = 5 / 9.0 * temperature - 32;
						System.out.println("Temperature in Celcius is =" + converted);
					}
					else
						System.out.println("Wrong Input .Please try again with 1 and 2 Input");
		 }
	}

}


