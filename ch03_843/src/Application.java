public class Application{
   public static void main(String args[]) {
      Station station=new RailwayStation();
      System.out.println(station.getName());
      station.ridingStep();
      station=new AutoStation(); 
      System.out.println(station.getName());
      station.ridingStep();
   }
}
