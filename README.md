# ChainOfResponsibility
* Makes use of the Chain of Responsibility design pattern for processing a food order
* User -> Kiosk -> Cashier -> Cook -> User

# Files:
    > Chain - Main file, initiates the chain
    > Kiosk - Creates chain of handlers
    > Cashier - Provides order receipt, order #
    > Cook - Handles "cook time"
    > OrderHandler - Handles chain progression
    > MenuOrder - Handles the menu options, price calculations
    
# Potential Improvement:
* I may have provided one more class than necessary between the 'Kiosk', 'Cashier' and 'Chain' classes.  
