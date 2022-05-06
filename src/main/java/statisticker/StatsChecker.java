package statisticker;


public class StatsChecker {

    private float maxThreshold;
    private IAlerter[] iAlerters;

    public StatsChecker(float maxThreshold, IAlerter[] iAlerters) {
        this.maxThreshold = maxThreshold;
        this.iAlerters = iAlerters;
    }

    public void checkAndAlert(Float[] numbers) {

        EmailAlert emailAlert = (EmailAlert) iAlerters[0];
        LEDAlert ledAlert = (LEDAlert) iAlerters[1];

        for (float number: numbers) {
               if(number > maxThreshold) {
                    emailAlert.setEmailSent(true);
                    ledAlert.setLedGlows(true);
                    break;
               }
        }


    }
}
