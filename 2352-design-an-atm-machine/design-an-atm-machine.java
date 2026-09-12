class ATM {

    long[] balances = new long[5];
    int[] denos = {20, 50, 100, 200, 500};

    public ATM() {
    }
    
    public void deposit(int[] banknotesCount) {
        //increment each denomination count as per deposit
        for(int i=0; i < 5; i++) {
            balances[i] += banknotesCount[i];
        }        
    }
    
    public int[] withdraw(int amount) {
        //for capturing the count of each denominations to withdraw
        int[] result = new int[5];
        long[] tempBalances = balances.clone();

        for(int i=4; i>-1; i--) {
            //amount to withdraw is higher than current denomination
            //AND
            //ATM has note of that denomination
            if(amount >= denos[i] && tempBalances[i] > 0) {
                // Find how many notes we actually need vs how many we have
                long notesToTake = Math.min((long) amount / denos[i], tempBalances[i]);
                amount -= notesToTake * denos[i];
                //reduce the denomination balances
                tempBalances[i]-= notesToTake;
                //update the count the number of notes of denomination
                result[i]+= notesToTake;
            }
        }

        if( amount == 0) {
            //withdrawal possible
            //update the balances
            balances =  tempBalances;
            return result;
        } else {
            return new int[] {-1};
        }
        
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */