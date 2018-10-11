import java.nio.charset.StandardCharsets;

/**
 * @author Chizhov Vladislav
 * @version 1.0
 * 
 *          ����� ClassString ������������ ��� ������������ ������ � �������
 *          String
 */
public class ClassString {
	/**
	 * 
	 * @param args - ������ ����� ���������� ������
	 */
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

		// public String concat(String string)
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

		// public static String copyValueOf (char[] data, int start, int length)
		// ������ ����� ������, ���������� ��������� ������� �� ������� Data ������� �
		// ������� start (��������� ���������� � ����) ������� length.
		char[] charBuf = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.print("public static String copyValueOf (char[] data, int start, int length) : ");
		System.out.println(String.copyValueOf(charBuf, 2, 3));

		// public static String copyValueOf(char[] data)
		// ������ ����� ������, ���������� ������� �� ���������� �������. ���������
		// ������� ����� �������� ������ �� �������� ��������� ������.
		System.out.print("public static String copyValueOf(char[] data) : ");
		System.out.println(String.copyValueOf(charBuf));

		// public boolean endsWith(String suffix)
		// ���������, ������������� �� ������ ��������� suffix.
		System.out.print("public boolean endsWith(String suffix) : ");
		System.out.println(testString.endsWith("��"));

		// public boolean equals (Object string)
		// ���������� ��������� ������ � ������ � ���������� true, ���� ������������
		// ������ �����, �.�. �������� �� �� ������� � � ��� �� ������� � ������
		// ��������.
		System.out.print("public boolean equals (Object string) : ");
		System.out.print("���".equals("���"));
		System.out.println("\t" + "���".equals("���"));

		// public boolean equalsIgnoreCase(String string)
		// ���������� ��������� ������ � �������� ������� ��� ����� �������� �
		// ���������� true, ���� ��� �����. �������� A-Z ��������� ������ ��������� a-z.
		System.out.print("public boolean equalsIgnoreCase(String string) : ");
		System.out.print("���".equalsIgnoreCase("���"));

		// public static String format(Locale locale, String format, Object... args)
		// ���������� ����������������� ������, ��������� ����������� ������ �
		// ���������, �������������� � ������ �������. �������� ���� ��� �����
		System.out.println("public static String format(Locale locale, String format, Object... args) : ");
		System.out.println("%.2f\t" + String.format("%.2f", 45.6789f)); // ������� ����� ���� float � ����� �������
																		// ����� �������
		System.out.println("%o\t" + String.format("%o", 64)); // ������������ ����� � ������������ �������.
		System.out.println("%x\t" + String.format("%x", 255)); // ������������ ����� � ����������������� �������.
		System.out.println("%X\t" + String.format("%X", 255)); // ������������ ����� � ����������������� ������� (�
																// ������� ��������).
		System.out.println("%d\\t%d\\t%d\\t%d\t" + String.format("%d\t%d\t%d\t%d\t", 0b0010, 010, 10, 0x10)); // �
																												// ����������
																												// �������

		// public byte[] getBytes()
		// ������������ ������ � ����� ������.
		String catName = "������";
		byte[] myByte = catName.getBytes();
		System.out.print("public byte[] getBytes() :");
		for (int i = 0; i < myByte.length; i++) {
			System.out.print("\t" + String.format("%d", myByte[i]));
		}
		System.out.println();

		// public byte[] getBytes(String charsetName)
		// ���������� ����������������� ������, ��������� ����������� ���������.
		byte[] myByte2 = catName.getBytes(StandardCharsets.UTF_8);
		System.out.print("public byte[] getBytes(String charsetName) :");
		for (int i = 0; i < myByte2.length; i++) {
			System.out.print("\t" + String.format("%d", myByte2[i]));
		}
		System.out.println();

		// public void getBytes(int start, int end, byte[] data, int index) � ������
		// ������������� ������
		// ����� ��������� ������� � ������ ������, ������������ ������ getChars().
		// ����� ������������ ��� �������� ����� �� ��������� ����������, ���
		// ������������ ������ ������� Unicode. ��������, Java �� ��������� ����������
		// 16-������� ������� Unicode, � � ��������� ����� ������ ���������� 8-�������
		// ��� Unicode, ASCII � ��.

