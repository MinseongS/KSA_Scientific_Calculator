package SampleCal;

public class ConvertFunc {
	

	
	public static  String sosuBunsu(String str1) { //�Ҽ� -> �м� �޼ҵ�
		
		
		String sosu = str1.substring(str1.lastIndexOf(".")+1); //. �ڿ� ���� �� �������� 
		int s = sosu.length(); // ���ڿ� �������
		double denominator = Math.pow(10, s); // 10�� �ŵ����� �� �����
		String denominatorString = Double.toString(denominator); //�Ǽ� ->string���� 
		String denomi =denominatorString.substring(0,denominatorString.lastIndexOf(".")); // ó������ . ������ �������� 100.0 ->100
		
		String numerator = str1.replace(".",""); // ���� �������� ��ȯ
		String bunsu = numerator +"/"+denomi; // ���ڿ� ��ġ��
		
		 int numerator1 = Integer.parseInt(numerator); // ���ڿ� -> int��
		 int denomi2 = Integer.parseInt(denomi); //���ڿ� -> int��
		 int c = gcd(numerator1, denomi2); // �ִ����� ���ϱ�		 
		 String result = ((Integer.toString(numerator1/c)+"/"+Integer.toString(denomi2/c)));// �ִ������� �����ֱ�
		 System.out.println(result);
		 
		
		return result;

	}
	
	public static int gcd(int a, int b) { //�ִ� ����� ���ϴ� �޼ҵ� (��Ŭ���� ȣ����)
		
		while(b!= 0) {
			int r = a%b;
			a =b;
			b=r;
			
		}
		return a;
	}
	
	
	public static String bunsuSosu (String str2) { //�м�-> �Ҽ��� ��ȯ�ϴ� �޼ҵ�
		String bunmo = str2.substring(str2.lastIndexOf("/")+1); // /�� �޺κ� �������� 
		String bunza = str2.substring(0,str2.lastIndexOf("/")); // /�� �պκ� ��������
		
		double bunsu = (Double.parseDouble(bunza)/Double.parseDouble(bunmo));// �Ǽ��� ��ȯ�Ͽ� �Ҽ� ���
		String result2 = Double.toString(bunsu); // �Ǽ� -> string���� 
		System.out.println(result2);
		
		return result2;

	}
	
	public static String jungsu (String str3) { // �����϶� ���� �޼ҵ� 
		System.out.println(str3);
		return str3 ;
	}

	public static String ConvertAll(String str) { // ���� �޼ҵ�
		
		if (str.contains(".")) { // .�� ������ �� 
			return sosuBunsu(str);
			
		}
		else if (str.contains("/")) { // /�� ������ ��
			return bunsuSosu(str);
		}
		else { // �Ѵ� �ƴ� ��
			return jungsu(str);
		}
			

}
	
}
