package alone;

class MyDog {
	String name;
	String type;
	// 여기에 코드를 작성하세요
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type + " " + name;
	}
	
}

public class Q4 {

	public static void main(String[] args) {
		//다음코드의 출력 결과가 '진돗개 댕댕이' 가 되도록 MyDog클래스를 수정하세요
		MyDog dog = new MyDog("댕댕이", "진돗개");
		System.out.println(dog);

	}

}
//