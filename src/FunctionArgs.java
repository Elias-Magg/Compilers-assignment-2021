import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class FunctionArgs {

    Hashtable<String, Type> args;
    String name;

    public FunctionArgs(String name){
        args = new Hashtable<>();
        this.name = name;
    }

    public FunctionArgs(Hashtable<String, Type> args) {
        this.args = args;
    }

    public FunctionArgs() {
    }

    public Hashtable<String, Type> getArgs() {
        return args;
    }

    public void setArgs(Hashtable<String, Type> args) {
        this.args = args;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Function Name: ").append(name).append("\n");
        for(Map.Entry<String, Type> arg: args.entrySet()){
            builder.append(arg.getKey()).append(": ").append(arg.getValue()).append("\n");
        }
        return builder.toString();
    }
}
