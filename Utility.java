package demo.database;

import java.io.*;
import java.util.ArrayList;
 
public class Utility{
	 

    public void start(String str, ArrayList<Employee>list) throws IOException{
    	if(str.equalsIgnoreCase("Start")){
             inputNumberOfTimes(list);
    	}else{
    	    System.out.println("Please enter valid input.");
    	    System.out.println("Please enter Start to begin:");
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    String str1 = br.readLine();
    	    start(str1,list);
    	  }
    }
	
	public void inputNumberOfTimes(ArrayList<Employee> list)throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));	
			 System.out.println("Enter the number of times you want to enter data:");
		     String str = br1.readLine();
		     try{
		    	 int n1 = Integer.parseInt(str);      
		    	  for(int i =0; i<n1;i++){
		    		enterData(list);  
		    	  }
			    
		      }catch(NumberFormatException e){
		    	  System.out.println("Please ebter valid input.");
		    	  inputNumberOfTimes(list);
		      }
		     
		    
	}	
	public void enterData(ArrayList<Employee>list) throws IOException{
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the ID of the employee.");
		String st1 = br2.readLine();
	    try{
	    	Employee e1= new Employee();
	    	int n2 = Integer.parseInt(st1);
	    	e1.setEmpid(n2);
			   
		     System.out.println("Enter name of the employee: ");
		     e1.setEmpname(br2.readLine());
		     System.out.println("Enter surname of the employee: ");
		     e1.setEmpsurname(br2.readLine());
		     System.out.println("Enter employee technology: ");
		     e1.setEmptech(br2.readLine());
		     list.add(e1);
             System.out.println("Data entered sucessfully!\n");
	        } catch(NumberFormatException w){
	          System.out.println("Please enter valid input.\n");
		      enterData(list);
	      }
 }	
	
	public void display(ArrayList<Employee> list)throws IOException{
	  int x=0;
	  BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Do you want to display data(y/n):");
	  String s1 = br3.readLine();
	  if(s1.equalsIgnoreCase("y")){
		System.out.println("Number of Employee ID's present is:"+list.size());
		System.out.println("Enter the ID of the employee whose details you wnt to be displayed:");
		String s3 = br3.readLine();
	    try{ int t = Integer.parseInt(s3);
		     for(int i=0; i<list.size();i++){
		      if(t== list.get(i).getEmpid()){
			    System.out.println("The Employee ID is:"+ list.get(i).getEmpid());
			    System.out.println("The Employee name is:"+ list.get(i).getEmpname());
			    System.out.println("The Employee surname is:"+ list.get(i).getEmpsurname());
			    System.out.println("The Employee technology is:"+list.get(i).getEmptech());
			    break;
		      }else{
			     x =1;
			    }
		     }
		      if(x == 1){
			  System.out.println("The entered ID does not exist.");
		      }
	       }catch(NumberFormatException e){
	    	System.out.println("Please enter valid input");
	    	display(list);
	        }
	  }else if(s1.equalsIgnoreCase("n")){
	     System.out.println("You have chosen not to display data.");
	     } else{
	    	 System.out.println("Please enter valid input.");
	    	 display(list);
	     }
	}
	
	public void remove(ArrayList<Employee> list)throws IOException{
		BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Do you want to remove data(y/n):");
		  String s5 = br4.readLine();
		  if(s5.equalsIgnoreCase("y")){
			System.out.println("Enter the ID of the employee whose details you want to be removed:");
			String s6 = br4.readLine();
		try{
		       int h = Integer.parseInt(s6);
		       for(int i = 0; i< list.size();i++){
			        if (list.get(i).getEmpid() == h) {
	                  list.remove(list.get(i));
				      System.out.println("Data removed sucessfully."); 
					 }else{
					      System.out.println("Please enter valid ID.");
					      remove(list);
						  }	
			    System.out.println("Now the number of Employee ID's present are:"+list.size());
		       }
		    }catch(NumberFormatException e){
		    	System.out.println("Please enter valid input.");
		    	remove(list);
		    	
		    }
	      }else if(s5.equalsIgnoreCase("n")){
	    	System.out.println("You have chosen not to delete data.");
	    	System.out.println("Now exiting the system......");
	    	System.exit(0);
	       }else{
	    	System.out.println("Please enter valid input.");
	    	remove(list);
	        }
    }
}	