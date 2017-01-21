class FinallyDemo {
static void procC() {
try {
System.out.println("inside procC"); }
finally {
System.out.println("procC's finally");
}
}

public static void main(String args[]) {
procC();
}
}
