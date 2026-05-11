# **The Game of Life**
Authors: Abigail Callahan, Alex Montemayor, Coco Sequeira, Penny Yanez

## Project description
This project is inspired by the board Game _Life_, where the user travels around the board, earns money, and
reaches different milestones like school, marraige, and starting a family. The player navigates different 
decisions from childhood to retirement. The game ends at retirement, with the player who made the most
money winning the game. This project takes _Life_ a bit deeper where we keep it to one player, but we add genetics, 
insurance, finances, more risk, and more chance. As the player, they have the choice of career, location of house, etc. 
The player and partner's DNA is randomly generated, while the child's DNA is combined from the two parents through normal inheritance. 
Car and House Insurance are based on risk factors for Location, and there are three different Events: Milestone Events, Financial Events, and 
Risky Events. The game still ends at retirement, with the player's full life statistics printed at the end. 

## Design 
The project has 5 different separate parts that all combine together with associated enums. <br>
1. Person/Character/Partner/Child: Person is an abstract class that is extended by Character, Child, Partner. All three are associated with DNA and have computed Phenotypes. <br>
2. DNA/Allele/AllelePair/Phenotype: DNA represents a DNA sequence that has a Map that maps each Allele (trait) to an AllelePair (two copies)
3. Event/EarlyLifeEventFactory/AdultLifeEventFactory/FinancialEvents/MilestoneEvents/RiskyEvents: There are three types of Events, and the Event Factories all manage the different events. This part implements the Abstract Factory Design Pattern throughout the game. <br>
4. Insurance/Car/House/Insurable: Insurable is an interface that is implemented by Car and House, as they each contribute to the overall Insurance. <br>
5. Simulator: Runs the Game. 

## Prerequisites
Java23, Gradle (./gradlew buid assembles and runs tests), JUnit, Mockito

## Skills 
Test Driven Development, Continuous Integration, SOLID Principles, OOP Pillars, Teamwork, Documentation



## Contact 
Abigail Callahan: abigailcallahan@sandiego.edu <br>
Alex Montemayor: amontemayor@sandiego.edu <br>
Coco Sequeria: csequeira@sandiego.edu <br>
Penny Yanez: pyanez@sandiego.edu <br>
