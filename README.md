# FullStack
This is a template of Full stack application.

# Table of contents
- [Technologies](#technologies)
- [How does it works](#how-does-it-works)
    - [Client](#client)
    - [Server](#server)
- [How to run](#how-to-run)

## Technologies
- Java on the backend (server side);
- Angular 9 on the frontend (client side);
- Gradle as a build system and dependency manager;

## How does it works
### Client
Angular is standalone full stack framework.
On other hand it is also a great fill for frontend part of the application.
It is possible to develop frontend independently from the server side. 
[AngularCLi](https://cli.angular.io/) that is running on top of [NodeJS](https://nodejs.org/en/)
is required.

To run frontend independently from the server:
- go to `src/angular/app`
- type `ng serve` in the command line

It will start NodeJS server and all the changes to the fronted (in HTML and CSS ets)
will be automatically reflected in the browser.

This is a nice feature that will help in development.

### Server
The server side is written in Java with SpringBoot.
By convention SpringBoot application can serve static resources (like HTML and CSS)
that are located in `src/main/resources/static`.
Technically Angular can be build into any output directory (including `src/main/resources/static`).
When the command `gradlew bootRun` is executed the folder `build` will be created on the project root level.
The `build` folder contains all java compiled sources and resources.

Since during development application is running as `gradlew bootRun`,
as a part of the build scrip Angular sources will be generated to `build` folder.
It can be change any moment in `src/angular/app/angular.json`, the value of `outputPath`.

## How to run
To run the application type `gradlew bootRun` in the command line.

This command will execute `ng build` internally,
that will generate Angular sources in the project `build` directory.
