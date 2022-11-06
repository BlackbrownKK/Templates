Operator	Name	Description	Example	Try it
+	Addition	Adds together two values	x + y
-	Subtraction	Subtracts one value from another	x - y
*	Multiplication	Multiplies two values	x * y
/	Division	Divides one value by another	x / y
%	Modulus	Returns the division remainder	x % y
++	Increment	Increases the value of a variable by 1	++x
--	Decrement	Decreases the value of a variable by 1	--x



Operator	Name	Description	Example
=	x = 5	x = 5
+=	x += 3	x = x + 3
-=	x -= 3	x = x - 3
*=	x *= 3	x = x * 3
/=	x /= 3	x = x / 3
%=	x %= 3	x = x % 3
&=	x &= 3	x = x & 3
|=	x |= 3	x = x | 3
^=	x ^= 3	x = x ^ 3
>>=	x >>= 3	x = x >> 3
<<=	x <<= 3	x = x << 3

Operator	Name	Description	Example
==	Equal to	x == y
!=	Not equal	x != y
>	Greater than	x > y
<	Less than	x < y
>=	Greater than or equal to	x >= y
<=	Less than or equal to	x <= y
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

Разновидность for-each цикла for
-----------------------------------

При выполнении операций с массивами возникают ситуации,
когда должен быть обработан каждый элемент массива.

В цикле  for-each происходит последовательное обращение
к каждому элементу совокупности объектов (например, массива).
Например, для расчета суммы всех значений, содержащихся
в массиве, нужно обратиться ко всем его элементам.

Разновидность for-each цикла for называется также расширенным
циклом for.

Оператор switch
-----------------

Конструкция switch-case позволяет обработать
сразу несколько условий.

После ключевого слова switch в () идет сравниваемое
выражение.

Значение этого выражения последовательно сравнивается
со значениями, помещенными после оператора сase.

И если совпадение будет найдено, то будет выполняться
определенный блок сase.

Цикл while, do-while
-----------------------

Цикл while сразу проверяет истинность некоторого условия,
и если условие истинно, то код цикла выполняется.

Оператор do сначала выполняет код цикла, а потом проверяет
условие в инструкции while. И пока это условие истинно, цикл
повторяется.

Цикл do гарантирует хотя бы однократное выполнение действий,
даже если условие в инструкции while не будет истинно.

Разница между do-while и while заключается в том,
что do-while оценивает выражение в нижней части цикла,
а не в его верхней части.
Поэтому операторы внутри блока do всегда выполняются
хотя бы один раз.