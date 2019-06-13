/*
Proszę dopisać do programu odpowiednie klauzule catch:
Processor p;
try {
Class c = Class.forName(classNameString);
p = (Processor) c.newInstance();
} catch // tu proszę dopisać odp. klauzule catch
 */

package E2014;

public class Processor {

    Processor p;
    String classNameString;

    Class c;

    {
        try {
            c = Class.forName(classNameString);
            p = (Processor) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
