class Day19
// Day 19 
{
  public static void main(String[] args) 
  {
    Smartphone s= new Smartphone();
    String[] Array=s.Network();
    for(String item:Array)
    {
    	System.out.println("These are the Network names : " + item);
    }
    // s.greeting();
    // can throw error because acess modifer is private 
    s.Recording4K();	
  }
}
interface Camera
{
	void takePhoto();
	void Recording();
	private void greeting()
	{
		System.out.println("Good Moring Person");
	}
    default void Recording4K()
    {
    	greeting();
    	System.out.println("The Person is Recording Vedio in 4k Resolution");
    } 
}
interface wifi
{
   String[] Network();
   void Connect(String network);
}
class Cellphone
{
	void calling(int number)
	{
		System.out.println("Calling to the Person" + number);
	}
	void pickup()
	{
		System.out.println("Conneting the Call of Person");
	}
}
class Smartphone extends Cellphone implements wifi,Camera
{
   public void takePhoto()
   {
   	 System.out.println("The Peron is Clicks the Photo");
   }
   public void Recording()
   {
   	 System.out.println("The Person is Recording the Vedio");	 
   }
   // public void Recording4K()
   // {
   // 	System.out.println("The Person is Recording the Vedio in 4K format and Also clicks the Photo");
   // }
   public String[] Network()
   {
   	 System.out.println("List of Network");
   	 String[] network ={"Vinayak","Smita","Akash"};
   	 return network;
   }
   public void Connect(String network)
   {
   	 System.out.println("Connecting to the " + network);
   }
}
