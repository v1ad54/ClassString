
public class ClassString {

	public static void main(String[] args) {
		String str0 = "Создание строк.";
		System.out.println(str0);
		for (int i = 0; i < str0.length(); i++) {
			System.out.print("=");
		}
		System.out.println();

		// Создание строки
		String str1 = "Это просто строка.";
		System.out.println("\n" + str1);

		// Создание массива строк
		String[] strArr = { "Строка 1", "Строка 2", "Строка 3" };
		System.out.println("\n" + "Массив строк:");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("\t" + strArr[i]);
		}

		// Пустая строка
		System.out.println("\n" + "Пустая строка.");
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

		// Создание строки через массив символов
		char[] chars = { 'A', 'B', 'C', 'D', 'E' };
		String strChars = new String(chars);
		System.out.println(strChars);
		// Указание диапазона символьного массива
		String strChars2 = new String(chars, 1, 3); // Начало диапазона и количество используемых символов
		System.out.println(strChars2);

		// Операторы + и += для String
		System.out.println("\nОператоры + и += для String");
		String strA = "Сим";
		String strB = "Салабим";
		String strC = strA + "-" + strB;
		System.out.println(strC);

		strA += "-" + strB;
		System.out.println(strA);

		// Форматирование строк
		System.out.println("\nФорматирование строк");
		String strFormat = "Ул. %1s, дом %2s, %3d кв.";
		String strStreet = "Гребенщикова";
		String strHome = "13";
		int flat = 201;
		String strAddress = String.format(strFormat, strStreet, strHome, flat);
		System.out.println(strAddress);

	}

}
