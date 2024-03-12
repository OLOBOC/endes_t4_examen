package refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // contenido
        printTitle();
        System.out.println("Contenido 1");
        System.out.println("Contenido 2");

        printConclusion();
    }

    private void printTitle() {
        //imprimir titulo
        System.out.println("Título del Reporte");
    }

    private void printConclusion() {
        //imprimir conclusion
        System.out.println("Conclusión del Reporte");
    }
}


