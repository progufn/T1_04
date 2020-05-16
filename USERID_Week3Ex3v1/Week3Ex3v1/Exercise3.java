
/**
 * Mastery Test Week 3 Exercise 3. Thread 1.
 * - Reverse SIX elements in an array.
 * 
 * @author (your name) 
 */
public class Exercise3
{
    public static int[] reverse(int[] numbers)
    {
        int temp;
        
        // In the coming weeks, the lecturer will explain all of the code above. But for now here is an explanation:
        // 1. In the code above we have provided an integer array "numbers", containing SIX elements.
        // 2. In the code above we have also provided another integer variable called "temp".
        // In the space provided below, write code to reverse the order of elements in the array "numbers".
        // 
        // Do NOT initialise "numbers[0]" ... "numbers[5]". Just write the lines that swap the values.
        // Add your code BELOW this line. Do NOT change anything ABOVE this comment line.
        
        for(int i = 0; i < numbers.length / 2; i++)
        {
            int j = numbers.length-1 -i;
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        
        
        // Add your code ABOVE this line. Do NOT change anything BELOW this comment line.
        return numbers;
    }
}
