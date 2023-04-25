

public class SlotMachine {

    public int currentPayout;
    public int odds;

    public SlotMachine() {
        this.currentPayout = 1000;
    }

    int whatOddsToGive() {
        if (this.currentPayout > 1000) {
            return 10;
        } else if (this.currentPayout > 900) {
            return 100;
        } else if (this.currentPayout > 800) {
            return 1000;
        } else {
            return 1;
        }
    }

    int playTheSlots(int moneyPutIn) {

        odds = this.whatOddsToGive();
        double randomNumber = Math.floor(Math.random() * odds) + 1;
        if (randomNumber == 7) {
            int winnings = 300;
            this.currentPayout -= winnings;
            return moneyPutIn + winnings;
        } else {
            this.currentPayout += moneyPutIn;
            return 0;
        }





    }
}