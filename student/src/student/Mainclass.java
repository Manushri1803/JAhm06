package student;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student("manushri");
		Student s3=new Student();
		
		System.out.println("name of student 1:" +s1.getName());
		System.out.println("name of student 2:" +s2.getName());
		System.out.println("name of student 3:" +s3.getName());

	}

}
