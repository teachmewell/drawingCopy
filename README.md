Java , drawboard. You can color pixels. 

To run it: 

 **FIRST:**  install Java , install git.
 
(on powershell:

winget install Microsoft.OpenJDK.19

winget install --id Git.Git -e --source winget

)

.

.

.

 **SECONDLY:**  ON POWERSHELL, TYPE IN: 
 
git clone https://github.com/teachmewell/drawboard.git

 cd drawboard/
 
 javac Main.java IntoFile.java Img.java Predefined.java Stat.java Transcribe.java
 
 java Main
 
.

.

follow the instructions on the terminal. After editing, the file will be named "drawn.png". You can only color with one colour at a time. 

.

.

If you want a quick start, you can do: 

java Main -q

This will initialize quickly. 

.

.


If you run again and choose 4 as option, then drawn.png will be automatically opened. 

If no drawn.png present, you get an error. 

1,2,3 reset drawn.png . 

If you want to save it, you must rename it or move it into another folder. 

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

You can draw on your own pgns by dragging them into the folder and renaming them to drawn.png However, you may barely see differences of bit-size of big images.

You can also have custom sizes by changing them inside Main.java (see the array 'a')

.

.

Use the command "java Stat -s <number>" to enlarge your picture. java Stat will make every bit n times as big. 

enter the times by which you want to enlarge into <number> .  Example: 

java Stat -s 10
