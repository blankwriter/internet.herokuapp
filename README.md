Selenium Automation Tests for The Internet Herokuapp
This project contains automated UI tests using Selenium WebDriver and TestNG for the The Internet web application.

Project Structure
base: Contains the base test class that initializes WebDriver and handles browser lifecycle.

org.example.pages: Page Object Model (POM) classes representing various pages on the site.

tests: Test classes that execute the test cases using TestNG.

resources: Contains any test resources such as files for upload.

Features Tested
Login functionality with secure page validation

Alert handling: JavaScript Alert, Confirm, and Prompt dialogs

Dropdown selection

File upload

Forgot password flow

Context menu interaction

Hover actions

Horizontal slider manipulation

Key presses input

WYSIWYG editor interaction

Prerequisites
Java 11 or above

Maven or Gradle (for dependency management)

Chrome browser

ChromeDriver (version matching your Chrome browser) available and configured in the project

Setup Instructions
Clone the repository:

bash
Copy
Edit
git clone https://github.com/yourusername/your-repo.git
Download the appropriate ChromeDriver and place it in a known path.

Update the ChromeDriver path in BaseTests.java:

java
Copy
Edit
System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
Build the project using Maven or your preferred build tool.

Running Tests
Run all tests with TestNG:

bash
Copy
Edit
mvn test
Or run specific tests from your IDE.

Notes
Tests are designed to run on Chrome browser.

Some tests interact with alerts and iframes, handled appropriately in page classes.

File upload test requires the file path to be correctly set in the test class.

Author
BlankWriter
