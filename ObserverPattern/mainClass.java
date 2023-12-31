
package ObserverPattern;

/**
 * 
 * @author IIT Prosanto Deb(ASH1925005M)
 * Problem Statement : We want to implement observer technique.
 * Here We want to send a notice to every student or teacher who has subscribed.
 *
 */

public class mainClass 
{
	public static void main(String[] args)
	{
		Notice notice = new Notice();
		
		Person studentA = new Student("Alif");
		Person studentB = new Student("Joy");
		Person studentC = new Student("Tahmid");
		Person teacher1=new Teacher("eusha");
		studentA.subscribe(notice);
		studentC.subscribe(notice);
		teacher1.subscribe(notice);
				
	    notice.update("Tomorrow is holiday");
	    
	    studentB.subscribe(notice);
	    
	    notice.update("Tomorrow is Monday");
		
	}
}
