
package boletin19;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIELCASTELAO\oyagualendara
 */
public class Boletin19 {
 public static void main(String[] args) {
int[][]goles=new int[20][36];
Metodos obx = new Metodos();
String[]equipos={"VCF","ATM","MLL","ALV","BAR","GTF","VIL","LUD","GRA","VLL","SFC","ESP","LEG","RBB",
"EIB","RSO","ATH","OSA","RMA","CEL"};
obx.ordenarEquipos(equipos);
String[]equiposOrdenados={"VCF","ATM","MLL","ALV","BAR","GTF","VIL","LUD","GRA","VLL","SFC","ESP","LEG","RBB",
"EIB","RSO","ATH","OSA","RMA","CEL"};
String[]xornadas=new String[36];
xornadas=obx.crearXornadas(xornadas);

int opcion;
do{
opcion = Integer.parseInt(JOptionPane.showInputDialog("     MENU\n1--> Crear matriz"
+"\n2--> Amosar goles \n3--> Amosar todo\n4--> Amosar equ ordeados por goles totales"
        + "\n5--> Amosar max. goleadores por x.  \n6--> Amosar maximos goleadores  "
        + "\n7--> Busqueda por equ/x \n8--> Sair \n Teclea a opcion"));
switch(opcion){
 case 1:
    goles= obx.crearMatriz(goles);
    break;
 case 2:
    obx.amosar(goles);
    break;
 case 3:
     obx.amosarTodo(goles,equipos,xornadas);
     break;
 case 4:
     obx.ordencrecenteArrays(goles,equiposOrdenados);
     break;
 case 5:
     obx.maximoGoleadorXornada(goles, xornadas, equipos);
     break;
 case 6:
     obx.maximosGoleadores(goles, xornadas, equipos);
     break;
 case 7:
     obx.consultarGoles(goles, xornadas, equipos);
     break;
 case 8:
    obx.sair();
 }
}while(opcion<8);
        
}

    
}
       