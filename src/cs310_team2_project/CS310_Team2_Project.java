package cs310_team2_project;

public class CS310_Team2_Project {
    public static void main(String[] args){
        TASDatabase db = new TASDatabase();
        Badge b = db.getBadge("12565C60");
        System.out.println(b.toString());
        Shift s = db.getShift(2);
        System.out.println(s.toString());
        Punch p = db.getPunch(3433);
        System.out.println(p.printOriginalTimestamp());
        
        Punch p2 = new Punch("4E6E296E", 105, 1);
        System.out.println(p2.printOriginalTimestamp());
        System.out.println(Integer.toString(db.insertPunch(p2)));
    }
}
