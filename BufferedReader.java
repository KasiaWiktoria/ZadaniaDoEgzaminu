/*
Proszę dopisać do programu odpowiednie klauzule catch:
ArrayList<Student> g = new ArrayList();
try {
BufferedReader r = new BufferedReader( new FileReader(f));
String l;
while( (l= r.readLine()) != null ) {
String [] n = l.split(”\\s+”);
g.add( new Student( n[0], Integer.parseInt(n[1]) );
}
} catch // tu proszę dopisać odp. klauzule catch
3. [15 pkt.] Proszę napisać klasę-test jednostkowy dla klasy Kajak z pierwszego
 */


    ArrayList<Student> g = new ArrayList();

        try {
            BufferedReader r = new BufferedReader(new FileReader(f));
            String l;
            while((l= r.readLine())!= null){
                String [] n = l.split("\\s");
                g.add(new Student(n[0], Integer.parseInt(n[1])));
            }
        }catch(FileNotFoundException e){

        }catch(IOException e){

        }

