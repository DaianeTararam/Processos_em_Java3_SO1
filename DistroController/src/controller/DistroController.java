//@author Daiane Tararam

package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistroController {
	public DistroController() {
		super();
		
	}
	private String os() {
		String name = System.getProperty("os.name");
		return name;
	}
	public void exibeDistro() {
		String so = os();
		try {
			if (so.contains("Linux")) {
				String comando = "cat /etc/os-release";
				
				Process processo = Runtime.getRuntime().exec(comando);
				BufferedReader ler = new BufferedReader(new InputStreamReader(processo.getInputStream()));
				String linha;
				
				while ((linha = ler.readLine()) != null) {
					if(linha.contains("NAME=")|| (linha.contains("VERSION=")))
						System.out.println(linha);
				}
				ler.close();
			}else {
				System.out.println("O sistema não é LINUX!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
