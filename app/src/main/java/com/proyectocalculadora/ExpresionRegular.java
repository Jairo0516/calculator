package com.proyectocalculadora;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExpresionRegular {
    private String resolver(String expresionMatematica, char operacionExpresion) {
        expresionMatematica = expresionMatematica.trim();
        System.out.println("Operación: " + operacionExpresion);
        System.out.println("Expresión actual: " + expresionMatematica);

        Pattern p = Pattern.compile("([-]{1}[\\d]+\\.[\\d]+|[\\d]+\\.[\\d]+|-[\\d]+|[\\d]+)(" + operacionExpresion + ")(-[\\d]+\\.[\\d]+|[\\d]+\\.[\\d]+|[\\d]+)");
        Matcher m = p.matcher(expresionMatematica);

        if ( m.find() ) {

            System.out.println("Fraccion:"+m.group());
            System.out.println("Num1:"+m.group(1));
            System.out.println("OperadorEncontrado:"+m.group(2));
            System.out.println("Num2:"+m.group(3));

            double num1 = Double.parseDouble(m.group(1));
            char operacion = m.group(2).charAt(0);
            double num2 = Double.parseDouble(m.group(3));

            double resultado = 0;
            switch (operacion) {
                case '/':
                    if (num2 == 0) {
                        return "ERRROR Division por CERO(0)";
                    }   resultado = num1 / num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                default:
                    break;
            }
            String txtResultado = "0";
            if( Math.abs( resultado ) > 0 ){
                txtResultado = String.valueOf(resultado);
                if( (Math.abs( resultado )/(int)Math.abs( resultado )) == 1D){
                    //Eliminamos el .0
                    txtResultado = String.valueOf(resultado).replaceFirst("\\.0", "");
                }
                System.out.println("Cambios Rfinal:"+txtResultado);
            }else{
                System.out.println("Rfinal:"+txtResultado);
            }

            expresionMatematica = m.replaceFirst( txtResultado );
            System.out.println("Expresión final: " + expresionMatematica);
        }
        return expresionMatematica;
    }
    public String resolverFormula( String formula ) {

        return formula+"000";
    }

}

