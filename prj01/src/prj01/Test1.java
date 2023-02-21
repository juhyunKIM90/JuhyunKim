package prj01;

public class Test1 {

	public static void main( String[] args ) {
		// Comment, remark 한줄주석, 설명문
		/* 여러줄 주석	 */
		// 입력	 :	이름, 태어난연도,	전화   
		String    name1       =  "아이유";   // 문자열 : String
		int       birthYear   =  1999;       // 정수 : Integer
		String    tel         =  "010-1234-5678";
		
		// 처리 : 계산 나이
		int       age         =  2022 - birthYear + 1; 
				
		// 출력  :  이름, 나이,         전화
		System.out.println("이름:" + name1);	
		System.out.println("태어난연도:" + birthYear);
		System.out.println("나이:" + age);
		System.out.println("전화:" + tel);

	}

}
