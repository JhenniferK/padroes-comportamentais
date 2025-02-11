class JsonParsingHandler extends RequestHandler {
    protected boolean process(HttpRequest request) {
        try {
            JSONObject json = new JSONObject(request.getBody());
            for (String key : json.keySet()) {
                request.getAttributes().put(key, json.getString(key));
            }
            System.out.println("JSON parsing complete: " + request.getAttributes());
            return true;
        } catch (JSONException e) {
            System.out.println("JSON parsing failed: " + e);
            return false;
        }
    }
}