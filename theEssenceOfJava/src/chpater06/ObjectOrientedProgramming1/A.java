package chpater06.ObjectOrientedProgramming1;

//의존성이 떨어지는 코드
//아침에 출근을 하려고 한다.

public class A {
	private B b;
	
	public A() {
		b = new B();
}
}
