public class BonusMilesService {
    public int calculate(int cost) {
        int ticket = 5; // количество купленных билетов
        int mile = (cost * ticket) / 20;
        if (mile >= 1) {
            mile = mile;
        }
        return mile;
    }
}
