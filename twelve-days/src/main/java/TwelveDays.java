class TwelveDays {
    String [] verseByday= new String[12];
    
    String [] days = new String[12];
    
    
    String verse(int verseNumber) {
        verseByday[0] = "a Partridge in a Pear Tree.";
    verseByday[1] = "two Turtle Doves, and ";
    verseByday[2] = "three French Hens, ";
    verseByday[3] = "four Calling Birds, ";
    verseByday[4] = "five Gold Rings, ";
    verseByday[5] = "six Geese-a-Laying, ";
    verseByday[6] = "seven Swans-a-Swimming, ";
    verseByday[7] = "eight Maids-a-Milking, ";
    verseByday[8] = "nine Ladies Dancing, ";
    verseByday[9] = "ten Lords-a-Leaping, ";
    verseByday[10] = "eleven Pipers Piping, ";
    verseByday[11] = "twelve Drummers Drumming, ";
        days[0]="first";
    days[1]="second";
    days[2]="third";
    days[3]="fourth";
    days[4]="fifth";
    days[5]="sixth";
    days[6]="seventh";
    days[7]="eighth";
    days[8]="ninth";
    days[9]="tenth";
    days[10]="eleventh";
    days[11]="twelfth";
        String ans = "On the " + days[verseNumber-1] + " day of Christmas my true love gave to me: ";
        for(int i = verseNumber-1 ; i>=0 ; i--){
            ans = ans + verseByday[i];
        }
        return ans+"\n";
            
    }

    String verses(int startVerse, int endVerse) {
        String ans = "";
        for(int i =startVerse ; i<=endVerse ; i++){
            if(i == endVerse){
                ans = ans + verse(i);
            }
            else
            ans = ans + verse(i)+"\n";
        }
        return ans;
    }
    
    String sing() {
        return verses(1 ,12);
    }
}
