###A facade is a class that provides a simple interface to a complex subsystem.

#Banking system example:

Facade: BankServiceFacade acts as a one-stop interface for banking services.
Subsystems: Various services like savings accounts, loans, credit cards, and investments are handled internally by the facade.
Client: The client interacts with the facade to perform banking operations without dealing with the complexity of individual services.
How it Works:

Easy Access:
Clients use the facade's simple methods (openSavingsAccount, applyForLoan, etc.) to perform tasks.

Hidden Complexity:
The facade handles the complexity of interacting with different banking services internally.

Centralized Interface:
Clients don't need to know how each service works internally; they only interact with the facade, which acts as a centralized interface.
