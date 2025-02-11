package ChainOfResponsibilityAndCommand;

public class Main {
    public static void main(String[] args) {
        HttpRequestProcessor processor = new HttpRequestProcessor();

        HttpRequest request1 = new HttpRequest("{\"nome\":\"João\",\"idade\":\"30\"}", true, true);
        processor.process(request1);
        System.out.println();

        HttpRequest request2 = new HttpRequest("{\"produto\":\"Notebook\"}", false, true);
        processor.process(request2);
        System.out.println();

        HttpRequest request3 = new HttpRequest("{\"curso\":\"Java\"}", true, false);
        processor.process(request3);
        System.out.println();

        HttpRequest request4 = new HttpRequest("nome = Jhennifer, idade = 25", true, true);
        processor.process(request4);
    }
}