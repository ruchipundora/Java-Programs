package inheritance;

public class StudentWithInheritanceRunner
{

	public static void main(String[] args)
	{
		StudentWithInheritance student = new StudentWithInheritance();
		student.setName("Ruchi");
		String result = student.getName();
		System.out.println("Tha name is " + result);
		
		Person person = new Person();
		person.setName("Ruchi Pundora");
		person.setEmail("ruchipundora@gmail.com");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
		
		Employee employee = new Employee();
		employee.setTitle("Software Developer");
		employee.setEmail("ruchi@gmail.com");
		employee.setEmployerGrade('A');
		 System.out.println(employee); // it will run in PErson class if 
		                               //you don't write toString code in employee
		

	}

}
