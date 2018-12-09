package com.wikitronica.programacionjavaapp;

public class Wiki {
    private int actual;
    private WikiPage[] paginas;


    public Wiki(){
        this.actual=0;
        paginas=new WikiPage[43];
        setPaginas();
    }

    private void setPaginas(){
        paginas[0]=new WikiPage("Led","Un diodo emisor de luz o led5\u200Bn 1\u200B (también conocido por la sigla LED, del inglés light-emitting diode) es una fuente de luz constituida por un material semiconductor dotado de dos terminales. Se trata de un diodo de unión p-n, que emite luz cuando está activado.6\u200B Si se aplica una tensión adecuada a los terminales, los electrones se recombinan con los huecos en la región de la unión p-n del dispositivo, liberando energía en forma de fotones. Este efecto se denomina electroluminiscencia, y el color de la luz generada (que depende de la energía de los fotones emitidos) viene determinado por la anchura de la banda prohibida del semiconductor. Los ledes son normalmente pequeños (menos de 1 mm2) y se les asocian algunas componentes ópticas para configurar un patrón de radiación.","");  // "Sigla de la expresión inglesa light-emitting diode, ‘diodo emisor de luz’, que es un tipo de diodo empleado en computadoras, paneles numéricos (en relojes digitales, calculadoras de bolsillo…), etc.", "Imagen");

        paginas[1]=new WikiPage("Fuente de poder", "En general, una fuente de poder es una fuente de energía, esta energía puede ser de varios típos, energía térmica, atómica, eléctrica, Etc. En el medio de la electrónica, la mayoria de la gente llama fuente de poder a un circuito eléctrico que convierte la electricidad de un voltaje de corriente alterna (Vca o Vac en inglés) a un voltaje de corriente directa (Vcd o Vdc en inglés).\n" +
                "\n" +
                "El voltaje de corriente alterna o Vca es, por ejemplo, el que obtenemos de la toma de corriente de nuestras casas, el voltaje y la corriente es alterna ya que su polaridad varia con una frecuencia especifica. Por ejemplo el voltaje nominal de México es de 110 volts a 60 Hz. El mismo que se usa en USA, pero diferente al que se tiene por ejemplo en Argentina, Japón o Europa.\n" +
                "El voltaje directo tiene una polaridad fija sin variación de frecuencia. Este voltaje es el que usa la gran mayoría de los circuitos electrónicos, ejemplo de este voltaje es el que se encuentra en las pilas alcalinas o las del tipo recargable que encontramos por ejemplo en el teléfono móvil.\n" +
                "La mayoría de los circuitos electrónicos usa voltaje directo, pero siempre tienen un tipo de fuente de poder que transforma el Vca a Vcd, la fuente puede ser externa o interna. Un cargador de baterías se considera una fuente de poder, por que transforma el Vca a Vcd para cargar la batería recargable.", "Imagen");

        paginas[2]=new WikiPage("Cautin", "Un soldador eléctrico, también conocido como cautín, es una herramienta eléctrica usada para soldar. Funciona convirtiendo la energía eléctrica en calor, que a su vez provoca la fusión del material utilizado en la soldadura, como por ejemplo el estaño.1\u200B2\u200B3\u200B Hay varios tipos de soldador eléctrico:\n" +
                "\n" +
                "Soldador de resistencia: la punta de cobre se calienta con una resistencia eléctrica, lo que la mantiene a una temperatura constante. Puede tener forma de martillo, punta, varilla u otras formas, en función del uso a que esté destinado.\n" +
                "Soldador instantáneo: de la forma típica pistola, tiene la característica de que su punta se calienta muy rápidamente, al presionar el botón, y sólo hay que soltar para que se solidifique el estaño o lo que se esté usando.", "Imagen");

        paginas[3]=new WikiPage("Relevador", "El relé (en francés, relais, “relevo”) o relevador es un dispositivo electromagnético. Funciona como un interruptor controlado por un circuito eléctrico en el que, por medio de una bobina y un electroimán, se acciona un juego de uno o varios contactos que permiten abrir o cerrar otros circuitos eléctricos independientes. Fue inventado por Joseph Henry en 1835.\n" +
                "Dado que el relé es capaz de controlar un circuito de salida de mayor potencia que el de entrada, puede considerarse, en un amplio sentido, como un amplificador eléctrico.", "Imagen");


        paginas[4]=new WikiPage("Arduino Nano", "El Arduino Nano es una pequeña y completa placa basada en el ATmega328 (Arduino Nano 3.0) o el ATmega168 en sus versiones anteriores (Arduino Nano 2.x) que se usa conectándola a una protoboard. Tiene más o menos la misma funcionalidad que el Arduino Duemilanove, pero con una presentación diferente. No posee conector para alimentación externa, y funciona con un cable USB Mini-B.\n" +
                "\n" +
                "Características\n" +
                "Microcontrolador: Atmel ATmega328 (ATmega168 versiones anteriores)\n" +
                "Tensión de Operación (nivel lógico): 5 V\n" +
                "Tensión de Entrada (recomendado): 7-12 V\n" +
                "Tensión de Entrada (límites): 6-20 V\n" +
                "Pines E/S Digitales: 14 (de los cuales 6 proveen de salida PWM\n" +
                "Entradas Analógicas: 8 Corriente máx por cada PIN de E/S: 40 mA\n" +
                "Memoria Flash: 32 KB (ATmega328) de los cuales 2KB son usados por el bootloader (16 KB – ATmega168)\n" +
                "SRAM: 2 KB (ATmega328) (1 KB ATmega168)\n" +
                "EEPROM: 1 KB (ATmega328) (512 bytes – ATmega168)\n" +
                "Frecuencia de reloj: 16 MHz\n" +
                "Dimensiones: 18,5mm x 43,2mm\n" +
                "Energía\n" +
                "El Arduino Nano posee selección automática de la fuente de alimentación y puede ser alimentado a través de:\n" +
                "\n" +
                "Una conexión Mini-B USB.\n" +
                "Una fuente de alimentación no regulada de 6-20V (pin 30).\n" +
                "Una fuente de alimentación regulada de 5V (pin 27)\n" +
                "Al alimentar el arduino a través del Mini USB, el CH340 proporciona una salida de 3.3V en el pin 16 de la placa. Por ende, cuando se conecta a una fuente externa (no USB), los 3.3V no se encuentran disponibles.", "Imagen");


        paginas[5]=new WikiPage("Arduino Uno", "La tarjeta Arduino Uno R3 incluso añade pins SDA y SCL cercanos al AREF. Es más, hay dos nuevos pines cerca del pin RESET. Uno es el IOREF, que permite a los shields adaptarse al voltaje brindado por la tarjeta. El otro pin no se encuentra conectado y está reservado para propósitos futuros. La tarjeta trabaja con todos los shields existentes y podrá adaptarse con los nuevos shields utilizando esos pines adicionales.\n" +
                "\n" +
                "El Arduino es una plataforma computacional física open-source basada en una simple tarjeta de I/O y un entorno de desarrollo que implementa el lenguaje Processing/Wiring. El Arduino Uno R3 puede ser utilizado para desarrollar objetos interactivos o puede ser conectado a software de tu computadora (por ejemplo, Flash, Processing, MaxMSP). El IDE open-source puede ser descargado gratuitamente (actualmente para Mac OS X, Windows y Linux).\n" +
                "\n" +
                "Características:\n" +
                "REF: A000066\n" +
                "Microcontrolador ATmega328.\n" +
                "Voltaje de entrada 7-12V.\n" +
                "14 pines digitales de I/O (6 salidas PWM).\n" +
                "6 entradas análogas.\n" +
                "32k de memoria Flash.\n" +
                "Reloj de 16MHz de velocidad.", "Imagen");

        //Aqui falta uno

        paginas[6]=new WikiPage("Arduino Mega", "El Arduino Mega está basado en el microcontrolador ATMega2560. Tiene 54 pines de entradas/salidas digitales (14 de las cuales pueden ser utilizadas como salidas PWM), 16 entradas analogas, 4 UARTs (puertos serial por hardware), cristal oscilador de 16 Mhz, conexión USB, jack de alimentación, conector ICSP y botón de reset. Incorpora todo lo necesario para que el microcontrolador trabaje; simplementa conectalo a tu PC por medio de un cable USB o con una fuente de alimentación externa. El Arduino Mega es compatible con la mayoría de los shields diseñados para Arduino Duemilanove, diecimila o UNO.\n" +
                "\n" +
                "Esta nueva versión de Arduino Mega 2560 adicionalmente a todas las características de su sucesor, el Arduino Mega ahora utiliza un microcontrolador ATMega8U2 en vez del chip FTDI. Esto permite mayores velocidades de transmisión por su puerto USB y no requiere drivers para Linux o MAC (archivo inf es necesario para Windows) además ahora cuenta con la capacidad de ser reconocido por el PC como un teclado, mouse, joystick, etc.\n" +
                "\n" +
                "Características:\n" +
                "REF: A000067\n" +
                "Microcontrolador ATmega2560.\n" +
                "Voltage de entrada de – 7-12V.\n" +
                "54 pines digitales de Entrada/Salida (14 de ellos son salidas PWM).\n" +
                "16 entradas análogas.\n" +
                "256k de memoria flash.\n" +
                "Velocidad del relog de 16Mhz", "Imagen");


        paginas[7]=new WikiPage("Protoboard", "Una placa de pruebas o placa de inserción (en inglés Protoboard o Breadboard) es un tablero con orificios que se encuentran conectados eléctricamente entre sí de manera interna, habitualmente siguiendo patrones de líneas, en el cual se pueden insertar componentes electrónicos y cables para el armado y prototipado de circuitos electrónicos y sistemas similares. Está hecho de dos materiales, un aislante, generalmente un plástico, y un conductor que conecta los diversos orificios entre sí. Uno de sus usos principales es la creación y comprobación de prototipos de circuitos electrónicos antes de llegar a la impresión mecánica del circuito en sistemas de producción comercial.", "Imagen");


        paginas[8]=new WikiPage("Resistencias", "Los tipos de resistencias más utilizadas son:\n" +
                "\n" +
                "- Resistencias fijas: aglomeradas, de película de carbón, de película metálica y bobinadas.\n" +
                "- Resistencias variables: bobinadas, de película.\n" +
                "- Resistencias dependientes o variables: LDR, VDR, PTC, NTC.\n" +
                "\n" +
                "La construcción de un tipo u otro de resistencias nace por la necesidad de cumplir unas especificaciones de bajo/alto valor óhmico, potencia, etc.\n" +
                "\n" +
                "Para el cálculo de una resistencia no basta con calcular su valor óhmico también es necesario conocer la potencia que puede soportar y, por tanto, el calor que es capaz de disipar dicha resistencia, la mayor o menor potencia repercute en su tamaño a más potencia más grandes son las resistencias, la unidad es el vatio o fracciones de vatio como puede ser; 1/4w, ½ w, 1w, 1,5w, 5w, etc.\n" +
                "\n" +
                "Las resistencias de carbón aglomerado se fabrican para 1/8 w, ¼ w, ½ w, 1w y 2w.\n" +
                "Las resistencias de película de carbón se fabrican para 1/10 w (o 1/8 w), ¼ w, 1/3 w, ½ w, 1w, 1,5 w, 2 w.\n" +
                "Las resistencias de película metálica se fabrican normalmente para ¼ w y ½ w.\n" +
                "Las resistencias bobinadas existe una gama muy amplia de fabricación con potencias de disipación que van desde 1 w hasta los 130 w o bajo pedido de más potencia.\n" +
                "\n" +
                "Como ya sabemos la unidad de medida de las resistencias es el ohmio, pero en la aplicación práctica se suelen representar del siguiente modo:\n" +
                "\n" +
                "- 2k2 = 2200 Ω\n" +
                "- 1,5k = 1500 Ω\n" +
                "- 4k7 = 4,7k = 4700 Ω\n" +
                "- 10k = 10000 Ω\n" +
                "\n" +
                "En este ejemplo he puesto la k pero para M (de mega) exactamente igual 2M2 = 2200000 Ω\n" +
                "\n" +
                "A partir de lo explicado se nos plantea la siguiente pregunta, ¿cuáles son las características esenciales de una resistencia? Dependiendo para qué queramos utilizarlas, si en electrónica de potencia, electrónica de telecomunicaciones, etc., pueden existir muchas características aquí tan solo trataré las más básicas;\n" +
                "\n" +
                "- El valor nominal de la resistencia en Ω.\n" +
                "- La tolerancia de este valor, normalmente en %.\n" +
                "- La carga permisible o potencia de la resistencia.\n" +
                "\n" +
                "Como en casi todo las normas han definido los valores nominales de las resistencias que se fabrican mediante números o mediante un código de colores.\n" +
                "\n" +
                "La Comisión Electrotécnica Internacional (CEI, sus siglas en inglés son IEC) determinó el número de valores por década para una serie de valores, por ejemplo;\n" +
                "\n" +
                "- E6 20% = 6 valores entre 1 y 10.\n" +
                "- E12 10%= 12 valores entre 1 y 10.\n" +
                "- E24 5%= 24 valores entre 1 y 10.\n" +
                "\n" +
                "El % de las series nos indica la tolerancia del valor de la resistencia, por ejemplo, si tenemos;\n" +
                "R1 = 100 Ω 10% su valor puede oscilar entre 90 …110 Ω", "Imagen");


        paginas[9]=new WikiPage("Circuito Impreso", "En electrónica, “placa de circuito impreso” (del inglés: Printed Circuit Board, PCB), es la superficie constituida por caminos, pistas o buses de material conductor laminadas sobre una base no conductora. El circuito impreso se utiliza para conectar eléctricamente a través de las pistas conductoras, y sostener mecánicamente, por medio de la base, un conjunto de componentes electrónicos. Las pistas son generalmente de cobre mientras que la base se fabrica generalmente de resinas de fibra de vidrio reforzada, Pertinax, cerámica, plástico, teflón o polímeros como la baquelita.\n" +
                "También se fabrican de celuloide con pistas de pintura conductora cuando se requiere que sean flexibles para conectar partes con movimiento entre sí, evitando los problemas del cambio de estructura cristalina del cobre que hace quebradizos los conductores de cables y placas.", "Imagen");


        paginas[10]=new WikiPage("Integrado 555", "El temporizador IC 555 es un circuito integrado (chip) que se utiliza en la generación de temporizadores, pulsos y oscilaciones. El 555 puede ser utilizado para proporcionar retardos de tiempo, como un oscilador, y como un circuito integrado flip flop. Sus derivados proporcionan hasta cuatro circuitos de sincronización en un solo paquete.\n" +
                "Fue introducido en 1971 por Signetics, el 555 sigue siendo de uso generalizado debido a su facilidad de uso, precio bajo y la estabilidad. Muchas empresas los fabrican en versión de transistores bipolares y también en CMOS de baja potencia. A partir de 2003, se estimaba que mil millones de unidades se fabricaban cada año. Este circuito suele ser utilizado para trabajos sencillos como trabajos escolares, debido a su bajo costo y facilidad de trabajar con él.", "Imagen");


        paginas[11]=new WikiPage("Integrado lm741", "El LM741CN es un amplificador operacional de propósito general que cuenta con un rendimiento mejorado sobre los estándares de la industria como el LM709.  El LM741  ofrece muchas características que hacen que su aplicación sea casi a prueba de protección de sobrecarga en la entrada y la salida, no latch-up cuando se supera el rango de modo común, así como la libertad de oscilaciones.\n" +
                "Son repuestos de inserción directa para 709C, LM201, MC1439 y 748 en la mayoría de las aplicaciones. Estos amplificadores cuentan con numerosas funciones que hacen que su aplicación sea prácticamente  protección infalible contra sobrecarga en entrada y salida, ausencia de enclavamiento cuando se excede el rango de modo común y libre de oscilaciones.", "Imagen");


        paginas[12]=new WikiPage("Compuerta OR", "En el Algebra de Boole esta es una suma. Esta compuerta permite que con cualquiera de sus entradas que este en estado binario 1, su salida pasara a un estado 1 también. No es necesario que todas sus entradas estén accionadas para conseguir un estado 1 a la salida pero tampoco causa algún inconveniente. Para lograr un estado 0 a la salida, todas sus entradas deben estar en el mismo valor de 0. Se puede interpretar como dos interruptores en paralelo, que sin importar cual se accione, será posible el paso de la corriente." +
                "\n" +
                "El servomotor es un motor eléctrico lleva incorporado un sistema de regulación que puede ser controlado tanto en velocidad como en posición. ", "Imagen");


        paginas[13]=new WikiPage("Compuerta NOR", "La compuerta OR también tiene su versión inversa. Esta compuerta cuando tiene sus entradas en estado 0 su salida estará en 1, pero si alguna de sus entradas pasa a un estado 1 sin importar en qué posición, su salida será un estado 0.", "Imagen");

        //Faltan más.


        paginas[14]=new WikiPage("Compuerta AND","Esta compuerta es representada por una multiplicación en el Algebra de Boole. Indica que es necesario que en todas sus entradas se tenga un estado binario 1 para que la salida otorgue un 1 binario. En caso contrario de que falte alguna de sus entradas con este estado o no tenga si quiera una accionada, la salida no podrá cambiar de estado y permanecerá en 0. Esta puede ser simbolizada por dos o más interruptores en serie de los cuales todos deben estar activos para que esta permita el flujo de la corriente.","Img");


        paginas[15]=new WikiPage("Compuerta NAND","También denominada como AND negada, esta compuerta trabaja al contrario de una AND ya que al no tener entradas en 1 o solamente alguna de ellas, esta concede un 1 en su salida, pero si esta tiene todas sus entradas en 1 la salida se presenta con un 0.","Img");

        paginas[16]=new WikiPage("Compuerta NOT","En este caso esta compuerta solo tiene una entrada y una salida y esta actúa como un inversor. Para esta situación en la entrada se colocara un 1 y en la salida otorgara un 0 y en el caso contrario esta recibirá un 0 y mostrara un 1. Por lo cual todo lo que llegue a su entrada, será inverso en su salida.","Img");

        paginas[17]=new WikiPage("Compuerta XOR","También llamada OR exclusiva, esta actúa como una suma binaria de un digito cada uno y el resultado de la suma seria la salida. Otra manera de verlo es que con valores de entrada igual el estado de salida es 0 y con valores de entrada diferente, la salida será 1.","Img");


        paginas[18]=new WikiPage("Compuerta XNOR","La compuerta XOR, ya que cuando las entradas sean iguales se presentara una salida en estado 1 y si son diferentes la salida será un estado 0.","Img");


        paginas[19]=new WikiPage("Osciloscopio","Un osciloscopio es un instrumento de visualización electrónico para la representación gráfica de señales eléctricas que pueden variar en el tiempo. Es muy usado en electrónica de señal, frecuentemente junto a un analizador de espectro.\n" +
                "\n" +
                "Presenta los valores de las señales eléctricas en forma de coordenadas en una pantalla, en la que normalmente el eje X (horizontal) representa tiempos y el eje Y (vertical) representa tensiones. La imagen así obtenida se denomina oscilograma. Suelen incluir otra entrada, llamada \"eje THRASHER\" o \"Cilindro de Wehnelt\" que controla la luminosidad del haz, permitiendo resaltar o apagar algunos segmentos de la traza.\n" +
                "\n" +
                "Los osciloscopios, clasificados según su funcionamiento interno, pueden ser tanto analógicos como digitales, siendo el resultado mostrado idéntico en cualquiera de los dos casos, en teoría.","Img");

        paginas[20]=new WikiPage("Estaño","Elemento químico de número atómico 50, masa atómica 118,69 y símbolo Sn ; es un metal de color blanco plateado, muy dúctil y maleable y de estructura cristalina, que se encuentra en la casiterita y se usa en forma de hojalata como capa protectora para recipientes de cobre, para fabricar latas y objetos similares, en aleaciones, en soldadura, en la industria aeroespacial y como ingrediente de algunos insecticidas.","Img");

        paginas[21]=new WikiPage("Tip 31","El TIP31C es un transistor de potencia NPN de tecnología de isla base en un paquete de plástico TO-220 con mejores rendimientos que el estándar industrial TIP31C que hace que este dispositivo sea adecuado para aplicaciones de audio, alimentación lineal y conmutación. El tipo de PNP es TIP32C.","Img");

        paginas[22]=new WikiPage("Tip 32","Transistor PNP de media potencia, IC max: 3 A, IC pico max: 5 A, IB max: 1 A, PTOT: 40 W, VCEO: 100 V, VCBO: 100 V, VEBO: 5 V, hFE: 10 a 50  (@ IC=3 A, VCE=4 V), Alta velocidad de suicheo, Complementario: TIP31C, Encapsulado: TO-220","Img");

        paginas[23]=new WikiPage("BJT","El transistor de unión bipolar (del inglés bipolar junction transistor, o sus siglas BJT) es un dispositivo electrónico de estado sólido consistente en dos uniones PN muy cercanas entre sí, que permite aumentar la corriente y disminuir el voltaje, además de controlar el paso de la corriente a través de sus terminales. La denominación de bipolar se debe a que la conducción tiene lugar gracias al desplazamiento de portadores de dos polaridades (huecos positivos y electrones negativos), y son de gran utilidad en gran número de aplicaciones; pero tienen ciertos inconvenientes, entre ellos su impedancia de entrada bastante baja.\n" +
                "Un transistor de unión bipolar está formado por dos Uniones PN en un solo cristal semiconductor, separados por una región muy estrecha. De esta manera quedan formadas tres regiones: \n" +
                "Emisor, que se diferencia de las otras dos por estar fuertemente dopada, comportándose como un metal. Su nombre se debe a que esta terminal funciona como emisor de portadores de carga.\n" +
                "Base, la intermedia, muy estrecha, que separa el emisor del colector.\n" +
                "Colector, de extensión mucho mayor.","Img");

        paginas[24]=new WikiPage("PLC","El “PLC” (Programmable Logic Controller, por sus siglas en inglés)  es un dispositivo electrónico que se programa para realizar acciones de control automáticamente.\n" +
                "Un PLC es un cerebro que activa componentes de maquinarias para ejecuten tareas que pudieran ser peligrosas para el ser humano o muy lentas o imperfectas.\n" +
                "Los PLC se usan en la actualidad en todo tipo de aplicaciones industriales, resolviendo requerimientos en control de procesos y secuencias de la maquinaria, dentro del sector industrial y ha penetrado las aplicaciones domésticas y comerciales con mayor auge en la última década.","Img");

        paginas[25]=new WikiPage("Display 7 Segmentos","El display 7 Segmentos es un dispositivo opto-electrónico que permite visualizar números del 0 al 9. Existen dos tipos de display, de cátodo común y de ánodo común. Este tipo de elemento de salida digital o display, se utilizabá en los primeros dispositivos electrónicos de la década de los 70’s y 80’s. Hoy en día es muy utilizadon en proyectos educativos o en sistemas vintage. También debido a su facilidad de uso, mantenimiento y costo, son utilizados en relojes gigantes o incluso como marcadores en algunos tipos de canchas deportivas.","Img");

        paginas[26]=new WikiPage("Cables Dupont","Un cable puente para prototipos (o simplemente puente para prototipos), es un cable con un conector en cada punta (o a veces sin ellos), que se usa normalmente para interconectar entre sí los componentes en una placa de pruebas. P.E.: se utilizan de forma general para transferir señales eléctricas de cualquier parte de la placa de prototipos a los pines de entrada/salida de un microcontrolador. \n" +
                "Los cables puente se fijan mediante la inserción de sus extremos en los agujeros previstos a tal efecto en las ranuras de la placa de pruebas, la cual debajo de su superficie tiene unas planchas interiores paralelas que conectan las ranuras en grupos de filas o columnas según la zona. Los conectores se insertan en la placa de prototipos, sin necesidad de soldar, en los agujeros que convengan para el conexionado del diseño.","Img");

        paginas[27]=new WikiPage("Cable UTP","Un cable es un cordón que está resguardado por alguna clase de recubrimiento y que permite conducir electricidad o distintos tipos de señales. Los cables suelen estar confeccionados con aluminio o cobre.","Img");

        paginas[28]=new WikiPage("Octoacopladores","Un optoacoplador, también llamado optoaislador o aislador acoplado ópticamente, es un dispositivo de emisión y recepción que funciona como un interruptor activado mediante la luz emitida por un diodo LED que satura un componente optoelectrónico, normalmente en forma de fototransistor o fototriac.","Img");

        paginas[29]=new WikiPage("Sensor de Humedad","Los sensores de humedad se aplican para detectar el nivel de líquido en un depósito, o en sistemas de riego de jardines para detectar cuándo las plantas necesitan riego y cuándo no. Permiten medir la temperatura de punto de rocío, humedad absoluta y relación de mezcla.","Img");

        paginas[30]=new WikiPage("Sensor de A proximidad","Un sensor de proximidad es un transductor que detecta objetos o señales que se encuentran cerca del elemento sensor.\u200B Existen varios tipos de sensores de proximidad según el principio físico que utilizan.","Img");

        paginas[31]=new WikiPage("Sensor de Humo","Un detector de humo es una alarma que detecta la presencia de humo en el aire y emite una señal acústica avisando del peligro de incendio. Atendiendo al método de detección que usan pueden ser de varios tipos: \n" +
                "Detectores iónicos: utilizados para la detección de gases y humos de combustión que no son visibles a simple vista.\n" +
                "Detectores ópticos: detectan los humos visibles mediante la absorción o difusión de la luz.\n" +
                "Cuando el aparato se encuentra conectado con una central que activa las alarmas visuales o sonoras se denomina «detector de humo». En cambio, un aparato individual que recibe su energía a través de baterías y que actúa de forma independiente de una central se denomina «alarma de humo».","Img");

        paginas[32]=new WikiPage("Sensor Infrarrojo","Particularmente, el sensor infrarrojo es un dispositivo optoelectrónico capaz de medir la radiación electromagnética infrarroja de los cuerpos en su campo de visión. Todos los cuerpos emiten una cierta cantidad de radiación, esta resulta invisible para nuestros ojos pero no para estos aparatos electrónicos, ya que se encuentran en el rango del espectro justo por debajo de la luz visible.","Img");

        paginas[33]=new WikiPage("Sensor de Calor","Un sensor de flujo de calor es un transductor que genera una señal eléctrica que es proporcional al calor total aplicado en la superficie del sensor. Los sensores de flujo de calor se conocen bajo nombres diferentes, como transductores de flujo de calor, o bien placas o platos de flujo de calor. Existen además varios instrumentos que son realmente sensores de flujo de calor de único propósito, como los piranómetros (para la medición de la radiación solar) y los calibradores de Schmidt-Boelter (para la medida del flujo de calor del fuego). En el SI la unidad de flujo de calor es el vatio por metro cuadrado.","Img");

        paginas[34]=new WikiPage("Giroscopio","EL MPU6050 es una unidad de medición inercial o IMU (Inertial Measurment Units) de 6 grados de libertad (DoF) pues combina un acelerómetro de 3 ejes y un giroscopio de 3 ejes. Este sensor es muy utilizado en navegación, goniometría, estabilización, etc.","Img");

        paginas[35]=new WikiPage("Módulo Bluetooth","Bluetooth es una especificación industrial para Redes Inalámbricas de Área Personal (WPAN) creado por Bluetooth Special Interest Group, Inc. que posibilita la transmisión de voz y datos entre diferentes dispositivos mediante un enlace por radiofrecuencia en la banda ISM de los 2.4 GHz. Los principales objetivos que se pretenden conseguir con esta norma son: \n" +
                "Facilitar las comunicaciones entre equipos móviles.\n" +
                "Eliminar los cables y conectores entre estos.\n" +
                "Ofrecer la posibilidad de crear pequeñas redes inalámbricas y facilitar la sincronización de datos entre equipos personales.\n" +
                "Los dispositivos que con mayor frecuencia utilizan esta tecnología pertenecen a sectores de las telecomunicaciones y la informática personal, como PDA, teléfonos móviles, ordenadores portátiles, ordenadores personales, impresoras o cámaras digitales.","Img");

        paginas[36]=new WikiPage("Sensor de Colores","Los sensores de color detectan el color de una superficie. Estos sensores emiten luz (roja, verde, azul) sobre los objetos que deben analizarse, calculan las coordenadas cromáticas a partir de la radiación reflejada y las comparan con los valores cromáticos de referencia guardados. Si los valores cromáticos se encuentran dentro de la banda de tolerancia de ajustada, se activa una salida conmutada.","Img");

        paginas[37]=new WikiPage("Diodo","Un diodo es un componente electrónico de dos terminales que permite la circulación de la corriente eléctrica a través de él en un solo sentido, \u200B bloqueando el paso si la corriente circula en sentido contrario, no solo sirve para la circulación de corriente eléctrica sino que este la controla y resiste.","Img");

        paginas[38]=new WikiPage("Diodo zener","El diodo Zener es un diodo de silicio fuertemente dopado\u200B que se ha construido para que funcione en las zonas de rupturas, recibe ese nombre por su inventor Clarence Melvin Zener. \n" +
                "Durante el ciclo positivo, una vez que la tensión de entrada alcanza el valor de la tensión zener (Vz), la tensión de salida es constante durante un cierto tiempo hasta que la tensión comienza a disminuir. Ahora, durante el medio ciclo negativo, el diodo zener se encuentra en polarización directa.","Img");

        paginas[39]=new WikiPage("Bobina","Un inductor, bobina o reactor es un componente pasivo de un circuito eléctrico que, debido al fenómeno de la autoinducción, almacena energía en forma de campo magnético.\u200B","Img");

        paginas[40]=new WikiPage("Microcontrolador","Un microcontrolador es un circuito integrado programable, capaz de ejecutar las órdenes grabadas en su memoria. Está compuesto de varios bloques funcionales, los cuales cumplen una tarea específica.","Img");

        paginas[41]=new WikiPage("Foco","En iluminación, el foco es un elemento óptico destinado a proyectar la luz de una lámpara hacia una región concreta. \n" +
                "Principalmente se usan para iluminar instalaciones deportivas, alumbrado ornamental de edificios emblemáticos, publicidad y seguridad. También son elementos esenciales en las artes escénicas como el teatro, el cine, la televisión u otros espectáculos en vivo.","Img");

        paginas[42]=new WikiPage("Potenciómetro","Un potenciómetro es uno de los dos usos que posee la resistencia o resistor variable mecánica. El usuario al manipularlo, obtiene entre el terminal central y uno de los extremos una fracción de la diferencia de potencial total, se comporta como un divisor de tensión o voltaje.","Img");


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