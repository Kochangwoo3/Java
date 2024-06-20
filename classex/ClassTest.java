package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException  {
		// Person의 Class 클래스 가져오기
		Person person = new Person();

		//System.out.println(person);
		
		Class pClass1 = person.getClass(); //1. Object 클래스 getClass() 메서드
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;  //2. 직접 class 파일 대입하기
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person"); //3. 클래스 이름으로 가져오기
		System.out.println(pClass3.getName());
		
	}

}
