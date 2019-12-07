package com.liccioni.k8sdemo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class K8sDemoApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Test
    fun `failing test`() {
        assertThat(1).isEqualTo(2)
    }
}
