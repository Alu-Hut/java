package Aufgabe30032022;


public class Person{
	private String firstname;
	private String lastname;
	
	public Person( String firstname, String lastname ) {
		this.firstname = firstname;
		this.lastname = lastname;	
	}
	
	public String getFirstname( ) {
		return this.firstname;
	}
	
	public String getLastname() {
		return  this.lastname;
	}
	
	public String getFullname() {
		return this.getFirstname() + " "  + this.getLastname();
	}
	
	public String toString() {
		return this.getFullname();
	}
		
	@Override
	public boolean equals( Object obj)  {
		
		if( obj instanceof Person ) {
			Person p = (Person) obj;
			
			return this.firstname.equals( p.firstname ) 
					&& this.lastname.equals( p.lastname );	
		}
		
		return false;
	}

}