import java.nio.charset.StandardCharsets;

/**
 * @author Chizhov Vladislav
 * @version 1.0
 * 
 *          Класс ClassString предназначен для демонстрации работы с классом
 *          String
 */
public class ClassString {
	/**
	 * 
	 * @param args - массив строк аргументов метода
	 */
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

		// public String concat(String string)
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

		// public static String copyValueOf (char[] data, int start, int length)
		// Создаёт новую строку, содержащую указанные символы из массива Data начиная с
		// позиции start (нумерация начинается с нуля) длинной length.
		char[] charBuf = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.print("public static String copyValueOf (char[] data, int start, int length) : ");
		System.out.println(String.copyValueOf(charBuf, 2, 3));

		// public static String copyValueOf(char[] data)
		// Создаёт новую строку, содержащую символы из указанного массива. Изменение
		// массива после создания строки не изменяет созданную строку.
		System.out.print("public static String copyValueOf(char[] data) : ");
		System.out.println(String.copyValueOf(charBuf));

		// public boolean endsWith(String suffix)
		// Проверяет, заканчивается ли строка символами suffix.
		System.out.print("public boolean endsWith(String suffix) : ");
		System.out.println(testString.endsWith("ок"));

		// public boolean equals (Object string)
		// Сравнивает указанный объект и строку и возвращает true, если сравниваемые
		// строки равны, т.е. содержит те же символы и в том же порядке с учётом
		// регистра.
		System.out.print("public boolean equals (Object string) : ");
		System.out.print("кот".equals("Кот"));
		System.out.println("\t" + "кот".equals("кот"));

		// public boolean equalsIgnoreCase(String string)
		// Сравнивает указанную строку с исходной строкой без учёта регистра и
		// возвращает true, если они равны. Диапазон A-Z считается равным диапазону a-z.
		System.out.print("public boolean equalsIgnoreCase(String string) : ");
		System.out.print("кот".equalsIgnoreCase("Кот"));

		// public static String format(Locale locale, String format, Object... args)
		// Возвращает отформатированную строку, используя прилагаемый формат и
		// аргументы, локализованных в данной области. Например дату или время
		System.out.println("public static String format(Locale locale, String format, Object... args) : ");
		System.out.println("%.2f\t" + String.format("%.2f", 45.6789f)); // выводим число типа float с двумя знаками
																		// после запятой
		System.out.println("%o\t" + String.format("%o", 64)); // Конвертируем число в восьмеричную систему.
		System.out.println("%x\t" + String.format("%x", 255)); // Конвертируем число в шестнадцатиричную систему.
		System.out.println("%X\t" + String.format("%X", 255)); // Конвертируем число в шестнадцатиричную систему (в
																// верхнем регистре).
		System.out.println("%d\\t%d\\t%d\\t%d\t" + String.format("%d\t%d\t%d\t%d\t", 0b0010, 010, 10, 0x10)); // В
																												// десятичной
																												// системе

		// public byte[] getBytes()
		// Конвертируем строку в набор байтов.
		String catName = "Барсик";
		byte[] myByte = catName.getBytes();
		System.out.print("public byte[] getBytes() :");
		for (int i = 0; i < myByte.length; i++) {
			System.out.print("\t" + String.format("%d", myByte[i]));
		}
		System.out.println();

		// public byte[] getBytes(String charsetName)
		// Возвращает отформатированную строку, используя прилагаемую кодировку.
		byte[] myByte2 = catName.getBytes(StandardCharsets.UTF_8);
		System.out.print("public byte[] getBytes(String charsetName) :");
		for (int i = 0; i < myByte2.length; i++) {
			System.out.print("\t" + String.format("%d", myByte2[i]));
		}
		System.out.println();

		// public void getBytes(int start, int end, byte[] data, int index) и другие
		// перегруженные версии
		// Метод сохраняет символы в массив байтов, альтернатива методу getChars().
		// Часто используется при экспорте строк из различных источников, где
		// используются другие символы Unicode. Например, Java по умолчанию использует
		// 16-битовые символы Unicode, а в интернете часто строки используют 8-битовый
		// код Unicode, ASCII и др.

