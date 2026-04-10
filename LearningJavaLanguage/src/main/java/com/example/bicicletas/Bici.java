/*
 * ¿Que es una interface?
 * 
 * Es un conjunto de metodos abstractos, en principio es decir que no tienen implementacion, que no 
 * tienen implementacion que no tienen cuerpo relacionados 
 * 
 * El lenguaje Java si permite a una clase implementar una o varias interfaces y esto complemeta que 
 * el lenguaje no permita la herencia multiple de clases
 * 
 * Las interfaces son quizar mas importantes que las propias clases porque por ejemplo el framework 
 * de colecciones son interfaces y tambien para desaclopar el codigo que veremos mas adelante a traves 
 * de la inyeccion de dependencias en spring lo que se utiliza son las interfaces*/

/*considera una empresa que se dedica a la fabricacion de bicicletas de montaña, de carrera, acuaticas,de paseo,
 * etc...
 * 
 *Existen en dicha fabrica/empresa varios departamentos que se dedican a  la fabricacion de las 
 *bicicletas, pero el jefe de produccion quiere que cuando diga frenar o embragar 
 *o acelerar el nombre del metodo que realize la accion sea el mismo y lo unico que cambie sea 
 *la implementacion del metodo segun el tipo de bicicleta por ejemplo una bicicleta
 *de carrera cuando acelera tiene que aumentar mas la velocidad que otro tipo de bicicleta 
 *pero el metodo se tiene que llamar acelerar, igualmente 
 *
 *
 *TECNICAMENTE: una interfaz es un contrato mediante el cual una clase concreta que implemente 
 *una interfaz se compromete a implementar todos los metodos abstractos de la interfaz aunque solamente
 *vaya a utizar uno solo. 
 *
 *
 *IMPORTANTE!!! Cuando se implementa una interfaz, la firma del metodo no se puede violar
 *
 *La firma (signature) del metodo comprende el nombre y los paremetros que recibe*/

package com.example.bicicletas;

public interface Bici {
	public abstract void acelerar(double velocidad);
	public abstract void frenar(double velocidad);
	public abstract void embragar(int engrane);
	
	

}
