package com.example.kafruitver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Application;
import android.widget.ExpandableListView;

public class MyApp extends Application{
	
	ExpandableAdapter mAdapter;
	ExpandableListView mViewExpandable;
	static List<String> mHeadersFruits = new ArrayList<String>();
	static List<String> mHeadersVegetables = new ArrayList<String>();
	static List<String> mHeadersOthers = new ArrayList<String>();
	static HashMap<String, List<String>> mChildsFruits = new HashMap<String, List<String>>();
	static HashMap<String, List<String>> mChildsVegetables = new HashMap<String, List<String>>();
	static HashMap<String, List<String>> mChildsOthers = new HashMap<String, List<String>>();
	
	static{

		/**----------------------FRUTAS-------------------**/
		mHeadersFruits.add("Aguacates");
		List<String> aguacates = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(0), aguacates);
		
		mHeadersFruits.add("Albaricoque");
		List<String> albaricoque = new ArrayList<String>();
		albaricoque.add("Extra");
		albaricoque.add("Segunda");
		mChildsFruits.put(mHeadersFruits.get(1), albaricoque);
		
		mHeadersFruits.add("Cerezas");
		List<String> cerezas = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(2), cerezas);

		mHeadersFruits.add("Chirimoyas");
		List<String> chirimoyas = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(3), chirimoyas);
		
		mHeadersFruits.add("Ciruelo");
		List<String> ciruelo = new ArrayList<String>();
		ciruelo.add("Amarillo");
		ciruelo.add("Claudia");
		ciruelo.add("Fresa");
		ciruelo.add("Negro");
		ciruelo.add("Prunas");
		ciruelo.add("Sungol");
		mChildsFruits.put(mHeadersFruits.get(4), ciruelo);
		
		mHeadersFruits.add("Fresas");
		List<String> fresas = new ArrayList<String>();
		fresas.add("Primera (Extra)");
		fresas.add("Segunda");
		mChildsFruits.put(mHeadersFruits.get(5), fresas);

		mHeadersFruits.add("Granadas");
		List<String> granadas = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(6), granadas);
		
		mHeadersFruits.add("Kiwis");
		List<String> kiwis = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(7), kiwis);
		
		mHeadersFruits.add("Mandarinas");
		List<String> mandarinas = new ArrayList<String>();
		mandarinas.add("Clementinas");
		mandarinas.add("Clemendillas");
		mChildsFruits.put(mHeadersFruits.get(8), mandarinas);
		
		mHeadersFruits.add("Mangos");
		List<String> mangos = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(9), mangos);
		
		mHeadersFruits.add("Manzanas");
		List<String> manzanas = new ArrayList<String>();
		manzanas.add("Delicios");
		manzanas.add("Espedriega");
		manzanas.add("Espedriega Helada");
		manzanas.add("Fuji");
		manzanas.add("Golden");
		manzanas.add("Gran Smith");
		manzanas.add("Reineta");
		manzanas.add("Royal Gala");
		manzanas.add("Pink Lady");
		mChildsFruits.put(mHeadersFruits.get(10), manzanas);
		
		mHeadersFruits.add("Melocoton");
		List<String> melocoton = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(11), melocoton);
		
		mHeadersFruits.add("Melon");
		List<String> melon = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(12), melon);
		
		mHeadersFruits.add("Naranja");
		List<String> naranja = new ArrayList<String>();
		naranja.add("Zumo");
		naranja.add("Mesa");
		mChildsFruits.put(mHeadersFruits.get(13), naranja);
		
		mHeadersFruits.add("Nectarinas");
		List<String> nectarina = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(14), nectarina);
		
		mHeadersFruits.add("Nisperos");
		List<String> nisperos = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(15), nisperos);
		
		mHeadersFruits.add("Limones");
		List<String> limones = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(16), limones);
		
		mHeadersFruits.add("Pavias");
		List<String> pavias = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(17), pavias);
		
		mHeadersFruits.add("Paraguayos (Chatos)");
		List<String> paraguayos = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(18), paraguayos);
		
		mHeadersFruits.add("Peras");
		List<String> peras = new ArrayList<String>();
		peras.add("Agua");
		peras.add("Alejandrina");
		peras.add("Castell");
		peras.add("Conferencia");
		peras.add("Ercolina");
		peras.add("Roma");
		mChildsFruits.put(mHeadersFruits.get(19), peras);
		
		mHeadersFruits.add("Piñas");
		List<String> piñas = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(20), piñas);
		
		mHeadersFruits.add("Pomelos");
		List<String> pomelos = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(21), pomelos);
		
		mHeadersFruits.add("Platanos");
		List<String> platanos = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(22), platanos);
		
		mHeadersFruits.add("Sandia");
		List<String> sandia = new ArrayList<String>();
		mChildsFruits.put(mHeadersFruits.get(23), sandia);
		
		mHeadersFruits.add("Tomate");
		List<String> tomate = new ArrayList<String>();
		tomate.add("Bola");
		tomate.add("Cherry");
		tomate.add("Cuarenteno");
		tomate.add("Daniela");
		tomate.add("Ensalada");
		tomate.add("Pera");
		tomate.add("Rambo");
		tomate.add("Raf");
		tomate.add("Valenciano");
		mChildsFruits.put(mHeadersFruits.get(24), tomate);
		
		mHeadersFruits.add("Uva");
		List<String> uva = new ArrayList<String>();
		uva.add("Uva Negra");
		uva.add("Uva Blanca");
		mChildsFruits.put(mHeadersFruits.get(25), uva);
			
		/**----------------------VERDURAS---------------------------------**/	
		mHeadersVegetables.add("Acelgas");
		List<String> acelgas = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(0), acelgas);
		
		mHeadersVegetables.add("Ajos");
		List<String> ajos = new ArrayList<String>();
		ajos.add("Secos");
		ajos.add("Tiernos");
		ajos.add("Puerros");
		mChildsVegetables.put(mHeadersVegetables.get(1), ajos);
		
		mHeadersVegetables.add("Alcachofas");
		List<String> alcachofas = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(2), alcachofas);
		
		mHeadersVegetables.add("Apio");
		List<String> apio = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(3), apio);
		
		mHeadersVegetables.add("Berenjenas");
		List<String> berenjenas = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(4), berenjenas);
		
		mHeadersVegetables.add("Bobi");
		List<String> bobi = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(5), bobi);
		
		mHeadersVegetables.add("Boniatos");
		List<String> boniato = new ArrayList<String>();
		boniato.add("Blanco");
		boniato.add("Rojo");
		mChildsVegetables.put(mHeadersVegetables.get(6), boniato);
		
		mHeadersVegetables.add("Brocoli");
		List<String> brocoli = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(7), brocoli);
		
		mHeadersVegetables.add("Calabacín");
		List<String> calabacin = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(8), calabacin);

		mHeadersVegetables.add("Calabazas");
		List<String> calabaza = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(9), calabaza);
		
		mHeadersVegetables.add("Calabaza Asada");
		List<String> calabaza_asada = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(10), calabaza_asada);
		
		mHeadersVegetables.add("Carlota");
		List<String> carlotas = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(11), carlotas);
				
		mHeadersVegetables.add("Cardo");
		List<String> cardo = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(12), cardo);
		
		mHeadersVegetables.add("Cebolla");
		List<String> cebolla = new ArrayList<String>();
		cebolla.add("Dulce");
		cebolla.add("Seca");
		cebolla.add("Tierna");
		mChildsVegetables.put(mHeadersVegetables.get(13), cebolla);
		
		mHeadersVegetables.add("Champiñón");
		List<String> champiñon = new ArrayList<String>();
		champiñon.add("Entero");
		champiñon.add("Laminado");
		mChildsVegetables.put(mHeadersVegetables.get(14), champiñon);
		
		mHeadersVegetables.add("Cocido");
		List<String> cocido = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(15), cocido);
		
		mHeadersVegetables.add("Col cocido");
		List<String> colcocido = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(16), colcocido);
		
		mHeadersVegetables.add("Coliflor");
		List<String> coliflor = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(17), coliflor);
		
		mHeadersVegetables.add("Corazones");
		List<String> corazones = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(18), corazones);

		mHeadersVegetables.add("Endivias");
		List<String> endivias = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(19), endivias);
		
		mHeadersVegetables.add("Esparragos");
		List<String> esparragos = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(20), esparragos);
		
		mHeadersVegetables.add("Espinacas");
		List<String> espinacas = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(21), espinacas);
		
		mHeadersVegetables.add("Garrofón");
		List<String> garrofon = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(22), garrofon);
		
		mHeadersVegetables.add("Habas");
		List<String> habas = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(23), habas);
		
		mHeadersVegetables.add("Lechuga");
		List<String> lechuga = new ArrayList<String>();
		lechuga.add("Iceberg");
		lechuga.add("Normal");
		lechuga.add("Terreno");
		mChildsVegetables.put(mHeadersVegetables.get(24), lechuga);
		
		mHeadersVegetables.add("Patatas");
		List<String> patatas = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(25), patatas);
		
		mHeadersVegetables.add("Pepinos");
		List<String> pepino = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(26), pepino);
		
		mHeadersVegetables.add("Perejil");
		List<String> perejil = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(27), perejil);

		mHeadersVegetables.add("Perona");
		List<String> perona = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(28), perona);
		
		mHeadersVegetables.add("Pimientos");
		List<String> pimiento = new ArrayList<String>();
		pimiento.add("Italiano");
		pimiento.add("Padrón");
		pimiento.add("Rojo");
		pimiento.add("Verde");
		mChildsVegetables.put(mHeadersVegetables.get(29), pimiento);
		
		mHeadersVegetables.add("Rebollones");
		List<String> rebollones = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(30), rebollones);
		
		mHeadersVegetables.add("Repollo");
		List<String> repollo = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(31), repollo);
				
		mHeadersVegetables.add("Rochet");
		List<String> rochet = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(32), rochet);
		
		mHeadersVegetables.add("Setas");
		List<String> setas = new ArrayList<String>();
		mChildsVegetables.put(mHeadersVegetables.get(33), setas);


		/**---------------COMPLEMENTOS---------------------**/
		
	}	

	/**-----------------SETTERS & GETTERS-----------------------**/
	ExpandableAdapter getAdapter(){return mAdapter;}
	ExpandableListView getListView(){return mViewExpandable;}
	ArrayList<String> getHeadersFruits(){return (ArrayList<String>) mHeadersFruits;}
	ArrayList<String> getHeadersVegetables(){return (ArrayList<String>) mHeadersVegetables;}
	ArrayList<String> getHeadersOthers(){return (ArrayList<String>) mHeadersOthers;}
	HashMap<String, List<String>> getChildsFruits(){return mChildsFruits;}
	HashMap<String, List<String>> getChildsVegetables(){return mChildsVegetables;}
	HashMap<String, List<String>> getChildsOthers(){return mChildsOthers;}
}