		// public void getChars(int start, int end, char[] buffer, int index)
		// Метод для извлечения нескольких символов из строки. Вам надо указать индекс
		// начала подстроки (start), индекс символа, следующего за концом извлекаемой
		// подстроки (end). Массив, который принимает выделенные символы находится в
		// параметре buffer. Индекс в массиве, начиная с которого будет записываться
		// подстрока, передаётся в параметре index. Следите, чтобы массив был
		// достаточного размера, чтобы в нём поместились все символы указанной
		// подстроки.

		// public int hashCode()
		// Возвращает целое число — хэш-код для данного объекта.
		System.out.print("public int hashCode() : ");
		System.out.println(testString.hashCode());

		// public int indexOf(int ch)
		// Ищет появление указанного символа и возвращает позицию индекса. Если символа
		// нет, то возвращается -1.
		System.out.print("public int indexOf(int ch) : ");
		System.out.println("Чертёнок".indexOf('ё'));

		// public int indexOf(int ch, int fromIndex)
		// Ищет индекс символа сh, начиная с позиции fromIndex
		System.out.print("public int indexOf(int ch, int fromIndex) : ");
		System.out.println("Чертёнок".indexOf('ё', 5));

		// public int indexOf(String str)
		// Ищет подстроку str и возвращает индекс найденной подстроки. Если подстроки не
		// существует, то возвращается -1.
		System.out.print("public int indexOf(String str) : ");
		System.out.println("Чертёнок".indexOf("рт"));

		// public int indexOf(String str, int fromIndex)
		// Ищет подстроку str, начиная с позиции fromIndex и возвращает индекс найденной
		// подстроки. Если подстроки не существует, то возвращается -1.
		System.out.print("indexOf(String str, int fromIndex) : ");
		System.out.println("Чертёнок".indexOf("рт", 3));

		// public String intern()
		// «Xэширует» строку ???
		System.out.print("public String intern() : ");
		System.out.println("Чертёнок".intern());

		// public boolean isEmpty()
		// Проверяет, является ли строка пустой
		System.out.print("public boolean isEmpty() : ");
		if ("".isEmpty()) {
			System.out.println("Строка пустая");
		} else {
			System.out.println("Строа не пустая");
		}

		// public int lastIndexOf(String string) и другие перегруженные версии
		// Метод ищет в строке в обратном порядке и возвращает индекс последнего
		// появления указанного символа. Если указанный символ не найден, то возвратится
		// -1. Например, получить имя файла без расширения можно так:
		String filename = "file_name.txt";
		System.out.print("public int lastIndexOf(String string) : ");
		System.out.println(filename.substring(0, filename.lastIndexOf(".")));

		// public int length()
		// Возвращает длину строки
		System.out.print("public int length() : ");
		System.out.println("Абракадабра Симсалабим".length());

		// public boolean matches(String regularExpression)
		// Проверяет, соответствует ли строка регулярным выражениям.
		System.out.print("public boolean matches(String regularExpression) : ");
		System.out.println("0b0101".matches("0b[01]+"));

		// public int offsetByCodePoints(int index, int codePointOffset)
		// Возвращает позицию, расположенную на расстоянии codePointOffset после
		// начальной позиции, заданной параметром index
		System.out.print("public int offsetByCodePoints(int index, int codePointOffset) : ");
		System.out.println("Абракадабра Симсалабим".offsetByCodePoints(3, 5));

		// public boolean regionMatches (int thisStart, String string, int start, int
		// length)
		// Метод сравнивает указанную часть строки с другой частью строки. Нужно задать
		// индекс начала диапазон строки вызывающего объекта класса String. Строка для
		// сравнивания передаётся в параметре string. Индекс символа, начиная с которого
		// нужно выполнять сравнение передаётся в параметре start, а длина сравниваемой
		// подстроки в параметре length.

		// public boolean regionMatches (boolean ignoreCase, int thisStart, String
		// string, int start, int length)
		// Перегруженная версия. Метод сравнивает указанную часть строки с другой частью
		// строки, игнорируя регистр.

		// public String replace(CharSequence target, CharSequence replacement) и другие
		// перегруженные версии
		// Меняет символ или последовательность символов target на replacement
		System.out.print("public String replace(CharSequence target, CharSequence replacement) : ");
		System.out.println("кит".replaceAll("и", "о"));

	}

}
