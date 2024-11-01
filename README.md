# Rectangle Manager

## Description
This is a simple Spring Boot application that manages a collection of rectangles. The application provides RESTful APIs to add, modify, delete, and retrieve rectangles. It also generates SVG code to visually represent the rectangles.

### Features
- Add rectangles with specified attributes (x, y, width, height, color).
- Retrieve a list of all rectangles.
- Retrieve a specific rectangle by its index.
- Modify an existing rectangle.
- Delete a rectangle by its index.
- Generate SVG code representing the rectangles.

### Technologies Used
- Spring Boot for building the application.
- Java for backend development.

### How to Run
1. Ensure you have Java Development Kit (JDK) and Maven installed.
2. Clone this repository to your local machine.
3. Navigate to the project directory in your terminal.
4. Run the application using the following command:
   ```bash
   mvn spring-boot:run
   ```
5. Access the application at http://localhost:8080.

## API Endpoints

| HTTP Method | Endpoint                   | Description                           |
|-------------|----------------------------|---------------------------------------|
| GET         | `/rectangles`              | Retrieve all rectangles               |
| GET         | `/rectangles/{id}`         | Retrieve a specific rectangle by ID   |
| POST        | `/rectangles/add`          | Add a new rectangle                   |
| PUT         | `/rectangles/modify/{id}`  | Modify an existing rectangle          |
| DELETE      | `/rectangles/delete/{id}`   | Delete a rectangle by ID              |
| GET         | `/rectangles/svg`          | Generate SVG code for all rectangles  |

## Example Usage

### Adding a Rectangle

To add a rectangle, send a POST request to `/rectangles/add` with a JSON body:

```json
{
    "x": 10,
    "y": 20,
    "width": 100,
    "height": 50,
    "color": "blue"
}
```
### Retrieving All Rectangles

Send a GET request to /rectangles to retrieve the list of all rectangles.

### Modifying a Rectangle

To modify an existing rectangle, send a PUT request to /rectangles/modify/{id} with a JSON body:

```json
{
    "x": 15,
    "y": 25,
    "width": 150,
    "height": 75,
    "color": "red"
}
```

### Deleting a Rectangle

To delete a rectangle, send a DELETE request to /rectangles/delete/{id}.

## Contact
If you’d like to reach out, feel free to connect with me:
- [LinkedIn](https://www.linkedin.com/in/nadiia-rybak-5092b8336)
- [Email](mailto:nvdiv5@gmail.com)

Thanks for visiting!
