# User_Regsitration_Form_With_Spring_Boot
User Registration form with spring boot and mysql database


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration Application</title>
</head>
<body>

<h1>User Registration Application</h1>

<p>This project is a user registration application built using Spring Boot, Spring Data JPA, Thymeleaf, and Hibernate Validator. It allows users to register by providing their details, which are then validated and saved to a database.</p>

<h2>Technologies Used:</h2>
<ul>
    <li><b>Spring Boot:</b> Simplifies the development of stand-alone, production-grade Spring applications.</li>
    <li><b>Spring Data JPA:</b> Provides easy integration with relational databases and simplifies data access using JPA.</li>
    <li><b>Thymeleaf:</b> A server-side Java template engine for web applications, used to render HTML views.</li>
    <li><b>Hibernate Validator:</b> Implements Java Bean Validation (JSR 380) for enforcing validation constraints on object properties.</li>
    <li><b>MySQL:</b> A relational database management system used to store user information.</li>
    <li><b>HTML:</b> The standard markup language for creating web pages and web applications.</li>
    <li><b>CSS(Bootstrap):</b> A stylesheet language used for describing the presentation of a document written in HTML.</li>
</ul>

<h2>Key Components:</h2>

<h3>Entity Class (<code>User</code>):</h3>
<ul>
    <li>Represents the user data model.</li>
    <li>Includes fields like username, email, phone number, password, confirm password, and gender.</li>
    <li>Uses validation annotations to enforce constraints such as:
        <ul>
            <li>Username must be between 4 to 15 characters.</li>
            <li>Email must be valid and contain an <code>@</code> symbol.</li>
            <li>Phone number must be 10 digits long and start with 7, 8, or 9.</li>
            <li>Password and confirm password must match.</li>
        </ul>
    </li>
</ul>

<h3>Repository Interface (<code>UserRepository</code>):</h3>
<ul>
    <li>Extends <code>JpaRepository</code> to provide CRUD operations for <code>User</code> entities.</li>
    <li>Allows interaction with the database to save and retrieve user data.</li>
</ul>

<h3>Controller Class (<code>UserController</code>):</h3>
<ul>
    <li>Handles HTTP requests for user registration and displaying the list of registered users.</li>
    <li>Provides methods to display the registration form, handle form submissions, validate input, and save user data to the database.</li>
    <li>Ensures that password and confirm password match before saving the user.</li>
</ul>

<h3>Thymeleaf Templates:</h3>
<ul>
    <li><code>register.html</code>: A form for user registration with fields for username, email, phone number, password, confirm password, and gender. Includes error messages and validation feedback.</li>
    <li><code>user.html</code>: Displays a list of registered users in a table format.</li>
</ul>

<h2>Application Flow:</h2>

<h3>User Registration:</h3>
<ul>
    <li>The user accesses the registration page and fills out the form.</li>
    <li>The form submission triggers validation of user input.</li>
    <li>If validation passes and passwords match, the user data is saved to the database.</li>
    <li>If validation fails or passwords do not match, appropriate error messages are displayed.</li>
</ul>

<h3>Display Registered Users:</h3>
<ul>
    <li>The application provides a page that lists all registered users, displaying their details in a tabular format.</li>
</ul>

<p>This project demonstrates how to build a simple, yet functional user registration system using Spring Boot and related technologies, ensuring robust validation and smooth user experience.</p>

</body>
</html>
