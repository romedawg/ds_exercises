# The Bigram Parsing Problem:

## Task:
Create an application that can take as input any text file and output a histogram of the bigrams
in the text.

## Description:
A bigram is **any** two adjacent words in the text disregarding case and punctuation. A histogram
is the count of how many times that particular bigram occurred in the text.
A well-formed submission will be runnable from command line and have accompanying unit
tests for the bigram parsing and counting code. You may do this in any language you wish and
use any framework or data structures you wish to handle reading the files, building up the
output, and running the unit tests. However the bigram parsing and counting code must be
implemented by yourself.

## Example:
Given the text: "The quick brown fox and the quick blue hare." The bigrams with their counts
would be.
```
"the quick" 2
"quick brown" 1
"brown fox" 1
"fox and" 1
"and the" 1
"quick blue" 1
"blue hare" 1
```

# Solution:

### Assumptions:
- Code:
    - Tested **Python 3.6.8**
    - Tested Fedora 29
    - Default Locale:
```
python3
locale.getdefaultlocale()
('en_US', 'UTF-8') # American/English UTF-8
```
- Input text file (**most** of these are based on standard linguistic rules):
    - Text file is Unicode UTF-8 encoded, with or w/o BOM and either CR or CRLF line terminated.
    - All words are space delimited.
    - There is always a space after a comma, period, question mark, exclamation mark, colan, semi-colan and star:
```
comma	,  ،  、
full stop, period	.
question mark	 ?
exclamation mark	 !
colon	:
semicolon	;
star	*
```
	- Their is always a space before and after bracket, hyphen, dash, slash, stroke, solidus and ellipse:
```
brackets	[ ]  ( )  { }  ⟨ ⟩
dash	‒  –  —  ―
hyphen	‐
slash, stroke, solidus	/  ⧸  ⁄
ellipsis	…  ...  . . .  ⋯  ᠁  ฯ
```
	- Their is never a space before or after any apostrophe:
```
apostrophe	’  '
```
	- Letters always surround guillemets and quotation marks without any spaces:
```
guillemets	‹ ›  « »
quotation marks	‘ ’  “ ”  ' '  " " ” “
```
	- No words contain any literal digits in them:
```
Correct: Went to one store.
Wrong: Went to 1 store.
```

## Executing:
```
python3 bigram_histogram.py --text_file sample_text
```

## Tests:
```
# Linter
python3 -m flake8 bigram_histogram.py
python3 -m flake8 tests/*
# Unit tests
python3 -m unittest discover --verbose
```

## Future:
- Use of methods (class) and logger with trace/pdb.
- Speed improvements using timeit module.
- More error handling/checking.
- Split single program into multiple logically separate files.
- Prettier histogram output.
- Using more test suits like pytest, testfixtures and hypothesis.