		// public void getChars(int start, int end, char[] buffer, int index)
		// ����� ��� ���������� ���������� �������� �� ������. ��� ���� ������� ������
		// ������ ��������� (start), ������ �������, ���������� �� ������ �����������
		// ��������� (end). ������, ������� ��������� ���������� ������� ��������� �
		// ��������� buffer. ������ � �������, ������� � �������� ����� ������������
		// ���������, ��������� � ��������� index. �������, ����� ������ ���
		// ������������ �������, ����� � �� ����������� ��� ������� ���������
		// ���������.

		// public int hashCode()
		// ���������� ����� ����� � ���-��� ��� ������� �������.
		System.out.print("public int hashCode() : ");
		System.out.println(testString.hashCode());

		// public int indexOf(int ch)
		// ���� ��������� ���������� ������� � ���������� ������� �������. ���� �������
		// ���, �� ������������ -1.
		System.out.print("public int indexOf(int ch) : ");
		System.out.println("�������".indexOf('�'));

		// public int indexOf(int ch, int fromIndex)
		// ���� ������ ������� �h, ������� � ������� fromIndex
		System.out.print("public int indexOf(int ch, int fromIndex) : ");
		System.out.println("�������".indexOf('�', 5));

		// public int indexOf(String str)
		// ���� ��������� str � ���������� ������ ��������� ���������. ���� ��������� ��
		// ����������, �� ������������ -1.
		System.out.print("public int indexOf(String str) : ");
		System.out.println("�������".indexOf("��"));

		// public int indexOf(String str, int fromIndex)
		// ���� ��������� str, ������� � ������� fromIndex � ���������� ������ ���������
		// ���������. ���� ��������� �� ����������, �� ������������ -1.
		System.out.print("indexOf(String str, int fromIndex) : ");
		System.out.println("�������".indexOf("��", 3));

		// public String intern()
		// �X������� ������ ???
		System.out.print("public String intern() : ");
		System.out.println("�������".intern());

		// public boolean isEmpty()
		// ���������, �������� �� ������ ������
		System.out.print("public boolean isEmpty() : ");
		if ("".isEmpty()) {
			System.out.println("������ ������");
		} else {
			System.out.println("����� �� ������");
		}

		// public int lastIndexOf(String string) � ������ ������������� ������
		// ����� ���� � ������ � �������� ������� � ���������� ������ ����������
		// ��������� ���������� �������. ���� ��������� ������ �� ������, �� �����������
		// -1. ��������, �������� ��� ����� ��� ���������� ����� ���:
		String filename = "file_name.txt";
		System.out.print("public int lastIndexOf(String string) : ");
		System.out.println(filename.substring(0, filename.lastIndexOf(".")));

		// public int length()
		// ���������� ����� ������
		System.out.print("public int length() : ");
		System.out.println("����������� ����������".length());

		// public boolean matches(String regularExpression)
		// ���������, ������������� �� ������ ���������� ����������.
		System.out.print("public boolean matches(String regularExpression) : ");
		System.out.println("0b0101".matches("0b[01]+"));

		// public int offsetByCodePoints(int index, int codePointOffset)
		// ���������� �������, ������������� �� ���������� codePointOffset �����
		// ��������� �������, �������� ���������� index
		System.out.print("public int offsetByCodePoints(int index, int codePointOffset) : ");
		System.out.println("����������� ����������".offsetByCodePoints(3, 5));

		// public boolean regionMatches (int thisStart, String string, int start, int
		// length)
		// ����� ���������� ��������� ����� ������ � ������ ������ ������. ����� ������
		// ������ ������ �������� ������ ����������� ������� ������ String. ������ ���
		// ����������� ��������� � ��������� string. ������ �������, ������� � ��������
		// ����� ��������� ��������� ��������� � ��������� start, � ����� ������������
		// ��������� � ��������� length.

		// public boolean regionMatches (boolean ignoreCase, int thisStart, String
		// string, int start, int length)
		// ������������� ������. ����� ���������� ��������� ����� ������ � ������ ������
		// ������, ��������� �������.

		// public String replace(CharSequence target, CharSequence replacement) � ������
		// ������������� ������
		// ������ ������ ��� ������������������ �������� target �� replacement
		System.out.print("public String replace(CharSequence target, CharSequence replacement) : ");
		System.out.println("���".replaceAll("�", "�"));

	}

}
