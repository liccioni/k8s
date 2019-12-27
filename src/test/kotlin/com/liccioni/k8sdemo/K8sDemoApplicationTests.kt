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
    fun `passing test`() {
        assertThat(1).isEqualTo(1)
        assertThat(2).isEqualTo(2)
        assertThat(3).isEqualTo(3)
    }
}
