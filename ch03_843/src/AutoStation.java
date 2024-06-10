public class AutoStation extends Station {
   public void safetyExamine() {
      System.out.println("使用危险品检查设备TTT999");
   }
   public void validateTicket() {
       System.out.println("大家排队，由检票员按顺序检票，并在票画线");
   }
   public void choiceCarriageType() {
       System.out.println("根据乘客的车票为乘客指定客车");
   }
   public String getName() {
      return "@@@@长途客车站@@@@";
   }
}




