//  CodeCampSummer.java


/*  Student information for assignment:
 *
 *  On my honor, <NAME>, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  UTEID:
 *  email address:
 *  Grader name:
 *  Number of slip days I am using:
 */

/*
 * CS307 Students. 
 * Put the results of your experiments and answer
 * the questions about the experiements here:
 * 
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CodeCampSummer {
    
    public static void main(String[] args){
                
        final String newline = System.getProperty("line.separator");
        
        ArrayList<Integer> result;
        ArrayList<Integer> expected = new ArrayList<Integer>();

        // test 1, matches
        result = matches("aaaa", "aaa");
        expected.add(0);
        expected.add(1);
        System.out.println("Testing matches(\"aaaa\", \"aaa\")");
        printTestResults(result, expected, 1);

        // empty expected to get it ready for next test
        expected.clear();

        // test 2, matches
        result = matches("aaa", "aaaa");
        System.out.println("Testing matches(\"aaa\", \"aaaa\")");
        printTestResults(result, expected, 2);

        // test 3, matches
        result = matches("aabbaabbaa", "abb");
        expected.add(1);
        expected.add(5);
        System.out.println("Testing matches(\"aabbaabbaa\", \"abb\")");
        printTestResults(result, expected, 3);
        expected.clear();

        //test 4, matches
        result = matches("babcabc", "abc");
        expected.add(1);
        expected.add(4);
        System.out.println("Testing matches(\"babcabc\", \"abc\")");
        printTestResults(result, expected, 4);
        expected.clear();


        // test 5, matches
        result = matches("aaaabaaaa", "aaa");
        expected.add(0);
        expected.add(1);
        expected.add(5);
        expected.add(6);
        System.out.println("Testing matches(\"aaaabaaaa\", \"aaa\")");
        printTestResults(result, expected, 5);
        expected.clear();


        // test 6, matches
        result = matches("aaabaaabaaabaa", "aab");
        expected.add(1);
        expected.add(5);
        expected.add(9);
        System.out.println("Testing matches(\"aaabaaabaaabaa\", \"aab\")");
        printTestResults(result, expected, 6);
        expected.clear();


        // test 7 mostVowels
        String[] sList = {"aaaaaaa", "aieou"};
        int expectedResult = 0;
        int actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 7, mostVowels");
        else
            System.out.println("failed test 7, mostVowels");

        
        // test 8 mostVowels
        sList = new String[] {"Staying", null, "", "moo", "SEqUOIA NAtIOnAl FOrEst", "!!!!>>+_)(*&^%$#@!>)))???\\///\n\n/n"};
        expectedResult = 4;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 8, mostVowels");
        else
            System.out.println("failed test 8, mostVowels");
        
        
        // test 9 mostVowels
        sList = new String[] {null, null, "100,000,000", "XXX", "", "!!!!>>+_)(*&^%$#@!>)))???\\///\n\n/n", null};
        expectedResult = 2;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 9, mostVowels");
        else
            System.out.println("failed test 9, mostVowels"); 
        
        
        // test 10 mostVowels
        sList = new String[] {null, null, null, null, "", "", null};
        expectedResult = 4;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 10, mostVowels");
        else
            System.out.println("failed test 10, mostVowels");
        
 
        // test 11 mostVowels
        sList = new String[] {""};
        expectedResult = 0;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 11, mostVowels");
        else
            System.out.println("failed test 11, mostVowels");
        
        
        // test 12 mostVowels
        sList = new String[] {null, "AIBA", ""};
        expectedResult = 1;
        actualResult = mostVowels(sList);
        System.out.println("Testing mostVowels with this array: " + Arrays.toString(sList));
        System.out.println("expected result: " + expectedResult + ", actual result: " + actualResult);
        if( actualResult == expectedResult )
            System.out.println("passed test 12, mostVowels");
        else
            System.out.println("failed test 12, mostVowels");
       
        
        //test 13 findMajority
        int majorityExpected = -1;
        int[] b = new int[]{2, 1, 3, 3};
        int majorityResult = findMajority(b);
        System.out.println("Testing findMajority({2, 1, 3, 3})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 13, findMajority");
        else
            System.out.println("failed test 13, findMajority");

        //test 14 findMajority
        b[0] = 3; 
        majorityExpected = 0;
        majorityResult = findMajority(b);
        System.out.println(newline + "Testing findMajority({3, 1, 3, 3})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 14, findMajority");
        else
            System.out.println("failed test 14, findMajority");
        
        //test 15 findMajority
        b = new int[]{-1, -1, -1, 0, 0};
        majorityExpected = 0;
        majorityResult = findMajority(b);
        System.out.println(newline + "Testing findMajority({-1, -1, -1, 0, 0})");
        System.out.println("Expected: " + majorityExpected + ", Actual: " + majorityResult);
        if( majorityResult == majorityExpected )
            System.out.println("passed test 15, findMajority");
        else
            System.out.println("failed test 15, findMajority");
        
        //test 16 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(1, 365)");
        int pairs = sharedBirthdays(1, 365);
        int expectedShared = 0;
        if( pairs == expectedShared )
            System.out.println("passed test 16, birthday problem");
        else
            System.out.println("failed test 16, birthday problem");
        
        //test 17 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(366, 365)");
        pairs = sharedBirthdays(366, 365);
        if( pairs > 0 )
            System.out.println("passed test 17, birthday problem");
        else
            System.out.println("failed test 17, birthday problem");        
        
        //test 18 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(2, 1)");
        pairs = sharedBirthdays(2, 1);
        if( pairs == 1 )
            System.out.println("passed test 18, birthday problem");
        else
            System.out.println("failed test 18, birthday problem. " +
                    "Expected pairs to be 1. Value returned: " + pairs);
        
        //test 19 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(3, 1)");
        pairs = sharedBirthdays(3, 1);
        if( pairs == 3 )
            System.out.println("passed test 19, birthday problem");
        else
            System.out.println("failed test 19, birthday problem. " +
                    "Expected pairs to be 3. Value returned: " + pairs);
        
        //test 20 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(4, 1)");
        pairs = sharedBirthdays(4, 1);
        if( pairs == 6 )
            System.out.println("passed test 20, birthday problem");
        else
            System.out.println("failed test 20, birthday problem. " +
                    "Expected pairs to be 6. Value returned: " + pairs);
        
        //test 21 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(5, 1)");
        pairs = sharedBirthdays(5, 1);
        if( pairs == 10 )
            System.out.println("passed test 21, birthday problem");
        else
            System.out.println("failed test 21, birthday problem. " +
                    "Expected pairs to be 10. Value returned: " + pairs);   

        
        //test 22 birthdayProblem, simple test
        System.out.println(newline + "Testing sharedBirthdays(100, 1)");
        pairs = sharedBirthdays(100, 1);
        if( pairs == 4950 )
            System.out.println("passed test 22, birthday problem");
        else
            System.out.println("failed test 22, birthday problem. " +
                    "Expected pairs to be 4950. Value returned: " + pairs);
        
        /*CS307 STUDENTS: ADD YOUR TESTS HERE. At least 5 for method matches,  
         * 5 for method mostVowels, and 5 for findMajority.
         */
         
        // Experiment
        runExperiment();
        
    }
    
    /**
     * Find all indices in <tt>source</tt> that are the start of a complete
     * match of <tt>target</tt>.
     * @param  source  != null, source.length() > 0
     * @param  target  != null, target.length() > 0
     * @return  an ArrayList that contains the indices in source that are the
     * start of a complete match of target. The indices are stored in
     * ascending order in the ArrayList.
     */
    public static ArrayList<Integer> matches(String source, String target) {
        // check preconditions
        assert (source != null) && (source.length() > 0)
        && (target != null) && (target.length() > 0): "Violation of precondition: method matches";

        ArrayList<Integer> result = new ArrayList<Integer>();

        /*CS307 STUDENTS: ADD YOUR CODE HERE
          The only methods you may use from the String
          class are charAt and length.*/
        int index = 0;
        
        while (index+target.length() <= source.length()) {
        	boolean match = true;
        	for (int target_index = 0; target_index < target.length(); target_index++) {
        		if (target.charAt(target_index) != source.charAt(index+target_index)) {
        			match = false;
        			break;
        		}
        	}
        	if(match) {
        		result.add(index);
        	}
        	index++;
        }

        return result;
    }


	/**
	 * Helper method for mostVowels
	 * @param string of which the vowels are being counted
	 * @return the number of vowels in the string
	 */
	 private static int countVowels(String word) {
	 	int count = 0;
	 	for (int i = 0; i < word.length(); i++) {
	 		char letter = word.charAt(i);
	 		if (letter == 'a' || letter == 'A' || letter == 'E' || letter == 'e' || 
	 			letter =='I' || letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u') {
	 			count ++;
	 		}
	 	}
	 	return count;
	 }
	
    /**
     * Determine the index of the String that 
     * has the largest number of vowels. 
     * Vowels are defined as <tt>'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', and 'u'</tt>.
     * The parameter <tt>list</tt> is not altered as a result of
     * this method.
     * <p>pre: <tt>list != null</tt>, <tt>list.length > 0</tt>, there is an least 1 non null element in list
     * <p>post: return the index of the non-null element in list that has the 
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero. 
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.
     * @param list the array to check
     * @return the index of the non-null element in list that has the largest number of vowels.
     */
    public static int mostVowels(String[] list) {
        assert list != null && list.length > 0 && atLeastOneNonNull(list) : "Violation of precondition: mostVowels"; 

        /* CS307 STUDENTS: ADD YOUR CODE HERE
            You can use any methods you want
         */
         
        int max_vowels = -1;
        int index = -1;
		for (int i = 0 ; i < list.length; i++) {
			String word = list[i];
			if (word != null) {
				int num_vowels = countVowels(word);
				if (num_vowels > max_vowels) {
					max_vowels = num_vowels;
					index = i;
				}
			}
		}
        
        return index;
    }
    
    /**
     * Helper method for findMajority
     * @params int array and item that we're looking for
     * @return the first index of the item in the array, -1 if not in the array
     */
     private static int findIndexOf(int[] list, int item) {
     	int res = -1;
     	for (int i = 0; i < list.length; i++) {
     		if (list[i] == item) {
     			res = i;
     			break;
     		}
     	}
     	return res;
     }
     
    
    /**
     * Determine if there is a majority element in an array of ints.
     * The parameter <tt>list</tt> is not altered as a result of this 
     * method.
     * A majority element in an array A of size N is an element that appears more than N/2 times
     * You can only use native array, and not any class from Java utils.
     * @param list != null
     * @return  the first index of the value of the majority element if it exists.
     * If a majority element does not exist return -1.
     */
    public static int findMajority(int[] list) {
        assert ( list != null ) : "Violation of precondition: findMajority";
        
        int result = -1;
        int unique_count = 0;
        int[] unique_elements = new int[list.length];
        int[] element_counts = new int[list.length];
        int[] first_indices = new int[list.length];

		// iterate through the list and keep count of unique elements
        for (int i = 0; i < list.length; i++) {
        	int index = findIndexOf(unique_elements, list[i]);
        	// if we haven't seen this element, add it to the unique_elements, store the index, and mark its count 1
        	if (index == -1) {
        		unique_count++;
        		unique_elements[unique_count-1] = list[i];
        		element_counts[unique_count-1] = 1;
        		first_indices[unique_count-1] = i;
        	}

        	// if we have seen this element, increase its count
        	else {
        		element_counts[index]++;
        	}
        }
        
        // check if there is such majority element
		for (int i = 0; i < element_counts.length; i++) {
			if (element_counts[i] > list.length/2) {
				result = first_indices[i];
				break;
			}
		}
        
        return result;
    }
    
    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people. 
     * Return the number of pairs of people that share the
     * same birthday.
     * You may not use any other Java classes when completing this method except Random and Math. 
     * You can use native arrays and of course the array length field. (but not methods from the Arrays class.)
     * @param numPeople The number of people in the experiment.
     * This value must be > 0
     * @param numDays The number of days in the year for this experiement.
     * This value must be > 0
     * @return The number of pairs of people that share a birthday.
     */
    public static int sharedBirthdays(int numPeople, int numDays) {
        assert numPeople > 0 && numDays > 0 : "Violation of precondition: parameters" +
                " must be greater than 0. numPeople: " + numPeople + 
                ", numDays: " + numDays;
        
        int[] birthdays = new int[numPeople];
        
        // generate random birthday for each person
        for (int person = 0; person < numPeople; person++) {
        	birthdays[person] = (int) (Math.random() * numDays);
        }

		// count number of shared birthdays
		int index = 0;
		int count = 0;
		while (index < numPeople) {
			for (int i = index+1 ; i < numPeople; i++) {
				if (birthdays[index] == birthdays[i])
					count++;
			}
			index++;
		}
        return count;
    }
    
    /* helper method for showing results of tests
     * pre: result != null, expected != null
     */
    private static void printTestResults(ArrayList<Integer> result, ArrayList<Integer> expected, int testNum){
        System.out.println( "Expected results: " + expected );
        System.out.println( "Actual results:   " + result );
        if( result.equals( expected ) ) {
            System.out.println( "Passed test " + testNum + "." );
        }
        else {
            System.out.println( "Failed test " + testNum + "." );
        }
        System.out.println();
    }

    // pre: list != null
    // post: return true if at least one element in list is null
    // otherwise return false.
    private static boolean atLeastOneNonNull(String[] list) {
        assert list != null : "Violation of precondition: atLeastOneNonNull"; 
        boolean foundNonNull = false;
        int i = 0;
        while( !foundNonNull && i < list.length ){
            foundNonNull = list[i] != null;
            i++;
        }
        return foundNonNull;
    }
    
    // Exp 1: 
    // Perform 20,000 experiments with 365 days per year and 182 people . What is the average number of pairs of people with shared birthdays?
    // Exp 2:
    // Perform 20,000 experiments with 365 days per year and vary the number of people from 2 to 100. (Total of 20,000 * 99 = 1,980,000 runs) 
    // For each of the given number of people determine the percentage of experiments were at least one pair of people shared a birthday. 
    // At what number of people (between 2 and 100) does the percentage first exceed 50%?
    private static void runExperiment() {
    	// EXP 1
    	int pairs = 0;
    	for (int i = 0; i < 20000; i++) {
    		pairs += sharedBirthdays(182, 365);
    	}
    	System.out.println("Exp 1: Performed 20,000 experiments with 365 days per year and 182 people.\n" + 
    		"The average number of pairs of people with shared birthdays is " + pairs/20000 + " pairs.");
    	
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	
    	// EXP 2
    	System.out.print("Exp 2: Perform 20,000 experiments with 365 days per year and vary the number of people from 2 to 100.\n" +
    		"At what number of people (between 2 and 100) does the percentage first exceed 50%? ");
    	int first_numPeople_to_exceed = 0;
    	for (int numPeople = 2; numPeople <= 100; numPeople++) {
    		pairs = 0;
    		int avg_sharedBirthdays = 0;
    		int count_exps_with_at_least_one_pair = 0;
			for (int i = 0; i < 20000; i++) {
				int exp_pairs = sharedBirthdays(numPeople, 365);
				pairs += exp_pairs;
				if (exp_pairs >= 1) {
					count_exps_with_at_least_one_pair++;
				}
			}
			avg_sharedBirthdays = pairs/20000;
			int percentage = count_exps_with_at_least_one_pair/20000 * 100;
			if (percentage > 50 && first_numPeople_to_exceed == 0)
			{
				first_numPeople_to_exceed = numPeople;
			}
    	}
    	System.out.println(first_numPeople_to_exceed);
    		
    	
    }
}