# Recruitment Challenge: Elevator System Simulation

Hello! As part of our recruitment process, we’ve prepared a challenge to evaluate your skills as a fullstack developer.
Your task is to create a simulation of an elevator system in a building, including a backend to manage the logic and state of the elevators and a frontend to visualize the building and allow user interaction.

## Objective

Develop a fullstack application that simulates the operation of an elevator system in a building.
The backend should handle the logic of elevator movement, passenger requests, and system state management, while the frontend provides a visualization of the building and elevators and allows users to interact with the system.

## Requirements

### Backend

1. **Elevator System Logic**
    - Implement an algorithm to control the movement of multiple elevators in a building with a specified number of floors.
    - Handle passenger requests from both outside the elevator (e.g., calling an elevator to a floor) and inside the elevator (e.g., selecting a floor).
    - Optimize elevator movement to minimize wait times and efficiently manage requests.
    - Support basic elevator operations: moving between floors, opening/closing doors, and processing multiple requests.

2. **Interface for Interaction**
    - Provide a way for the frontend to communicate with the backend to send requests (e.g., calling an elevator or selecting a floor) and retrieve the current state of the elevator system.
    - Ensure the system can report the status of all elevators, such as their current floor, direction, and pending requests.

3. **State Management**
    - Maintain the state of each elevator (e.g., current floor, direction, list of requests).
    - Handle concurrent requests safely to avoid conflicts or errors.

4. **Scalability**
    - Design the system to work with a variable number of elevators and floors.
    - Ensure the solution performs well in larger buildings with multiple elevators.

### Frontend

1. **Building Visualization**
    - Display the building, including its floors and elevators.
    - Show the current position and movement direction of each elevator in an intuitive way.

2. **User Interaction**
    - Allow users to call elevators to specific floors and select floors from inside the elevators.
    - Create an intuitive and easy-to-use interface.

3. **Real-Time Updates**
    - Keep the frontend synchronized with the backend to reflect the current state of the elevators.
    - Update the interface dynamically to show elevator movements and request statuses as they happen.

4. **User Experience**
    - Make the interface responsive and visually appealing.
    - Provide feedback for user actions (e.g., confirming an elevator has been called).

## Technologies

You’re free to choose any technologies you like for both the backend and frontend. Justify your choices in your documentation. The method for communication between the frontend and backend is also up to you—select what you think works best for this system.

## Deliverables

- **Source Code**: Upload your solution to a public repository (e.g., GitHub).

## Tips

- Prioritize an efficient backend solution, as that’s our main focus.
- Think about edge cases, like busy elevators or simultaneous requests.
- Show us your thought process—how you approach the problem is just as important as the final result.
