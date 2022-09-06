public class allDices {
    private final DiceValue[] dice;

    public allDices(DiceValue[] diceValue){
        this.dice = diceValue;
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
