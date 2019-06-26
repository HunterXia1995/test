import java.util.Objects;

public class Game {
    private String period;
    private String time;
    private String hostPlace;
    private String champion;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHostPlace() {
        return hostPlace;
    }

    public void setHostPlace(String hostPlace) {
        this.hostPlace = hostPlace;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public Game(String period, String time, String hostPlace, String champion) {
        this.period = period;
        this.time = time;
        this.hostPlace = hostPlace;
        this.champion = champion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(period, game.period) &&
                Objects.equals(time, game.time) &&
                Objects.equals(hostPlace, game.hostPlace) &&
                Objects.equals(champion, game.champion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, time, hostPlace, champion);
    }

    @Override
    public String toString() {
        return "Game{" +
                "period='" + period + '\'' +
                ", time='" + time + '\'' +
                ", hostPlace='" + hostPlace + '\'' +
                ", champion='" + champion + '\'' +
                '}';
    }
}
