package prototype;

public interface Viisari {
    public void tick();
    public int getAika();
    public void setAika(int aika);
    public void resetAika();
    public Object clone() throws CloneNotSupportedException;
}
