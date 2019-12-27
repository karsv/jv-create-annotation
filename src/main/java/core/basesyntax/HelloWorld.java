package core.basesyntax;

import core.basesyntax.DAO.BetDaoImpl;
import core.basesyntax.DAO.CasinoDaoImpl;
import core.basesyntax.controller.ConsoleHandler;
import core.basesyntax.lib.Injector;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConsoleHandler.handle();
        System.out.println(new BetDaoImpl().getAll());
        System.out.println(new CasinoDaoImpl().getAll());
    }

}
