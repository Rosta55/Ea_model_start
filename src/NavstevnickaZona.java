

/**
 * @author loudal
 * @version 1.0
 * @created 04-XII-2018 9:43:02
 */
public class NavstevnickaZona extends Mistnost{

	private String jmeno;

	public NavstevnickaZona(String jmeno){
		super();
		this.jmenoMistnosti = jmeno;

	}

	public void finalize() throws Throwable {

	}
	public String getJmeno(){
		return "";
	}

	/**
	 * @param ktera
	 */
	@Override
	public IMistnost getMistost(int ktera) {
		return null;
	}

	@Override
	public void chciJitPryc() {

	}

	/**
	 * @param mistnost
	 */
	@Override
	public void setMistnost(IMistnost mistnost) {

	}

	@Override
	public void zobrazMozneMistnosti() {

	}

	@Override
	public String getJmenoMistnosti() {
		return this.jmenoMistnosti;
	}

	@Override
	public void interakce() {
        System.out.println("0) prohledej mistnost");
        System.out.println("1) jit pryč");

        switch (HerniEngine.prectiVstupOdUzivateleInt()){
            case 0:

            case 1:
                chciJitPryc();
                break;
        }
	}
}//end NavstevnickaZona