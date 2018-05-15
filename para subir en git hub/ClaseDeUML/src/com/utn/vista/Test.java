package com.utn.vista;

import com.utn.modelo.CaninoE1;
import com.utn.modelo.HumanoE1;
import com.utn.modelo.MamiferoClassE1;
import com.utn.vistaE2.CaninoE2;
import com.utn.vistaE2.HumanoE2;
import com.utn.vistaE2.MamiferoClassE2;
import com.utn.vistaE3.CaninoE3;
import com.utn.vistaE3.HumanoE3;
import com.utn.vistaE3.MamiferoE3;

public class Test {

	public static void main(String[] args) {
		
		/*EJEMPLO UTILIZANDO CLASES NO ABSTRACTAS
		 * creamos un mamifero de tipo humano
		 *   Primer patron de diseño :
		 *     Factoria abstracta 
		 */
		MamiferoClassE1 m1 = new HumanoE1 ();//obtiene el esqueleto del mamifero pero con la funcionalidad del humano
		MamiferoClassE1 m2 = new CaninoE1 ();
		MamiferoClassE1 m3 = new MamiferoClassE1();
		m1.dormir(8.5);
		m2.dormir(10.2);
		m3.dormir(4.5);
		String[] alimentosHumanos = {"Cafe","Galletitas","Fideos con queso"};
		String[] alimentoCanino = {"Dogui","Dog chow","Don bosco"};
		m1.comer(alimentosHumanos);
		m2.comer(alimentoCanino);
		//EJEMPLO UTILIZANDO CLASES ABSTRACTAS
		MamiferoClassE2 ma1 = new HumanoE2 ();
		MamiferoClassE2 ma2 = new CaninoE2 ();
		
		System.out.println("===============EJEMPLO 3===============");
		MamiferoE3 mami1 = new HumanoE3();
		MamiferoE3 mami2 = new CaninoE3();
		mami1.comer(alimentosHumanos);
		mami2.comer(alimentoCanino);
		
		/*
		 * ES LA TRANSFORMACION DE UN OBJETO EN OTRO
		 * EJEMPLO : ((objetoQueQuieroTransformar)objetoB)
		 * ((ObjA)ObjB) == ObjB -> ObjA
		 */
		
		mami1.comunicarse();
		((CaninoE3)mami2).setFuncionalidadInterfaz(true);
		mami2.comunicarse();
		((CaninoE3)mami2).setFuncionalidadInterfaz(false);
	}

}
