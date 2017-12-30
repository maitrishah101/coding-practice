class Checker implements Comparator {

    public int compare(Object o1, Object o2){
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;

        if(p1.score != p2.score){
            return p2.score - p1.score;
        }
        return p1.name.compareTo(p2.name);
    }
}
