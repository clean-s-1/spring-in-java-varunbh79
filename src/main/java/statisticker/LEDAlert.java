package statisticker;

public class LEDAlert implements IAlerter{

   protected boolean ledGlows;

   public void setLedGlows(boolean ledGlows) {
      this.ledGlows = ledGlows;
   }
}
