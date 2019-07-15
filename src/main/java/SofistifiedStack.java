import java.util.Stack;

/**
 * Una PilaSofisticada es una pila, que además agrega los siguientes comportamientos:
 * a. agregar(PilaSofisticada p): que permite agregar sobre “this” la pila p.
 * b. PilaSofisticada intercalar(PilaSofisticada nueva): que devuelve el
 * resultado de intercalar los elementos de la pila “this” con la pila nueva.
 */
public class SofistifiedStack extends Stack {

    public SofistifiedStack addStack(SofistifiedStack sofistifiedStack){
        this.add(sofistifiedStack);
        return this;
    }


    public SofistifiedStack intercalate(SofistifiedStack newStack){
        SofistifiedStack intercalatedSlack = new SofistifiedStack();
        while(!this.isEmpty() || newStack.isEmpty()){
            intercalatedSlack.add(this.pop());
            intercalatedSlack.add(newStack.pop());
        }
        return intercalatedSlack;
    }

    public static void main(String[] args) {
        SofistifiedStack sf = new SofistifiedStack();
        SofistifiedStack sf2 = new SofistifiedStack();
        sf.add(1);
        sf.add(41);
        sf2.add(4);
        sf2.add(14);
        System.out.println(sf.addStack(sf2));
    }

}
