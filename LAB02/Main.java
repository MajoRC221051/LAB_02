import java.util.Scanner;
import java.util.ArrayList;
// María José Ramírez - 221051 - POO

public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
   
        System.out.println("Software memorias");

        int opcion=-1;
        Scanner scanner = new Scanner(System.in);

        // Creating an array list of objects.
        ArrayList<Navegadores> memory =new ArrayList<Navegadores>();
        ArrayList<String> memoriasR=new ArrayList<String>();
        ArrayList<Navegadores> cola=new ArrayList<Navegadores>();
        Memory memorias =new Memory("", 0, 0);

        // Asking the user to input a number between 1 and 6.
        int to=1;
        String type="";
        double tamañoTo =1, tamaño = 4, aux, bloques;
        System.out.println("Ingresa el tipo de memoria que deseas? 1. SDR o 2. DDR");
        to=scanner.nextInt();
        System.out.println("Por favor, ingrese el tamaño de sus memorias: 1. 4GB, 2. 8 GB, 3. 12 GB, 4. 16 GB, 5. 32 GB, 6. 64 GB");
        tamañoTo =scanner.nextDouble();
        if(tamañoTo==1){
            tamaño=4;
        }else if(tamañoTo==2){
            tamaño=8;
        }else if(tamañoTo==3){
            tamaño=12;
        }else if(tamañoTo==4){
            tamaño=16;
        }else if(tamañoTo==5){
            tamaño=32;
        }else if(tamañoTo==6){
            tamaño=64;
        }
        //
        double tamañoGlobal=tamaño*1024;
        double limiteGlobal=tamañoGlobal;
        double bloquesGlobal=tamañoGlobal/64;
        //
        if(to==1){
            type="SDR";
        }else{
            type="DDR";
        }
        memorias.setType(type);
        memorias.setTamaño(tamaño);
        aux= tamaño/64;
        bloques= Math.ceil(aux);
        memorias.setBloques(bloques);



        //Inicializar
        Navegadores programasNav1=new Navegadores("Google chrome", 2070, 8);
        Navegadores programasNav5=new Navegadores("Telegmemory", 128, 8);
        Navegadores programasNav2=new Navegadores("Firefox", 64, 16);
        Navegadores programasNav3=new Navegadores("Zoom", 320, 60);
        Navegadores programasNav9=new Navegadores("Word", 1024, 10);
        Navegadores programasNav6=new Navegadores("Visual Studio Code", 320, 60);
        Navegadores programasNav4=new Navegadores("Whatsapp", 128, 8);
        Navegadores programasNav7=new Navegadores("Gmail", 32, 15);
        Navegadores programasNav8=new Navegadores("Contactos", 32, 8);

        memory.add(programasNav1);
        memory.add(programasNav2);
        memory.add(programasNav3);
        memory.add(programasNav4);
        memory.add(programasNav5);
        memory.add(programasNav6);
        memory.add(programasNav7);
        memory.add(programasNav8);
        memory.add(programasNav9);
        memoriasR.add("Google Chrome");
        memoriasR.add("Firefox");
        memoriasR.add("Zoom");
        memoriasR.add("Whatsapp");
        memoriasR.add("Telegmemory");
        memoriasR.add("Visual Studio");
        memoriasR.add("Mail");
        memoriasR.add("Contactos");
        memoriasR.add("Word");
        double suma=2070+64+320+128+128+320+32+32+1024;
        double sumabloques=8+16+60+8+8+60+15+8+10;
        tamañoGlobal-=suma;
        bloquesGlobal-=sumabloques;

        while(opcion!=14){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("-----------MENU----------");
            System.out.println("1 Abrir Navegadores");
            System.out.println("2. Saber la memoria total del programa");
            System.out.println("3. Saber cuánta memoria hay disponible");
            System.out.println("4. Saber cuánta memoria hay  en uso");
            System.out.println("5. Ejecutar navegadores");
            System.out.println("6. Ver cuántos navegadores estan en cola");
            System.out.println("7. Saber espacios que ocupa un Navegador");
            System.out.println("9. Determinar que Navegadores pueden ingresarse a la cola");
            System.out.println("10. Aumentar o disminuir");
            System.out.println("11. Cerrar Navegadores");
            System.out.println("\n\nIngresa la opcion que desees");
            opcion=scanner.nextInt();
            System.out.println("-------------------------------------------------------------------");
            if(opcion==1){
           

                Navegadores programasNav=new Navegadores("nombre", 0, 0);
                String nombre;
                double spaces,aux2;
                Double bloques2;
                System.out.println("Ingresa el nombre del programasNav que deseas: ");
                nombre=scanner.next();
                System.out.println("Ingresa los espacios que ocupa este: ");
                spaces=scanner.nextDouble();

                aux2=spaces/64;
                bloques2=Math.ceil(aux2);
                if(bloques2>bloquesGlobal && tamañoGlobal>spaces){

                
                programasNav.setNombre(nombre);
                programasNav.setSpaces(spaces);
                programasNav.setBloques(bloques2);
                memory.add(programasNav);
                memoriasR.add(nombre);
                tamañoGlobal-=spaces;
                }else{
                    System.out.println("No se puede ingresar el programasNav, se pondra en cola ");
                    programasNav.setNombre(nombre);
                    programasNav.setSpaces(spaces);
                    programasNav.setBloques(bloques2);
                    cola.add(programasNav);
                }
                
            }else if(opcion==2){
                //memory total 
                System.out.println("memory total: "+limiteGlobal);
            }else if(opcion==3){
                //memory disponible
                System.out.println("memory disponible "+tamañoGlobal);
            }else if(opcion==4){
                //memory en uso
                System.out.println("memory en uso: "+(limiteGlobal-tamañoGlobal));
            }else if(opcion==5){
                for(int i=0;i<memory.size();i++){
                    System.out.print(i+1+". ");
                    System.out.println(memory.get(i));
                }
                System.out.println("memorias restante: "+tamañoGlobal+" MB");
           // Printing the elements of the queue.
            }else if(opcion==6){
                for(int i=0;i<cola.size();i++){
                    System.out.print(i+1+". ");
                    System.out.println(cola.get(i));
                }
            // Printing the spaces that the user has inputed.
            }else if(opcion==7){

                int posicion=0;
                for(int i=0;i<memory.size();i++){
                    System.out.print(i+1+". ");
                    System.out.println(memory.get(i).getNombre());
                }
                posicion=scanner.nextInt();
                if(posicion>0 && posicion<=memory.size()){
                    System.out.print("spaces que ocupa "+memory.get(posicion-1).getNombre()+": ");
                    System.out.println(memory.get(posicion-1).getSpaces());
                }

                 
            }else if(opcion==8){

                // A menu for a program that simulates a memory.
                ArrayList<Navegadores> lista=new ArrayList<Navegadores>();
                ArrayList<Navegadores> lista2=new ArrayList<Navegadores>();
                if(cola.size()>0){
                    for(int i=0;i<cola.size();i++){
                        if(cola.get(i).getBloques()<bloquesGlobal){
                            lista.add(cola.get(i));
                            cola.remove(i);
                        }else{
                            lista2.add(cola.get(i));
                        }
                    }
                    System.out.println("###################### SI SE PUEDEN ######################");
                    for(int k=0;k<lista.size();k++){
                        System.out.print(k+1+". ");
                        System.out.println(lista.get(k));
                    }
                    System.out.println("###################### NO SE PUEDEN ######################");
                    for(int k=0;k<lista2.size();k++){
                        System.out.print(k+1+". ");
                        System.out.println(lista2.get(k));
                    }
                }else{
                    System.out.println("No hay Navegadores en la cola");
                }
            }else if(opcion==9){

                double contador=0;

                double bloque1=64;
                double bloque2=128;
                double bloque3=192;
                double bloque4=256;
                double bloque5=512;
                double bloque6=1024;
                if(memorias.getType().equalsIgnoreCase("SDR")){
                    if(cola.size()>0){
                        for(int i=0;i<cola.size();i++){
                            contador+=cola.get(i).getBloques();
                        }
                    
                    if(bloque1<contador && contador<bloque2){
                        memorias.setTamaño(8);
                        memorias.setBloques(128);
                    }else if(bloque2<contador && contador<bloque3){
                        memorias.setTamaño(12);
                        memorias.setBloques(192);
                    }else if(bloque3<contador && contador<bloque4){
                        memorias.setTamaño(16);
                        memorias.setBloques(256);
                    }else if(bloque4<contador && contador<bloque5){
                        memorias.setTamaño(32);
                        memorias.setBloques(512);
                    }else if(bloque5<contador && contador<bloque6){
                        memorias.setTamaño(64);
                        memorias.setBloques(1024);
                    }
                        System.out.println("Ha aumentado el tamaño: "+memorias.getTamaño()+", bloques: "+memorias.getBloques());
                    }else{
                        double contador2=memorias.getTamaño()-tamañoGlobal;
                        if(bloque1<contador2 && contador2<bloque2){
                            memorias.setTamaño(4);
                            memorias.setBloques(64);
                        }else if(bloque2<contador2 && contador2<bloque3){
                            memorias.setTamaño(8);
                            memorias.setBloques(128);
                        }else if(bloque3<contador2 && contador2<bloque4){
                            memorias.setTamaño(12);
                            memorias.setBloques(192);
                        }else if(bloque4<contador2 && contador2<bloque5){
                            memorias.setTamaño(16);
                            memorias.setBloques(256);
                        }else if(bloque5<contador2 && contador2<bloque6){
                            memorias.setTamaño(32);
                            memorias.setBloques(512);
                        }
                        System.out.println("Ha disminuido el tamaño: "+memorias.getTamaño()+", bloques: "+memorias.getBloques());
                    }
                }else{
                    System.out.println("No es posible aumentar la memoria :,c ");
                }
            }

               // Removing the element from the list.
                else if(opcion==10){
                    int pos=0;
                    for(int i=0;i<memoriasR.size();i++){
                        System.out.println(i+1+". "+memoriasR.get(i));
                    }
                    System.out.println("Ingresa el numero de Navegador que deseas cerrar ");
                    pos=scanner.nextInt();
                    memory.remove(pos-1);
                    memoriasR.remove(pos-1);
            


        



        }
    }
    
}



