class Monkeys {

    static boolean monkeyBusiness(Monkey[] monkeys) {
    //BONUS EXERCISE
    //We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.
        int smileCount = 0;
        for (Monkey m: monkeys) {
            if (m.smile) {
                smileCount++;
            }
        }
        return smileCount >= ((float)monkeys.length / 2);
    }

    static class Monkey {
        String name;
        boolean smile;

        public Monkey(String name, boolean smile) {
            this.name = name;
            this.smile = smile;
        }
    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and determine whether the majority of them are smiling or not.  
        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.  

        Monkey rafiqi = new Monkey("Rafiqi", true);
        Monkey curiousGeorge = new Monkey("Curious George", true);
        Monkey kingKong = new Monkey("King Kong", false);

        Monkey[] monkeyList = {rafiqi, curiousGeorge, kingKong};
        System.out.println(Monkeys.monkeyBusiness(monkeyList));
    }

    
}