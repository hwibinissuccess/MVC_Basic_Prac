package com.example.foodorder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @DisplayName("메뉴 생성")
    @Test
    void createMenu(){
        assertThatCode(() -> new MenuItem("만두", 5000))
                .doesNotThrowAnyException();
    }

}
