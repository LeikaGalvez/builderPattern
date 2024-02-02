# Problem Statement
Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User (String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
Optional fields: Not all customers provide complete information, but the constructor forces them to.
Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.
Implement solution using the Builder Pattern to address the issue.

#
## Output
![image](https://github.com/LeikaGalvez/builderPattern/assets/142652629/0667bafa-20a6-4112-9376-22bdafe4ccc2)

#
# UML Diagram
![builderPattern_UML](https://github.com/LeikaGalvez/builderPattern/assets/142652629/6085f4a2-2d58-41f5-ba9d-096f98d788a8)


