public abstract class Station {
   public abstract String getName();
   public abstract void safetyExamine();
   public abstract void validateTicket();
   public abstract void choiceCarriageType();
   public final void ridingStep() {  //模板方法
      safetyExamine();
      validateTicket();
      choiceCarriageType();
   }
}
