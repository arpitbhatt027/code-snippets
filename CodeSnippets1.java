import java.util.List;
import java.util.Objects;

public class CodeSnippets1 {

    public static boolean checkIfListIsEmptyOrNull(List<String> stringList) {
        return (Objects.nonNull(stringList) && !stringList.isEmpty());
    }
}
