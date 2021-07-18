package oop;
import java.util.Scanner;  //scanner libraries to take input from user
public class CurrencyConverterByShariqAliSaadBEE57B {

	public static void main(String[] args) { // class starts from here
		double C=0,D=0;
		System.out.println("Welcome to currency converter ");//welcoming line
		System.out.println("enter only index number");//instructions
		Scanner A=new Scanner(System.in);//scanner class declared
		int B=-1,E;//loop initial condition
		while(B!=(0))//to repeat program
	    {System.out.println();//to put line gap
		System.out.println("enter '0' to exit, to continue enter currency index ");//user guide
	    System.out.println();//to put line gap
		System.out.println("1)US Dollars             2)EURO              3)POUND               4) Pakistani RUPEES    5)YEN");//list
		System.out.println("6)Kuwait Dinar           7)Swiss Franc       8)Oman Rial           9)Canadian Dollar     10)Ind Rupees");//list
		System.out.println("11)Australlian Dollars   12)NZ dollars       13)Singapore Dollar  14)Turkish Lira        15)CNY");//list
		System.out.println("16)Hong kong Dollars     17)Russian Ruble    18)Algerian Dinar    19)Argentine peso      20)Thai Bhat");//list
		System.out.println("21)Brazilian Real        22)Belgerian lev    23)Chilian Peso      24)Crotian Kuna        25)Czech koruna");//list
		System.out.println("26)Danish korne          27)Egyptian pound   28)Ethereum          29)Hungarian Forint    30)Iceland Krona");//list
		System.out.println("31)Indonasian Rupiah     32)Iranian Rial     33)Korean won        34)Malaysian Ringgit   35)Mexican Peso");//list
		System.out.println("36)Nigerian Naira        37)Norwagian Krone  38)Phillipine Peso   39)Polish Zloty        40)Qatari Rial");//list
		System.out.println("41)Romanian Leu          42)Saudi Rial       43)Serbian Dinar     44)SA Rand             45)Sri lankan Rupees");
		System.out.println("46)Swedish Krona         47)Taiwan Dollars   48)Ukarine Hryvnia   49)UAE Dirham          50)Zimbawe Dollars");//list
		System.out.print("select your home currency : ");B=A.nextInt();//taking home currency index
		outer :if(B>=0 && B<=50)//loop conditions to repeat program(if Else)
		{if(B==0) {break;}//'0' to exit program
			
		double d=1; double g;
		System.out.print("enter amount : "); g=A.nextDouble();//converting amount to dollars
		inner :switch(B) //converting to dollars
		{case 1: d=g*1; System.out.println(g+" Dollars = "+d+" US Dollars");//converting amount to dollars
        break;
		case 2: d=g*1.19; System.out.println(g+" Euros = "+d+"US Dollars");//converting amount to dollars
	
		break;
		case 3: d=g*1.38; System.out.println(g+" Pounds = "+d+"US Dollars");//converting amount to dollars
        break;
		case 4: d=g*0.0063; System.out.println(g+" Rupees = "+d+"US Dollars");//converting amount to dollars
        break;
		case 5: d=g*0.0090; System.out.println(g+" YEN = "+d+"US Dollars");//converting amount to dollars
        break;
		case 6: d=g*3.32; System.out.println(g+" Kuwait Dinars = "+d+"US Dollars");//converting amount to dollars
        break;
		case 7: d=g*1.08; System.out.println(g+" Swiss Franc = "+d+"US Dollars");//converting amount to dollars
        break;
		case 8: d=g*2.60; System.out.println(g+" Omani Rial = "+d+"US Dollars");//converting amount to dollars
        break;
		case 9: d=g*0.8038; System.out.println(g+" Canadian Dollars = "+d+"US Dollars");//converting amount to dollars
        break;
		case 10: d=g*0.0134; System.out.println(g+" Indian Rupees = "+d+"US Dollars");//converting amount to dollars
        break;
        case 11: d=g*0.746; System.out.println(g+" Australlian Dollars = "+d+"US Dollars");//converting amount to dollars
        break;
        case 12: d=g*0.696; System.out.println(g+" NZ Dollars = "+d+"US Dollars");//converting amount to dollars
        break;
        case 13: d=g*0.741; System.out.println(g+" Singaporian Dollars = "+d+"US Dollars");//converting amount to dollars
        break;
        case 14: d=g*0.115; System.out.println(g+" Turkish Lira = "+d+"US Dollars");//converting amount to dollars
        break;
        case 15: d=g*0.154; System.out.println(g+" CNY = "+d+"US Dollars");//converting amount to dollars
        break;
        case 16: d=g*0.1288; System.out.println(g+" Hong Kong Dollar = "+d+"US Dollars");//converting amount to dollars
        break;
        case 17: d=g*0.0136; System.out.println(g+" Russian Ruble = "+d+"US Dollars");//converting amount to dollars
        break;
        case 18: d=g*0.0074; System.out.println(g+" Algerian Dinar = "+d+"US Dollars");//converting amount to dollars
        break;
        case 19: d=g*0.0104; System.out.println(g+" Argentin Peso = "+d+"US Dollars");//converting amount to dollars
        break;
        case 20: d=g*0.312; System.out.println(g+" Thai Bhat = "+d+"US Dollars");//converting amount to dollars
        break;
        case 21: d=g*0.1984; System.out.println(g+" Brazilian Real = "+d+"US Dollars");//converting amount to dollars
        break;
        case 22: d=g*0.606; System.out.println(g+" Bulgarian Lev = "+d+"US Dollars");//converting amount to dollars
        break;
        case 23: d=g*0.0013; System.out.println(g+" Chilian Peso = "+d+"US Dollars");//converting amount to dollars
        break;
        case 24: d=g*0.1582; System.out.println(g+" Crotian Kuna = "+d+"US Dollars");//converting amount to dollars
        break;
        case 25: d=g*0.0464; System.out.println(g+" Czech Koruna = "+d+"US Dollars");//converting amount to dollars
        break;
        case 26: d=g*0.1593; System.out.println(g+" Danish Krone = "+d+"US Dollars");//converting amount to dollars
        break;
        case 27: d=g*0.0637; System.out.println(g+" Egyptian Pound = "+d+"US Dollars");//converting amount to dollars
        break;
        case 28: d=g*2114; System.out.println(g+" Ethereum = "+d+"US Dollars");//converting amount to dollars
        break;
        case 29: d=g*0.0034; System.out.println(g+" Hungarian Dollars = "+d+"US Dollars");//converting amount to dollars
        break;
        case 30: d=g*0.0081; System.out.println(g+" Iceland Krona = "+d+"US Dollars");//converting amount to dollars
        break;
        case 31: d=g*0.0001; System.out.println(g+" Indonasian Rupiah = "+d+"US Dollars");//converting amount to dollars
        break;
        case 32: d=g*0.00002; System.out.println(g+" Iranian Rial = "+d+"US Dollars");//converting amount to dollars
        break;
        case 33: d=g*0.0009; System.out.println(g+" Korean Won = "+d+"US Dollars");//converting amount to dollars
        break;
        case 34: d=g*0.2404; System.out.println(g+" Malaysian Ringgit = "+d+"US Dollars");//converting amount to dollars
        break;
        case 35: d=g*0.0499; System.out.println(g+" Mexican Peso = "+d+"US Dollars");//converting amount to dollars
        break;
        case 36: d=g*0.0024; System.out.println(g+" Nigerian Nira = "+d+"US Dollars");//converting amount to dollars
        break;
        case 37: d=g*0.1159; System.out.println(g+" Norwegian Krone = "+d+"US Dollars");//converting amount to dollars
        break;
        case 38: d=g*0.0203; System.out.println(g+" Phillipine Peso = "+d+"US Dollars");//converting amount to dollars
        break;
        case 39: d=g*0.2623; System.out.println(g+" Polish Zloty = "+d+"US Dollars");//converting amount to dollars
        break;
        case 40: d=g*0.2746; System.out.println(g+" Qatari Rial = "+d+"US Dollars");//converting amount to dollars
        break;
        case 41: d=g*0.2404; System.out.println(g+" Romanian Leu = "+d+"US Dollars");//converting amount to dollars
        break;
        case 42: d=g*0.2666; System.out.println(g+" Saudi Rial = "+d+"US Dollars");//converting amount to dollars
        break;
        case 43: d=g*0.0101; System.out.println(g+" Serbian Dinar = "+d+"US Dollars");//converting amount to dollars
        break;
        case 44: d=g*0.0691 ;System.out.println(g+" SA Rand = "+d+"US Dollars");//converting amount to dollars
        break;
        case 45: d=g*0.005; System.out.println(g+" Sri Lankan Rupees = "+d+"US Dollars");//converting amount to dollars
        break;
        case 46: d=g*0.1166; System.out.println(g+" Swedish Krona = "+d+"US Dollars");//converting amount to dollars
        break;
        case 47: d=g*0.0358; System.out.println(g+" Taiwan Dollar = "+d+"US Dollars");//converting amount to dollars
        break;
        case 48: d=g*0.0365; System.out.println(g+" Ukaraine Hryvnia = "+d+"US Dollars");//converting amount to dollars
        break;
        case 49: d=g*0.2723; System.out.println(g+" UAE Dirham = "+d+"US Dollars");//converting amount to dollars
        break;
        case 50: d=g*0.000018; System.out.println(g+" Zimbawe Dollar = "+d+"US Dollars");//converting amount to dollars
        break;}
		
		System.out.print("select your desired currency : "); E=A.nextInt();//select your desired currency
		if(E<=0||E>=51)//to check valid index number
		{System.out.println("INVALID INDEX");//warning
			System.out.println("PLEASE ENTER THE INDEX CAREFULLY");}//warning
	    switch(E)//switch on desired currency
	    {case 1:
		
		D=(d)*(1);
		 System.out.println(d+" Dollars = "+D+" Dollars");//converting to desired currency
	
	    break;
	    case 2:
		D=(d)*(0.84);
		 System.out.println(d+"US Dollars = "+D+" Euros");//converting to desired currency
	    break;
	    case 3:
	    	D=(d)*(0.72);
			 System.out.println(d+"US Dollars = "+D+" Pounds");//converting to desired currency
		break;
	    case 4:
	    	D=(d)*(158.06);
			 System.out.println(d+"US Dollars = "+D+" Pak rupees");//converting to desired currency
		break;
	    case 5:
	    	D=(d)*(111.41);
			 System.out.println(d+"US Dollars = "+D+" Yen");//converting to desired currency
		break;
	    case 6:
	    	D=(d)*(0.3);
			 System.out.println(d+"US Dollars = "+D+" Kuwait Dinars");//converting to desired currency
		break;
	    case 7:
	    	D=(d)*(0.926);
			 System.out.println(d+"US Dollars = "+D+" Swiss Franc");//converting to desired currency
		break;
	    case 8:
	    	D=(d)*(0.38);
			 System.out.println(d+"US Dollars = "+D+" Omani Rial");//converting to desired currency
		break;
	    case 9:
	    	D=(d)*(1.24);
			 System.out.println(d+"US Dollars = "+D+" Canadian Dollars");//converting to desired currency
		break;
	    case 10:
	    	D=(d)*(74.5);
			 System.out.println(d+"US Dollars = "+D+" Indian Rupees");//converting to desired currency
		break;
	    case 11:
	    	D=(d)*(1.34);
			 System.out.println(d+"US Dollars = "+D+" Australlian Dollar");//converting to desired currency
		break;
	    case 12:
	    	D=(d)*(1.44);
			 System.out.println(d+"US Dollars = "+D+" NZ Dollar");//converting to desired currency
		break;
	    case 13:
	    	D=(d)*(1.35);
			 System.out.println(d+"US Dollars = "+D+" Singaporian Dollar");//converting to desired currency
		break;
	    case 14:
	    	D=(d)*(8.66);
			 System.out.println(d+"US Dollars = "+D+" Turkish Lira");//converting to desired currency
		break;
	    case 15:
	    	D=(d)*(6.47);
			 System.out.println(d+"US Dollars = "+D+" CNY");//converting to desired currency
		break;
	    case 16:
	    	D=(d)*(7.77);
			 System.out.println(d+"US Dollars = "+D+" Hong Kong Dollar");//converting to desired currency
		break;
	    case 17:
	    	D=(d)*(73.4);
			 System.out.println(d+"US Dollars = "+D+" Russian Ruble");//converting to desired currency
		break;
	    case 18:
	    	D=(d)*(134);
			 System.out.println(d+"US Dollars = "+D+" Algerian Dinar");break;//converting to desired currency
	    case 19:
	    	D=(d)*(95.8);
			 System.out.println(d+"US Dollars = "+D+" Argentine Peso");//converting to desired currency
		break;
	    case 20:
	    	D=(d)*(32.1);
			 System.out.println(d+"US Dollars = "+D+" Thai Bhats");//converting to desired currency
		break;
	    case 21:
	    	D=(d)*(5.04);
			 System.out.println(d+"US Dollars = "+D+" Brazilian Real");//converting to desired currency
		break;
	    case 22:
	    	D=(d)*(1.65);
			 System.out.println(d+"US Dollars = "+D+" Bulgerian Lev");//converting to desired currency
		break;
	    case 23:
	    	D=(d)*(742);
			 System.out.println(d+"US Dollars = "+D+" Chilian Peso");//converting to desired currency
		break;
	    case 24:
	    	D=(d)*(6.32);
			 System.out.println(d+"US Dollars = "+D+" Crotean Kuna");//converting to desired currency
		break;
	    case 25:
	    	D=(d)*(21.6);
			 System.out.println(d+"US Dollars = "+D+" Czech Koruna");//converting to desired currency
		break;
	    case 26:
	    	D=(d)*(6.28);
			 System.out.println(d+"US Dollars = "+D+" Danish Krone");//converting to desired currency
		break;
	    case 27:
	    	D=(d)*(15.7);
			 System.out.println(d+"US Dollars = "+D+" Egyptian Pound");//converting to desired currency
		break;
	    case 28:
	    	D=(d)*(0.0005);
			 System.out.println(d+"US Dollars = "+D+" Etherum");//converting to desired currency
		break;
	    case 29:
	    	D=(d)*(296);
			 System.out.println(d+"US Dollars = "+D+" Hungarian Forint");//converting to desired currency
		break;
	    case 30:
	    	D=(d)*(124);
			 System.out.println(d+"US Dollars = "+D+" Iceland Krona");//converting to desired currency
		break;
	    case 31:
	    	D=(d)*(14584);
			 System.out.println(d+"US Dollars = "+D+" Indonasian Rupeah ");//converting to desired currency
		break;
	    case 32:
	    	D=(d)*(42105);
			 System.out.println(d+"US Dollars = "+D+" Iranian Rial");//converting to desired currency
		break;
	    case 33:
	    	D=(d)*(1135);
			 System.out.println(d+"US Dollars = "+D+" Korean Won");//converting to desired currency
		break;
	    case 34:
	    	D=(d)*(4.16);
			 System.out.println(d+"US Dollars = "+D+" Malaysian Ringgit");//converting to desired currency
		break;
	    case 35:
	    	D=(d)*(20);
			 System.out.println(d+"US Dollars = "+D+" Mexican Peso");//converting to desired currency
		break;
	    case 36:
	    	D=(d)*(411);
			 System.out.println(d+"US Dollars = "+D+" Nigerian Nira");//converting to desired currency
		break;
	    case 37:
	    	D=(d)*(8.63);
			 System.out.println(d+"US Dollars = "+D+" Norwagian Krone");//converting to desired currency
		break;
	    case 38:
	    	D=(d)*(49.3);
			 System.out.println(d+"US Dollars = "+D+" Phillippine Peso");//converting to desired currency
		break;
	    case 39:
	    	D=(d)*(3.81);
			 System.out.println(d+"US Dollars = "+D+" Polish Zloty");//converting to desired currency
		break;
	    case 40:
	    	D=(d)*(3.64);
			 System.out.println(d+"US Dollars = "+D+" Qatari Rial");//converting to desired currency
		break;
	    case 41:
	    	D=(d)*(4.16);
			 System.out.println(d+"US Dollars = "+D+" Romanian Leu");//converting to desired currency
		break;
	    case 42:
	    	D=(d)*(3.75);
			 System.out.println(d+"US Dollars = "+D+" Saudi Rial");//converting to desired currency
		break;
	    case 43:
	    	D=(d)*(98.6);
			 System.out.println(d+"US Dollars = "+D+" Serbian Dinar");//converting to desired currency
		break;
	    case 44:
	    	D=(d)*(14.5);
			 System.out.println(d+"US Dollars = "+D+" SA Rand");//converting to desired currency
		break;
	    case 45:
	    	D=(d)*(199);
			 System.out.println(d+"US Dollars = "+D+" Sri Lankan Rupees");//converting to desired currency
		break;
	    case 46:
	    	D=(d)*(8.58);
			 System.out.println(d+"US Dollars = "+D+" Swedish Krona");//converting to desired currency
		break;
	    case 47:
	    	D=(d)*(27.9);
			 System.out.println(d+"US Dollars = "+D+" Taiwan Dollar");//converting to desired currency
		break;
	    case 48:
	    	D=(d)*(27.4);
			 System.out.println(d+"US Dollars = "+D+" Ukraine Hryvnia");//converting to desired currency
		break;
	    case 49:
	    	D=(d)*(3.67);
			 System.out.println(d+"US Dollars = "+D+" UAE Dirham");//converting to desired currency\\
		break;
	    case 50:
	    	D=(d)*(60000);
			 System.out.println(d+"US Dollars = "+D+" Zimbawe Dollar");//converting to desired currency
		break;}
	} else {System.out.println("INVALID INDEX");//warning
	System.out.println("PLEASE ENTER THE INDEX CAREFULLY");break outer;}}//warning
		if(B==(0))
	{System.out.println("EXITED SUCESSFULLY");//warning
	System.out.println("Thank you for using our Program");}}}//class ends here