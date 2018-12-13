import java.util.Scanner;

/**
 * @author loudal
 * @version 1.0
 * @created 04-XII-2018 9:42:52
 */
public class HerniEngine {

	private IMistnost aktualniPolohaUzivatele;

	private static HerniEngine hra;

	private HerniEngine(){
		//TODO tady se všechno připraví tak aby ten hráč už mohl začít hrát
		printIntroduction();
		generateMap();

	}

	public static HerniEngine getHerniEngine(){
	    if(hra == null){
	        hra=new HerniEngine();
        }
        return hra;
    }



	private void printIntroduction(){
		System.out.println("Právě jste se ocitli ve věhlasné IT firmě, ale jako zcela podřadný zaměstnanec a to ve sklepě, kde jsou již vyřazené počítače. " +
                "Je teď na Vás, zdali chcete stoupat po žebříčku na kýžené nejvyšší místo nebo skončit na dlažbě, zcela bez prostředků, ale také bez povinností a stresu. " +
                "V budově můžete procházet nabízené místnosti a sbírat předměty, z nichž některé jsou nutné pro dokončení hry.");
	}

	private void generateMap(){

		IMistnost relaxZona = new RelaxZona("Relaxační zóna");
		IMistnost sklep = new Sklep("Sklep");
		IMistnost kancelarHr = new KancelarHr("Kancelář perosnálního oddělení");
		IMistnost kancelarGr= new KancelarGr("Kancelář generálního ředitele");
		IMistnost kancelarObch = new KancelarObch("Kancelář obchodního oddělení");
		IMistnost navstevnickaZona = new NavstevnickaZona("Návštěvnická zóna");
		IMistnost recepce = new Recepce("Recepce");


        sklep.setMistnost(recepce);
        recepce.setMistnost(sklep);

        recepce.setMistnost(navstevnickaZona);
        recepce.setMistnost(kancelarHr);

        navstevnickaZona.setMistnost(recepce);
        navstevnickaZona.setMistnost(relaxZona);

        kancelarHr.setMistnost(recepce);
        kancelarHr.setMistnost(relaxZona);
        kancelarHr.setMistnost(kancelarObch);

        relaxZona.setMistnost(navstevnickaZona);
        relaxZona.setMistnost(kancelarHr);

        kancelarObch.setMistnost(kancelarHr);
        kancelarObch.setMistnost(kancelarGr);

        kancelarGr.setMistnost(kancelarObch);


		/*Mistnosti kancelarHr = new KancelarHr();
		Mistnosti kancelarGR = new KancelarGr();
		Mistnosti navstevnickaZona = new NavstevnickaZona();*/

        aktualniPolohaUzivatele = sklep;
	}

	public void finalize() throws Throwable {

	}

	public void hrej(){
		boolean konecHry = false;

		while (!konecHry){
			aktualniPolohaUzivatele.interakce();
		}
	}

	public IMistnost getAktualniPolohaUzivatele(){
	    return aktualniPolohaUzivatele;
    }

    public void setAktualniPolohaUzivatele(IMistnost mistnost){
	    if(mistnost == null){
            throw new NullPointerException();
        }else{
	        aktualniPolohaUzivatele=mistnost;
        }
    }
	public IMistnost jdiDoVybraneMistnosti(){
		return null;
	}

	public static int prectiVstupOdUzivateleInt(){
		Scanner vstupCisla = new Scanner(System.in);
		return vstupCisla.nextInt();
	}

	public static String prectiVstupOdUzivateleString()
    {
        Scanner vstupTextu = new Scanner(System.in);
        return vstupTextu.nextLine();
    }

	public void ukonceniHry()
	{
		//TODO tady se zhodnotí čeho hrač dosáhnul, vytiskne skore, čas straveny ve hře atp...
        /* Varianta GŘ:
        Úspěšně jste dokončili hru a stali jste se generálním ředitelem společnosti.
        Můžete směle začít rozhodovat o budoucnosti a směru této společnosti.
        GRATULUJEME !!! :-)

        Varianta dlažba:
        Skončili jste tzv. na dlažbě a už nikdy nebudete v této společnosti zaměstnán. Příčinou je naprostá lenost pracovat,
        nicméně pokud vám to charakter dovoluje, tak jste se stali zcela svobodní a nezávislí na korporátním mamonu.
        Přejeme hodně úspěchů v budoucím životě :) !!!
         */

	}

	public int vybratPrikaz(){
		return 0;
	}

	public void zobrazitAktualniPrikazy(){

	}

	public void zobrazitNapovedu(){

	}

    public static void main(String[] args) {
	    HerniEngine.getHerniEngine().hrej();

    }
}//end HerniEngine