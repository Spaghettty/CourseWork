# Capital City Guesser - Coursework

Hey dude, some stuff you may want to talk about.

## Seperation of Concerns
https://en.wikipedia.org/wiki/Separation_of_concerns

GUI - Angular/HTML/CSS <> REST API - Java <> Database - MySQL

When drawing this in your coursework use the correct symbols databse on the bottom, process for the REST, and DI for the GUI; two arrows one up one down should be used with the database on the bottom.

![Symbols](https://www.sketchappsources.com/resources/source-image/sketch-flowchart-symbols.png)

A user has no details for the database and therefore cannot access it without going through the API; this principle is used in industry as a Java application is vulnerable to security exploits.

## Limitations
* Despite being a REST API it only supports one user at a time
* No score tracking
* Testing is limited

