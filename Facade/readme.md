
# Facade Design Pattern

A facade is a class that provides a simple interface to a complex subsystem. In a banking system example:

- **Facade**: `BankServiceFacade` acts as a  interface for banking services.
- **Subsystems**: Various services like savings accounts, loans, credit cards, and investments are handled internally by the facade.
- **Client**: The client interacts with the facade to perform banking operations without dealing with the complexity of individual services.

### How it Works:

1. **Easy Access**:
   Clients use the facade's simple methods (`openSavingsAccount`, `applyForLoan`, etc.) to perform tasks.

2. **Hidden Complexity**:
   The facade handles the complexity of interacting with different banking services internally.

3. **Centralized Interface**:
   Clients don't need to know how each service works internally; they only interact with the facade, which acts as a centralized interface.

By using the Facade pattern, clients can easily perform banking operations without worrying about the underlying complexities of individual services.
