# Palindrome

A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

### Examples

"racecar"
"madam"
"level"
Phrases:

"A man, a plan, a canal: Panama"
"Was it a car or a cat I saw?"
Numbers:

121
12321
1234321

### Key Characteristics
It must be symmetric around its center.
Case, spaces, and non-alphanumeric characters are usually ignored when determining if something is a palindrome.

### Non-Palindrome Examples
Word: "hello" (reads as "olleh" backward)
Phrase: "Java Programming" (reads as "gnimmargorP avaJ" backward)


### Explanation

Normalization:
The input string is normalized by:
Removing all non-alphanumeric characters using replaceAll("[^a-zA-Z0-9]", "").
Converting it to lowercase using toLowerCase().

Two-pointer Technique:
Use two pointers: One starts at the beginning (left).
The other starts at the end (right).
Compare characters at these pointers and move them inward.

### Edge Cases:
Handles empty or null strings.
Ignores case sensitivity and special characters.

### What is Punctuation?
Punctuation refers to the symbols or marks used in writing to clarify meaning, separate sentences, indicate pauses, or show emphasis. Punctuation helps readers understand the structure and meaning of a sentence or text.

Common Punctuation Marks
Period (.)

Used to end a declarative sentence.
Example: "I love Java."
Comma (,)

Used to indicate a pause or separate elements in a list.
Example: "I bought apples, bananas, and oranges."
Question Mark (?)

Used at the end of a question.
Example: "What is your name?"
Exclamation Mark (!)

Indicates strong feelings or emphasis.
Example: "Wow! That's amazing!"
Colon (:)

Introduces a list, explanation, or a quotation.
Example: "There are three colors: red, blue, and green."
Semicolon (;)

Connects related independent clauses or separates items in a complex list.
Example: "I have a meeting tomorrow; it starts at 10 a.m."
Quotation Marks (" ")

Used to indicate speech or quotations.
Example: "He said, 'Java is powerful.'"
Apostrophe (')

Shows possession or forms contractions.
Example: "It's John's book."
Hyphen (-)

Connects words or parts of words.
Example: "Well-written essay."
Dash (—)

Indicates a pause or range.
Example: "She was happy—finally free!"
Parentheses ( )

Used to enclose additional information.
Example: "Java (created in 1995) is widely used."
Brackets [ ]

Used for editorial comments or technical explanations.
Example: "She said she liked [the movie]."
Ellipsis (...)

Indicates omitted text or a trailing thought.
Example: "I'll think about it..."
Slash (/)

Used to show alternatives or fractions.
Example: "Yes/No" or "1/2."

### Single Character:
A palindrome is defined as a string that reads the same backward as forward. Since a single character has no other characters to compare with, it is inherently symmetric and satisfies the definition of a palindrome.

Examples


"a" → Reads the same forward and backward → Palindrome.
"Z" → Reads the same forward and backward → Palindrome.
Empty String (Edge Case):

An empty string "" is also considered a palindrome, as there is nothing to contradict symmetry.
