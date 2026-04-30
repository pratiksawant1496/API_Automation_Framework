
# API Automation Framework

## 📌 Overview
This repository contains a **Java-based API Automation Framework** designed to simplify testing RESTful APIs. It leverages **TestNG**, **Maven**, and industry-standard practices to provide a scalable, maintainable, and reusable solution for API testing.

The framework supports:
- Writing and executing automated API test cases.
- Managing test suites with TestNG.
- CI/CD integration via GitHub Actions.
- Easy extension for new endpoints and test scenarios.

---

## 🛠️ Tech Stack
- **Language**: Java  
- **Build Tool**: Maven  
- **Testing Framework**: TestNG  
- **CI/CD**: GitHub Actions  
- **Project Structure**: Follows modular design for test cases, utilities, and configurations.

---

## 📂 Project Structure
```
API_Automation_Framework/
│── src/test/        # Test classes and API test cases
│── suite.xml        # TestNG suite configuration
│── pom.xml          # Maven dependencies and build configuration
│── .github/workflows # CI/CD pipeline configs
│── .gitignore       # Ignored files
│── README.md        # Project documentation
```

---

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/pratiksawant1496/API_Automation_Framework.git
cd API_Automation_Framework
```

### 2. Install Dependencies
Ensure you have **Java (JDK 8+)** and **Maven** installed. Then run:
```bash
mvn clean install
```

### 3. Run Tests
Execute the TestNG suite:
```bash
mvn test -DsuiteXmlFile=suite.xml
```

---

## ⚙️ Configuration
- **suite.xml**: Defines which test classes to run.
- **pom.xml**: Contains dependencies (TestNG, REST-assured, etc.).
- **GitHub Actions**: Automates test execution on every push/pull request.

---

## 📊 CI/CD Integration
The framework includes GitHub Actions workflows under `.github/workflows`.  
- Tests run automatically on commits and pull requests.  
- Results are visible in the GitHub Actions tab.

