//Jonathas dos Santos, 202201644

package arquivosUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;

public class JsonUtil {
	
	private JSONObject json;
	
	public JsonUtil(String path) {
		json = leitorJSON(path); 
	}
	
	public JSONObject leitorJSON(String path) {
		
		JSONObject objetoJson = null;
		
		//Lê o arquivo .json e armazena como JSONObject
		try(BufferedReader arquivo = new BufferedReader(new FileReader(path))){
			
			StringBuilder construtor = new StringBuilder();
			
			while(arquivo.ready()) {
				construtor.append(arquivo.readLine());
			}
			
			objetoJson = new JSONObject(construtor.toString());
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {}
		
		return objetoJson;
	}
	
	public JSONObject getJson() {
		return json;
	}
}
