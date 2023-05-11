
public class Antolnc{
 public static void main(String[] args){
int i = 1;
prt("i : " + i);
prt("pre-incremento ++i: " + ++i); // Pre-Incremento
prt("post-incremento i++: " + i++); // Post-Incremento
prt("i : " + i);
prt("pre-incremento --i: " + --i); // Pre-Decremento
prt("post-incremento i--: " + i--); // Post-Decremento
prt("i : " + i);
 }
 // Metodo para Impresion
 static void prt(String s) {
System.out.println(s);
 }
}