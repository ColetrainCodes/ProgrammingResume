public class Time {

    private int h,m,s;
    private boolean showSecs = true;

    public void set(int hour, int min, int sec) {

        if(hour >= 0 && hour < 24 && min >= 0 && min <= 60 && sec >= 0 && sec <= 60) {
            h = hour;
            m = min;
            s = sec;
        }
        else
            System.out.println("Illegal!")
    }

    public void showSecs(boolean show) {
        showSecs = show;
    }

    public int getHour() {
        return h;
    }

    public int getMinute() {
        return m;
    }

    public int getSecond() {
        return s;
    }

    public void tick() {
        s = s+1;

        if(s == 60) {
            s = 0;
            m +=1;
        }
        if(m == 60) {
            m = 0;
            h+=1;
        }
        if(h == 24)
            h = 0;
    }

    public String toString() {
        String t = h + ":" + m;
        if(showSecs)
            t = t + ":" + s;

        return t;
    }
}