
public class ClassString {

	public static void main(String[] args) {
		String str0 = "�������� �����.";
		System.out.println(str0);
		for (int i = 0; i < str0.length(); i++) {
			System.out.print("=");
		}
		System.out.println();

		// �������� ������
		String str1 = "��� ������ ������.";
		System.out.println("\n" + str1);

		// �������� ������� �����
		String[] strArr = { "������ 1", "������ 2", "������ 3" };
		System.out.println("\n" + "������ �����:");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("\t" + strArr[i]);
		}

		// ������ ������
		System.out.println("\n" + "������ ������.");
		String strNull = null;
		if (strNull == null) {
			System.out.println("strNull is null");
		}
		String strEmpty = new String();
		if (strEmpty.length() == 0) {
			System.out.println("strEmpty.length() == 0");
		}
		if (strEmpty.isEmpty()) {
			System.out.println("strEmpty is empty");
		}
		if (strEmpty.equals("")) {
			System.out.println("strEmpty equals \"\"");
		}
		System.out.println("strEmpty.compareTo(\"\"): " + strEmpty.compareTo(""));

		// �������� ������ ����� ������ ��������
		char[] chars = { 'A', 'B', 'C', 'D', 'E' };
		String strChars = new String(chars);
		System.out.println(strChars);
		// �������� ��������� ����������� �������
		String strChars2 = new String(chars, 1, 3); // ������ ��������� � ���������� ������������ ��������
		System.out.println(strChars2);

		// ��������� + � += ��� String
		System.out.println("\n��������� + � += ��� String");
		String strA = "���";
		String strB = "�������";
		String strC = strA + "-" + strB;
		System.out.println(strC);

		strA += "-" + strB;
		System.out.println(strA);

		// �������������� �����
		System.out.println("\n�������������� �����");
		String strFormat = "��. %1s, ��� %2s, %3d ��.";
		String strStreet = "������������";
		String strHome = "13";
		int flat = 201;
		String strAddress = String.format(strFormat, strStreet, strHome, flat);
		System.out.println(strAddress);

	}

}
