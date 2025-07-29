package nexoedu;
public class SimonAI {
    public Resultado interactuar(PromptBusqueda prompt) {
        // Aquí puedes simular una respuesta básica
        System.out.println("Simon AI procesando: " + prompt.getTexto());
        return new Resultado("Respuesta generada por la IA para: " + prompt.getTexto());
    }
}
