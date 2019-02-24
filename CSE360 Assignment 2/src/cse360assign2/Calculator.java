/**
* Author: Ettien Martinez
* Class ID: 476 
* Assignment: Assignment 2
* Description: This Calculator will conduct operations with the 
* inputted variables to generate a total. The total will be added,
* subtracted, multiplied, and divided. In addition the program will 
* print the history of the operations conducted.
*/

package cse360assign2;

public class Calculator {

	private int total;
	private String history = "0";
	
	/**  
	* 
	*   
	*/  
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**  
	* Calculate total of operations conducted
	* 
	*/  
	public int getTotal () {
		return total;
	}
	
	/**  
	* add the parameter to the total variable
	* 
	* @param value Int variable which will be added
	* to the total variable. 
	*/  
	public void add (int value) {
		total = total + value;
		history = "+" + value;
	}
	
	/**  
	* subtract the parameter to the total variable
	* 
	* @param value Int variable which will be subtracted
	* from the total variable. 
	*/ 
	public void subtract (int value) {
		total = value - total;
		history = "-" + value;
	}
	
	/**  
	* multiply the parameter to the total variable
	* 
	* @param value Int variable which will be multiplied
	* to the total variable. 
	*/ 
	public void multiply (int value) {
		total = total * value;
		history = "*" + value;
	}
	
	/**  
	* divide the parameter to the total variable
	* 
	* @param value Int variable which the total variable
	* will be divided by 
	*/ 
	public void divide (int value) {
		//total = total / value;
		if(value==0){
			total=0;
		}else{
			total = total / value;
		}
		history = "/" + value;
	}
	
	/**  
	* a history report of all the operations will be generated
	*/ 
	public String getHistory () {
		return "";
	}
}
