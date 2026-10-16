
package Day13;

 class StudentDetail {
	
	String name;
	int age;
	String course;
	int marks;
	
	StudentDetail(String _name,int _age,String _course,int _marks){
		
		this.name = _name;
		this.age = _age;
		this.course = _course;
		this.marks = _marks;
	}
	StudentDetail(String _name,String _course){
		
		this.name = _name;
		this.course = _course;
		
	}
	
	StudentDetail(){
		
		System.out.println("Student information");
		
	}	
}
	
  public class Student{
	public static void main(String[] args) {
		
		StudentDetail s1 = new StudentDetail("jatin",21,"Btech",98);
		System.out.println(s1.name+" , "+s1.age+" , "+s1.course+" , "+s1.marks);
		StudentDetail s2 = new StudentDetail("jatin","Btech");
		System.out.println(s2.name+" , "+s2.course);
		System.out.println("Student information");
	}

}
