

/**
 * @author loudal
 * @version 1.0
 * @created 04-XII-2018 9:43:01
 */
public interface IMistnost {

    /**
     *
     * @param ktera
     */
    public IMistnost getMistost(int ktera);

    public void chciJitPryc();

    /**
     *
     * @param mistnost
     */
    public void setMistnost(IMistnost mistnost);

    public void zobrazMozneMistnosti();

    public String getJmenoMistnosti();

    public void interakce();



}