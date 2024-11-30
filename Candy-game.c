
//-------------------------------------------------------works only in turboC++------------------------------------------------------------------------------------

#include <stdio.h>
#include <conio.h> // For functions like clrscr(), gotoxy(), and kbhit()

void main()
{
    int candyX = 40, candyY = 5, boxX = 40, boxY = 22, score = 0, lifeline = 3, d; // Initialize variables for positions and score
    char ch;                                                                       // Character variable for user input

    textbackground(BLUE); // Set the background color to blue

start:                                 // Label for the loop to restart the game
    clrscr();                          // Clear the screen
    gotoxy(60, 5);                     // Move the cursor to position (60,5)
    cprintf("Score=%d", score);        // Display the current score
    cprintf(" lifeline=%d", lifeline); // Display the remaining lifeline
    gotoxy(candyX, candyY);            // Move the cursor to the candy's position
    textcolor(YELLOW);                 // Set the text color to yellow for the candy
    cprintf("0");                      // Display the candy as "0"
    gotoxy(boxX, boxY);                // Move the cursor to the position of the box
    printf("#");                       // Display the left part of the box
    gotoxy(boxX + 7, boxY);            // Move the cursor to the right part of the box
    cprintf("#");                      // Display the right part of the box
    gotoxy(boxX, boxY + 1);            // Move the cursor to the bottom of the box
    cprintf("########");               // Display the bottom part of the box

    // Check if a key has been pressed
    if (kbhit())
    {
        ch = getch(); // Get the pressed key
        switch (ch)
        {         // Check which key was pressed
        case 'a': // If 'a' is pressed, move the box left
            if (boxX > 1)
            { // Ensure the box doesn't go beyond the screen
                boxX--;
            }
            break;

        case 'd': // If 'd' is pressed, move the box right
            if (boxX < 73)
            { // Ensure the box doesn't go beyond the screen
                boxX++;
            }
            break;

        case 'x': // If 'x' is pressed, exit the game
            exit(0);
        }
    }

    candyY++; // Move the candy down by 1 unit

    // Check if the candy has reached the bottom of the screen
    if (candyY == 23)
    {
        d = candyX - boxX; // Calculate the distance between the candy and the box
        if (d >= 1 && d <= 6)
        {            // If the candy is caught by the box (within range)
            score++; // Increase the score
        }
        else
        {               // If the candy is missed
            lifeline--; // Decrease the lifeline by 1
            if (lifeline == 0)
            {                            // If no lifelines remain, end the game
                clrscr();                // Clear the screen
                gotoxy(40, 13);          // Move the cursor to the middle of the screen
                textcolor(RED);          // Set the text color to red
                cprintf("GAME IS OVER"); // Display "Game Over" message
                getch();                 // Wait for a key press before closing
                exit(0);                 // Exit the program
            }
        }

        candyX = rand() % 80 + 1; // Randomly place the candy at a new X position
        candyY = 1;               // Reset the candy's Y position to the top of the screen
    }

    delay(200); // Delay the loop for 200 milliseconds to control the speed of the game
    goto start; // Go back to the start label to repeat the game loop
}
