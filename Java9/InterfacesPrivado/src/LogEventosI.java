public interface LogEventosI {
    default void logInfo(String mensagem){
        log(mensagem, "INFO");
    }
    default void logWarn(String mensagem){
        log(mensagem, "WARN");
    }
    default  void logErrorrr(String m){
        log(m, "Error");
    }

    default void logFatal(String m){
        log(m, "FATAL");
    }

    // New feature do java 9
    private void log(String m, String tipo){
        System.out.println("INÍCIO DA MENSAGEM ");
        System.out.println(tipo+": " + m);
        System.out.println("FIM DA MENSAGEM ");
    }
}
