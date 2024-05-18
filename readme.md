# Basic System in Kotlin
Showing Alvaro best practices

### Project Structure Fundamentals

![Project Structure Fundamentals](/readme/project-structure-fundamentals.png)

Here I follow the **hexagonal-architecture**.   
To follow it and keep our domain secure from external behaviour:

#### About Domain
- Entities contains the entity data.
- Entities DOES NOTHING.
- Services modifies Entities.
- Services can interact with domain services through dependency injection.
- Services can interact with outsource services through dependency injection by interfaces.
- Services HAVE NO data.
#### About outsource
- All business logic here should be tested. (like UNIQUE KEYS on DB)


### Code Design decision for code isolation and separation of concerns
![Code Structure Decision](/readme/design-decision-for-code-concerns-isolation.png)

### Firsts entities and services pre-designed
![first-entities](/readme/first-entities.png)