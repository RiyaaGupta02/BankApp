# 💳 Basic Banking API

A RESTful API for managing basic banking operations such as account creation, deposits, withdrawals, and balance inquiries. This project is designed to demonstrate fundamental backend development concepts using Java and Spring Boot.

---

## 🚀 Features

- **Account Management**: Create and manage bank accounts.
- **Transactions**: Perform deposits and withdrawals.
- **Balance Inquiry**: Check current account balances.
- **Transaction History**: Retrieve a list of all transactions for an account.
- **Error Handling**: Graceful handling of invalid operations and inputs.

---

### 🧱 Architecture Overview

- **Controller Layer**: Handles HTTP requests and routes them to the appropriate service methods.
- **Service Layer**: Contains the business logic for account management and transactions.
- **Repository Layer**: Interfaces with the in-memory H2 database using Spring Data JPA.
- **Model Layer**: Defines the structure of data entities like `Account` and `Transaction`.

### 🏦 Account Flow

1. **Create Account**: User sends account holder's name and initial balance. A new account is stored in the database.
2. **Fetch Account**: User provides an account ID to get account info.
3. **Deposit / Withdraw**: User sends an amount to deposit or withdraw; balance is updated and a transaction is logged.


## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database (for development and testing)
- Maven

---
