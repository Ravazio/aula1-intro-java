package datas;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano){
        if(dia < 1 || dia > 31){
            throw new IllegalArgumentException("Dia deve estar em [1, 31]");
        }
        if(mes < 1 || mes > 12){
            throw new IllegalArgumentException("Dia deve estar em [1, 12]");
        }
        if(anoInvalido(ano)){
            throw new IllegalArgumentException("Ano deve estar em [1, 2999]");
        }

        // testar os meses com 31 dias
        //testar os meses com 30 dias
        //testar fevereiro

    }

    static boolean anoInvalido(int ano){
        return ano < 0 || ano > 2999;
    }

    static boolean bissexto(int ano){
        if(anoInvalido(ano)){
            throw new IllegalArgumentException("Ano fora do intervalo.");
        }

        // se não é divisivel por 4, não é bissexto
        if(ano % 4 != 0){
            return false;
        }

        // divisivel por 4 mas não por 100, bissexto
        if(ano % 100 != 0){
            return true;
        }

        //divisivel por 100 e 400
        return ano % 400 == 0;
    }

    boolean anterior(Data d){
        return false;
    }

    boolean posterior(Data d){
        return false;
    }
}
