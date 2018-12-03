package com.wikitronica.programacionjavaapp;

public class Wiki {
    private int actual;
    private WikiPage[] paginas;


    public Wiki(){
        this.actual=0;
        paginas=new WikiPage[15];
        setPaginas();
    }

    private void setPaginas(){
        paginas[0]=new WikiPage("Led", "Sigla de la expresión inglesa light-emitting diode, ‘diodo emisor de luz’, que es un tipo de diodo empleado en computadoras, paneles numéricos (en relojes digitales, calculadoras de bolsillo…), etc.", "Imagen");
        paginas[1]=new WikiPage("Capacitor", "Un condensador eléctrico (también conocido frecuentemente con el anglicismo capacitor, proveniente del nombre equivalente en inglés) es un dispositivo pasivo, utilizado en electricidad y electrónica, capaz de almacenar energía sustentando un campo eléctrico.\u200B\u200B", "Imagen");
        paginas[2]=new WikiPage("Diodo Zener", "Los diodos Zener son diodos de unión PN corrientes, pero que tienen la capacidad de funcionar en condiciones de polaridad inversa. A diferencia de un diodo convencional que bloquea cualquier flujo de corriente a través de sí mismo cuando está polarizado al revés, tan pronto como la tensión inversa alcanza un valor predeterminado, el diodo Zener comienza a conducir en la dirección inversa. Esta es la característica más destacada de este elemento.", "Imagen");
        paginas[3]=new WikiPage("Diodo", "Un diodo es un componente electrónico de dos terminales que permite la circulación de la corriente eléctrica a través de él en un solo sentido,\u200B bloqueando el paso si la corriente circula en sentido contrario, no solo sirve para la circulación de corriente eléctrica sino que este la controla y resiste.", "Imagen");
        paginas[4]=new WikiPage("Mosfet", "Un MOSFET es un dispositivo semiconductor utilizado para la conmutación y amplificación de señales. El nombre completo, Transistor de Efecto de Campo de Metal-Óxido-Semiconductor (Metal Oxide Semiconductor Field Effect Transistor, MOSFET) se debe a la constitución del propio transistor.", "Imagen");
        paginas[5]=new WikiPage("Transistor", "El transistor es un dispositivo electrónico semiconductor utilizado para entregar una señal de salida en respuesta a una señal de entrada. Cumple funciones de amplificador, oscilador, conmutador o rectificador.", "Imagen");

        //Aqui falta uno

        paginas[6]=new WikiPage("Resistencia", "Componente electrónico diseñado para introducir una resistencia eléctrica determinada entre dos puntos de un circuito eléctrico. En otros casos, como en las planchas, calentadores, etc., se emplean resistencias para producir calor aprovechando el efecto Joule. Es un material formado por carbón y otros elementos resistivos para disminuir la corriente que pasa. Se opone al paso de la corriente.", "Imagen");
        paginas[7]=new WikiPage("Sensor de temperatura", "Un tipo de especial de reostato de estado solido, conocido como resistencia termica. Se usa para captar liquido refrigerante, y en algunos sistemas la, temperatura de aire tambien.", "Imagen");
        paginas[8]=new WikiPage("Dip Switch", "Un DIP se trata de un conjunto de interruptores eléctricos que se presenta en un formato encapsulado (en lo que se denomina Dual In-line Package), la totalidad del paquete de interruptores se puede también referir como interruptor DIP en singular.", "Imagen");
        paginas[9]=new WikiPage("Bobina", "Es un componente pasivo del circuito eléctrico que incluye un alambre aislado, el cual se arrolla en forma de hélice. Esto le permite almacenar energía en un campo magnético a través de un fenómeno conocido como autoinducción.", "Imagen");
        paginas[10]=new WikiPage("Buzzer", "Es un transductor electroacústico que produce un sonido o zumbido continuo o intermitente de un mismo tono (generalmente agudo). Sirve como mecanismo de señalización o aviso y se utiliza en múltiples sistemas, como en automóviles o en electrodomésticos, incluidos los despertadores.", "Imagen");
        paginas[11]=new WikiPage("Multimetro", "Es un instrumento eléctrico portátil para medir directamente magnitudes eléctricas activas, como corrientes y potenciales (tensiones), o pasivas, como resistencias, capacidades y otras. ", "Imagen");
        paginas[12]=new WikiPage("Servomotor", "Es un dispositivo similar a un motor de corriente continua que tiene la capacidad de ubicarse en cualquier posición dentro de su rango de operación, y mantenerse estable en dicha posición.\u200B\n" +
                "\n" +
                "El servomotor es un motor eléctrico lleva incorporado un sistema de regulación que puede ser controlado tanto en velocidad como en posición. ", "Imagen");
        paginas[13]=new WikiPage("Motor", "Es un dispositivo que convierte la energía eléctrica en energía mecánica por medio de la acción de los campos magnéticos generados en sus bobinas. Son máquinas eléctricas rotatorias compuestas por un estator y un rotor.\n" +
                "\n" +
                "Algunos de los motores eléctricos son reversibles, ya que pueden convertir energía mecánica en energía eléctrica funcionando como generadores o dinamo.", "Imagen");
    }

    public void siguiente(){
        if(actual<paginas.length-1)
            actual++;
    }

    public void anterior() {
        if(actual>0)
            actual--;
    }

    public int getActual(){
        return actual;
    }

    public void setActual(int act){
        this.actual=act;
    }

    public WikiPage getPagina(int ac){
        return paginas[ac];
    }

    public WikiPage getPaginaActual(){
        return paginas[actual];
    }





}