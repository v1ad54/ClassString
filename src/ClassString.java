
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

		// Методы
		System.out.println("\nМетоды");

		// public char charAt(int index)
		// Возвращает символ с указанным смещением. Отсчет идет от 0
		System.out.print("public char charAt(int index) : ");
		System.out.println("Библиотека профессионала".charAt(7));

		// public int codePointAt(int index)
		// Возвращает Unicode-символ в заданном индексе
		String testString = "Котёнок";
		int myChar = testString.codePointAt(3);
		System.out.print("public int codePointAt(int index) : ");
		System.out.println(myChar);

		// public int codePointBefore(int index)
		// Возвращает Unicode-символ, который предшествует данному индексу
		myChar = testString.codePointBefore(4);
		System.out.print("public int codePointBefore(int index) : ");
		System.out.println(myChar);

		// public int codePointCount(int start, int end)
		// Вычисляет количество Unicode-символов между позициями start и end
		myChar = testString.codePointCount(0, 3);
		System.out.print("public int codePointCount(int start, int end) : ");
		System.out.println(myChar);

		// public int compareTo(String string)
		// Сравнивает указанную строку, используя значения символов Unicode и вычисляет,
		// какая из строк меньше, равна или больше следующей. Может использоваться при
		// сортировке. Регистр учитывается. Если строки совпадают, то возвращается 0,
		// если меньше нуля, то вызывающая строка меньше строки string, если больше
		// нуля, то вызывающая строка больше строки string. Слова с большим регистром
		// стоят выше слова с нижним регистром.
		System.out.print("public int compareTo(String string) : ");
		System.out.println(testString.compareTo("котёнок"));

		// Отсортируем массив строк через пузырьковую сортировку.
		String[] poem = { "Мы", "везём", "с", "собой", "кота" };
		System.out.println("Сортировка массива строк с помощью метода compareTo :");
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
		// Сравнивает указанную строку, используя значения символов Unicode, без учета
		// регистра.
		System.out.print("public int compareToIgnoreCase(String string) : ");
		System.out.println(testString.compareToIgnoreCase("котёнок"));

		// public String concat (String string)
		// Объединяет строку с указанной строкой.
		// Метод выполняет ту же функцию, что и оператор +
		System.out.print("public String concat(String string) : ");
		System.out.println(testString.concat(" маленький"));

		// public boolean contains(CharSequence cs)
		// Определяет, содержит ли строка последовательность символов в CharSequence
		System.out.print("public boolean contains(CharSequence cs) : ");
		System.out.println(testString.contains("Кот"));

		// public boolean contentEquals(CharSequence cs)
		// Сравнивает CharSequence с этой строкой.
		System.out.print("public boolean contentEquals(CharSequence cs) : ");
		System.out.println(testString.contentEquals("кот"));
	}

}
