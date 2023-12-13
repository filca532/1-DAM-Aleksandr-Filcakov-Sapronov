package Agenda;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreApellidoPatron = "^[a-zA-Z -]+$";
        String correoPatron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String ipPatron = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        String telefonoPatron = "^[0-9]{9}$";

        Pattern patronNombreApellido = Pattern.compile(nombreApellidoPatron);
        Pattern patronCorreo = Pattern.compile(correoPatron);
        Pattern patronIp = Pattern.compile(ipPatron);
        Pattern patronTelefono = Pattern.compile(telefonoPatron);

        System.out.print("Cuantas personas quieres añadir a la agenda?: ");
        int personas = sc.nextInt();

        String[][][] agenda = new String[personas][4][];
        for (int k = 0; k < personas; k++) {
            agenda[k][0] = new String[3];
            agenda[k][1] = new String[1];
            agenda[k][2] = new String[1];
            agenda[k][3] = new String[1];


            for (int i = 0; i < agenda[k].length; i++) {
                for (int j = 0; j < agenda[k][i].length; j++) {
                    if (i == 0 && j == 0) {
                        String apellido1;
                        do {
                            System.out.print("Introduzca su primer apellido: ");
                            apellido1 = sc.next();
                        } while (!patronNombreApellido.matcher(apellido1).matches());
                        agenda[k][i][j] = apellido1;
                    } else if (i == 0 && j == 1) {
                        String apellido2;
                        do {
                            System.out.print("Introduzca su segundo apellido: ");
                            apellido2 = sc.next();
                        } while (!patronNombreApellido.matcher(apellido2).matches());
                        agenda[k][i][j] = apellido2;
                    } else if (i == 0 && j == 2) {
                        String nombre;
                        do {
                            System.out.print("Introduzca su nombre: ");
                            nombre = sc.next();
                        } while (!patronNombreApellido.matcher(nombre).matches());
                        agenda[k][i][j] = nombre;
                    } else if (i == 1) {
                        String correo;
                        do {
                            System.out.print("Introduzca su correo: ");
                            correo = sc.next();
                        } while (!patronCorreo.matcher(correo).matches());
                        agenda[k][i][j] = correo;
                    } else if (i == 2) {
                        String ip;
                        do {
                            System.out.print("Introduzca su IP: ");
                            ip = sc.next();
                        } while (!patronIp.matcher(ip).matches());
                        agenda[k][i][j] = ip;
                    } else if (i == 3) {
                        String telefono;
                        do {
                            System.out.print("Introduzca su numero de telefono: ");
                            telefono = sc.next();
                        } while (!patronTelefono.matcher(telefono).matches());
                        agenda[k][i][j] = telefono;
                    }
                }
            }
        }

        System.out.println();

        for (int k = 0; k < personas; k++) {
            System.out.print("Nombre y apellidos: ");
            for (int i = 0; i < agenda[k][0].length; i++) {
                System.out.print(agenda[k][0][i] + " ");
            }

            System.out.println();

            System.out.print("Correo electrónico: ");
            for (int i = 0; i < agenda[k][1].length; i++) {
                System.out.print(agenda[k][1][i] + " ");
            }

            System.out.println();

            System.out.print("Dirección IP: ");
            for (int i = 0; i < agenda[k][2].length; i++) {
                System.out.print(agenda[k][2][i] + " ");
            }

            System.out.println();

            System.out.print("Teléfono: +(34) ");
            for (int i = 0; i < agenda[k][3].length; i++) {
                System.out.print(agenda[k][3][i] + " ");
            }
            System.out.println();
        }
    }
}
