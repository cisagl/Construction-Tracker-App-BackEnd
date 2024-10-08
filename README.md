# Construction Tracker App BackEnd

This repository contains the backend for the Construction Tracker App, a system designed to manage construction sites and their associated tasks.

## Features

- **Manage Construction Sites:** Add, update, and delete construction sites.
- **Task Management:** Assign tasks to specific construction sites, and manage them by adding, updating, or deleting tasks.
- **Task Images:** Attach multiple images to tasks for better visual representation and management.
- **API Integration:** RESTful API endpoints for seamless integration with the frontend.

## Endpoints Overview

### Sites

- **GET** `/api/sites` - Retrieve all construction sites.
- **POST** `/api/sites/save` - Add a new construction site.
- **PUT** `/api/sites/update/{id}` - Update an existing construction site.
- **DELETE** `/api/sites/{id}` - Delete a construction site by ID.

### Tasks

- **GET** `/api/tasks/site/{id}` - Retrieve all tasks for a specific construction site.
- **POST** `/api/tasks/save` - Add a new task to a construction site.
- **PUT** `/api/tasks/update/{id}` - Update an existing task.
- **DELETE** `/api/tasks/{id}` - Delete a task by ID.

### Images

- **GET** `/api/images/task/{taskId}` - Retrieve all images associated with a specific task.
- **POST** `/api/images/save` - Add a new image to a task.
- **PUT** `/api/images/update/{id}` - Update an existing image's URL.
- **DELETE** `/api/images/{id}` - Delete an image by ID.

## Technologies Used

- **Java** - Primary language used for backend development.
- **Spring Boot** - Framework used to build and deploy the backend.
- **PostgreSQL** - Database used for storing site, task, and image information.
- **JPA/Hibernate** - ORM for database interaction.