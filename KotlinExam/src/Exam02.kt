/**
	Kotlin 200제
	14 ~ 28
 **/

fun main(args: Array<String>): Unit // 함수가 클래스에 묶여져 있지 않음 - 패키지 레벨 함
{
	val value:Int = if(10>5) // if, else문 표현식으로 사용하기 
	{
		println("10은 5보다 크다.")
		10
	}else{
		println("d")
		5
	}
println(value)
	
	val score = 95
	
	val grade: Char = when(score/10) // wher을 표현식으로 사용 
		{
		6->'D'
		7->'C'
		8->'B'
		9, 10->'A'
		else->'F'
	}
	println(grade)
}