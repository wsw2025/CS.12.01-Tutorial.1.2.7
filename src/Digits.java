import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        if(num<0){
            throw new IllegalArgumentException("The number passed to the constructor (" + num +") cannot be negative!");
        }
        String number = String.valueOf(num);
        digitList = new ArrayList<>();
        for (int i = 0; i < number.length(); i++){
            digitList.add(Character.getNumericValue(number.charAt(i)));
        }
        // To be implemented.

    }


    public ArrayList<Integer> getDigitList(){
        return this.digitList;
    }
    public boolean isStrictlyIncreasing()
    {

        for (int i = 1; i < digitList.size(); i++){
            if(digitList.get(i)<=digitList.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
