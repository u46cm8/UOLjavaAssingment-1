//Cameron Munro 150192354
import java.util.Scanner;


public class PartC {

	public static void main (String[] args) {
		// Defining the varibles 
		
		double earnings = 0,allowance = 0, firstTax = 0, secTax = 0, adTax = 0, net = 0, totalTax ;
		String blind = null, manual = null; 
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your income");
		
		earnings = in.nextInt();
		
		//Setting up basic allowance
		if(earnings <122000) allowance = 11000;
		
		//Making sure reletive data about blindness is collected with a while loop 

		int i = 0;		
		while( i == 0){
			blind = get(blind,"blind");
			//As strings could not be equated String.campareTo(another String) was used 
			if(blind.compareTo("Yes") == 0 || blind.compareTo("yes") == 0 || blind.compareTo("y") == 0 || blind.compareTo("Y") == 0){
				allowance = allowance +2290;
				i = 1;
				}
				
			if(blind.compareTo("No") == 0 || blind.compareTo("no") == 0 || blind.compareTo("n") == 0 || blind.compareTo("N") == 0)
				i = 1;
			}
		
		/*varible i is reset to serve as an index for another while loop to assure data about the subject being 
		a manual worker. 
		The reason a methord was used  to stop the loop from printing the question twice, 
		which I could not find out why it was being done; the methord fixed it*/
		i = 0;
		
		while( i == 0){
			
			manual = get(manual,"manual");			
			
			if(manual.compareTo("Yes") == 0 || manual.compareTo("yes") == 0 || blind.compareTo("y") == 0 || blind.compareTo("Y") == 0){
				allowance = allowance + 60;
				i++;
				
				}
			if( manual.compareTo("No") == 0 || manual.compareTo("no") == 0 || blind.compareTo("n") == 0 || blind.compareTo("N") == 0){
				i++;
					}
		}

		/*Embeded conditional statements had to be used to meet tax conditions and a net value to keep track of 
		untaxed income vs total income*/
		
		if(earnings >=122000) allowance = 0;
		if(earnings >= allowance) {
			if(earnings >= 43000){
			firstTax = (43000-allowance) * 0.2;
			net = earnings - 43000;
			}
			else{
				firstTax = (earnings-allowance)*0.2;
			}
		
		}
		if(earnings > 43000){
			if(earnings >= 150000){
				secTax = (150000 - 43000) * 0.4;
				net = (earnings - 150000);
			}
			else{
				secTax = net * 0.4;
			}
				
		}
		if(earnings > 150000) adTax = net * 0.45;
		
		System.out.printf("Your Salary is %.2f \nYour allowance is %.2f"  ,earnings,allowance);
		System.out.printf("\nYou owe %.2f in the first tax band (20%% tax) paid on  income 43,000",firstTax);
		System.out.printf("\nYou owe %.2f in the second tax band (40%% tax) paid on taxable income above 43,000 and up 150,000", secTax);
		System.out.printf("\nYou owe %.2f in the third tax band (45%% tax) paid on taxable income over 150,000", adTax);
		totalTax = (firstTax+secTax+adTax); 
		System.out.printf("\n Total tax owed on your salary = %.2f", totalTax );
		
		
		}
	
	static String get(String x,String y){
		System.out.println("Are you "+y+"?(Yes/No)");
		Scanner in = new Scanner(System.in);
		x = in.nextLine();
		return x;
		}
		
		
}
