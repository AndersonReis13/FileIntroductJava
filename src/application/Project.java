package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
	
		File file = new File("C:\\Projetos_Programação\\teste.txt"); //Pegando o file(arquivo), e importando para utilizalo... Vale lemnbrar que para captar o caminho tem que user o \\ e obrigatiriamente invertida.
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()){ //Verificando se ainda tem linha no arquivo txt.
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage() );
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
