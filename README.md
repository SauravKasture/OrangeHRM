
# 🚀 OrangeHRM Automation using Java Selenium with POM Framework 🚀

## 📝 Project Overview

This project automates the testing of the **OrangeHRM** software using **Java** and **Selenium WebDriver**. The project follows the **Page Object Model (POM)** design pattern with **PageFactory** to enhance test maintenance and reduce code duplication. The framework is structured to support easy scalability and readability.

---

## 🗂️ Project Structure

The project is organized as follows:

```
📦 OrangeHRM
├── 📂 src
│   ├── 📂 main
│   │   └── 📂 java
│   │       ├── 📂 pages        # Page classes for OrangeHRM
│   │       ├── 📂 tests        # Test scripts
│   │       └── 📂 utils        # Utility classes and helper methods
│   └── 📂 test
├── 📂 TestData                 # Test data files
├── 📂 logs                     # Log files generated during test execution
├── 📂 reports                  # Test execution reports
├── 📂 screenshots              # Screenshots captured during test execution
├── 📂 test-output              # Output files generated by the test framework
├── 📄 .classpath               # Eclipse build path configuration
├── 📄 .gitignore               # Specifies files to be ignored by Git
├── 📄 .project                 # Eclipse project file
├── 📄 OrangeHRM.properties     # Configuration file for environment settings
├── 📄 README.md                # This file
├── 📄 pom.xml                  # Maven build configuration
└── 📄 testing.xml              # TestNG configuration for test suites
```

---

## 🛠️ Prerequisites

Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK)**: JDK 8 or higher.
- **Maven**: For dependency management and build automation.
- **Selenium WebDriver**: Included as a dependency in the `pom.xml`.
- **TestNG**: Used for test execution and reporting.
- **WebDriver Executables**: Ensure the appropriate WebDriver executables (e.g., ChromeDriver) are available and their paths are correctly set.

---

## 🚀 Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/SauravKasture/OrangeHRM.git
   cd OrangeHRM
   ```

2. **Install Dependencies**:
   ```bash
   mvn clean install
   ```

3. **Configure Environment**:
   - Update the `OrangeHRM.properties` file with the necessary environment settings (e.g., URL, credentials).

4. **Run Tests**:
   - To run the tests, use the following command:
     ```bash
     mvn test
     ```
   - Alternatively, you can run the tests using the `testing.xml` file in your IDE.

---

## 📊 Reporting

After test execution, reports can be found in the `reports` directory. Screenshots of failed tests are stored in the `screenshots` directory for further analysis.

---

## 🤝 Contributing

Contributions to this project are welcome! Please follow the standard fork-and-pull request workflow.

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeatureName`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeatureName`).
5. Open a pull request.

---

## 📜 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- **Selenium WebDriver** 🌐
- **TestNG** 🧪
- **Maven** 🛠️
- **OrangeHRM** 🍊

---

## 📧 Contact

For any questions or issues, please open an issue in the repository or contact the maintainers.

---

## 🎉 Happy Testing! 🎉
