# Portuguese Dishes Menu

## Project Overview

This project is a Java-based menu management system that allows users to interact with a database of Portuguese dishes. It provides functionalities such as adding dishes, displaying dishes (all, eaten, or not eaten), ranking dishes, and deleting dishes or their ranks. The system follows the **MVC (Model-View-Controller)** architecture, where:

- **Model** represents the data (Dishes).
- **View** is responsible for displaying information to the user.
- **Controller** handles user input, manages the flow of data, and coordinates interactions between the model and the view.

## Features

- **Add Dishes**: Allows users to add new dishes to the menu.
- **Display Dishes**: Shows all dishes, or specifically eaten or not eaten dishes.
- **Rank Dishes**: Users can rank dishes they've eaten.
- **Delete Dishes**: Users can delete dishes from the menu or delete rankings for eaten dishes.
- **Database Integration**: The menu system is connected to a MySQL database that stores the dishes and their rankings.

## Technologies Used

- **Java**: The main programming language used for the project.
- **MySQL**: A relational database used to store data about dishes.
- **JDBC**: Java Database Connectivity for interacting with the database.
- **MVC Architecture**: To separate concerns and improve the structure of the code.

## Prerequisites

Before you run the project, ensure you have the following:

1. **Java 8+**: Make sure Java is installed on your machine. You can check this by running the following command:
   ```bash
   java -version
