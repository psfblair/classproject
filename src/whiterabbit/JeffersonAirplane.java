package whiterabbit;

public class JeffersonAirplane {
     
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test1 = "You’ve just been name project manager on the new \n" +
	"ASTRO project that is slated to start next week.\n"+
				"On your team is Tom the Tester, \n" +
	"David, Daniel,and Debbie the Developers,\n"+
				"Bob the Business Analyst, and Uma the UX Designer.\n"+
	"A great group of highly experienced people\n"+
				"and some of the best in the company.\n"+

"However...turns out Tom is currently located in building\n"+
"C down the road, David and Daniel and Debbie are together \n"+
"but one floor down, Bob’s cube is right next to you in \n"+
"building F, and Uma has a floating desk and care move anywhere.\n"+
"And Charlie the Customer is located on the 6th floor of \n"+
"building D.  Below are the available space/configuration options.\n"+
"It’s up to you to choose the best working set up for your team.";
		Question question = new Question(test1);
		question.addAnswer("A) Team Room 231 - located on the 3rd floor in building F (your building).  The developers can move in right away because it’s already wired.  However, Charlie the Customer can only be in the building on Tuesdays from 9:00-11:30 and Tom will need 45 min every morning and evening for travel.");
		question.addAnswer("B) Conference Room A - located in building K.  This room is an old conference room “with potential”.  Charles can be there three times a week.  Developers need two days to set up.  and Tom needs 30 min of travel time every morning and evening.  There is an old conference table and chairs and it will take two weeks for new furniture..");
		question.addAnswer("C) Team Room Orange - located on the 2nd floor in building D (same building as Charlie) and is the nicest team space.  However, it will take the developers three days to move, Tom will need hour every morning and evening for travel, and Bob will need 30 min notice to get there and can spend 3-4 hours a day.");
		question.addAnswer("Enter your choice, A, B, or C, below:");

		
		
		
		System.out.println(question.toString());
	}

}
