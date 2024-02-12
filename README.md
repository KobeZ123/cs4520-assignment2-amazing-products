GitHub Repository Link:
https://github.com/KobeZ123/cs4520-assignment2-amazing-products

# Application Structure 

The application features a main activity that navigates between two fragments, 
a login fragment and a product list fragment. The login fragment has simple username 
and password text input fields that the user uses to input their credentials. 
The user will be navigated to the product list fragment if they input "admin" as the 
username and password. Otherwise, they will be met with an appropriate toast message
(and their input will be cleared if they input the wrong credentials). The product 
list fragment is a recycler view rendering a dataset of Products (FoodProduct and 
EquipmentProduct). The product data is handled by a product card fragment. 

# How to Run Application 
There is no special setup required to run the application. Simply connect your device 
or start the emulator and run 'app'.