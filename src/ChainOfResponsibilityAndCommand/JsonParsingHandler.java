package ChainOfResponsibilityAndCommand;

import org.json.JSONObject;
import org.json.JSONException;

class JsonParsingHandler extends RequestHandler {
    @Override
    protected boolean process(HttpRequest request) {
        try {
            JSONObject json = new JSONObject(request.getBody());
            for (String key : json.keySet()) {
                request.getAttributes().put(key, json.getString(key));
            }
            System.out.println("JSON transformado em Map: " + request.getAttributes());
            return true;
        } catch (JSONException e) {
            System.out.println("Erro: JSON inválido.");
            return false;
        }
    }
}