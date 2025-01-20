public class Main
{
    public static class Car
    {
      int speed;
      String name;
        
        public void setSpeed(int speed){
            this.speed = speed;
        }
        public void setName(String name){
            this.name = name;
        }
        
        public int getSpeed(){
            return this.speed;
        }
        
        public String getName(){
            return this.name;
        }
        
    }
	public static void main(String[] args) {
	    int x = Integer.parseInt(args[0]);
        Main c = new Main();
        
        c.setSpeed(100,"Honda");
        c.get();
		
	}
}
