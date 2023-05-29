package formas;
import visitor.Visitor;

public interface Forma {
    void accept(Visitor visitor);
}
