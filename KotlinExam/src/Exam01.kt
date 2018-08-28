/**
	Kotlin 200제
	01 ~ 13
 **/ 

typealias Number = Int // type들을 재정의해서 사용 가능 

fun main(args: Array<String>): Unit // 함수가 클래스에 묶여져 있지 않음 - 패키지 레벨 함
{ // 코틀린은 변수의 타입을 끝에 넣음 (ex Java > String[] args)
	println("Hello Kotlin") // 세미클론 필요없다.
	
	println(54)
	var s = 3; // 변수, 변수는 선언과 동시에 초기화 필수 
	println(s)
	
	val a = 10 // 상수, var에 final넣은 맹락.
	val b = 20
	
	println("a의 값 : $a") // concat안쓰고 바로 출력 가능.
	println("b의 값 : $b") // concat안쓰고 바로 출력 가능.
	
	val n:Number = 10
	println(n)
}