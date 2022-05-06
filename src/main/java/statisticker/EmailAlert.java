package statisticker;

public class EmailAlert implements IAlerter{

   protected boolean emailSent;

   public void setEmailSent(boolean emailSent) {
      this.emailSent = emailSent;
   }
}
