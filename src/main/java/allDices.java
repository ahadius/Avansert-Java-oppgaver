public class allDices {
    private final DiceValue[] dice;

    public allDices(DiceValue[] diceValue){
        this.dice = diceValue;
    }

    public int getScoreForVariableDiceValue(int number){
        int sum = 0;
        for(DiceValue DiceValue: dice){
            int thisDice = DiceValue.getValue();
            if(thisDice == number){
                sum+=thisDice;
            }
        }
        return sum;
    }

    public int getSum(){
        int sum = 0;
        for(DiceValue DiceValue: dice){
            int thisDice = DiceValue.getValue();
            sum+= thisDice;

        }
        return sum;
    }
}
