
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

		// ������
		System.out.println("\n������");

		// public char charAt(int index)
		// ���������� ������ � ��������� ���������. ������ ���� �� 0
		System.out.print("public char charAt(int index) : ");
		System.out.println("���������� �������������".charAt(7));

		// public int codePointAt(int index)
		// ���������� Unicode-������ � �������� �������
		String testString = "������";
		int myChar = testString.codePointAt(3);
		System.out.print("public int codePointAt(int index) : ");
		System.out.println(myChar);

		// public int codePointBefore(int index)
		// ���������� Unicode-������, ������� ������������ ������� �������
		myChar = testString.codePointBefore(4);
		System.out.print("public int codePointBefore(int index) : ");
		System.out.println(myChar);

		// public int codePointCount(int start, int end)
		// ��������� ���������� Unicode-�������� ����� ��������� start � end
		myChar = testString.codePointCount(0, 3);
		System.out.print("public int codePointCount(int start, int end) : ");
		System.out.println(myChar);

		// public int compareTo(String string)
		// ���������� ��������� ������, ��������� �������� �������� Unicode � ���������,
		// ����� �� ����� ������, ����� ��� ������ ���������. ����� �������������� ���
		// ����������. ������� �����������. ���� ������ ���������, �� ������������ 0,
		// ���� ������ ����, �� ���������� ������ ������ ������ string, ���� ������
		// ����, �� ���������� ������ ������ ������ string. ����� � ������� ���������
		// ����� ���� ����� � ������ ���������.
		System.out.print("public int compareTo(String string) : ");
		System.out.println(testString.compareTo("������"));

		// ����������� ������ ����� ����� ����������� ����������.
		String[] poem = { "��", "����", "�", "�����", "����" };
		System.out.println("���������� ������� ����� � ������� ������ compareTo :");
		for (int j = 0; j < poem.length; j++) {
			for (int i = j + 1; i < poem.length; i++) {
				if (poem[i].compareTo(poem[j]) < 0) {
					String temp = poem[j];
					poem[j] = poem[i];
					poem[i] = temp;
				}
			}
			System.out.println("\t" + poem[j]);
		}

		// public int compareToIgnoreCase(String string)
		// ���������� ��������� ������, ��������� �������� �������� Unicode, ��� �����
		// ��������.
		System.out.print("public int compareToIgnoreCase(String string) : ");
		System.out.println(testString.compareToIgnoreCase("������"));

		// public String concat (String string)
		// ���������� ������ � ��������� �������.
		// ����� ��������� �� �� �������, ��� � �������� +
		System.out.print("public String concat(String string) : ");
		System.out.println(testString.concat(" ���������"));

		// public boolean contains(CharSequence cs)
		// ����������, �������� �� ������ ������������������ �������� � CharSequence
		System.out.print("public boolean contains(CharSequence cs) : ");
		System.out.println(testString.contains("���"));

		// public boolean contentEquals(CharSequence cs)
		// ���������� CharSequence � ���� �������.
		System.out.print("public boolean contentEquals(CharSequence cs) : ");
		System.out.println(testString.contentEquals("���"));
	}

}
