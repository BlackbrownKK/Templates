^ — string beginning.
$ — string end.
\b — word boundary.
\B — not a word boundary.
\A — input start.
\G — end of the previous match.
\Z — input end, except for the end terminator, if applicable.
\z — input end.

\d — numeric character.
\D — non-numeric character.
\s — whitespace character.
\S — non-whitespace character.
\w — alphanumeric character or an underscore.
\W — any character, except for an alphabetic, numeric character or the underscore character.
. — (full stop) any character, except for the new string character.

\t — tabulation character.
\n — new line character.
\r — carriage return character.
\f — switching to a new page.
\u0085 — next line unicode character.
\u2028 — line separator unicode character.
\u2029 — paragraph separator unicode character.

[abc] — any of the listed (a,b, or c).
[^abc] — any, except for the listed (neither a, nor b, nor c).
[a-zA-Z] — merging ranges (Roman characters from a to z without considering case).
[a-d[m-p]] — combining characters (from a to d and from m to p).
[a-z&&[def]] — overlapping characters (characters d,e,f).
[a-z&&[^bc]] — subtracting characters (characters a, d-z).

? — one or absent.
* — zero or more times.
+ — one or more times.
{n} — n times.
{n,} — n times and more.
{n,m} — at least n times but no more than m times.

If you need to use the designation of a metacharacter or quantifier as a regular character, then escaping is applied:
\<metacharacter> (example: \*, \+, \., \?)
[<metacharacter>] (example: [+], [?], [*], if then follows a quantifier)

The metacharacter \b is interpreted differently depending on the context where it is used:
If it is specified in a class of characters, then it denotes the "backspace" character ( [\b] ).
If it is specified outside a class of characters, it means the word boundary (meaning that it limits words consisting of characters [a-zA-Z0-9_]).

The metacharacter ? is also interpreted differently depending on where it is used:

? shows that the preceding characters (ranges of values) is a not a mandatory part of the expression.
+? shows the minimum number of characters (ranges of values) that may occur once or several times.
*? shows the minimum number of characters (ranges of values) that may occur several times. This is the so called "lazy" quantifier.