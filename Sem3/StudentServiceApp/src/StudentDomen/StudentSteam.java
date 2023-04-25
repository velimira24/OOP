package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    /* создаем список потоков */
    private List<StudentGroup> steam;
    private int steamNumber;

    /* конструктор */
    public StudentSteam(List<StudentGroup> steam, int steamNumber) {
        this.steam = steam;
        this.steamNumber = steamNumber;
    }

    /* геттер */
    public List<StudentGroup> getSteam() {
        return steam;
    }

    /* сеттер */
    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    /* геттер */
    public int getSteamNumber() {
        return steamNumber;
    }

    /* сеттер */
    public void setSteamNumber(int steamNumber) {
        this.steamNumber = steamNumber;
    }

    @Override
    /* итеррирование* */
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(steam);
    }

    @Override
    /* вывод на экран */
    public String toString() {
        return "StudentSteam{"

                + "Steam=" + getSteam()
                + ", steamnumber=" + getSteamNumber() +
                '}';

    }

}
