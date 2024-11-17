# Design Patterns Exercises - Creational Patterns Overview

This document provides an overview of Exercises 2-4 that focus on creational design patterns and their implementations.

## Overview of Exercises

### Exercise 2: Periodic Table Application

- **Pattern Used**: **Singleton Pattern** and **Factory Pattern**
- **Description**: This exercise involves designing and implementing an application that allows users to enter, store, and retrieve information about different chemical elements. The **Singleton Pattern** is used to ensure that only one instance of the periodic table exists, providing consistency across the application. Additionally, the **Factory Pattern** is used to create instances of different chemical elements based on their unique properties such as name, symbol, and atomic number.

### Exercise 3: Drink Dispenser Machine

- **Pattern Used**: **State Pattern**
- **Description**: This exercise involves designing an application that connects to an automatic drink dispenser. The machine dispenses one of three beverages (coffee, tea, or water) based on the time of day. For example, from 6 am to 3 pm, the machine dispenses coffee, from 4 pm to 9 pm, it dispenses tea, and during other hours it dispenses water. The **State Pattern** is used to manage the behavior of the machine as it changes states depending on the time of day, allowing the machine to adapt its response dynamically.

### Exercise 4: Beverage Customization

- **Pattern Used**: **Decorator Pattern**
- **Description**: This exercise involves designing an application that simulates an automatic machine capable of dispensing customizable beverages. Users can add features such as cream, milk, and sugar to their drinks, as well as select the temperature (e.g., hot, warm, cold) and size (e.g., small, medium, large). The **Decorator Pattern** is used to dynamically add various combinations of features to the beverages, providing flexibility in creating customized drinks while keeping the core beverage functionality intact.

## Running the Exercises

1. Clone the repository:
   ```
   git clone <repository_url>
   ```
2. Navigate to the exercise you want to run.
3. Compile and run the respective `Main` class to see the creational design patterns in action.

## Patterns Summary (Creational)

- **Singleton Pattern**: Ensures that a class has only one instance and provides a global access point to that instance. This is useful for managing shared resources, such as the periodic table.
- **Factory Pattern**: Provides a method for creating objects without specifying the exact class of object that will be created. This pattern is useful in scenarios involving complex logic or multiple subclasses.
- **State Pattern**: Allows an object to change its behavior when its internal state changes. The context object delegates state-specific behavior to different state objects, making it suitable for controlling the behavior of the drink dispenser based on the time of day.
- **Decorator Pattern**: Dynamically adds additional responsibilities or features to an object. It provides a flexible alternative to subclassing for extending an object's capabilities, making it ideal for customizing beverages with different options.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests to add new exercises, improve code quality, or expand on the documentation.

## License

This repository is licensed under the MIT License.

