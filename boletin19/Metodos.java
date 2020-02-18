
package boletin19;
import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author DANIELCASTELAO\oyagualendara
 */
public class Metodos {
  public int[][] crearMatriz(int[][] taboa){
    for (int f=0;f<taboa.length;f++){
      for(int c=0;c<taboa[f].length;c++){
      taboa[f][c]=(int)(Math.random()*(9+1));
      }    
    }
    System.out.println("Array Creado");    
return taboa;
}
public String[] crearXornadas(String[]xornadas){
for(int i=0;i<xornadas.length;i++){
xornadas[i]="x"+(i+1);    
}
return xornadas;    
}

public void amosar(int[][]taboa){
for (int f=0;f<taboa.length;f++){
    System.out.println("\n");
      for(int c=0;c<taboa[f].length;c++){
          System.out.print(taboa[f][c]+"  ");
      }    
    }
    System.out.println("");
}

public void amosarTodo(int[][]taboa,String[]equipos,String[]xornadas){
    System.out.print("\nEq/Xor");
    for(int i=0;i<xornadas.length;i++){
     if(i<10)   
    System.out.print("   "+xornadas[i]);    
    else
    System.out.print("  "+xornadas[i]);      
    }
  for (int f=0;f<taboa.length;f++){
    System.out.print("\n "+equipos[f]);
      System.out.print("    ");
      for(int c=0;c<taboa[f].length;c++){
          System.out.print("  "+taboa[f][c]+"  ");
      }    
    }
    System.out.println("");   
}

public void sair(){
System.exit(0);
}

public void ordencrecenteArrays(int[][]taboa,String[]equiposOrdenados){
int[]totalGoles= new int[taboa.length];
 for (int f=0;f<taboa.length;f++){
      for(int c=0;c<taboa[f].length;c++){
         totalGoles[f]=totalGoles[f]+taboa[f][c];  
         
      }
      
    }
 
int aux;
String auxEqu;
for (int i=0;i<totalGoles.length-1;i++){
    for(int j=i+1;j<equiposOrdenados.length;j++){
    if(totalGoles[i]>totalGoles[j]){
    aux = totalGoles[i];
    totalGoles[i]=totalGoles[j];
    totalGoles[j]=aux;
    auxEqu = equiposOrdenados[i];
    equiposOrdenados[i]=equiposOrdenados[j];
    equiposOrdenados[j]=auxEqu;
    }
    }    
}
    System.out.println("\n\nTotal de goles marcados en orde ascendente:");   
for (int j=0;j<equiposOrdenados.length;j++){
    System.out.println(equiposOrdenados[j]+"  "+totalGoles[j]);    
}


}

public void ordenarEquipos(String[] equipos){
Arrays.sort(equipos);
}

public void maximoGoleadorXornada(int[][]taboa,String[]xornadas,String[]equipos){
    int maxGoles;
    String equipoMax[]=new String[equipos.length];
        
    for(int i=0;i<taboa[0].length;i++){
    maxGoles=0;
        for(int j=0;j<taboa.length;j++){
            if(maxGoles<=taboa[j][i]){
            maxGoles=taboa[j][i];
            equipoMax[j]=equipos[j];
            }
        }
    System.out.println("\nNa xornada "+(i+1)+" os maximos goleadores foron (con "+maxGoles+" goles)" +":");
        for(int k=0;k<taboa.length;k++){
            if(maxGoles==taboa[k][i]){
            System.out.println(equipoMax[k]);
            }
        }
    }
        System.out.println("");
}

public void maximosGoleadores(int[][]taboa,String[]xornadas,String[]equipos){
    int maxGoles=0;
    for(int i=0;i<xornadas.length;i++){
        for(int j=0;j<taboa.length;j++){
            if(maxGoles<=taboa[j][i]){
            maxGoles=taboa[j][i];
            }
        }

    }
    System.out.println("Os maximos goleadores foron:");
    for (int x = 0; x < taboa[0].length; x++) {
    
        for (int y = 0; y <taboa.length; y++) {
            if (taboa[y][x]==maxGoles){
                System.out.println(equipos[y]+" na "+xornadas[x]);
            }    
        }
    }


}

public void consultarGoles(int[][]taboa,String[]xornadas,String[]equipos){
String equipoBuscar = JOptionPane.showInputDialog("Introduce o equipo a buscar(ALV,ATH,ATM...):");
String xornadaBuscar = JOptionPane.showInputDialog("Introduce a xornada a buscar(x1,x2,x3...):");
int auxEquipo=0,auxXor=0;
int i,j;
for (i = 0; i <equipos.length ; i++) {
    if(equipos[i].equals(equipoBuscar)){
    auxEquipo=i;   
    } 
    }
    for (j = 0; j <xornadas.length; j++) {
    if(xornadas[j].equals(xornadaBuscar)){
    auxXor=j;    
    }    
    }
    System.out.println("O "+equipos[auxEquipo]+" na "+xornadas[auxXor]+" marcou "+taboa[auxEquipo][auxXor]+" goles");



    
}



}