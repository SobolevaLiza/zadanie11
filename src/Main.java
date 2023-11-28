import Prototype.Document;

public class Main {
    public static void main(String[] args) {
        Document originalDocument = new Document("Это оригинальный документ");
        Document clonedDocument = originalDocument.makeCopy();

        System.out.println("Оригинальный документ: " + originalDocument.getContent());
        System.out.println("Клонированный документ: " + clonedDocument.getContent());
    }
}
