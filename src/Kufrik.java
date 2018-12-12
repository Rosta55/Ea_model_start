import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author loudal
 * @version 1.0
 * @created 04-XII-2018 9:43:00
 */
public class Kufrik {

	private String popis;
	private int kapacita;
	private double nosnost;
	private double vaha;
	private int objem;

	private ArrayList<IVec> kufrik;

	public Kufrik(double nosnost, int kapacita, String popis){
		this.kapacita=kapacita;
		this.popis=popis;
		this.nosnost=nosnost;
		kufrik= new ArrayList<>();
	}

	public void finalize() throws Throwable {

	}
	public String getPopis(){
		return popis;
	}

	public boolean vlozitVec(IVec vec)
	{
		if(vec.getVaha()< nosnost-vaha
				&& this.kapacita> kufrik.size()){
			kufrik.add(vec);
			vaha += vec.getVaha();
			return true;
		}else{
			return false;
		}
	}

	public IVec vyndatVec(int ktera)
	{
		IVec vec= kufrik.get(ktera);
		vaha-=vec.getVaha();
		kufrik.remove(ktera);
		return vec;
	}

	public List<IVec> vysypatObsahKufriku(){
		List<IVec> veciZKufriku = kufrik;
		kufrik = new ArrayList<>();
		vaha = 0;
		return Collections.unmodifiableList(veciZKufriku);
	}

	public void zobrazitObsah(){

	}


	public static void main(String[] args) {

		// TODO projděte si tento kod a okomentujte mista kde nevite co to děla
		// TODO překopirovat do Junit testu

		Kufrik kufrik = new Kufrik(10, 10, "Pěkny mali postribreny kufrik");

		class TestTuska implements IVec{
			public double vaha=2;
			@Override
			public void pouzij() {
				System.out.println("pouzivam tusku");
			}

			@Override
			public double getVaha() {
				return vaha;
			}
		}


		IVec tuska = new TestTuska();

		System.out.println(kufrik.vlozitVec(tuska));

		TestTuska vec = (TestTuska)  kufrik.vyndatVec(0);

		System.out.println(vec.vaha);
		vec.vaha=5;
		System.out.println(vec.vaha);

		kufrik.vlozitVec(tuska);

		List<IVec> list = kufrik.vysypatObsahKufriku();
		System.out.println(list.get(0).getVaha());
		TestTuska unmodif =(TestTuska) list.get(0);

		System.out.println("------------");

		unmodif.vaha=6;
		System.out.println(vec.vaha);
		System.out.println(unmodif.vaha);



	}
}//end Kufrik