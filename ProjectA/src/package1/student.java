package package1;

public class student 
{
    int unnati; //variable named unnati
    public void display() // () indicates method
    {
    	System.out.println("This is my first program");
    }
    
    public static void main(String[] args)
    {
    	student abc = new student();
    	abc.unnati=222;
    	System.out.println("value of unnati "+abc.unnati);
    	abc.display();
    	
    }
}
