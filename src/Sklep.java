

/**
 *
 * Sklep
 * V rámci sklepa bude možné nalézt spínač, který půjde spustit.
 * Po spuštění bude nutné zadat heslo.
 * Uživatel bude moci zkusit nápovědu k heslu, která bude znít: „Ident předmětu“.
 *
 * Po zadání správného hesla se uživatel automaticky stane generálním ředitelem a ukončí hru.
 *
 * V rámci sklepa bude možné také nalézt kufřík a ten si vzít k sobě.
 * Do kufříku pak bude možné vkládat věci.
 *
 * @author loudal
 * @version 1.0
 * @created 04-XII-2018 9:43:09
 */
public class Sklep extends Mistnost {

	public Sklep(String jmeno){
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

        tlacitko();


    }


    private void tlacitko(){
        System.out.println("Nalezl jsi tlačítko. \n chceš ho zmačknout? \n 0- ano \n 1- ne");
        int vstup = HerniEngine.prectiVstupOdUzivatele();
        String pass = "";
        switch (vstup){
            case 0:
                System.out.println("Ze zdi vyjizdi maly panýlek do kterho můžeš zadavat hodnoty");
                System.out.println("zkus tam něco zadat");
                //vstup = HerniEngine.prectiVstupOdUzivatele();
                // TODO potřeba přečís i string o d uživatele
                if(pass == "top secred pass") {
                    HerniEngine.getHerniEngine().ukonceniHry();
                }
                // TODO AKCE KDYŽ ZADA ŠPATNÉ HESLO
                break;
            case 1:
                break;

                default:
                    tlacitko();
        }
    }

}//end Sklep