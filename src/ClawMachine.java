public class ClawMachine {

 public int numberOfTries;
 public int moneyInTheBank;


 public boolean readyToWin;
 public boolean readyToWinBigTime;
 public String playGame;
 public int moneyPaid;



public ClawMachine(int numberOfTries, int moneyInTheBank) {
    this.numberOfTries = 0;
    this.moneyInTheBank = 0;
}



    int getMoneyInTheBank() {
        return this.moneyInTheBank;
    }

    boolean readyToWin() {
        if (this.numberOfTries >= 5 && this.numberOfTries % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean readyToWinBigTime() {
        if (this.numberOfTries >= 10) {
            return true;
        } else {
            return false;
        }
    }

    String playGame(int moneyPaid) {
        if (moneyPaid >= 1) {
            this.moneyInTheBank += moneyPaid;
            this.numberOfTries++;

            if (this.readyToWinBigTime()) {
                this.numberOfTries = 0;
                this.moneyInTheBank -= 10;
                return "You won BIG!";
            } else if (this.readyToWin()) {
                this.numberOfTries = 0;
                this.moneyInTheBank -= 5;
                return "You won!";
            } else {
                return "You lost.";
            }
        } else {
            return "Please insert at least 1 EURO to play the game.";
        }
    }
}



