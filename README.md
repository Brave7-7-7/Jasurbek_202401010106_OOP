# Object-Oriented Programming — Lab Tutorial Portfolio (Week 1–10)

**Student Name:** Jasurbek

**Student ID:** 202401010106

## Course Information

| Field | Detail |
|---|---|
| Course Name | Object-Oriented Programming |
| Course Code | BIT1123 |
| Lecturer | NAZMIRUL IZZAD BIN NASIR |
| Semester | 5 |
| Institution |CITY UNIVERCITY MALAYSIA |

## Brief Course Description

This course introduces object-oriented programming using Java, covering encapsulation,
inheritance, polymorphism and abstraction as the foundations of OOP design. It extends
into practical application development, including working with Java collections and
file I/O for persisting data, and concludes with event-driven GUI programming using
Java Swing.

## Repository Structure

```
Jasurbek_202401010106_OOP/
├── Week1/       # Java basics: variables, arithmetic, if/else
├── Week2/       # Classes, objects, constructors and methods
├── Week3-4/     # Inheritance, super(), method overriding, polymorphism
├── Week5/       # Encapsulation with private fields, getters and setters
├── Week6/       # Inheritance with protected fields, super constructor
├── Week7/       # Abstraction: abstract class, abstract method, polymorphism
├── Week8-9/     # ArrayList, Scanner input, file I/O with BufferedWriter/BufferedReader
├── Week10/      # Swing GUI: JFrame, JLabel, JButton, ActionListener
├── .gitignore
└── README.md
```

## Tutorial Summary (Week 1–10)

| Week | Directory | Topic | Key Classes | OOP Concept Demonstrated |
|---|---|---|---|---|
| Week 1 | Week1/ | Java basics: variables, arithmetic, if/else | HelloWorld, StudentGrade | Procedural fundamentals (variables, arithmetic, conditional logic) preceding OOP |
| Week 2 | Week2/ | Classes, objects, constructors and methods | Student, Main | Class definition, constructors, instance methods, object creation |
| Week 3-4 | Week3-4/ | Inheritance, super(), method overriding, polymorphism | Person, Student, Lecturer, Main | Inheritance, the super() constructor call, method overriding, runtime polymorphism |
| Week 5 | Week5/ | Encapsulation with private fields, getters and setters | Student, Main | Encapsulation via private fields accessed only through getters/setters |
| Week 6 | Week6/ | Inheritance with protected fields, super constructor | Employee, Lecturer, Main | Inheritance with protected fields, extending a base class via super() |
| Week 7 | Week7/ | Abstraction: abstract class, abstract method, polymorphism | Appliance, WashingMachine, Refrigerator, AirConditioner, Television, Main | Abstraction through an abstract class and abstract method, implemented polymorphically by subclasses |
| Week 8-9 | Week8-9/ | ArrayList, Scanner input, file I/O with BufferedWriter/BufferedReader | Main | Using the Java Collections framework (ArrayList) together with file I/O for data persistence |
| Week 10 | Week10/ | Swing GUI: JFrame, JLabel, JButton, ActionListener | Questions, QuizBattleGUI | GUI programming with Java Swing and event-driven design via ActionListener |

## Technologies Used

- Java SE (JDK 25)
- javac/java command line
- Java Swing (javax.swing, java.awt.event)
- java.util collections (ArrayList, Scanner)
- java.io (BufferedReader, BufferedWriter, FileReader, FileWriter)
- Git and GitHub
- GitHub Codespaces
- Visual Studio Code

## How to Run the Projects

Every week is compiled and run independently from inside its own folder. All classes
use the default package, and some class names (for example `Main` and `Student`)
repeat across weeks, so the folders must not be compiled together.

```
cd <WeekFolder>
javac *.java
java <MainClass>
```

| Week | Run Command |
|---|---|
| Week 1 | `cd Week1 && javac *.java && java HelloWorld` (also run `java StudentGrade`) |
| Week 2 | `cd Week2 && javac *.java && java Main` |
| Week 3-4 | `cd Week3-4 && javac *.java && java Main` |
| Week 5 | `cd Week5 && javac *.java && java Main` |
| Week 6 | `cd Week6 && javac *.java && java Main` |
| Week 7 | `cd Week7 && javac *.java && java Main` |
| Week 8-9 | `cd Week8-9 && javac *.java && java Main` |
| Week 10 | `cd Week10 && javac *.java && java QuizBattleGUI` (opens a GUI window) |

## Reflection Summary

This portfolio traces a progression from procedural Java to full object-oriented
design. Week 1 begins with plain variables, arithmetic and if/else branching in
`HelloWorld` and `StudentGrade`, establishing the syntax base the later weeks build
on. Week 2 introduces the class as a unit of state and behaviour, with `Student`
demonstrating a constructor and instance methods, while Week 5 revisits the same
idea through the lens of encapsulation, using private fields and explicit getters
and setters to control access to a student's data.

Weeks 3-4 and 6 develop inheritance. The `Person`/`Student`/`Lecturer` hierarchy in
Week 3-4 shows a base class extended by two subclasses that override `introduce()`
differently, demonstrating polymorphism when all three are referenced as `Person`.
Week 6 applies the same mechanism to an `Employee`/`Lecturer` relationship, this
time using protected fields and a super() constructor call to pass shared state up
the hierarchy. Week 7 builds on this with abstraction: `Appliance` is declared
abstract with one abstract method, `operate()`, and four concrete subclasses
(`WashingMachine`, `Refrigerator`, `AirConditioner`, `Television`) each supply their
own implementation, again invoked polymorphically through `Appliance` references.

Weeks 8-9 move from language mechanics to practical application, combining an
`ArrayList` for in-memory storage with `Scanner` for input and `BufferedWriter`/
`BufferedReader` for saving and reloading tasks from `task.txt`, demonstrating that
an object's state can outlive a single program run. Week 10 closes the portfolio
with a Swing GUI, where a `Questions` class holds quiz data and `QuizBattleGUI`
wires `JButton` clicks to an `ActionListener` implementation, translating the
earlier OOP concepts into an event-driven, interactive program.

Across all ten weeks, the recurring thread is the incremental layering of
encapsulation, inheritance, polymorphism and abstraction onto increasingly
realistic problems — from console arithmetic to a persisted to-do list to a
graphical quiz application. The full self-reflective report is linked here:
\<LINK TO FULL SELF-REFLECTIVE REPORT\>.

---

https://github.com/Brave7-7-7/Jasurbek_202401010106_OOP
