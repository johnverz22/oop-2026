**Instruction**: You are tasked with designing and implementing a simple order processing system in Java. The system should allow you to define Product items and create Order objects that contain multiple products. Submit your .java file(s). (30 points)

1. **Product Class:**  
   1. **Attributes (private):** productId (String), name (String), price (double).  
   2. **Constructor:** A constructor that initializes all three attributes.  
   3. **Methods:**  
      1. getProductId(): Getter for productId.  
      2. getName(): Getter for name.  
      3. getPrice(): Getter for price.  
      4. displayProductInfo(): Prints product details (ID, Name, Price) in a user-friendly format.  
2. **Order Class:**  
   1. **Attributes (private):** orderId (String), products (an ArrayList\<Product\> to store items in the order).  
   2. **Constructor:** A constructor that initializes orderId and creates an empty ArrayList for products.  
   3. **Methods:**  
      1. getOrderId(): Getter for orderId.  
      2. addProduct(Product p): Adds a Product object to the products list.  
      3. getTotalCost(): Calculates and returns the total cost of all products in the order.  
      4. displayOrderDetails(): Prints the orderId and then iterates through the products list, calling displayProductInfo() for each product, and finally prints the total cost of the order.  
3. **Main Class (Testing):**  
   1. Create a main method.  
   2. **Product Creation:** Create at least 3-4 Product objects (e.g., Laptop, Mouse, Keyboard).  
   3. **Order Creation:**  
      1. Create two Order objects.  
      2. Add various Product objects to each order.  
   4. **Demonstration:**  
      1. Call displayOrderDetails() for both orders.  
      2. Print the total cost of each order.

## Rubric

- **Code Functionality** (12 points)
  - All requirements met, code runs perfectly without errors, and produces correct output.
- **Code Structure** (9 points)
  - Code is exceptionally well-organized, clean, and follows OOP principles (e.g., encapsulation).
- **Comments/Readability** (6 points)
  - Code is thoroughly documented with clear, concise comments, and is easy to understand.
- **Efficiency/Best Practices** (3 points)
  - Solution demonstrates optimal efficiency and utilizes best practices for Java and OOP.