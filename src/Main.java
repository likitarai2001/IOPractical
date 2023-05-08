class Main{
    public static void main(String[] args) throws Exception {
        OutputStreamClass outObj = new OutputStreamClass();
        outObj.writeToFile();

        InputStreamClass inObj = new InputStreamClass();
        inObj.readFromFile();
    }
}