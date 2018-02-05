package br.com.kotlin.arthurfnsc

import org.apache.logging.log4j.LogManager

class MeuPrograma

val logger = LogManager.getLogger(MeuPrograma::class.java)

fun main(args: Array<String>) {
    logger.info("Minha primeira aplicação Kotlin!!")
}
