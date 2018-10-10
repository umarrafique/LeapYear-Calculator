public class calendar{
	public static void main(String[] args){

	leapYear leap1 = new leapYear();// i created 4 leap calender 
	leapYear leap2 = new leapYear();
	leapYear leap3 = new leapYear();
	leapYear leap4 = new leapYear();

	leap1.isALeapYear(2015); // here it is going to tell us is the year is leap or not
	leap2.isALeapYear(2016);
	leap3.isALeapYear(2020);
	leap4.isALeapYear(1993);

	leap2.displayCalendar(2016);// in this line its going to print our calenedr 
		
	}
}
