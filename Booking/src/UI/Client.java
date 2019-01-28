package UI;

import java.awt.List;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import MODEL.BookingBean;
import SERVICE.IService;
import SERVICE.ServiceClass;

public class Client {

	public static void main(String[] args) {
		
		IService service = new ServiceClass();
		boolean validateflag = false;
		do {
			Scanner scanner = new Scanner(System.in);
			boolean doflag = false;
			String custname ;
			LocalDate dob;
			DateTimeFormatter formatter ;
			do {
				scanner=new Scanner(System.in);
			System.out.println("Enter your name");
			custname = scanner.nextLine();
			try {
			String regname ="[A-Z]{1}[a-z]*";
			boolean pattern = Pattern.matches(regname, custname);
			if(pattern == true) {
				doflag=true;
			}else {
				System.out.println("First letter of the name should be capital and the rest should be lowercase");
				
			}
			}catch(InputMismatchException e) {
				System.out.println("");
			}
			}while(!doflag);
			doflag=false;
			String custId;
			do{
				scanner=new Scanner(System.in);
				System.out.println("Enter your ID");
				custId  =scanner.nextLine();
				String regId = "[A-Z]{1}[a-z]{1}[0-9]{1}[A-Z]{1}[a-z]{1}";
				boolean pattern1  = Pattern.matches(regId, custId);
				if(pattern1==true) {
					doflag=true;
				}else {
					System.out.println("first letter-uppercase,2-lowercase,3-digit,4-uppercase,5-lowercase");
				}
			}while(!doflag);
			doflag = false;
			String date;
		
			do {
				BookingBean bean = new BookingBean();
				scanner = new Scanner(System.in);
				System.out.println("Enter your Date of Birth");
				date = scanner.nextLine();
				try {
				formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
				dob= LocalDate.parse(date, formatter);
				LocalDate now=LocalDate.now();
				Period age=now.until(dob);
				int years=age.getYears();
				
				if(years> 18) {
					System.out.println("permitted to buy");
					List bookingId=service.idgenerate(bean);
					doflag=true;
				}else {
					System.out.println("under age");
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
				doflag=false;
				
		}while(!doflag);
		}while(!validateflag);
		
		
	}
}
