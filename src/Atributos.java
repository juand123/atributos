import java.util.Scanner;

/**
 *
 * @author Juan David Gomez ID:
 * 10/04/2018
 */
public class Atributos {
//declaramos los atributos
    String marca,modelo,precio,color,cilindraje;
    public static void main(String[] args) {
        //aqui creamos nuestro primer objeto para la cuatrimoto
        Atributos atributo = new Atributos();
        //aqui le damos las caracteristicas a nuestros atributos
        atributo.marca="yamaha"; atributo.modelo="2007"; atributo.precio="20.0000"; atributo.color="azul"; atributo.cilindraje="5 mil cc";
        //imprimimos el nombre de cual moto vamos a mostrar
        System.out.println("Estos son los atributos de una cuatrimoto!");
        System.out.println("-------------------------------------------------------");
        //imprimimos los atributos con sus caracteristicas
        System.out.println("marca: "+atributo.marca+"\n"+"modelo: "+atributo.modelo+"\n"+"precio: "+atributo.precio+"\n"+"color: "+atributo.color+"\n"+"cilindraje: "+atributo.cilindraje);
        System.out.println("-------------------------------------------------------");
        //creamos nuestro segundo objeto para la moto de carreras
        Atributos atributo2= new Atributos();
        //ponemos las caracteristicas de la moto de carreras
        atributo2.marca="suzuki"; atributo2.modelo="2010"; atributo2.precio="60.0000"; atributo2.color="rojo"; atributo2.cilindraje="8 mil cc";
        //imprimimos el nombre de nuestro segundo objeto
        System.out.println("Estos son los atributos de una moto de carreras!");
        System.out.println("-------------------------------------------------------");
        //imprimimos las caracteristicas de nuestra moto de carreras
         System.out.println("marca: "+atributo2.marca+"\n"+"modelo: "+atributo2.modelo+"\n"+"precio: "+atributo2.precio+"\n"+"color: "+atributo2.color+"\n"+"cilindraje: "+atributo2.cilindraje);
         System.out.println("-------------------------------------------------------");
         
         //creamos nuestro tercer objeto para la moto trial
         Atributos atributo3= new Atributos();
        //ponemos las caracteristicas de la moto trial
        atributo3.marca="gas gas"; atributo3.modelo="2015"; atributo3.precio="30.0000"; atributo3.color="negra"; atributo3.cilindraje="10 mil cc";
        //imprimimos el nombre de nuestro tercer objeto
        System.out.println("Estos son los atributos de una moto trial!");
        System.out.println("-------------------------------------------------------");
        //imprimimos las caracteristicas de nuestra moto trial
         System.out.println("marca: "+atributo3.marca+"\n"+"modelo: "+atributo3.modelo+"\n"+"precio: "+atributo3.precio+"\n"+"color: "+atributo3.color+"\n"+"cilindraje: "+atributo3.cilindraje);
         System.out.println("-------------------------------------------------------");
         
         //creamos nuestro cuarto objeto para la moto acuatica
         Atributos atributo4= new Atributos();
        //ponemos las caracteristicas de la moto acuatica
        atributo4.marca="bombardier"; atributo4.modelo="2017"; atributo4.precio="80.0000"; atributo4.color="blanca"; atributo4.cilindraje="16 mil cc";
        //imprimimos el nombre de nuestro cuarto objeto
        System.out.println("Estos son los atributos de una moto acuatica!");
        System.out.println("-------------------------------------------------------");
        //imprimimos las caracteristicas de nuestra moto acuatica
         System.out.println("marca: "+atributo4.marca+"\n"+"modelo: "+atributo4.modelo+"\n"+"precio: "+atributo4.precio+"\n"+"color: "+atributo4.color+"\n"+"cilindraje: "+atributo4.cilindraje);
         System.out.println("-------------------------------------------------------");
         
         //creamos nuestro quinto objeto para la moto de nieve
         Atributos atributo5= new Atributos();
        //ponemos las caracteristicas de la moto de nieve
        atributo5.marca="yamaha Sr viper"; atributo5.modelo="2016"; atributo5.precio="110.0000"; atributo5.color="blanca"; atributo5.cilindraje="9 mil cc";
        //imprimimos el nombre de nuestro quinto objeto
        System.out.println("Estos son los atributos de una moto de nieve!");
        System.out.println("-------------------------------------------------------");
        //imprimimos las caracteristicas de nuestra moto de nieve
         System.out.println("marca: "+atributo5.marca+"\n"+"modelo: "+atributo5.modelo+"\n"+"precio: "+atributo5.precio+"\n"+"color: "+atributo5.color+"\n"+"cilindraje: "+atributo5.cilindraje);
         System.out.println("-------------------------------------------------------");
         
          //creamos nuestro sexto objeto para la moto de montaña
         Atributos atributo6= new Atributos();
        //ponemos las caracteristicas de la moto de montaña
        atributo6.marca="macbor"; atributo6.modelo="2014"; atributo6.precio="25.0000"; atributo6.color="amarilla"; atributo6.cilindraje="2 mil cc";
        //imprimimos el nombre de nuestro sexto objeto
        System.out.println("Estos son los atributos de una moto de montaña!");
        System.out.println("-------------------------------------------------------");
        //imprimimos las caracteristicas de nuestra moto de montaña
         System.out.println("marca: "+atributo6.marca+"\n"+"modelo: "+atributo6.modelo+"\n"+"precio: "+atributo6.precio+"\n"+"color: "+atributo6.color+"\n"+"cilindraje: "+atributo6.cilindraje);
         
         //fin.
         
    }
    
    
}
