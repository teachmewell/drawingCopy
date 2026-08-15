supported operations: 
1. draw a png (and use template) (autofill, colouring, load template, brushsize, scaling)
2. get img sizes (amount of bits)
3. resize any picture (both zooming out/in and adding/removing bits to right/left/up/down)
4. Copy all the bits of some color from one picture to another (or make all affected bits change color in the other image)
5. turn a colour into solely black and white bits (doable with any two colours & no grey tones)
6. add two pictures into a bigger picture
7. change the colour of all instances of one colour inside the picture into another

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
To run it: 

 **FIRST:**  install Java , install git.
 
(on powershell:

*winget install Microsoft.OpenJDK.19*

*winget install --id Git.Git -e --source winget*

)

.

.

 **SECONDLY:**  ON POWERSHELL, TYPE IN: 
 
*git clone https://github.com/teachmewell/drawboard.git*

*cd drawboard/*
 
*javac Main.java IntoFile.java Img.java Predefined.java Stat.java Transcribe.java Refactor.java*
 
*java Main*
 
.

.

 ***to read the manual, write this into console:***

 *cat man.txt*


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

You can draw on your own pgns by dragging them into the folder and renaming them to drawn.png 

However, you may barely see differences because of the big sizes of images.

You can also have custom sizes by changing them inside Main.java (see the array 'a')

.


If you run again and choose 4 as option, then drawn.png will be automatically opened. 

If no drawn.png present, you get an error. 

Options 1,2,3 reset drawn.png . 

If you want to save it, you must rename it or move it into another folder, because next time you run the code, drawn.png might get overwritten. 
