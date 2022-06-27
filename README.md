# WHILE Language Compiler
A compiler for the WHILE language, an educational programming language.

## Syntax highlighting for VsCode
A WHILE VsCode Extension can be found [here](https://github.com/ZitronenSchrank/While-Extension-VsCode).

## How To Use

### Compile compiler
```
git clone https://github.com/ZitronenSchrank/compiler_project
cd compiler_project/compiler
mvn clean compile assembly:single
```

### Compile a WHILE program
Compile file "test.while":
```
java -jar while-1.0.jar ./test.while
```
Will generate a "test.class" file

Alternative:
```
java -jar while-1.0.jar ./test.while ./helloWorld
```
Will generate a "helloWorld.class" file

### Run compiled WHILE program
If the generated file is "test.class":
```
java -cp . test
```

If the generated file is "helloWorld.class":
```
java -cp . helloWorld
```

## Annotaion

This extension and compiler were written by [Richard H.](https://github.com/richardhempel) and [Anton P.](https://github.com/ZitronenSchrank)  and are the result of a student project at [Hochschule Furtwangen University](https://www.hs-furtwangen.de/), Germany.
