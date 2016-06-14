import java.util.Scanner;

public class TaxActivity {

public static void main(String[] args) {
String customernumber, customername, taxcode;
double salesamount, total=0;


Scanner keyboard = new Scanner(System.in);

System.out.print( "Please enter customer number: " );
customernumber = keyboard.next();

System.out.print( "Please enter customer name: " );
customername = keyboard.next();

System.out.print( "Please enter sales amount: " );
salesamount = keyboard.nextDouble();

System.out.print( "Please enter taxcode: " );
taxcode = keyboard.next();

if(taxcode.equals("NRM"))
{
	total=(salesamount*1.06);
}
else if(taxcode.equals("NPF"))
{
	total=salesamount;
}
else if(taxcode.equals("BIZ"))
{
	total=salesamount*(1+0.045);
}

System.out.println("Your total is "+total);


}
}