# <i>Regular expression in JAVA</i>
![Image alt](https://github.com/gvozdev1986/RegExpression/blob/master/resources/RegEx.png)

# Used
Standart libraries:
1. java.util.regex.Matcher;
2. java.util.regex.Pattern;

Application:
1. Declare a variable (<b>pattern</b>) with a regular expression.
2. <b>Compiles</b> the given regular expression into a pattern.
3. Creates a <b>matcher</b> that will match the given input against this pattern.

Example:
```java
Pattern pattern = Pattern.compile("^Ivan$"); // create regex
Matcher matcher = pattern.matcher("Ivan"); // create rule to formal parameters
matcher.matches(); // return result conformity string with rule
```

<table>
    <tr>
        <td colspan = "4"> Description of symbols in a regular expression. </ td>
    </ tr>
    <tr>
        <td> # </ td>
        <td> Symbol </ td>
        <td> Description </ td>
    </ tr>
    <tr>
        <td> 1 </ td> <td> ^ </ td> <td> The beginning of the string to be checked. </ td>
    </ tr>
    <tr>
        <td> 2 </ td> <td> $ </ td> <td> End of the line to be erased. </ td>
    </ tr>
    <tr>
        <td> 3 </ td> <td>. </ td> <td> Short form for a character class that matches any character. </ td>
    </ tr>
    <tr>
        <td> 4 </ td> <td> | </ td> <td> "OR" </ td>
    </ tr>
    <tr>
        <td> 5 </ td> <td>? </ td> <td> The first digit is mandatory. </ td>
    </ tr>
    <tr>
        <td> 6 </ td> <td> "</ td> <td> Any number of element instances (and zero). </ td>
    </ tr>
    <tr>
        <td> 7 </ td> <td> \ d </ td> <td> Matches any digit; the equivalent of class [0-9]. </ td>
    </ tr>
    <tr>
        <td> 8 </ td> <td> \ D </ td> <td> Matches any non-numeric character; the equivalent of the class [^ 0-9]. </ td>
    </ tr>
    <tr>
        <td> 9 </ td> <td> \ s </ td> <td> Matches any whitespace character; the equivalent of [\ t \ n \ r \ f \ v]. </ td>
    </ tr>
    <tr>
        <td> 10 </ td> <td> \ S </ td> <td> Matches any non-whitespace character; the equivalent of [^ \ t \ n \ r \ f \ v]. </ td>
    </ tr>
    <tr>
        <td> 11 </ td> <td> \ w </ td> <td> Matches any letter or number; the equivalent of [a-zA-Z0-9 _]. </ td>
    </ tr>
    <tr>
        <td> 12 </ td> <td> \ W </ td> <td> Conversely; the equivalent of [^ a-zA-Z0-9 _]. </ td>
    </ tr>
</ table>
