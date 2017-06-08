import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Grava {
	
	public void GravarF(ArrayList<Cliente> cliente){
		
			try {
				FileOutputStream fos = new FileOutputStream("ArquivoF.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(cliente);
				oos.close();
				
			} catch (IOException e) { e.printStackTrace();}
	
		
	}
	public void GravarE(ArrayList<Cliente> cliente){
		
		try {
			FileOutputStream fos = new FileOutputStream("ArquivoJ.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cliente);
			oos.close();
			
		} catch (IOException e) { e.printStackTrace();}

	
}
	public void GravarCR(ArrayList<CadastroRes> cliente){
		
		try {
			FileOutputStream fos = new FileOutputStream("ArquivoCR.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cliente);
			oos.close();
			
		} catch (IOException e) { e.printStackTrace();}

	
}
	public void GravarCE(ArrayList<CadastroEmp> cliente){
		
		try {
			FileOutputStream fos = new FileOutputStream("ArquivoCR.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cliente);
			oos.close();
			
		} catch (IOException e) { e.printStackTrace();}

	
}
	public static ArrayList<Cliente> LerF() {
		ArrayList<Cliente> lerclientes = null;
		try{
			FileInputStream fis = new FileInputStream("ArquivoF.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			lerclientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lerclientes;
	}

	public static ArrayList<Cliente> LerJ() {
	ArrayList<Cliente> lerclientes = null;
	try{
		FileInputStream fis = new FileInputStream("ArquivoJ.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		lerclientes = (ArrayList<Cliente>) ois.readObject();
		ois.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return lerclientes;
}
	public static ArrayList<CadastroRes> LerCR() {
		ArrayList<CadastroRes> lercadastro = null;
		try{
			FileInputStream fis = new FileInputStream("ArquivoCR.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			lercadastro = (ArrayList<CadastroRes>) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lercadastro;
	}
	public static ArrayList<CadastroEmp> LerCE() {
		ArrayList<CadastroEmp> lercadastro = null;
		try{
			FileInputStream fis = new FileInputStream("ArquivoCE.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			lercadastro = (ArrayList<CadastroEmp>) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lercadastro;
	}
}
