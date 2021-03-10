package ie.gmit.dip;

import java.util.*;
public class SimpleAreaCalculator {
    //Constant
    private static final double PI = 3.1415d;

    //Instance variables
    private Scanner scanner;
    
    private boolean keepRunning = true;
    
    public SimpleAreaCalculator(){
        scanner = new Scanner(System.in);
        
        do{
            initMenu();
            processInput();
        }while(keepRunning == true);
    }
    
    
    public void calculateCircleArea(){
        System.out.println("Enter the radius>");
        String input = scanner.next();
        double radius = Double.parseDouble(input);
        double result = PI * (radius * radius);
        System.out.println("Area of Circle:" + result);
    }
    
    public void calculateTriangleArea(){
        System.out.println("Enter the width>");
        String input = scanner.next();
        double width = Double.parseDouble(input);
        
        System.out.println("Enter the height>");
        input = scanner.next();
        double height = Double.parseDouble(input);        
        double result = height * (width / 2);
        System.out.println("Area of Triangle: " + result);
    }
    
    private void processInput(){
        String input = scanner.next();
        int choice = Integer.parseInt(input);
        
        switch(choice){
            case 1:
                calculateCircleArea(); 
                break;
            case 2:
                calculateTriangleArea();
                break;
            case 3:
                keepRunning = false;
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
        
        /*
        
        if (choice == 1){
            calculateCircleArea();    
        }else if (choice == 2){
            calculateTriangleArea();
        }else if (choice == 3){
            System.exit(0);           
        }else{
            System.out.println("Invalid selection.");
        }
        */
    }
    
    private void initMenu(){
        System.out.println("-----------------------------------");
        System.out.println("\t\tSimple Area Calculator");
        System.out.println("-----------------------------------");  
        System.out.println("1) Area of a Circle");
        System.out.println("2) Area of a Triangle");
        System.out.println("3) Quit");
        System.out.println("Select [1-3]>");
    }
    
    
    public static void main(String[] args){
        new SimpleAreaCalculator();   
    }
}
