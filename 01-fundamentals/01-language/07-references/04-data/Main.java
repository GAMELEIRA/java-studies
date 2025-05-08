//PARA OBTERMOS A BIBLIOTECA/API DE DATA DO JAVA DEVEMOS IMPORTAR O java.time

import java.time.LocalDate; //REPRESENTA UMA DATA
import java.time.LocalTime; //REPRESENTA UMA HORA
import java.time.LocalDateTime; //REPRESENTA AMBOS UMA DATA E UM HORARIO
import java.time.format.DateTimeFormatter; //FORMATADOR PARA EXBIR E ANALISAR OBJETOS DE DATA E HORA

public class Main {
  public static void main(String[] args) {

    //LocalDate.now() PARA EXIBIR UMA DATA ATUAL
    LocalDate dateCurrent = LocalDate.now();
    System.out.println("Data Atual: " + dateCurrent);

    //LocalTime.now() PARA EXIBIR A HORA ATUAL(HORA, MINUTO, SEGUNDO E NANOSSEGUNDOS)
    LocalTime timeCurrent = LocalTime.now();
    System.out.println("Hora Atual: " + timeCurrent);

    //LocalDateTime.now() PARA EXIBIR A DATA E A HORA ATUAL
    LocalDateTime dateTimeCurrent = LocalDateTime.now();
    System.out.println("Data e Hora Atual: " + dateTimeCurrent);

    //FORMATAR UMA DATA
    LocalDate dateToFormat = LocalDate.of(2022, 12, 31);

    //USANDO FORMATADOR PARA FORMATAR UMA DATA EM "dd/MM/yyyy"
    //OS FORMATOS PERMITIDOS PARA USAR O ofPattern
    //É PRECISO USAR A FUNÇÃO ofPattern DO DateTimeFormatter
    //EXEMPLO: "dd/MM/yyyy" - Dia, Mês e Ano
    //EXEMPLO: "yyyy-MM-dd" - Ano, Mês e Dia
    //EXEMPLO: "HH:mm:ss" - Hora, Minuto e Segundo
    //EXEMPLO: "yyyy-MM-dd HH:mm:ss" - Ano, Mês, Dia, Hora, Minuto e Segundo
    //EXEMPLO: "yyyy-MM-dd HH:mm:ss.SSS" - Ano, Mês, Dia, Hora, Minuto, Segundo e Milissegundos
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formattedDate = dateToFormat.format(formatter);
    System.out.println("Data Formatada: " + formattedDate);
    
  }
}
