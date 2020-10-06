import java.util.*;

class Q43{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        
        //details for onebhk from user
        System.out.println("Enter Details for ONE BHK : ");
        System.out.println("Enter Room Area1 : ");
        float roomArea = sc.nextFloat();
        System.out.println("Enter Hall Area : ");
        float hallArea = sc.nextFloat();
        System.out.println("Enter Price : ");
        float price = sc.nextFloat();

        //created object o1 to invoke default constructor of super  class
        OneBHK o1= new OneBHK();

        //created object o to invoke the parameterised constructor of super class
        OneBHK o = new OneBHK(roomArea,hallArea,price);  
        System.out.println("Output of the parent class show() method : ");
        o.show(); 

        
        System.out.println("Enter Details for TWO BHK : ");
        System.out.println("Enter Room Area1 : ");
        roomArea = sc.nextFloat();
        System.out.println("Enter Room Area2 : ");
        float roomArea2 = sc.nextFloat();
        System.out.println("Enter Hall Area : ");
        hallArea = sc.nextFloat();
        System.out.println("Enter Price : ");
        price = sc.nextFloat();

        //created object tb1 to invoke default constructor of subclass 
        TwoBHK tb1= new TwoBHK();

        //created object tb to invoke the parameterised constructor of subclass
        TwoBHK tb =  new TwoBHK(roomArea, roomArea2, hallArea, price);
        System.out.println("Output of the Child class show() method : ");
        tb.show(); 

        // display the value of static variable that count the total no of objects created
        System.out.println("Total Objects Created : " + OneBHK.count);


    }

}




class OneBHK{

    protected float roomArea;
    protected float hallArea;
    protected float price;
    static int count;

    OneBHK(){
        roomArea = 168;
        hallArea = 144;
        count++;
        
    }

    public OneBHK(float roomArea, float hallArea, float price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
        count++;
    }

    //show method of super class
    public void show(){
        System.out.println("Room Area : "+roomArea+" | Hall Area : "+hallArea+" | Price : "+price);
    }


}





class TwoBHK extends OneBHK{

    private float roomArea2;
    
    public TwoBHK(){

        this.roomArea = (float)144.23;

        this.roomArea2 = (float)155.5;

        this.hallArea = (float)168.52;
        this.price = 28000;

    }

    public TwoBHK(float roomArea, float roomArea2, float hallArea, float price){
        //pass the values to the super class and if private we will need the getter and the setter methods for the same
        super(roomArea,hallArea,price); 

        //pass this value to the instance variable for sub class
        this.roomArea2=roomArea2;
    }

    //show method that is overridden in the sub class
    public void show(){
        System.out.println("Room Area 1 : "+roomArea+" |Room Area 2 : "+roomArea2+" | Hall Area : "+hallArea+" | Price : "+price);
    }


}