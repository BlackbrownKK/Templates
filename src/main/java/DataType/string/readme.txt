Method prototype	Purpose of the method

char charAt(int pos)	Returns the char value at the specified index
String concat(String s) or "+"	Concatenates the specified string to the end of this string
boolean endsWith(String suffix)	Tests if this string ends with the specified suffix
boolean equals(Object ob)	Compares this string to the specified object
int indexOf(int ch)	Returns the index within this string of the first occurrence of the specified character
int length()	Returns the length of this string
String substring(int beginIndex)	Returns a new string that is a substring of this string
String substring(int beginIndex, int endIndex)	Returns a new string that is a substring of this string
String toLowerCase()	Converts all the characters in this String to lower case using the rules of the default locale
String toUpperCase()	Converts all the characters in this String to upper case using the rules of the default locale
String trim()	Returns a copy of the string, omitting leading and trailing whitespace
int lastIndexOf(char c)	Returns the index within this string of the last occurrence of the specified character
String replace(char oldChar, char newChar )	Returns a string resulting from replacing all occurrences of oldChar in this string with newChar
String replaceAll(String regex, String replacement)	Replaces each substring of this string that matches the given regular expression with the given replacement
String split(String regex)	Splits this string around matches of the given regular expression

sIgnoreCase(String s)	Compares this String to another String, ignoring case considerations
static String format(String format, Object... args)	Returns a formatted string using the specified format string and arguments
boolean equal format(String format, Object... args)	Returns a formatted string using the specified format string and arguments
void getChars(<parameters>)	Copies characters from this string into the destination character array
String intern()	Returns a canonical representation for the string object
boolean matches(String regex)	Tells whether or not this string matches the given regular expression
String repeat(int count)	Returns a string whose value is the concatenation of this string repeated count times
boolean startsWith(String prefix)	Tests if this string starts with the specified prefix
static String valueOf(<value>)	Returns the string representation of the specified base type value