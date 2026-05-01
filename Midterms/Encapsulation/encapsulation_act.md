# **Programming Activity: **

# **Movie Rental System**

Filename: **Surname_03_Encapsulation_MovieRentalSystem**

#### **Instructions:**

Create a Movie class for a rental store that properly uses encapsulation to protect movie data. Create the Class Diagram as well.

### **Requirements**

**Step 1: Create the Movie Class**

**Private Attributes:**

* title (String)
* director (String)
* releaseYear (int)
* rentalPrice (double)
* availableCopies (int)

**Constructor:**

* Create a constructor that accepts all five attributes and uses setters for validation

**Getter Methods:**

* Create getter methods for all five attributes

**Setter Methods with Validation:**

* **setTitle(String title): **Title cannot be null or empty
* **setDirector(String director): **Director cannot be null or empty
* **setReleaseYear(int year): **Year must be between 1900 and 2024
* **setRentalPrice(double price): **Price must be between 1.0 and 10.0
* **setAvailableCopies(int copies): **Copies must be >= 0

**Additional Methods:**

* **rentMovie(): **Decrease availableCopies by 1 if copies are available, show error message if not
* **returnMovie(): **Increase availableCopies by 1
* **displayInfo(): **Print all movie information in a nice format

**Step 2: Create the Main Program**

Create a RentalStore class with a main method that:

1. Creates at least 2 Movie objects
2. Displays information for each movie
3. Rents out a movie (decrease copies)
4. Returns a movie (increase copies)
5. Tests validation by trying to set invalid values (negative price, empty title, etc.)
6. Shows that the validation prevents invalid data

## **Grading Rubric**

![](https://cdn.gamma.app/s1jl3a40l6g7l02/c7e38cbee16245479e16de0f7814241b/original/image.png)
