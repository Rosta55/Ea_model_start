import java.util.ArrayList;

public abstract class Mistnost implements IMistnost {


    private ArrayList<IMistnost> kamMuzuJit;
    private ArrayList<IPrikaz> prikazyMistnosti;
    protected String jmenoMistnosti;



    public Mistnost(){
        kamMuzuJit= new ArrayList<>();
        prikazyMistnosti = new ArrayList<>();
    }
    /**
     * @param ktera
     */
    @Override
    public IMistnost getMistost(int ktera) {
        if(ktera < kamMuzuJit.size() && ktera >= 0){
            return kamMuzuJit.get(ktera);
        }else {
            return null;
        }
    }

    public void setPrikazyMistnosti(IPrikaz prikaz){
        prikazyMistnosti.add(prikaz);
    }

    @Override
    public void chciJitPryc(){
        zobrazMozneMistnosti();
        HerniEngine.getHerniEngine().setAktualniPolohaUzivatele(getMistost(HerniEngine.prectiVstupOdUzivateleInt()));
    }

    /**
     * @param mistnost
     */
    @Override
    public void setMistnost(IMistnost mistnost) {
        kamMuzuJit.add(mistnost);
    }

    @Override
    public void zobrazMozneMistnosti() {
        for(int i =0 ; i< kamMuzuJit.size(); i++){
            System.out.println(i+") mistnost: "+ kamMuzuJit.get(i).getJmenoMistnosti());
        }
    }

    @Override
    public abstract String getJmenoMistnosti();

    public abstract void interakce();
}
