public class leapYear{

	String Month;
	boolean leapYear = false;
	int year = 2016; // insatlising the year its going to print 2016
	int days = 31; // days
	
	public leapYear(){
	}

	public void isALeapYear(int yr){
		year = yr;
		if ((year %4 == 0)&&(year %100 != 0)||( year % 400 == 0)){
			leapYear=true;
		}
		if (leapYear == true){
			System.out.println(year + " is a leap year!"); // if the statement is true its going to println
		} else {
			System.out.println(year + " is not a leap year!"); // if the statement is false its going to println
		}
	}

	public void displayCalendar(int yr){
		//year = yr;
		if ((year %4 == 0)&&(year %100 != 0)||( year % 400 == 0)){
			leapYear=true;
		}			
		// Formula for leap year again
		// i used for loops to make my calender i feel its easy to do this way
		for(int i=1; i<=12; i++){
			int x = 0; //counter

			if (i == 1){
				//i in for is int wheres as i have decleared month as a string and x is the counter which will work for our days
				Month = "Jan";
				days = 31; 
			}else if (i == 2 && leapYear == true){
				Month = "Feb";
				days = 29;
			}else if (i == 2 && leapYear == false){
				Month = "Feb";
				days = 28;
			}else if (i == 3){
				Month = "Mar";
				days = 31;
           	}else if(i == 4){
                Month = "April";
				days = 30;
          	}else if (i ==5){
				Month = "May";
				days = 31;
			}else if (i ==6){
				Month = "June";
				days = 30;
			}else if (i == 7){
				Month = "July";
				days = 31;
			}else if (i == 8){
				Month = "August";
				days = 31;
			}else if (i ==9){
				Month = "September";
				days = 30;
			}else if (i == 10){
				Month = "October";
				days = 31;
			}else if (i == 11){
				Month = "November";
				days = 30;
			}else{
				Month = "December";
				days = 31;
			}
			
			

			System.out.println();
			System.out.println(Month + "   " + year);
			
		
		
			for(int d=1; d<=days; d++){
			
			if(d<=9){
				System.out.print("  "+ d); // when the days are else then or equal to 9 its going to give me to space
			} else {
				System.out.print(" " + d); //else theres only one space
			}
			x++;
			if(d%7==0){
			System.out.println(); // if the mod of 7 == 0 its going to print a new line every
			}

		}
	
		
		
	}
	}
}	
	
	
