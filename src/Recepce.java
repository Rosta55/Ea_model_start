/**
 * @author loudal
 * @version 1.0
 * @created 04-XII-2018 9:43:07
 */
public class Recepce extends Mistnost{

	public Recepce(String jmeno){
		super();
		this.jmenoMistnosti = jmeno;

	}


	@Override
	public void chciJitPryc() {

	}

	@Override
	public String getJmenoMistnosti() {
		return this.jmenoMistnosti;
	}

    @Override
    public void interakce() {

    }
}//end Recepce