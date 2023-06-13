package pickfloat;
import java.util.*;
public class PickFloat 
{
	/*Java program to illustrate the
	  nextFloat() method of Scanner class in Java
	  without parameter*/
		public static void main(String[] args)
			//throws Exception
		{
			Scanner scnr=new Scanner(System.in);
            System.out.println("Input a string with numbers");
			String s = scnr.nextLine();

			// create a new scanner
			// with the specified String Object
			Scanner sc = new Scanner(s);

			while (sc.hasNext()) 
			{

				// if the next is a Float,
				// print found and the Float
				if (sc.hasNextFloat()) 
				{
					System.out.println("Found Float value : "
									+ sc.nextFloat());
				}

				// if no float is found,
				// print "Not Found:" and the token
				else 
				{
					System.out.println("Not found Float value : "
									+ sc.next());
				}
			}
			//sc.close();
		}
	}