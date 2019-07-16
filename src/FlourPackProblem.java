public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }

        if(bigCount*5==goal || smallCount==goal || (bigCount!=0 && (bigCount*5)%goal==0)){
            return true;
        } else if(bigCount*5<goal && bigCount*5 + smallCount>=goal){
            return true;
        } else if(bigCount*5>goal && smallCount>=goal) {
            return true;
        } else {
            return false;
        }
    }
}
