# psa-final-project-info6205

# Menace Game
Menace(aka. Tic-Tac-Toe) game is a two-player game, where players takes turn by marking 0's and X's in a 3x3 grid. Here one player is Human(User) and second player Machine, which have been trained to play through Reinforcement Learning(Not exactly but somewhat similar).

# Instructions to Run Program
* clone the repository https://github.com/amireddym/psa-final-project-info6205.git
* Open the repo in NETBEANS IDE (Preffered)
* Run the Application by clicking the run icon in the IDE or by running the main function in MainJFrame class
* Don't try to run the built jar as it is not a fat jar.

# Dependencies
* This application depends on Java 1.8 version
* Also has dependency on slf4j,logback jars for logging and Junit for test cases.
* It loads the log.xml file to load its configuration for logging.

# Logs 
* Log file can be found inside the log folder.
* It logs every event that happens in the system, Both the training and the human interaction with the System.

# States
* The information regarding the training is stored in the winning.csv file in the following format.
* GamesPlayed,SystemWon,Draw,RandomMoveWon (ex- 50,26,13,11)
* Trained Beads state in a Matchbox can be found in trained.csv in the following format.
* State,BeadsCount (ex- 0,0,0,0,0,0,0,0,0,10,10,10,10,10,10,10,10,10)
* In the above the first 9 comma separated values define the state of the MatchBox ie MenaceGame and the next 9 values denote the count of beads for that position available in the MatchBox.
  
# Additional Info
* Please feel free to suggest changes.
* As of now we are training with the either System and Random Mover alternatively. So in order to train the System better please use high value of Iterations while training.
* Please bear with the performance of the System. As of now it is not optimized fully.
* Currently the built jar under dist folder is not a fat jar. So don't try to directly run it. It throws error on the dependency.

# Contributions Info
* There is an issue with the Git stats as everyone is using different systems to commit as time passed and with inconsistency of the mail ids. Please use the below command to properly identify each individual.
* git shortlog --summary --numbered --email
* We tried our best to use mailmap to identify this and fix it. Lets hope it really works.
# Contact Info
* Manoj Reddy Amireddy (mailto:amireddy.m@northeastern.edu)
* Anshita Verma (mailto:verma.ans@northeastern.edu)
* Varun