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

		// public boolean regionMatches(int thisStart, String string, int start, int
		// length)
		// Метод сравнивает указанную часть строки с другой частью строки. Нужно задать
		// индекс начала диапазон строки вызывающего объекта класса String. Строка для
		// сравнивания передаётся в параметре string. Индекс символа, начиная с которого
		// нужно выполнять сравнение передаётся в параметре start, а длина сравниваемой
		// подстроки в параметре length.
		System.out.print("public boolean regionMatches(int thisStart, String string, int start, int length) : ");
		System.out.println("Абракадабра Симсалабим".regionMatches(12, "Сим", 0, 3));

		// public boolean regionMatches(boolean ignoreCase, int thisStart, String
		// string, int start, int length)
		// Перегруженная версия. Метод сравнивает указанную часть строки с другой частью
		// строки, игнорируя регистр.
		System.out.print(
				"public boolean regionMatches(boolean ignoreCase, int thisStart, String string, int start, int length) : ");
		System.out.println("Абракадабра Симсалабим".regionMatches(true, 12, "сим", 0, 3));

		// public String replace(CharSequence target, CharSequence replacement) и другие
		// перегруженные версии
		// Меняет символ или последовательность символов target на replacement
		System.out.print("public String replace(CharSequence target, CharSequence replacement) : ");
		System.out.println("кит".replaceAll("и", "о"));

		// public String replaceFirst(String regularExpression, String replacement)
		// Удаляет первые символы при помощи регулярного выражения.
		// Например, если нужно удалить нули в начале чисел 001, 007, 000024, то можно
		// использовать такой вызов:
		System.out.print("public String replaceFirst(String regularExpression, String replacement) : ");
		System.out.println("004505".replaceFirst("^0*", ""));

		// public String[] split(String regularExpression)
		// public String[] split(String regex, int limit) - имеет limit - ограничение
		// возвращаемых результатов
		// Разбивает строку на массив из слов.
		System.out.println("public String[] split(String regularExpression) : ");
		String str = "У попа была собака, он ее любил";
		for (String str_split : str.split("[\\s,]+")) {
			System.out.println(str_split);
		}

		// public boolean startsWith(String prefix)
		// Проверяет, начинается ли строка символами prefix с начала строки
		System.out.print("public boolean startsWith(String prefix) : ");
		System.out.println("Абракадабра Симсалабим".startsWith("А"));

		// public boolean startsWith(String prefix, int start)
		// Проверяет, начинается ли заданная строка символами prefix с указанной
		// позиции.
		System.out.print("public boolean startsWith(String prefix, int start) : ");
		System.out.println("Абракадабра Симсалабим".startsWith("С", 12));

		// public CharSequence subSequence (int start, int end)
		// Аналогичен методу substring(), но может использоваться для CharSequence.

		// public String substring(int start) и другие перегруженные версии.
		// Создаёт новую последовательность/строку с символами из данной строки начиная
		// с позиции start до конца строки/заканчивая символом с позиции end. Новая
		// строка содержит символы от start до end - 1, поэтому берём на один символ
		// больше.
		System.out.print("public String substring(int start) : ");
		System.out.println(str.substring(12, 18));

		// public char[] toCharArray()
		// Копирует символы в этой строке в массив символов. Тот же результат можно
		// получить через метод getChars(). Документация не рекомендует использовать
		// данный метод, предлагая метод charAt().

		// public String toLowerCase() и другие перегруженные версии
		// Преобразовывает строку в нижний регистр. Преобразованием управляет заданный
		// по умолчанию региональный язык.
		System.out.print("public String toLowerCase() : ");
		System.out.println("КОТ".toLowerCase());

		// public String toString ()
		// Возвращает строку. Для самой строки, которая сама уже является строкой,
		// возвращать строку бессмысленно (о, как я загнул). Но на самом деле этот метод
		// очень полезен для других классов.

		// public String toUpperCase()
		// Преобразовывает строку в верхний регистр. Преобразованием управляет заданный
		// по умолчанию региональный язык.
		System.out.print("public String toUpperCase() : ");
		System.out.println("кот".toUpperCase());

		// public String trim()
		// Удаляет пробелы в начале и в конце строки.
		System.out.print("public String trim() : ");
		System.out.println("    123".trim());

		// public static String valueOf(long value) и другие перегруженные версии
		// Конвертирует содержимое (числа, объекты, символы, массивы символов) в строку.
		System.out.print("public static String valueOf(long value) : ");
		System.out.println(String.valueOf(12345));

		// Сравнение строк
		String str_1 = new String("Абракадабра");
		String str_2 = new String("Абракадабра");
		System.out.println("operator == : " + (str_1 == str_2));
		System.out.println("method equals : " + str_1.equals(str_2));

	}
}
