public class Program {
    public static void main(String[] args) {        
        //El color sera "Red"
        Vehicle v1 = new Vehicle();
        
        //El color sera "Green"
        Vehicle v2 = new Vehicle("Green"); 
        
        System.out.println(v2.getColor());
    }
}