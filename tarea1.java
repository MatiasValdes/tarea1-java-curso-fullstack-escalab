import java.util.Scanner;
import java.util.Random;

public class tarea1 {
    public static void main(String[] args) {
        boolean init = true;
        int option = 0;

        showMenu();

        while (init) {
            Scanner sc = new Scanner(System.in);

            if (sc.hasNextInt()) {
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        calculator();
                        showMenu();
                        break;
                    case 2:
                        game();
                        showMenu();
                        break;
                    case 3:
                        System.out.println("Hasta la proximaaaaaa!!!!!");
                        init = false;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } else {
                System.out.println("Debe ingresar un valor numérico");
            }
        }
    }

    public static void showMenu() {
        System.out.println("***********************************");
        System.out.println("***** Bienvenido a la Tarea 1 *****");
        System.out.println("***********************************");
        System.out.println("Selecciona una Opción:");
        System.out.println("1) Calculadora");
        System.out.println("2) Jugar");
        System.out.println("3) Salir");
    }

    public static void showMenuCalculator() {
        System.out.println("***********************************");
        System.out.println("*********** CALCULADORA ***********");
        System.out.println("***********************************");
        System.out.println("Selecciona una Opción:");
        System.out.println("1) Suma (+)");
        System.out.println("2) Resta (-)");
        System.out.println("3) División (/)");
        System.out.println("4) Multiplicación (*)");
        System.out.println("5) Salir");
    }

    public static void showMenuGame() {
        System.out.println("***********************************");
        System.out.println("********* Juego Matemático ********");
        System.out.println("***********************************");
        System.out.println("Ingresa tu Nombre:");
    }

    public static void calculator() {
        boolean init = true;
        String answer = "";
        int option = 0, x = 0, y = 0;;
        Scanner sc, scX, scY, scAnswer;

        showMenuCalculator();

        while (init) {
            Boolean validationX = true, validationY = true;
            sc = new Scanner(System.in);

            if (sc.hasNextInt()) {
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        while (validationX) {
                            System.out.println("Ingresa una valor (x): ");
                            scX = new Scanner(System.in);
                            if (scX.hasNextInt()) {
                                x = scX.nextInt();
                                validationX = false;
                            } else {
                                System.out.println("El valor de X debe ser un número");
                            }
                        }

                        while (validationY) {
                            System.out.println("Ingresa una valor (y): ");
                            scY = new Scanner(System.in);
                            if (scY.hasNextInt()) {
                                y = scY.nextInt();
                                validationY = false;
                            } else {
                                System.out.println("El valor de X debe ser un número");
                            }
                        }

                        System.out.println(x + " + " + y + " = " + suma(x, y));

                        System.out.println("Desea continuar? (S/N)");
                        scAnswer = new Scanner(System.in);
                        answer = scAnswer.next();

                        if (answer.toUpperCase().equals("S")) {
                            showMenuCalculator();
                        } else {
                            init = false;
                        }
                        break;
                    case 2:
                        while (validationX) {
                            System.out.println("Ingresa una valor (x): ");
                            scX = new Scanner(System.in);
                            if (scX.hasNextInt()) {
                                x = scX.nextInt();
                                validationX = false;
                            } else {
                                System.out.println("El valor de X debe ser un número");
                            }
                        }

                        while (validationY) {
                            System.out.println("Ingresa una valor (y): ");
                            scY = new Scanner(System.in);
                            if (scY.hasNextInt()) {
                                y = scY.nextInt();
                                validationY = false;
                            } else {
                                System.out.println("El valor de X debe ser un número");
                            }
                        }

                        System.out.println(x + " - " + y + " = " + resta(x, y));

                        System.out.println("Desea continuar? (S/N)");
                        scAnswer = new Scanner(System.in);
                        answer = scAnswer.next();

                        if (answer.equals("S")) {
                            showMenuCalculator();
                        } else {
                            init = false;
                        }
                        break;
                    case 3:
                        while (validationX) {
                            System.out.println("Ingresa una valor (x): ");
                            scX = new Scanner(System.in);
                            if (scX.hasNextInt()) {
                                x = scX.nextInt();
                                validationX = false;
                            } else {
                                System.out.println("El valor de X debe ser un número");
                            }
                        }

                        while (validationY) {
                            System.out.println("Ingresa una valor (y): ");
                            scY = new Scanner(System.in);
                            if (scY.hasNextInt()) {
                                y = scY.nextInt();
                                if (y == 0) {
                                    System.out.println("El valor de Y debe ser mayor a 0");
                                } else {
                                    validationY = false;
                                }
                            } else {
                                System.out.println("El valor de X debe ser un número");
                            }
                        }

                        System.out.println(x + " / " + y + " = " + division(x, y));

                        System.out.println("Desea continuar? (S/N)");
                        scAnswer = new Scanner(System.in);
                        answer = scAnswer.next();

                        if (answer.equals("S")) {
                            showMenuCalculator();
                        } else {
                            init = false;
                        }
                        break;
                    case 4:
                        while (validationX) {
                            System.out.println("Ingresa una valor (x): ");
                            scX = new Scanner(System.in);
                            if (scX.hasNextInt()) {
                                x = scX.nextInt();
                                validationX = false;
                            } else {
                                System.out.println("El valor de X debe ser un número");
                            }
                        }

                        while (validationY) {
                            System.out.println("Ingresa una valor (y): ");
                            scY = new Scanner(System.in);
                            if (scY.hasNextInt()) {
                                y = scY.nextInt();
                                validationY = false;
                            } else {
                                System.out.println("El valor de X debe ser un número");
                            }
                        }

                        System.out.println(x + " * " + y + " = " + multiplicacion(x, y));

                        System.out.println("Desea continuar? (S/N)");
                        scAnswer = new Scanner(System.in);
                        answer = scAnswer.next();

                        if (answer.equals("S")) {
                            showMenuCalculator();
                        } else {
                            init = false;
                        }
                        break;
                    case 5:
                        System.out.println("Salir!!!!!");
                        init = false;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } else {
                System.out.println("Debe ingresar un valor numérico");
            }
        }
    }

