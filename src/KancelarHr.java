/**
 * @author loudal
 * @version 1.0
 * @created 04-XII-2018 9:42:57
 */
public class KancelarHr extends Mistnost{


    // TODO TADY BUDE PAPIROVÁ SMLOIUVA A TA JE POTŘEBA PODEPSAT TUŠKOU POKUD JI PODEPIŠE TAK SE VYPIŠE H
    /*
    * TADY BUDE PŘÍBĚH.
    * */

	public KancelarHr(String jmeno){
		super();
		this.jmenoMistnosti = jmeno;
	}

    /***
     *
     */
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
}//end KancelarHr