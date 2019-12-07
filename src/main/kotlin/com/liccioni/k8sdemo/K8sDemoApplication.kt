package com.liccioni.k8sdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sDemoApplication

fun main(args: Array<String>) {
	runApplication<K8sDemoApplication>(*args)
}
