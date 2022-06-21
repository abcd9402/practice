package PrintMain;
public class PrintMain{
	
	public static void main(String[] args){
		System.out.println("abcd"); //콘솔창에 뭐 출력하고 줄바꿈
		// ln = line
		
		System.out.print("1234");  // 콘솔창에 뭐 출력
		
		System.out.printf("%.2f",123.6548324);
		System.out.println();
		//특수문자 시리즈
		// \t - tab키
		// \n = new line
		// \r - carriage return
		// \r\n 정석 엔터
		// \\,(," - 특수문자(/,(," 등) 문자출력
		// \b - 백스페이스(1byte) *java언어는 2byte
		System.out.println("언제\n:본수업은 5월6일이랍니다.");
		System.out.println("시간은\r:오전10시부터 오후1시까지입니다.");
		System.out.println("\\(^^)/");
		System.out.println("\\(\" \")/");
		System.out.println("------------------------------------------------");
		//정수
		System.out.printf("숫자%d",3);
		System.out.println("2022-04-20");
		System.out.printf("숫자:%03d\n",3);
		
		//실수	float
		System.out.printf("숫자아%f",123.6548);
	}
}