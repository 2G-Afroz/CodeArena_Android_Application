**Legends:**  
✅ Added questions in this file  
✅✅ Added questions in the database
---------------------------------------------
# Languages
1. [Python](#python)
    - [Python Basics](#python-basics) ✅✅
    - [Control Flow](#control-flow) ✅✅
    - [Functions](#functions) ✅✅
    - [Data Structures](#data-structures) 
    - [File Handling](#file-handling)
    - [Object-Oriented Programming (OOP)](#object-oriented-programming--oop-)
    - [Python Standard Library](#python-standard-library)
    - [Error Handling](#error-handling)
    - [Decorators and Generators](#decorators-and-generators)
    - [Web Scraping](#web-scraping)

2. [JavaScript](#javascript)
    - [JavaScript Basics](#javascript-basics) ✅✅
    - [DOM Manipulation](#dom-manipulation) ✅✅
    - [Functions and Closures](#functions-and-closures) ✅
    - [Asynchronous JavaScript](#asynchronous-javascript) ✅
    - [Events and Event Handling](#events-and-event-handling)
    - [Objects and Prototypes](#objects-and-prototypes)
    - [JSON in JavaScript](#json-in-javascript)
    - [JavaScript ES6+](#javascript-es6)
    - [AJAX and Fetch API](#ajax-and-fetch-api)
    - [Front-End Frameworks](#front-end-frameworks)

3. [HTML](#html)
    - [HTML Basics and Structure](#html-basics-and-structure) ✅✅
    - [HTML Forms](#html-forms) ✅✅
    - [Semantics and Structure](#semantics-and-structure) ✅✅
    - [Media Elements](#media-elements) ✅
    - [Responsive Design](#responsive-design) ✅
    - [HTML5 Features](#html5-features)
    - [HTML Accessibility](#html-accessibility)
    - [SVG in HTML](#svg-in-html)
    - [Meta Tags and SEO](#meta-tags-and-seo)
    - [Web Accessibility Standards](#web-accessibility-standards)

4. [Go](#go)
    - [Introduction to Go](#introduction-to-go) ✅✅
    - [Variables and Data Types](#variables-and-data-types)
    - [Control Flow](#control-flow)
    - [Functions and Packages](#functions-and-packages)
    - [Concurrency in Go](#concurrency-in-go)
    - [Error Handling](#error-handling)
    - [Pointers in Go](#pointers-in-go)
    - [Go Web Programming](#go-web-programming)
    - [Unit Testing in Go](#unit-testing-in-go)
    - [Go Best Practices](#go-best-practices)
5. [CSS](#css)
    - [CSS Basics and Selectors](#css-basics-and-selectors) ✅✅
    - [Box Model and Layout](#box-model-and-layout) ✅✅
    - [Flexbox and Grid](#flexbox-and-grid) ✅
    - [Responsive Design with Media Queries](#responsive-design-with-media-queries) ✅
    - [Transitions and Animations](#transitions-and-animations)
    - [CSS Preprocessors](#css-preprocessors)
    - [CSS Frameworks](#css-frameworks)
    - [Variables and Custom Properties](#variables-and-custom-properties)
    - [Browser Dev Tools](#browser-dev-tools)
    - [CSS Naming Conventions](#css-naming-conventions)

6. [Ruby](#ruby)
    - [Ruby Basics and Syntax](#ruby-basics-and-syntax) ✅✅
    - [OOP in Ruby](#oop-in-ruby)
    - [Ruby Classes and Modules](#ruby-classes-and-modules)
    - [Blocks, Procs, and Lambdas](#blocks-procs-and-lambdas)
    - [Ruby Gems](#ruby-gems)
    - [Ruby on Rails Basics](#ruby-on-rails-basics)
    - [ActiveRecord in Rails](#activerecord-in-rails)
    - [Testing in Ruby (RSpec)](#testing-in-ruby--rspec-)
    - [Concurrency in Ruby](#concurrency-in-ruby)
    - [Metaprogramming in Ruby](#metaprogramming-in-ruby)

7. [PHP](#php)
    - [PHP Basics and Syntax](#php-basics-and-syntax) ✅✅
    - [Variables and Data Types](#variables-and-data-types)
    - [Control Structures](#control-structures)
    - [Functions and Libraries](#functions-and-libraries)
    - [Forms and Input Handling](#forms-and-input-handling)
    - [OOP in PHP](#oop-in-php)
    - [Database Connectivity (MySQL, SQLite)](#database-connectivity--mysql-sqlite-)
    - [Security Best Practices](#security-best-practices)
    - [Sessions and Cookies](#sessions-and-cookies)
    - [PHP Frameworks (e.g., Laravel)](#php-frameworks--eg-laravel-)

8. [Java](#java)
    - [Java Basics and Syntax](#java-basics-and-syntax) ✅✅
    - [OOP in Java](#oop-in-java)
    - [Collections Framework](#collections-framework)
    - [Exception Handling](#exception-handling)
    - [File I/O](#file-io)
    - [Multithreading](#multithreading)
    - [GUI Programming (Swing or JavaFX)](#gui-programming--swing-or-javafx-)
    - [Database Connectivity (JDBC)](#database-connectivity--jdbc-)
    - [Spring Framework Basics](#spring-framework-basics)
    - [Unit Testing in Java (JUnit)](#unit-testing-in-java--junit-)

## Python
### Python Basics
``` 
String[] questions = {
    "What is the output of the following code: print(3 + 7 * 2)?",
    "Which keyword is used to define a function in Python?",
    "What is the purpose of the 'if' statement in Python?",
    "Which data type is used to store a sequence of characters in Python?",
    "What is the correct way to comment out multiple lines in Python?",
    "What is the result of the expression 10 / 2?",
    "Which of the following is a valid variable name in Python?",
    "What will be the output of the code: print('Hello ' + 'World')?",
    "How do you check the length of a list named 'my_list' in Python?",
    "What is the purpose of the 'else' statement in Python?",
    "What does the 'range' function in Python return?",
    "Which symbol is used for single-line comments in Python?",
    "In Python, how do you declare a tuple?",
    "What is the purpose of the 'while' loop in Python?",
    "Which function is used to take user input in Python?",
    "What is the correct way to write an empty function in Python?",
    "How do you convert a string to an integer in Python?",
    "What is the output of the code: print(2 ** 3)?",
    "What does the 'import' keyword do in Python?",
    "Which method is used to remove the last element from a list in Python?"
};

String[][] options = {
    {"17", "20", "23", "27"},
    {"func", "def", "define", "function"},
    {"To define a loop", "To check conditions", "To print output", "To declare a variable"},
    {"int", "str", "list", "float"},
    {"# This is a comment", "// This is a comment", "/* This is a comment */", "''' This is a comment '''"},
    {"5", "5.0", "2.0", "0"},
    {"my-variable", "my variable", "MyVariable", "_my_variable"},
    {"HelloWorld", "'Hello World'", "Hello World", "Error"},
    {"len(my_list)", "sizeOf(my_list)", "count(my_list)", "length(my_list)"},
    {"To handle errors", "To execute a block of code only if the condition is true", "To repeat a block of code", "To define a function"},
    {"A list of numbers", "A range object", "A list of integers", "A sequence of numbers"},
    {"#", "//", "/*", "'''"},
    {"(1, 2, 3)", "[1, 2, 3]", "{1, 2, 3}", "<1, 2, 3>"},
    {"To create an infinite loop", "To repeat a block of code as long as a certain condition is true", "To define a function", "To iterate over a sequence"},
    {"get_input()", "user_input()", "input()", "read_input()"},
    {"def my_function():", "function my_function():", "function my_function", "define my_function():"},
    {"int('42')", "str(42)", "convertInt(42)", "42.toInt()"},
    {"8", "6", "16", "64"},
    {"To include external libraries", "To print output", "To declare variables", "To define a class"},
    {"remove()", "pop()", "delete()", "del()"}
};

Long[] answer = {0, 1, 1, 1, 0, 0, 3, 2, 0, 1, 1, 0, 0, 2, 2, 0, 1, 2, 3, 1};
```
### Control Flow
```
String[] questions = {
    "What is the purpose of the 'if' statement in Python?",
    "How do you comment out a single line in Python?",
    "Which keyword is used to define the else part of an 'if-else' statement?",
    "What is the correct way to represent an 'or' condition in Python?",
    "What is the purpose of the 'while' loop in Python?",
    "In Python, how do you terminate the current loop iteration and move to the next one?",
    "What does the 'break' keyword do in Python?",
    "What is the purpose of the 'continue' keyword in Python?",
    "Which statement is used to handle exceptions in Python?",
    "How do you define a function in Python?",
    "What is the purpose of the 'return' statement in a function?",
    "How do you call a function named 'my_function' in Python?",
    "What is the correct way to check if a variable is in a list in Python?",
    "Which loop is used to iterate over a sequence of elements in Python?",
    "What does the 'pass' statement do in Python?",
    "What is the purpose of the 'elif' keyword in Python?",
    "In Python, what is the 'else' clause used for in a loop?",
    "How do you create an empty list in Python?",
    "What is the result of the expression '3 in [1, 2, 3]' in Python?",
    "What is the purpose of the 'range' function in Python?"
};

String[][] options = {
    {"To execute a block of code only if the condition is true", "To define a loop", "To concatenate strings", "To handle exceptions"},
    {"// This is a comment", "# This is a comment", "/* This is a comment */", "'This is a comment'"},
    {"elseif", "elif", "else if", "end"},
    {"&&", "||", "&", "|"},
    {"To iterate over a sequence of elements until a condition is false", "To repeat a block of code for a specific number of times", "To define a loop", "To execute a block of code only if the condition is true"},
    {"terminate()", "skip()", "next()", "continue"},
    {"Exits the loop and terminates the program", "Jumps to the beginning of the loop", "Exits the loop and continues with the next iteration", "Does nothing"},
    {"Skips the current iteration and continues with the next one", "Exits the loop and terminates the program", "Jumps to the beginning of the loop", "Does nothing"},
    {"try-except block", "handle-exception block", "exception block", "catch-throw block"},
    {"def my_function():", "function my_function():", "function my_function", "define my_function():"},
    {"To define a variable", "To handle errors", "To specify the type of a variable", "To return a value from a function"},
    {"my_function()", "call my_function()", "invoke my_function()", "function my_function()"},
    {"if variable in [1, 2, 3]:", "if variable contains [1, 2, 3]:", "if variable exists in [1, 2, 3]:", "if variable is [1, 2, 3]:"},
    {"for", "while", "do-while", "foreach"},
    {"Skips the current iteration and continues with the next one", "Exits the loop and terminates the program", "Does nothing", "Raises an exception"},
    {"To define an additional condition for the 'if' statement", "To specify the else part of an 'if-else' statement", "To define a loop", "To check if a variable is in a list"},
    {"To execute a block of code only if the loop is true", "To define the default case in a switch statement", "To define the final case in a switch statement", "To execute a block of code only if the loop is false"},
    {"[]", "{}", "()", "list()"},
    {"True", "False", "Error", "None"},
    {"To generate a sequence of numbers", "To check if a number is within a specific range", "To define the end value of a loop", "To create a list of numbers"}
};

Long[] answer = {0, 0, 1, 1, 0, 3, 2, 1, 0, 0, 3, 0, 0, 0, 2, 1, 3, 0, 0, 1};
```
### Functions
```
String[] questions = {
    "What is a function in Python?",
    "How do you define a function in Python?",
    "What is the purpose of the 'return' statement in a function?",
    "How do you call a function named 'my_function' in Python?",
    "What is a parameter in a function?",
    "How do you pass arguments to a function in Python?",
    "What is a default parameter in Python?",
    "What is the scope of a variable defined inside a function in Python?",
    "What does the 'global' keyword do in Python?",
    "What is a lambda function in Python?",
    "How do you write a multiline comment in a function in Python?",
    "What is the purpose of the 'docstring' in Python?",
    "What is recursion in Python?",
    "What happens if you call a function with fewer arguments than it expects?",
    "What is the purpose of the 'args' parameter in a function definition?",
    "What is the purpose of the 'kwargs' parameter in a function definition?",
    "How do you capture an arbitrary number of positional arguments in a function?",
    "What is the purpose of the 'map' function in Python?",
    "How do you define a function with an unknown number of keyword arguments?",
    "What is a higher-order function in Python?"
};

String[][] options = {
    {"A block of code that performs a specific task", "A variable that holds a function", "A class in Python", "A loop in Python"},
    {"def my_function():", "function my_function():", "my_function()", "define my_function():"},
    {"To define the structure of the function", "To terminate the execution of the function", "To specify the type of a variable", "To return a value from the function"},
    {"my_function()", "call my_function()", "invoke my_function()", "function my_function()"},
    {"A value passed to a function when it is called", "A variable defined inside a function", "A variable that holds a function", "A block of code inside a function"},
    {"Separated by commas in the function call", "Enclosed in square brackets in the function definition", "Passed as a dictionary in the function call", "Separated by spaces in the function call"},
    {"A parameter with a default value", "A parameter that must be passed", "A parameter with an unknown value", "A parameter with a variable type"},
    {"Local to the function where it is defined", "Global throughout the entire program", "Accessible only within the same module", "Accessible from any part of the program"},
    {"Makes a variable accessible from anywhere in the program", "Indicates that a variable should not be modified", "Defines a variable with a constant value", "Specifies the type of a variable"},
    {"An anonymous function defined using the 'lambda' keyword", "A function with no parameters", "A function that returns a lambda object", "A built-in function in Python"},
    {"/* This is a multiline comment */", "''' This is a multiline comment '''", "// This is a multiline comment", "# This is a multiline comment"},
    {"To provide documentation for the function", "To specify the type of the function", "To define the function's return value", "To indicate the function's visibility"},
    {"A function that calls itself", "A function with multiple return statements", "A function that takes multiple parameters", "A function that uses the 'recursion' keyword"},
    {"It raises an error", "It assigns default values to the missing arguments", "It ignores the missing arguments", "It adds None for the missing arguments"},
    {"To capture multiple positional arguments as a tuple", "To capture keyword arguments as a dictionary", "To capture variable arguments as a list", "To capture default arguments as a set"},
    {"To capture keyword arguments as a dictionary", "To capture multiple positional arguments as a tuple", "To capture variable arguments as a list", "To capture default arguments as a set"},
    {"*args", "**args", "*parameters", "**parameters"},
    {"To apply a function to all items in an iterable", "To define a function with variable arguments", "To capture keyword arguments as a dictionary", "To capture multiple positional arguments as a tuple"},
    {"def my_function(**kwargs):", "def my_function(*kwargs):", "def my_function(kwargs):", "def my_function(kwargs={}):"},
    {"A function that takes another function as an argument", "A function with a high-level of abstraction", "A function with a large number of lines of code", "A function that returns another function"}
};

Long[] answer = {0, 0, 3, 2, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1};
```
### Data Structures
### File Handling
### Object-Oriented Programming (OOP)
### Python Standard Library
### Error Handling
### Decorators and Generators
### Web Scraping

## JavaScript
### JavaScript Basics
```
String[] questions = {
    "What is the correct way to include JavaScript in an HTML file?",
    "Which keyword is used to declare a variable in JavaScript?",
    "What is the purpose of the 'typeof' operator in JavaScript?",
    "What will the following code output: console.log(2 + '2')?",
    "How do you comment out a single line in JavaScript?",
    "Which function is used to print output in the console?",
    "What is the result of the expression 10 / 2 in JavaScript?",
    "Which statement is used to perform conditional execution in JavaScript?",
    "What is the purpose of the 'return' statement in a function?",
    "How do you declare an array in JavaScript?",
    "What is the difference between '==' and '===' in JavaScript?",
    "What is the purpose of the 'let' keyword in JavaScript?",
    "Which method is used to add a new element to the end of an array in JavaScript?",
    "What is the purpose of the 'this' keyword in JavaScript?",
    "Which operator is used for logical AND in JavaScript?",
    "What is an example of a falsy value in JavaScript?",
    "How do you create a function in JavaScript?",
    "What is the purpose of the 'addEventListener' method in JavaScript?",
    "What is the difference between 'null' and 'undefined' in JavaScript?",
    "How do you declare a constant variable in JavaScript?"
};

String[][] options = {
    {"<scripting>", "<javascript>", "<script>", "<js>"},
    {"var", "let", "const", "int"},
    {"To check the data type of a variable", "To perform type conversion", "To declare a variable", "To concatenate strings"},
    {"4", "'22'", "NaN", "'4'"},
    {"// This is a comment", "/* This is a comment */", "# This is a comment", "'This is a comment'"},
    {"print()", "log()", "console.log()", "output()"},
    {"5", "5.0", "2.0", "0"},
    {"if", "else", "for", "switch"},
    {"To terminate a function", "To skip the next iteration in a loop", "To specify the type of a variable", "To return a value from a function"},
    {"[1, 2, 3]", "(1, 2, 3)", "{1, 2, 3}", "<1, 2, 3>"},
    {"Checks only value", "Checks both value and type", "Checks only type", "Checks neither value nor type"},
    {"To declare a constant", "To declare a block-scoped variable", "To declare a variable with function scope", "To declare a global variable"},
    {"push()", "append()", "insert()", "addToEnd()"},
    {"To reference the current object", "To reference the global object", "To reference the parent object", "To reference the previous object"},
    {"&&", "||", "&", "|"},
    {"0", "''", "null", "undefined"},
    {"function = myFunction() {}", "function: myFunction() {}", "def myFunction() {}", "function myFunction() {}"},
    {"To handle mouse clicks", "To handle keyboard input", "To handle asynchronous events", "To handle form submissions"},
    {"null is assigned by the programmer, undefined is a system-assigned value", "null is a system-assigned value, undefined is assigned by the programmer", "They are interchangeable", "null and undefined are the same in JavaScript"},
    {"const myVar;", "final myVar;", "const myVar = 10;", "let myVar = 10;"}
};

Long[] answer = {2, 0, 0, 1, 0, 2, 0, 0, 3, 0, 1, 1, 0, 0, 0, 2, 2, 3, 2, 1, 2};
```
### DOM Manipulation
```
String[] questions = {
    "Which method is used to access an element by its ID in the DOM?",
    "How can you change the text content of an HTML element with id \"example\"?",
    "What does the DOM stand for?",
    "Which method is used to create a new HTML element in the DOM?",
    "How can you add a class \"highlight\" to an element with id \"targetElement\"?",
    "What is the purpose of the innerHTML property?",
    "Which method is used to remove an HTML element from the DOM?",
    "How can you check if an element has a specific class \"myClass\"?",
    "What does the setAttribute method do?",
    "How can you attach a click event to an HTML button with the id \"myButton\" using JavaScript?",
    "What is the purpose of the querySelector method?",
    "How can you change the value of an input element with id \"myInput\" using JavaScript?",
    "What is the purpose of the appendChild method?",
    "How can you check if an element with id \"myElement\" exists in the DOM?",
    "What does the parentNode property represent in the DOM?",
    "How can you prevent the default behavior of a click event?",
    "What is the purpose of the classList property?",
    "How can you select all elements with the class \"myClass\"?",
    "What is the purpose of the setAttribute method?",
    "How can you check if an element with id \"myElement\" has a specific attribute \"data-toggle\"?"
};

String[][] options = {
    {"getElementById", "selectElementById", "getIDElement", "queryElementById"},
    {"document.getElement(\"example\").textContent = \"New Text\";", "document.querySelector(\"#example\").innerHTML = \"New Text\";", "document.getElementById(\"example\").innerText = \"New Text\";", "document.getElementById(\"example\").text = \"New Text\";"},
{"Document Object Model", "Data Object Model", "Document Oriented Model", "Document Operation Model"},
    {"createElement", "newElement", "addElement", "makeElement"},
    {"document.getElementById(\"targetElem    ent\").class = \"highlight\";", "document.querySelector(\"#targetElement\").addClass(\"highlight\");", "document.getElementById(\"targetElement\").classList.add(\"highlight\");", "document.querySelector(\"#targetElement\").class = \"highlight\";"},
    {"It gets the text content of an element.", "It sets the text content of an element.", "It gets or sets the HTML content within an element.", "It creates a new HTML element."},
    {"deleteElement", "removeElement", "document.remove(\"elementId\");", "parentNode.removeChild(element);"},
    {"document.querySelector(\".myClass\").hasClass(\"myClass\");", "document.querySelector(\".myClass\").containsClass(\"myClass\");", "document.querySelector(\".myClass\").hasClass(\"myClass\");", "document.querySelector(\".myClass\").isClass(\"myClass\");"},
    {"Adds a new attribute to an HTML element.", "Removes an attribute from an HTML element.", "Modifies the value of an existing attribute.", "Retrieves the value of an attribute."},
    {"document.getElementById(\"myButton\").addEventListener(\"click\", myFunction);", "document.querySelector(\"#myButton\").click(myFunction);", "document.button(\"myButton\").onClick = myFunction;", "document.getElementById(\"myButton\").on(\"click\", myFunction);"},
    {"It selects the first element that matches a specified CSS selector.", "It selects all elements that match a specified CSS selector.", "It selects elements based on their tag name.", "It selects elements based on their index."},
    {"document.getElementById(\"myInput\").value = \"New Value\";", "document.querySelector(\"#myInput\").setValue(\"New Value\");", "document.input(\"myInput\").value = \"New Value\";", "document.getElementById(\"myInput\").text = \"New Value\";"},
    {"It removes an element from the DOM.", "It appends a new child element to an existing element.", "It replaces an existing element with a new element.", "It retrieves the children of an element."},
    {"document.exists(\"myElement\");", "document.querySelector(\"#myElement\").exists();", "document.getElementById(\"myElement\") !== null;", "document.querySelector(\"#myElement\") == true;"},
    {"It represents the parent element of the current element.", "It represents the first child element of the current element.", "It represents the next sibling element of the current element.", "It represents the previous sibling element of the current element."},
    {"event.preventDefault();", "preventDefaultEvent();", "stopPropagation();", "stopDefault();"},
    {"It represents the list of all HTML elements.", "It represents the list of classes associated with an HTML element.", "It represents the list of child elements of an HTML element.", "It represents the list of attributes of an HTML element."},
    {"document.select(\".myClass\");", "document.querySelectorAll(\".myClass\");", "document.getElements(\".myClass\");", "document.getElementById(\"myClass\");"},
    {"Adds a new attribute to an HTML element.", "Removes an attribute from an HTML element.", "Modifies the value of an existing attribute.", "Retrieves the value of an attribute."},
    {"document.getElementById(\"myElement\").hasAttribute(\"data-toggle\");", "document.querySelector(\"#myElement\").attribute(\"data-toggle\").exists();", "document.getElementById(\"myElement\").attribute(\"data-toggle\").isSet();", "document.querySelector(\"#myElement\").hasAttribute(\"data-toggle\");"}
};

Long[] answer = {0L, 2L, 0L, 0L, 2L, 2L, 3L, 2L, 0L, 0L, 0L, 0L, 1L, 2L, 0L, 0L, 1L, 1L, 0L, 0L};
```
### Functions and Closures
```
String[] questions = {
    "What is a JavaScript function?",
    "How do you declare a function in JavaScript?",
    "What is the purpose of the return statement in a function?",
    "What is a parameter in a function?",
    "How do you call a function named myFunction in JavaScript?",
    "What is a JavaScript closure?",
    "What is the scope of a variable declared inside a function?",
    "How can you create an anonymous function in JavaScript?",
    "What is the purpose of the arguments object in a JavaScript function?",
    "How do you check the number of arguments passed to a function?",
    "What is the difference between function declaration and function expression?",
    "What is a callback function in JavaScript?",
    "How can you immediately invoke a function in JavaScript?",
    "What is the purpose of the bind method in JavaScript functions?",
    "What is the closure in the context of a function?",
    "How can you pass a variable number of arguments to a JavaScript function?",
    "What is the purpose of the apply method in JavaScript functions?",
    "What does the this keyword refer to in a JavaScript function?",
    "How do you create a new instance of a function in JavaScript?",
    "What is the purpose of the bind method in JavaScript functions?"
};

String[][] options = {
    {"A data type","A variable","A reusable block of code","An object"},
    {"function = myFunction() {}","function myFunction() {}","var myFunction = function() {}","declare myFunction() {}"},
    {"To stop the execution of the function","To return a value from the function","To print a message to the console","To declare a variable"},
    {"A variable defined inside a function","A value passed to a function when it is called","A function that calls another function","A type of loop in JavaScript"},
    {"run myFunction();","call myFunction;","myFunction();","execute myFunction {}"},
    {"A function that has no parameters","A function that returns another function","A built-in JavaScript object","A variable declared inside a function"},
    {"Global scope","Local scope","Both global and local scope","Function scope"},
    {"function anonymous(){}","var myFunction =()=>{}","var anonymous=function(){}", "anonymous=()=>{}"},
    {"It represents the arguments passed to the function as an array-like object.","It contains the local variables of the function.","It is used to declare parameters in the function signature.","It is a reserved keyword that cannot be used in a function."},
    {"arguments.count","B)arguments.length", "C) arguments.size", "D) arguments.number"},
    {"There is no difference.","Function declaration is hoisted, while function expression is not.","Function expression is hoisted, while function declaration is not.","Function declaration and function expression are not valid in JavaScript."},
    {"A function that calls another function","A function passed as an argument to another function","A function that contains a callback keyword","A function with a return statement"},
    {"invokeFunction();","run function {};","(function(){})();","call function;"},
    {"To bind a function to a specific variable","To bind a function to a specific context, creating a new function","To bind two functions together","To bind a function to an HTML element"},
    {"The act of closing a function","The inner function having access to the outer function's variables","The process of declaring variables inside a function","The act of closing a browser tab"},
    {"Using the ...args syntax","Using the arguments keyword","By declaring multiple parameters","It's not possible in JavaScript"},
    {"To apply a function to a specific element","To apply a function with a given this value and arguments provided as an array","To apply a function with a specific context","To apply a function to all elements in an array"},
    {"The function itself","The window object","The object the function is a method of"," The global scope"},
    {"newFunction();","create function {};","new function();","new myFunction();"},
    {"To bind a function to a specific variable","To bind a function to a specific context, creating a new function","To bind two functions together","To bind a function to an HTML element"}
};

Long[] answer = {2L, 1L, 1L, 1L, 2L, 1L, 1L, 1L, 0L, 1L, 1L, 1L, 2L, 1L, 1L, 0L, 1L, 2L, 3L, 1L};
```
### Asynchronous JavaScript
```
String[] questions = {
    "What is asynchronous programming in JavaScript?",
    "Which keyword is used to define an asynchronous function in JavaScript?",
    "What does the await keyword do in an asynchronous function?",
    "How do you handle errors in asynchronous JavaScript?",
    "What is the purpose of the Promise object in JavaScript?",
    "How do you create a new Promise in JavaScript?",
    "What are the states of a Promise in JavaScript?",
    "How do you handle the fulfillment of a Promise?",
    "What is the purpose of the catch method in a Promise?",
    "What is the event loop in JavaScript?",
    "How do you execute a function after a specific delay in JavaScript?",
    "What is the purpose of the setInterval function in JavaScript?",
    "How do you cancel a scheduled timeout in JavaScript?",
    "What is the purpose of the async/await syntax in JavaScript?",
    "How do you handle multiple promises concurrently in JavaScript?",
    "What is the purpose of the Promise.race method in JavaScript?",
    "What is the purpose of the finally block in a Promise?",
    "What is the role of the resolve function in a Promise?",
    "How do you convert a callback-based function into a promise-based function?",
    "What is the purpose of the async keyword in JavaScript?"
};

String[][] options = {
    {"A way to execute code in a single thread sequentially", "A way to handle multiple tasks simultaneously without blocking the main thread", "A type of loop in JavaScript", "A feature not available in JavaScript"},
    {"async", "function", "await", "asyncFunction"},
    {"Pauses the execution of the function until the promise is resolved or rejected", "Skips the next line of code", "Executes the function synchronously", "Ends the asynchronous function"},
    {"Using try...catch", "Using if...else statements", "Using switch statements", "Errors cannot be handled in asynchronous JavaScript"},
    {"To represent a value that might be available now, in the future, or never", "To define a constant value", "To create a loop in asynchronous functions", "To handle synchronous tasks"},
    {"new Promise.create()", "Promise.new()", "new Promise()", "create Promise()"},
    {"Pending, Resolved, Rejected", "Starting, Running, Stopped", "Waiting, Executing, Completed", "Open, Closed, Error"},
    {"Using the finally block", "Using the resolve function", "Using the then method", "Using the catch block"},
    {"To catch errors thrown in the then method", "To catch errors thrown in the finally block", "To catch errors thrown in the resolve function", "To catch errors thrown in the async function"},
    {"A loop that runs only once", "A loop that handles asynchronous tasks and callbacks", "A loop that handles synchronous tasks", "A loop that runs in a separate thread"},
    {"executeFunction(delay, myFunction)", "setTimeout(myFunction, delay)", "wait(delay).then(myFunction)", "delay(myFunction)"},
    {"To execute a function repeatedly at a specified interval", "To set a timeout for a function", "To create a new asynchronous function", "To handle errors in asynchronous functions"},
    {"clearTimeout(timeoutId)", "cancelTimeout(timeoutId)", "removeTimeout(timeoutId)", "stopTimeout(timeoutId)"},
    {"To handle synchronous tasks", "To create a loop", "To simplify asynchronous code and make it look more like synchronous code", "To handle events in the DOM"},
    {"Using nested 'then' blocks", "Using the Promise.all method", "Using the async/await syntax", "Using the Promise.race method"},
    {"To race two asynchronous functions", "To race multiple promises and fulfill or reject as soon as one of them resolves or rejects", "To set a timeout for a promise", "To handle errors in promises"},
    {"To handle fulfilled promises", "To handle rejected promises", "To execute code regardless of whether the promise is resolved or rejected", "There is no finally block in a Promise"},
    {"To reject a promise", "To fulfill a promise", "To catch errors in a promise", "To define the initial state of a promise"},
    {"wrapInPromise(callbackFunction)", "convertToPromise(callbackFunction)", "Promise.fromCallback(callbackFunction)", "Use the Promise constructor"},
    {"To define a variable as asynchronous", "To create a new asynchronous function", "To handle errors in asynchronous code", "To execute a function after a specific delay"}
};

Long[] answer = {1L, 0L, 0L, 0L, 0L, 2L, 0L, 2L, 0L, 1L, 1L, 0L, 0L, 2L, 1L, 1L, 2L, 1L, 3L, 1L};
```
### Events and Event Handling
### Objects and Prototypes
### JSON in JavaScript
### JavaScript ES6+
### AJAX and Fetch API
### Front-End Frameworks

## HTML
### HTML Basics and Structure
```
String[] questions = {
    "What does HTML stand for?",
    "Which HTML tag is used to define the document type?",
    "What is the correct way to comment out multiple lines in HTML?",
    "Which HTML tag is used to define the root of an HTML document?",
    "Which tag is used to create a hyperlink in HTML?",
    "Which HTML tag is used to create an unordered list?",
    "In HTML, which attribute is used to provide additional information about an element?",
    "What does the 'alt' attribute in the 'img' tag represent?",
    "Which HTML tag is used to define a table?",
    "What is the purpose of the 'colspan' attribute in a table cell?",
    "What is the correct HTML for creating a checkbox?",
    "Which tag is used to create a line break in HTML?",
    "In HTML, what does the acronym 'URL' stand for?",
    "What is the purpose of the 'head' tag in HTML?",
    "Which HTML tag is used to define an inline style?",
    "What is the purpose of the 'iframe' tag in HTML?",
    "Which HTML tag is used to define a form in HTML?",
    "What is the purpose of the 'placeholder' attribute in an input element?",
    "What is the correct way to create a numbered list in HTML?",
    "In HTML, what does the 'hr' tag represent?"
};

String[][] options = {
    {"Hyper Text Markup Language", "Highly Typed Markup Language", "Hyperlink and Text Markup Language", "High Text Markup Language"},
    {"<doctype>", "<html>", "<!doctype html>", "<head>"},
    {"<!-- This is a comment -->", "// This is a comment", "'This is a comment'", "/* This is a comment */"},
    {"<body>", "<head>", "<html>", "<root>"},
    {"<a>", "<link>", "<href>", "<url>"},
    {"<ul>", "<ol>", "<li>", "<list>"},
    {"class", "style", "id", "data"},
    {"Alternative text for an image", "Alignment of text", "Attribute list", "Altitude of the image"},
    {"<table>", "<tr>", "<td>", "<tab>"},
    {"To merge two or more cells horizontally", "To merge two or more cells vertically", "To create a border around a cell", "To define a cell in a table"},
    {"<input type='checkbox'>", "<checkbox>", "<check>", "<input type='check'>"},
    {"<lb>", "<break>", "<br>", "<linebreak>"},
    {"Uniform Resource Locator", "Universal Resource Locator", "Unified Resource Locator", "Uniform Retrieval Locator"},
    {"To define the structure of the HTML document", "To contain metadata about the HTML document", "To display content on the webpage", "To provide styles for the HTML document"},
    {"<style>", "<css>", "<script>", "<font>"},
    {"To embed an external webpage within the current webpage", "To create an inline frame", "To define a hyperlink", "To display an image"},
    {"<form>", "<input>", "<submit>", "<field>"},
    {"To specify the text that should be displayed in the input field before the user enters a value", "To define a default value for the input field", "To set the maximum length of the input field", "To validate user input in real-time"},
    {"<ol>", "<ul>", "<li>", "<list>"},
    {"To create a horizontal ruler", "To define a hyperlink reference", "To separate content in a webpage", "To represent a header in a table"}
};

Long[] answer = {0, 2, 0, 2, 0, 0, 2, 0, 0, 0, 0, 2, 1, 0, 0, 1, 0, 0, 3, 0, 2};
```
### HTML Forms
```
String[] questions = {
    "What HTML element is used to create a form?",
    "Which attribute is used to specify the HTTP method in a form?",
    "What type of input is used for a single-line text entry in a form?",
    "How can you create a drop-down list in HTML?",
    "Which input type is used for checkboxes?",
    "What is the purpose of the <label> element in HTML forms?",
    "Which attribute is used to set the initial value of a text input in a form?",
    "What does the required attribute do in an input element?",
    "Which input type is used for file uploads?",
    "How do you group radio buttons in HTML?",
    "What is the purpose of the <header> element in HTML5?",
    "Which HTML tag is used to define a hyperlink?",
    "What does the <article> element represent in HTML5?",
    "Which tag is used for grouping and applying styles to inline elements?",
    "What is the purpose of the <footer> element in HTML?",
    "Which HTML tag is used to create an unordered list?",
    "What is the purpose of the <nav> element in HTML5?",
    "Which attribute is used to define the source URL of an image in HTML?",
    "What does the <aside> element represent in HTML5?",
    "Which HTML tag is used to define a division or a section in a webpage?"
};

String[][] options = {
    {"<form>", "<input>", "<submit>", "<field>"},
    {"method", "action", "type", "link"},
    {"text", "password", "textarea", "inputline"},
    {"<select>", "<list>", "<dropdown>", "<options>"},
    {"check", "box", "checkbox", "selectbox"},
    {"Adds a label to an input element", "Defines a section of navigation links", "Specifies the main content of a webpage", "Represents a list item"},
    {"initial", "value", "default", "start"},
    {"Specifies a default value", "Marks the input as mandatory", "Defines the input type", "Creates a reset button"},
    {"file", "upload", "text", "image"},
    {"<group>", "<radio>", "<inputgroup>", "<input type=\"radio\" name=\"group\">"},
    {"Defines a footer for a section or page", "Represents introductory content at the beginning of a section or page", "Specifies a navigation menu for a section or page", "Indicates the copyright information of a section or page"},
    {"<link>", "<href>", "<a>", "<hyper>"},
    {"A standalone piece of content that can be distributed and reused independently", "A section of navigation links", "The main content of a webpage", "a block of code"},
    {"<div>", "<span>", "<section>", "<group>"},
    {"Represents a navigation menu", "Defines the footer of a section or page", "Specifies the main content of a webpage", "Indicates the header of a webpage"},
    {"<ol>", "<list>", "<ul>", "<dl>"},
    {"Defines the main content of a webpage", "Specifies a navigation menu for a section or page", "Represents a block of code", "Indicates the footer of a webpage"},
    {"src", "link", "href", "url"},
    {"A block of code", "Tangentially related content, like a sidebar", "The main content of a webpage", "A hyperlink"},
    {"<div>", "<section>", "<block>", "<area>"}
};

Long[] answer = {0L, 0L, 0L, 0L, 2L, 0L, 1L, 1L, 0L, 3L, 1L, 2L, 0L, 1L, 1L, 2L, 1L, 0L, 1L, 0L};
```
### Semantics and Structure
```
String[] questions = {
    "Which HTML5 element is used for the main content of the document?",
    "What is the purpose of the <nav> element in HTML5?",
    "Which HTML tag is used to define a section in a document?",
    "What does the <article> element represent in HTML5?",
    "Which element is used for metadata in HTML?",
    "What is the role of the <header> element in HTML5?",
    "What is the purpose of the <aside> element in HTML5?",
    "Which HTML tag is used to define a hyperlink?",
    "What does the <time> element represent in HTML5?",
    "Which HTML element is used to define a footer for a section or page?",
    "What is the purpose of the <mark> element in HTML5?",
    "Which HTML5 attribute is used to provide an alternative text for an image?",
    "What is the significance of the <section> element in HTML5?",
    "Which tag is used to define a thematic change in the content of a document?",
    "What is the purpose of the <figcaption> element in HTML5?",
    "Which HTML element is used to define a list item within an ordered or unordered list?",
    "What is the role of the <figure> element in HTML5?",
    "Which attribute is used to provide additional information about an element in HTML?",
    "What does the <abbr> element represent in HTML5?",
    "Which HTML tag is used to define the main heading of a document or section?"
};

String[][] options = {
    {"<main>", "<body>", "<content>", "<section>"},
    {"Defines a section of navigation links", "Represents introductory content at the beginning of a section or page", "Specifies a navigation menu for a section or page", "Indicates the header of a webpage"},
    {"<div>", "<section>", "<area>", "<group>"},
    {"A standalone piece of content that can be distributed and reused independently", "A section of navigation links", "The main content of a webpage", "A block of code"},
    {"<meta>", "<head>", "<metadata>", "<data>"},
    {"Represents introductory content at the beginning of a section or page", "Indicates the header of a webpage", "Specifies a navigation menu for a section or page", "Defines a section of navigation links"},
    {"Represents tangentially related content, like a sidebar", "Defines additional information that is related to the main content", "Specifies a navigation menu for a section or page", "A standalone piece of content that can be distributed and reused independently"},
    {"<a>", "<link>", "<href>", "<hyperlink>"},
    {"Represents a specific period in time", "Indicates a hyperlink", "Defines a thematic change in the content", "Specifies additional details about an element"},
    {"<footer>", "<caption>", "<summary>", "<bottom>"},
    {"Highlights text for reference purposes", "Defines a thematic change in the content", "Specifies additional details about an element", "Indicates a specific section of content"},
    {"alt", "caption", "src", "title"},
    {"It defines a thematic change in the content", "It specifies a section of content", "It represents a generic container with no specific semantic meaning", "It provides a way to group elements for styling purposes"},
    {"<div>", "<section>", "<hr>", "<p>"},
    {"Defines a caption or legend for a <figure> element", "Specifies additional details about an element", "Represents introductory content at the beginning of a section or page", "Indicates the header of a webpage"},
    {"<li>", "<ul>", "<ol>", "<dl>"},
    {"Represents any content that is referenced from the main content", "Defines a thematic change in the content", "Specifies a navigation menu for a section or page", "Indicates a specific section of content"},
    {"title", "info", "description", "metadata"},
    {"Represents an abbreviation or acronym", "Defines additional details about an element", "Indicates a hyperlink", "Specifies a navigation menu for a section or page"},
    {"<h1>", "<heading>", "<head>", "<header>"}
};

Long[] answer = {0L, 0L, 1L, 0L, 0L, 1L, 0L, 0L, 2L, 0L, 1L, 0L, 2L, 0L, 1L, 0L, 0L, 0L, 0L, 0L};
```
### Media Elements
```
String[] questions = {
    "What HTML tag is used to embed audio content?",
    "Which attribute is used to specify the source file of an audio element?",
    "In HTML, what tag is used for embedding video content?",
    "Which attribute is used to define an image as a clickable hyperlink in HTML?",
    "The controls attribute in the <audio> and <video> tags provides what functionality?",
    "What is the purpose of the <source> element inside an <audio> or <video> tag?",
    "Which attribute is used to specify an image file in the <img> tag?",
    "The autoplay attribute in the <video> tag is used for:",
    "Which attribute is used to specify a poster image for a video in HTML?",
    "What does the <track> element inside a <video> tag do?",
    "Which attribute is used to set the initial volume of an audio or video element?",
    "What is the purpose of the controls attribute in the <video> tag?",
    "Which attribute is used to specify a fallback source for the audio or video element?",
    "How can you make a video play in a loop using HTML?",
    "What is the purpose of the preload attribute in the <audio> or <video> tag?",
    "Which attribute is used to specify the width of an embedded video?",
    "How can you make a video start playing from a specific time using HTML?",
    "What is the purpose of the <canvas> element in HTML?",
    "Which attribute is used to specify the aspect ratio of a video in HTML?",
    "What HTML tag is used to embed a PDF document?"
};

String[][] options = {
    {"<audio>", "<sound>", "<music>", "<media>"},
    {"src", "source", "file", "audio-source"},
    {"<video>", "<movie>", "<visual>", "<vid>"},
    {"href", "link", "src", "url"},
    {"Play and pause controls", "Volume control", "Full-screen mode", "All of the above"},
    {"It defines alternative text for the media", "It specifies the type of media file", "It sets the size of the media player", "It controls the playback speed"},
    {"img-src", "image", "src", "picture"},
    {"Automatically playing the video when the page loads", "Creating a loop for continuous playback", "Pausing the video by default", "None of the above"},
    {"thumbnail", "poster", "image", "cover"},
    {"It defines a track for subtitles or captions", "It specifies the playback speed", "It sets the video resolution", "It controls the audio output"},
    {"sound", "volume", "initial-volume", "volumne"},
    {"It adjusts the video resolution", "It provides play and pause controls", "It changes the video speed", "It adds a border around the video"},
    {"fallback", "alt", "fallback-source", "fallback-src"},
    {"Set loop="true" attribute", "Use the loop attribute without a value", "Add a <loop> element inside the <video> tag", "Set loop="loop" attribute"},
    {"It preloads the media file for faster playback", "It specifies the file size of the media", "It controls the buffering speed", "It changes the playback speed"},
    {"width", "size", "video-width", "length"},
    {"Use the start attribute", "Add a start-time attribute", "Set the autoplay attribute with a time value", "Use JavaScript for time control"},
    {"It is used for drawing graphics using JavaScript", "It embeds external images in the document", "It displays 3D models", "It is a container for multimedia content"},
    {"aspect-ratio", "ratio", "video-aspect", "aspect"},
    {"<pdf>", "<document>", "<embed>", "<iframe>"}
};

Long[] answer = {0L, 1L, 0L, 2L, 3L, 1L, 2L, 0L, 1L, 0L, 0L, 1L, 2L, 0L, 0L, 1L, 2L, 0L, 3L, 2L};
```
### Responsive Design
```
String[] questions = {
    "What does \"RWD\" stand for in the context of web development?",
    "Which HTML tag is commonly used to create a responsive navigation menu?",
    "In CSS, what property is used to make an image or a video responsive within a container?",
    "Which CSS framework is widely used for building responsive and mobile-first websites?",
    "What is the purpose of the viewport meta tag in HTML for responsive design?",
    "Which CSS property is used to create flexible grids in responsive design?",
    "What is the purpose of media queries in CSS for responsive design?",
    "Which CSS unit is commonly used for responsive font sizes?",
    "What is the purpose of the CSS property overflow: hidden in a responsive design?",
    "Which HTML5 element is used to embed responsive videos?",
    "What does the term \"breakpoint\" refer to in responsive design?",
    "How can you hide an element on smaller screens in CSS using media queries?",
    "Which CSS property is used to set the spacing between columns in a responsive layout?",
    "What is the purpose of the @media rule in CSS?",
    "Which HTML5 attribute is used to ensure that a webpage is optimized for mobile devices?",
    "How can you make an image fluid and responsive within its container in CSS?",
    "Which CSS property is used to create a sticky navigation bar in a responsive design?",
    "In responsive design, what does the term \"mobile-first\" mean?",
    "Which HTML5 element is used for grouping and applying styles to a set of navigation links in responsive design?",
    "What is the purpose of the CSS property flex-grow in a responsive layout?"
};

String[][] options = {
    {"Real Web Design", "Responsive Web Design", "Rapid Web Development", "Relative Width Design"},
    {"<nav>", "<menu>", "<navbar>", "<navigation>"},
    {"width", "height", "max-width", "min-height"},
    {"Bootstrap", "Foundation", "Bulma", "All of the above"},
    {"Defines the background color of the viewport", "Sets the initial scale of the webpage", "Specifies the font family for the entire page", "None of the above"},
    {"flex", "grid", "layout", "box-sizing"},
    {"To include external media files", "To apply styles based on device characteristics", "To add media elements like images and videos", "None of the above"},
    {"px (pixels)", "em", "rem", "vw (viewport width)"},
    {"Hides the entire webpage", "Prevents content from overflowing its container", "Adds a hidden scrollbar to the webpage", "None of the above"},
    {"<video>", "<embed>", "<media>", "<player>"},
    {"A point in the code where errors occur", "The point at which a webpage's layout changes based on device width", "A specific pixel value for images", "None of the above"},
    {"display: none;", "visibility: hidden;", "opacity: 0;", "hidden: true;"},
    {"padding", "margin", "column-gap", "grid-gap"},
    {"To define media types for a stylesheet", "To apply styles only when certain conditions are met", "To include external media files", "None of the above"},
    {"mobile-optimized", "viewport", "responsive", "device-width"},
    {"image-size: fluid;", "max-width: 100%;", "responsive: true;", "fluid-image: auto;"},
    {"fixed", "sticky", "position: absolute;", "float: top;"},
    {"Designing specifically for smartphones", "Prioritizing styling for desktop screens", "Starting with the smallest screen size and progressively enhancing for larger screens", "Ignoring mobile devices in the design process"},
    {"<nav>", "<ul>", "<menu>", "<list>"},
    {"Defines the growth factor of a flex item", "Sets the flex container's growth rate", "Determines the width of a flexible box", "None of the above"}
};

Long[] answers = {1L, 0L, 2L, 3L, 1L, 1L, 1L, 3L, 1L, 0L, 1L, 0L, 2L, 1L, 1L, 1L, 1L, 2L, 0L, 0L};
```
### HTML5 Features
### HTML Accessibility
### SVG in HTML
### Meta Tags and SEO
### Web Accessibility Standards

## Go
### Introduction to Go
```
String[] questions = {
    "What is the primary purpose of the 'go' keyword in Go language?",
    "Which of the following is a valid way to comment out a single line in Go?",
    "What is the zero value of an uninitialized numeric variable in Go?",
    "In Go, how is a package's visibility controlled?",
    "Which of the following is a correct way to declare and initialize a variable in Go?",
    "What is the purpose of the 'defer' keyword in Go?",
    "Which data type is used to represent a sequence of characters in Go?",
    "How do you import a package named 'fmt' in a Go program?",
    "Which keyword is used to create a new instance of a structure in Go?",
    "What is the purpose of the 'panic' function in Go?",
    "In Go, how do you declare a constant?",
    "What is the purpose of the 'range' keyword in Go?",
    "Which type of loop is used in Go for iterating over a collection?",
    "How do you check if two slices are equal in Go?",
    "What is the purpose of the 'select' statement in Go?",
    "Which package provides functions for formatting input and output in Go?",
    "What is the purpose of the 'init' function in Go?",
    "In Go, how do you create an array with a fixed size?",
    "Which keyword is used for creating an alias for a data type in Go?",
};

String[][] options = {
    {"To start a new goroutine " ,"To declare a constant " ,"To define a new variable " ,"To perform a type assertion "},
    {" // Comment ", " /* Comment */  ", " #Comment ", " --Comment "},
    {" 0 " , " 1 ", " Null " , " Undefined "},
    {"Public and private keywords " , "Exported and unexported identifiers  ","Package and module keywords", "Visible and hidden declarations"},
    {"var x int = 10  ","x:= 10","x = 10","int x = 10"},
    {" To delay the execution of a function until the surrounding function returns" , "To create a pointer to a variable","To declare a deferred variable " , " To execute a function asynchronously "},
    {"string", " char " , " text " , "sequence"},
    {"To create a new variable" , "To allocate memory for a new map, slice, or channel" , "To initialize a constant " , "To delete a variable " },
    {" import "fmt" " , " import "fmt" ", " use "fmt" ", " require "fmt" " },
    {" new " , " make " , " struct " , " instance " },
    {"  To handle errors gracefully " , " To print messages to the console " , " To recover from panics " , " To trigger a program panic and terminate the program " },
    {" const x = 10  " , " let x = 10 " ," constant x = 10 ", " var x constant = 10 " },
    {" To define a range of values for a variable"," To iterate over elements in various data structures"," To specify the range of an array" ," To create a range of goroutines" },
    {" for loop ", " while loop ", " foreach loop " ," iterate loop " },
    {" Use the '==' operator ", " Use the '===' operator " ," Use the equal method " , " Slices cannot be directly compared for equality " },
    {" To select a case from a switch statement " , " To select a value from a channel  "," To choose between multiple return values ", " To select a variable in a range statement " },
    {" fmt "," io ", " inputoutput " ," format " },
    {" To initialize global variables ", " To perform package-level initialization "," To initialize a new instance of a struct ", " To initialize constants " },
    {" arr := [5]int{} ", " arr := {1, 2, 3, 4, 5} "," arr := make([]int, 5) ", " arr := new Array(5) " },
    {" type " , " alias " , " typedef " , " define " },
    
};

Long[] answer ={0 , 0, 0, 1, 1, 0, 0, 1, 0, 0, 3, 0, 1, 0, 3, 1, 0, 1, 0, 0 };
```
### Variables and Data Types
```
String[] questions = {
    "Which HTML5 element is used for the main content of the document?",
    "What is the purpose of the <nav> element in HTML5?",
    "Which HTML tag is used to define a section in a document?",
    "What does the <article> element represent in HTML5?",
    "Which element is used for metadata in HTML?",
    "What is the role of the <header> element in HTML5?",
    "What is the purpose of the <aside> element in HTML5?",
    "Which HTML tag is used to define a hyperlink?",
    "What does the <time> element represent in HTML5?",
    "Which HTML element is used to define a footer for a section or page?",
    "What is the purpose of the <mark> element in HTML5?",
    "Which HTML5 attribute is used to provide an alternative text for an image?",
    "What is the significance of the <section> element in HTML5?",
    "Which tag is used to define a thematic change in the content of a document?",
    "What is the purpose of the <figcaption> element in HTML5?",
    "Which HTML element is used to define a list item within an ordered or unordered list?",
    "What is the role of the <figure> element in HTML5?",
    "Which attribute is used to provide additional information about an element in HTML?",
    "What does the <abbr> element represent in HTML5?",
    "Which HTML tag is used to define the main heading of a document or section?"
};

String[][] options = {
    {"<main>", "<body>", "<content>", "<section>"},
    {"Defines a section of navigation links", "Represents introductory content at the beginning of a section or page", "Specifies a navigation menu for a section or page", "Indicates the header of a webpage"},
    {"<div>", "<section>", "<area>", "<group>"},
    {"A standalone piece of content that can be distributed and reused independently", "A section of navigation links", "The main content of a webpage", "A block of code"},
    {"<meta>", "<head>", "<metadata>", "<data>"},
    {"Represents introductory content at the beginning of a section or page", "Indicates the header of a webpage", "Specifies a navigation menu for a section or page", "Defines a section of navigation links"},
    {"Represents tangentially related content, like a sidebar", "Defines additional information that is related to the main content", "Specifies a navigation menu for a section or page", "A standalone piece of content that can be distributed and reused independently"},
    {"<a>", "<link>", "<href>", "<hyperlink>"},
    {"Represents a specific period in time", "Indicates a hyperlink", "Defines a thematic change in the content", "Specifies additional details about an element"},
    {"<footer>", "<caption>", "<summary>", "<bottom>"},
    {"Highlights text for reference purposes", "Defines a thematic change in the content", "Specifies additional details about an element", "Indicates a specific section of content"},
    {"alt", "caption", "src", "title"},
    {"It defines a thematic change in the content", "It specifies a section of content", "It represents a generic container with no specific semantic meaning", "It provides a way to group elements for styling purposes"},
    {"<div>", "<section>", "<hr>", "<p>"},
    {"Defines a caption or legend for a <figure> element", "Specifies additional details about an element", "Represents introductory content at the beginning of a section or page", "Indicates the header of a webpage"},
    {"<li>", "<ul>", "<ol>", "<dl>"},
    {"Represents any content that is referenced from the main content", "Defines a thematic change in the content", "Specifies a navigation menu for a section or page", "Indicates a specific section of content"},
    {"title", "info", "description", "metadata"},
    {"Represents an abbreviation or acronym", "Defines additional details about an element", "Indicates a hyperlink", "Specifies a navigation menu for a section or page"},
    {"<h1>", "<heading>", "<head>", "<header>"}
};

Long[] answer = {0L, 0L, 1L, 0L, 0L, 1L, 0L, 0L, 2L, 0L, 1L, 0L, 2L, 0L, 1L, 0L, 0L, 0L, 0L, 0L};
```
### Control Flow
### Functions and Packages
### Concurrency in Go
### Error Handling
### Pointers in Go
### Go Web Programming
### Unit Testing in Go
### Go Best Practices

## CSS
### CSS Basics and Selectors
```
String[] questions = {
"What type of CSS is generally recommended for designing large web pages?",
"Can negative values be allowed in padding property?",
"How can we select an element with a specific ID in CSS ?",
"What type of selector is used in this case ?\np {line-height : 150%;}",
"How many layouts were there before the Flexbox Layout Module was introduced in CSS ?",
"What parameter does the calc() function in CSS  take ?",
"We can make rounded borders around the elements using which CSS element ?",
"The transparent keyword is equivalent to which RGBA() value in CSS ?",
"Which of the following syntax is correct in CSS to make each word of a sentence start with a capital letters ?",
"In the below code snippet,in what order will the margins be added?\np{margin: 25px 50px 75px 100px;}",
"The CSS property used to specify the transparency of an element is ?",
"How are custom fonts defined using CSS ?",
"Setting an inline-block in CSS requires the property ?",
"The ____ attribute is used to define the name(s) of the class(es) to which a particular tag belongs.",
"Which of the following is the correct syntax to make the background-color of all paragraph elements to yellow ?",
"Which property is used as the shorthand property of the padding properties ",
"The CSS property used to make the text bold is-",
"Which property is used to allign the text in a table?",
"Which selector select any tag with an id attribute set?",
"Which selector select siblings?"
};

String[][] options = {
{"Inline", "Internal", "External", "None of the above "},
{"Yes", "No", "Depends on property", "None of the above "},
{"#", " -", " ^", "None of the above "},
{"class Selector", "element Selector", " id Selector", "none of the    mentioned "},
{"1", " 2", "3", "4"},
{"A sentence",  "A mathematical expression",  "A number", "All the them"},
{"border-collapse",  "border-round", "border-radius", "None of the above"},
{"RGBA(0,0,0,1)", "RGBA(255,255,255,1)", "RGBA(0,0,0,0)", "RGBA(255,255,255,0)"},
{"text-style : capital;", "transform : capitalize;",  "text-transform : capital;",  "text-transform : capitalize;"},
{"Top, Right, Bottom, Left",  "Top, Left, Bottom, Right", "Top, Bottom, Right, Left", "Right, Left, Bottom, Top"},
{"opacity", "visibility", "filter", "all  of the above"}, 
{"@font-face rule", "Custom fonts can not be defined", "src tags", "none of them"},
{"display", "Color", "Div", "Both (a) and (b)"},
{"class", "element", "Id", "None of the above"},
{"p {background-color : yellow;}", "p {background-color : #yellow;}", "all {background-color : yellow;}", "all p {background-color : #yellow;}"},
{"padding -left", "padding right", "padding", "all of them"},
{"font-weight : bold", "weight : bold", "font : bold", "style :bold"},
{"text-align", "align", "text", "none"},
{"E#id", ". class", "#id", "*"},
{"E.class", "E~F", "*", "E,F,G"}
};

Long [] answer = {2, 1, 0, 1, 3, 1, 2, 2, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 1};
```
### Box Model and Layout
```
String[] questions = 
{
"Which property is not used for positioning columns next to each other?",
"Which part of box model clears an area around the content ?",
"Which part of box model is transparent?",
"Which is not a box-level element?",
"The content of the box , where text and images appear.",
"What will take the element out of normal flow?",
"Which visibility property value is described by the element is not visible, but the layout of surrounding element is not affected?",
"Which property can't be the value of float property?",
"Which property defines the style for the left border of an element?",
"Which value is not taken by the border-style property?",
"Which type of margin collapses? ",
"Which overrides container's align-items property?",
"Which property is nearest to the element, as per the box model",
"Which specifies initial length of flex item?",
"Which property specifies the stack order of elements?",
"Which box sizing property value is described by width and height include content ,padding and border ?",
"Which property controls the horizontal overflow of a block or inline block?",
"Which was not previous layout mode?",
"What can't be the value of a clear property?",
"What does not affect the element itself"
};

String[][] options =
{
{"float", "width", "margin", "border"},
{"padding", "border", "margin", "none of them"},
{"padding", "margin", "border", "all of the above"},
{"<p>", "<ul>", "<li>", "<b>"},
{"true", "false", "can be true or false", "can't say"},
{"fixed positioning", "floating elements", "relative positioning", "absolute positioning"},
{"visible", "hidden", "collapse", "none"},
{"left", "right", "center", "inherit"},
{"border-style", "border-left-style", "border-left-width", "border-right"},
{"out", "groove", "ridge", "inset"},
{"only Top or Bottom", "only Right or Left", "Top and Bottom", "Left and Right"},
{"order", "align-self", "align-items", "flex"},
{"padding", "margin", "border", "alignment"},
{"flex-flow", "flex-grow", "flex-shrink", "flex-basis"},
{"z-index", "overlap", "override", "none"},
{"content-box", "border-box", "both", "none"},
{"overflow-y", "overflow-k", "overflow-x", "overflow"},
{"block","flexbox layout", "inline", "positioned"},
{"left", "inherit", "right", "center"},
{"perspective()", "scale()", "matrix()", "rotate"}
};

Long[] answer = {3L, 0L, 0L, 3L, 0L, 1L, 1L, 2L, 1L, 0L, 2L, 1L, 0L, 3L, 0L, 2L, 2L, 1L, 3L, 0L};
```
### Flexbox and Grid
```
String[] questions = {
    "What is a grid made up of?",
    "What property should use to customize the rows generated automatically?",
    "What property decides if rows or columns get generated?",
    "What does the fr measurement unit do?",
    "What is the syntax for the repeat() function?",
    "How can I make a column respect a maximum or a minimum size?",
    "How can I align the content INSIDE of the grid cells?",
    "How can I align the grid cells?",
    "How can I give space between the cells?",
    "What is the default value of grid-auto-flow property?",
    "How to correctly place a grid item inside a named area?",
    "Which is an invalid property?",
    "Flex-flow is a shorthand for",
    "The order property applies to both flex items and grid items",
    "Which of the following is an invalid property?",
    "What is the default value of the flex-grow property?",
    "What is the default value of the flex-shrink property?",
    "What element do you target Flexbox on to?",
    "What flexbox property changes the order of the flex-items?",
    "How do you specify how flex items are laid out in the container?"
};

String[][] options = {
    {"lines, cells, rows, columns", "lines, cells, columns", "lines, cells, rows", "grid structure"},
    {"grid-generated-rows", "grid-auto-rows", "grid-automatically-rows", "customize-rows"},
    {"grid-auto-flow", "grid-flow", "grid-generated-flow", "grid-generation"},
    {"It takes as much space as possible", "It makes the rigid contract", "It expands the lines of the cell", "Flexible rows"},
    {"repeat(size,times)", "repeat(times,size)", "repeat(size)(times)", "syntax-repeat"},
    {"using maxSize() function", "using minmax() function", "using min-max property", "column-size"},
    {"using place-items", "using place-content", "none", "align-inside"},
    {"using place-items", "using place-content", "both", "align-cells"},
    {"margin", "padding", "grid-gap", "cell-spacing"},
    {"auto", "row", "fill", "column"},
    {"grid-area: 'foo';", "item-area: foo;", "grid-area: foo;", "item-placement"},
    {"grid-template", "grid-row", "grid-area", "grid-flow"},
    {"it's an invalid property", "flex-column & flex-row", "flex-direction & flex-wrap", "flex-shorthand"},
    {"false", "true", "none", "both"},
    {"flex-column", "flex-basis", "flex-flow", "flex-direction"},
    {"0", "1", "both", "none"},
    {"1", "0", "both", "none"},
    {"the parent element", "child element", "doesn't matter", "container-element"},
    {"flex-order", "order", "flex-change", "order-change"},
    {"justify content", "flex-direction", "align-items", "layout-specification"}
};

Long[] answers = {0L, 1L, 0L, 0L, 1L, 1L, 0L, 1L, 2L, 1L, 2L, 3L, 2L, 1L, 0L, 0L, 0L, 0L, 1L, 1L};
```
### Responsive Design with Media Queries
```
String[] questions = {
    "Which media features describe the number of entries in the color lookup table of the output device?",
    "Which of the following Viewport Property sets the initial scaling factor?",
    "Which Viewport Property determines whether the display can be zoomed in & out?",
    "Which CSS property allows you to define the rules for different media types and devices?",
    "Which media query operator is used to target devices with a width between 768px and 1024px?",
    "Which CSS property allows you to set the font size relative to the root element's font size?",
    "Which CSS property allows you to create flexible grid layouts for responsive design?",
    "Which CSS property is used to control the stacking order of elements in responsive design?",
    "What is the purpose of the flex-direction property in CSS for responsive design?",
    "Which CSS property is used to make text wrap around an image in a responsive layout?",
    "Which unit of measurement in CSS is relative to the font size of the parent element and can be used for responsive typography?",
    "In a media query, what does the 'orientation' property target to distinguish between portrait and landscape orientations of a device?",
    "Which CSS property allows you to specify the number of columns in a responsive multi-column layout?",
    "What is the primary goal of responsive web design?",
    "What is the purpose of media queries in responsive web design?",
    "Which media query operator is used to target devices with a width less than or equal to 600px?",
    "What does the 'viewport' refer to in the context of responsive web design?",
    "What is the primary purpose of using responsive images in web design?",
    "What is the purpose of the CSS display property in responsive design?",
    "What does the meta viewport tag's 'initial-scale' property control in responsive web design?"
};

String[][] options = {
    {"color", "color-index", "color-value", "color-@media"},
    {"scale", "initial-scale", "minimum-scale", "user-scale"},
    {"scale", "set-scale", "adjust-scale", "user-scalable"},
    {"media-rules", "media-queries", "device-styles", "responsive-layout"},
    {"and", "not", "between", "or"},
    {"font-adjust", "font-size-adjust", "font-relative-size", "rem"},
    {"grid-layout", "flexbox", "media-queries", "responsive-grid"},
    {"z-index", "position", "display", "order"},
    {"It controls the stacking order of elements", "It specifies the order in which flex items appear", "It defines the direction of the flexible container's main axis", "It adjusts the font size based on the Viewport's width"},
    {"float", "text-wrap", "image-wrap", "text-flow"},
    {"px", "em", "vw", "pt"},
    {"landscape", "orientation", "portrait", "device-orientation"},
    {"layout-columns", "column-count", "multi-columns", "responsive-columns"},
    {"Creating visually appealing websites", "Providing a consistent user experience on different devices", "Maximizing website performance", "Ensuring cross-browser compatibility"},
    {"To hide certain elements on the webpage", "To load web fonts faster", "To adapt the layout and styling based on the device's characteristics", "To create interactive animations"},
    {"and", "not", "max-width", "or"},
    {"The browser's title bar", "The device's physical screen", "The visible area of the webpage in the browser", "The URL of the website"},
    {"To make images load faster", "To ensure all images are the same size", "To adjust image dimensions based on the device's screen size", "To add decorative elements to the webpage"},
    {"To control the stacking order of elements", "To define the order of elements within a flex container", "To specify how elements are displayed within the layout", "To adjust the font size based on the viewport's width"},
    {"The width of the viewport", "The initial font size of the webpage", "The initial scale of the webpage's content", "The background color of the webpage"}
};

Long[] answers = {1L, 1L, 3L, 1L, 0L, 3L, 1L, 0L, 2L, 0L, 1L, 1L, 1L, 1L, 2L, 2L, 2L, 2L, 2L, 2L};
```
### Transitions and Animations
### CSS Preprocessors
### CSS Frameworks
### Variables and Custom Properties
### Browser Dev Tools
### CSS Naming Conventions

## Ruby
### Ruby Basics and Syntax
```
String[] questions = {
   "What is the file extension for Ruby source files?",
   "In Ruby, how do you print something to the console?",
   "Which keyword is used to define a method in Ruby?",
   "What is the Ruby equivalent of the 'if-else' statement in other languages?",
   "What does the '&&' operator represent in Ruby?",
   "How do you define a class in Ruby?",
   "What is the purpose of the 'attr_accessor' in a Ruby class?",
   "What is the symbol used to represent a block in Ruby?",
   "How do you create an array in Ruby?",
   "What does the 'each' method do in Ruby?",
   "How do you comment multiple lines in Ruby?",
   "What is the purpose of the 'super' keyword in Ruby?",
   "Which method is used to remove the last element from an array in Ruby?",
   "What does the 'self' keyword refer to in Ruby?",
   "What is the purpose of the 'yield' keyword in Ruby?",
   "How do you open and read a file in Ruby?",
   "What is the purpose of the 'include' module in Ruby?",
   "How do you raise an exception in Ruby?",
   "Which Ruby method is used to convert a string to uppercase?",
   "What is the purpose of the 'require' statement in Ruby?"
};

String[][] options = {
   {"rb", "ru", "ruby", "rbs"},
   {"console.log", "puts", "print", "echo"},
   {"define", "method", "func", "def"},
   {"ifelse", "elsif", "elseif", "switch"},
   {"Logical OR", "Logical AND", "Bitwise OR", "Bitwise AND"},
   {"class MyClass", "create class MyClass", "MyClass : class", "new Class MyClass"},
   {"Defines a new attribute", "Creates a getter and setter method for an attribute", "Removes an attribute", "Prints the attribute value"},
   {"do and end", "{ and }", "begin and finish", "block and endblock"},
   {"array = [1, 2, 3]", "array(1, 2, 3)", "array = {1, 2, 3}", "set array = [1, 2, 3]"},
   {"Iterates over elements in an array or hash", "Adds elements to an array", "Multiplies each element in an array", "Divides each element in an array"},
   {"/* */", "--", "#{}", "=begin and =end"},
   {"Calls the parent class method", "Calls the child class method", "Ends the program execution", "Prints a message to the console"},
   {"remove_last", "delete_last", "pop", "shift"},
   {"The current instance of the class", "The parent class", "The child class", "The entire program"},
   {"Exits a method", "Pauses program execution", "Raises an exception", "Invokes a block passed to a method"},
   {"open_file('filename.txt')", "read_file('filename.txt')", "File.open('filename.txt', 'r')", "read('filename.txt')"},
   {"Imports another Ruby file", "Includes methods from a module in a class", "Adds comments to the code", "Declares a variable"},
   {"throw Exception", "raise Exception", "exception.raise", "throw_error"},
   {"to_uppercase", "uppercase", "upcase", "to_upper"},
   {"Declares a new variable", "Imports external libraries or files", "Requires user input", "Includes a module"}
};

Long[] answers = {0, 1, 3, 1, 1, 0, 1, 0, 0, 0, 3, 0, 2, 0, 3, 2, 1, 1, 2, 1};
```
### OOP in Ruby
### Ruby Classes and Modules
### Blocks, Procs, and Lambdas
### Ruby Gems
### Ruby on Rails Basics
### ActiveRecord in Rails
### Testing in Ruby (RSpec)
### Concurrency in Ruby
### Metaprogramming in Ruby

## PHP
### PHP Basics and Syntax
```
String[] questions = {
    "What does PHP stand for?",
    "Which of the following tags is used to write PHP code in an HTML file?",
    "How do you start a PHP block of code?",
    "Which operator is used for concatenation in PHP?",
    "What is the correct way to comment out a single line in PHP?",
    "In PHP, how do you declare a variable?",
    "What is the purpose of the 'echo' statement in PHP?",
    "What is the result of the expression 10 % 3 in PHP?",
    "How do you concatenate two strings in PHP?",
    "What is the purpose of the 'if' statement in PHP?",
    "Which function is used to check if a variable is an array in PHP?",
    "How do you define a constant in PHP?",
    "What is the purpose of the 'foreach' loop in PHP?",
    "Which superglobal variable is used to collect form data after submitting an HTML form with the POST method?",
    "What is the purpose of the 'include' statement in PHP?",
    "What is the correct way to end a PHP statement?",
    "How do you retrieve the length of an array in PHP?",
    "What is the purpose of the 'return' statement in a function?",
    "Which PHP function is used to open a file for reading?",
    "What is the purpose of the 'mysqli_connect' function in PHP?"
};

String[][] options = {
    {"Hypertext Preprocessor", "Home Page Processor", "Hypertext Programming", "Hypertext Preprogramming"},
    {"<php>", "<?php>", "<script>", "<?script>"},
    {"$[...]", "<php>", "<?php", "<?php>"},
    {"+", "&", ".", ","},
    {"// This is a comment", "# This is a comment", "/* This is a comment */", "'This is a comment'"},
    {"$variable", "var $variable", "variable $", "$"},
    {"To output text to the screen", "To declare a variable", "To concatenate two strings", "To include a file"},
    {"1", "0", "2", "3"},
    {"$string1 . $string2", "$string1 + $string2", "$string1 & $string2", "$string1, $string2"},
    {"To handle errors", "To execute a block of code only if the condition is true", "To declare a variable", "To repeat a block of code"},
    {"is_array()", "check_array()", "array_check()", "isArray()"},
    {"define('CONSTANT_NAME', 'value')", "const CONSTANT_NAME = 'value';", "constant('CONSTANT_NAME', 'value')", "CONSTANT_NAME = 'value';"},
    {"To iterate over the elements of an array", "To define a constant", "To output text to the screen", "To include a file"},
    {"$_POST", "$_GET", "$_REQUEST", "$_FORM"},
    {"To include an external file in the current PHP file", "To declare a constant", "To output text to the screen", "To open a file for writing"},
    {";", ":", ".", ","},
    {"count($array)", "$array.length", "$array.size", "length($array)"},
    {"To terminate the execution of a function", "To return a value from a function", "To declare a variable", "To handle errors"},
    {"fopen()", "readfile()", "openfile()", "file_open()"},
    {"To connect to a MySQL database", "To include a file", "To output text to the screen", "To declare a constant"}
};

Long[] answer = {0, 1, 3, 2, 0, 0, 2, 1, 0, 1, 0, 1, 0, 2, 0, 0, 0, 1, 1, 0};
```
### Variables and Data Types
### Control Structures
### Functions and Libraries
### Forms and Input Handling
### OOP in PHP
### Database Connectivity (MySQL, SQLite)
### Security Best Practices
### Sessions and Cookies
### PHP Frameworks (e.g., Laravel)

## Java
### Java Basics and Syntax
```
String[] questions = {
    "What is Java?",
    "Which keyword is used to define a class in Java?",
    "How do you declare a variable in Java?",
    "What is the default value of an integer variable in Java?",
    "Which operator is used for equality comparison in Java?",
    "What is the purpose of the 'public' keyword in a Java class?",
    "Which data type is used to store whole numbers in Java?",
    "How do you comment out a single line in Java?",
    "What is the result of the expression 10 / 3 in Java?",
    "Which statement is used to perform conditional execution in Java?",
    "How do you define a constant in Java?",
    "What is the purpose of the 'this' keyword in Java?",
    "Which method is called when an object is created in Java?",
    "What is the correct way to declare a method in Java?",
    "What is the purpose of the 'static' keyword in Java?",
    "Which loop is used to iterate over a collection in Java?",
    "What is the correct way to instantiate an object in Java?",
    "How do you handle exceptions in Java?",
    "What is the purpose of the 'extends' keyword in Java?",
    "Which class is the superclass for all classes in Java?"
};

String[][] options = {
    {"A programming language", "A coffee brand", "A computer manufacturer", "An operating system"},
    {"class", "void", "public", "java"},
    {"int variableName;", "variableName = int;", "variable variableName = int;", "int = variableName;"},
    {"0", "null", "1", "Depends on the compiler"},
    {"==", "=", "===", "!"},
    {"To define a class that can be accessed from any other class", "To define a class that cannot be instantiated", "To define a public method", "To define a public variable"},
    {"int", "float", "double", "boolean"},
    {"// This is a comment", "# This is a comment", "/* This is a comment */", "'This is a comment'"},
    {"3", "3.33", "3.0", "Depends on the compiler"},
    {"if", "switch", "for", "execute"},
    {"const int MY_CONSTANT = 10;", "final int MY_CONSTANT = 10;", "const MY_CONSTANT = 10;", "MY_CONSTANT = 10;"},
    {"To reference the current object", "To reference the parent object", "To reference the previous object", "To reference the next object"},
    {"init()", "start()", "main()", "create()"},
    {"void myMethod() {}", "int myMethod() {}", "myMethod() {}", "public myMethod() {}"},
    {"To define a variable that belongs to the class rather than the instance", "To define a variable that can be accessed without creating an instance of the class", "To define a variable that cannot be changed", "To define a variable that is shared among all instances of the class"},
    {"for", "while", "do-while", "foreach"},
    {"MyClass obj = new MyClass();", "MyClass obj = MyClass.create();", "new MyClass obj();", "MyClass obj = create MyClass();"},
    {"try-catch block", "catch-throw block", "handle-exception block", "exception block"},
    {"To implement multiple inheritance in Java", "To create an instance of a class", "To define a subclass", "To specify the implementation of an interface"},
    {"Object", "Main", "Super", "Base"}
};

Long[] answer = {0, 0, 0, 3, 0, 0, 0, 0, 2, 0, 1, 0, 2, 2, 3, 3, 0, 0, 0, 2, 0};
```
### OOP in Java
### Collections Framework
### Exception Handling
### File I/O
### Multithreading
### GUI Programming (Swing or JavaFX)
### Database Connectivity (JDBC)
### Spring Framework Basics
### Unit Testing in Java (JUnit)