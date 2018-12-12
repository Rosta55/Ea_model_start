import java.util.ArrayList;

/**
 * @author loudal
 * @version 1.0
 * @created 04-XII-2018 9:38:40
 */
public class RelaxZona extends Mistnost {


	public RelaxZona(String jmeno){
		super();
		this.jmenoMistnosti = jmeno;

	}

	public void chciJitPryc(){

	}


	@Override
	public String getJmenoMistnosti() {
		return this.jmenoMistnosti;
	}


	private void printInfo(){
		System.out.println("nachazis se tady a tady a vidis to a to a můžeš udělat tohle a tohle");
	}

	@Override
	public void interakce() {
		printInfo();


	}

}//end RelaxZona