    public static void game() {
        String resultString = "", name = "", valueString = "";
        char operator;
        int x = 0, y = 0, result = 0, points = 0, value = 0;
        float resultFloat = 0, resultConvert = 0;
        Scanner scResult, sc;

        showMenuGame();

        sc = new Scanner(System.in);
        
        name = sc.nextLine()
                .replace("a", "apa")
                .replace("e", "epe")
                .replace("i", "ipi")
                .replace("o", "opo")
                .replace("u", "upu");

        System.out.println("Bienvenido " + name + "!!!! Tienes que resolver operaciones matemáticas *o*");

        for (int i = 0; i < 10; i++) {
            boolean validation = true;
            operator = getRandomOperator();
            switch (operator) {
                case '+':
                    x = getRandomNumber(0, 100);
                    y = getRandomNumber(0, 100);
                    System.out.println(x + " + " + y + " = ");
                    result = suma(x, y);

                    while (validation) {
                        System.out.println("El resultado es: ");
                        scResult = new Scanner(System.in);
                        if (scResult.hasNextInt()) {
                            value = scResult.nextInt();
                            validation = false;
                        } else {
                            System.out.println("El resultado debe ser un número");
                        }
                    }

                    if (result == value) {
                        System.out.println("Respuesta correcta! =)");
                        points++;
                    } else {
                        System.out.println("Respuesta incorrecta (" + result + ")! =(");
                    }
                    break;
                case '-':
                    x = getRandomNumber(0, 100);
                    y = getRandomNumber(0, 100);
                    System.out.println(x + " - " + y + " = ");
                    result = resta(x, y);
                    
                    while (validation) {
                        System.out.println("El resultado es: ");
                        scResult = new Scanner(System.in);
                        if (scResult.hasNextInt()) {
                            value = scResult.nextInt();
                            validation = false;
                        } else {
                            System.out.println("El resultado debe ser un número");
                        }
                    }

                    if (result == value) {
                        System.out.println("Respuesta correcta! =)");
                        points++;
                    } else {
                        System.out.println("Respuesta incorrecta (" + result + ")! =(");
                    }
                    break;
                case '/':
                    x = getRandomNumber(0, 10);
                    y = getRandomNumber(1, 10);
                    System.out.println(x + " / " + y + " = ");
                    resultFloat = division(x, y);
                    
                    while (validation) {
                        System.out.println("El resultado es: ");
                        scResult = new Scanner(System.in);
                        if (scResult.hasNextInt() || scResult.hasNextFloat()) {
                            valueString = scResult.nextLine();
                            validation = false;
                        } else {
                            System.out.println("El resultado debe ser un número");
                        }
                    }

                    resultString = valueString.replace(',', '.');
                    resultConvert = Float.parseFloat(resultString);

                    if (resultFloat == resultConvert) {
                        System.out.println("Respuesta correcta! =)");
                        points++;
                    } else {
                        System.out.println("Respuesta incorrecta (" + resultFloat + ")! =(");
                    }
                    break;
                case '*':
                    x = getRandomNumber(0, 15);
                    y = getRandomNumber(0, 15);
                    System.out.println(x + " * " + y + " = ");
                    result = multiplicacion(x, y);
                    
                    while (validation) {
                        System.out.println("El resultado es: ");
                        scResult = new Scanner(System.in);
                        if (scResult.hasNextInt()) {
                            value = scResult.nextInt();
                            validation = false;
                        } else {
                            System.out.println("El resultado debe ser un número");
                        }
                    }

                    if (result == value) {
                        System.out.println("Respuesta correcta! =)");
                        points++;
                    } else {
                        System.out.println("Respuesta incorrecta (" + result + ")! =(");
                    }
                    break;
                default:
                    System.out.println("Operador no válido");

            }
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Juego Terminado " + name + "!!!! Tu puntaje es de: " + points);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static char getRandomOperator() {
        String operators = "+-*/";

        Random r = new Random();
        char c = operators.charAt(r.nextInt(operators.length()));

        return c;
    }

    public static int suma(int x, int y) {
        return x + y;
    }

    public static int resta(int x, int y) {
        return x - y;
    }

    public static int multiplicacion(int x, int y) {
        return x * y;
    }

    public static float division(int x, int y) {
        return (float) x / (float) y;
    }
}