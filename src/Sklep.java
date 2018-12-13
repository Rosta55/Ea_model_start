import java.util.Scanner;
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
	public void chciJitPryc()
    {

	}

	@Override
	public String getJmenoMistnosti() {
		return this.jmenoMistnosti;
	}

    @Override
    public void interakce()
    {
        tlacitko();
    }

    private void tlacitko(){
        System.out.println("Nalezl jsi tlačítko. \n chceš ho zmačknout? \n 0- ano \n 1- ne");
        int vstup = HerniEngine.prectiVstupOdUzivateleInt();
        String hesloProPanel = "4IT353";
        switch (vstup){
            case 0:
                System.out.println("Ze zdi vyjíždí malý panýlek do kterého můžeš zadávat hodnoty: ");
                System.out.print("Zkus tam něco zadat: ");
                String vstupProHeslo = HerniEngine.prectiVstupOdUzivateleString();
                // TODO potřeba přečís i string od uživatele

                if (!vstupProHeslo.contains("4IT353"))
                {
                    System.out.println("Zadali jste špatné heslo, nápověda pro heslo je ident předmětu pro pokročilé borce. ");
                }

                else if(vstupProHeslo.contains("4IT353"))
                {
                    // TODO přesunout na úspěšné ukončení (viz varianty konce)
                    HerniEngine.getHerniEngine().ukonceniHry();
                }

                else
                {
                    System.out.println("Zadali jste opět špatné heslo, nic se nestane.");
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