package br.com.java.arthurfnsc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class MeuPrograma {

    private static final Logger LOGGER = LogManager
            .getLogger(MeuPrograma.class);

    private MeuPrograma() {
    }

    public static void main(final String... args) {

        LOGGER.info("Minha primeira aplicação Java!!");
    }
}
